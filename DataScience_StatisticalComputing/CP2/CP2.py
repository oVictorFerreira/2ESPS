import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from pathlib import Path

df = pd.read_csv("/content/scouts_2015.csv")
print("Dimensão da base: ", df.shape)
df.head()

# Qual é a pontuação média dos jogadores em uma rodada?

media_por_rodada = df.groupby("rodada_id")["pontos_num"].mean()

# Rodada aleatória
rodada_aleatoria = media_por_rodada.sample(1)

print("Pontuação média em uma rodada aleatória:")
display(rodada_aleatoria)

# Qual posição tem a maior mediana de pontos?
# Calcula a mediana dos pontos por posição
mediana_por_pontos = df.groupby("posicao")["pontos_num"].median()

# Encontra o valor da maior mediana
maior_mediana_valor = mediana_por_pontos.max()

# Encontra a posição que corresponde à maior mediana
posicao_maior_mediana = mediana_por_pontos.idxmax()

# Imprime a posição com a maior mediana de pontos
print(f"A posição com a maior mediana de pontos é: {posicao_maior_mediana}")

# Exibe o valor da maior mediana
display(maior_mediana_valor)

# Exibe a mediana de pontos para todas as posições
display(mediana_por_pontos)

# Existe um jogador que aparece como “moda” em gols ou assistências (ou seja, que repete muito em valores)?

moda = df["apelido"].mode()[0]
contagem = df["apelido"].value_counts()[moda]

print(f"O jogador que aparece como moda é: {moda}, aparecendo {contagem} vezes")

#A pontuação dos atacantes é mais dispersa que a dos zagueiros?

atacantes = df[df["posicao"] == "ata"]["pontos_num"]
zagueiros = df[df["posicao"] == "zag"]["pontos_num"]

#calculando a dispersão (desvio padrão)

disp_atacantes = np.std(atacantes)
disp_zagueiros = np.std(zagueiros)

print(f"Dispersão dos atacantes: {disp_atacantes:.2f}")
print(f"Dispersão dos zagueiros: {disp_zagueiros:.2f}")

#Qual posição tem maior consistência de desempenho (menor desvio-padrão de pontos)?

disp_por_posicao = df.groupby("posicao")["pontos_num"].std()
display (disp_por_posicao)

posicao_consistente = disp_por_posicao.idxmin()
valor_consistente = disp_por_posicao.min()
print (f"A posição com maior consistência de desempenho é: {posicao_consistente}, com o DP de: {valor_consistente}")

#Como é a variabilidade no preço dos jogadores por posição?

variabilidade_por_posicao = df.groupby("posicao")["preco_num"].std()
display(variabilidade_por_posicao)

# Quais clubes tiveram a maior média de pontos por jogador?
# Carregar dataset

df = pd.read_csv("scouts_2015.csv")

# Clubes com maior média de pontos

clubes_media_pontos = (

    df.groupby("clube")["media_num"]

    .mean()

    .sort_values(ascending=False)

)

# Mostrar o campeão

clube_top = clubes_media_pontos.idxmax()

valor_top = clubes_media_pontos.max()

print(f"O clube com maior média de pontos por clube foi {clube_top}, com {valor_top:.2f} pontos.")

# Rodada mais produtiva em gols

rodadas_gols = (

    df.groupby("rodada_id")["G"]

    .sum()

    .sort_values(ascending=False)

)

# Mostrar a rodada campeã

rodada_top = rodadas_gols.idxmax()

valor_top = rodadas_gols.max()

print(f"A rodada mais produtiva em gols foi a rodada {rodada_top}, com {valor_top} gols.")

#Houve jogadores que fizeram pontuações extremamente altas em uma rodada específica?
# converter a coluna de pontos para numérico
df['pontos_num'] = pd.to_numeric(df['pontos_num'], errors='coerce')

# calcular limites do IQR
Q1 = df['pontos_num'].quantile(0.25)
Q3 = df['pontos_num'].quantile(0.75)
IQR = Q3 - Q1
limite_sup = Q3 + 1.5 * IQR

# filtrar outliers (pontuações muito altas)
outliers = df[df['pontos_num'] > limite_sup]

# mostrar top 10 maiores pontuados
print("Jogadores com pontuação extremamente alta:")
display(outliers[['apelido', 'rodada_id', 'pontos_num']].sort_values(by='pontos_num', ascending=False).head(10))

#O preço de algum jogador destoou demais da sua pontuação real?
# converter colunas para numérico
df['pontos_num'] = pd.to_numeric(df['pontos_num'], errors='coerce')
df['preco_num'] = pd.to_numeric(df['preco_num'], errors='coerce')
# calcular limites normais com IQR
Q1_pontos, Q3_pontos = df['pontos_num'].quantile([0.25, 0.75])
IQR_pontos = Q3_pontos - Q1_pontos
Q1_preco, Q3_preco = df['preco_num'].quantile([0.25, 0.75])
IQR_preco = Q3_preco - Q1_preco
limite_sup_preco = Q3_preco + 1.5 * IQR_preco
limite_inf_preco = Q1_preco - 1.5 * IQR_preco
# jogadores destoantes
caros_baixos = df[(df['preco_num'] > limite_sup_preco) & (df['pontos_num'] < Q1_pontos)]
baratos_altos = df[(df['preco_num'] < limite_inf_preco) & (df['pontos_num'] > Q3_pontos)]
if not caros_baixos.empty or not baratos_altos.empty:
   print("Sim, houve jogadores cujo preço destoou da pontuação real.")
else:
   print("Não houve jogadores com preço destoante da pontuação.")

# # filtra apenas goleiros
goleiros = df[df['posicao'] == 'gol']
# detecta outliers em DD e DP (método IQR)
Q1_DD = goleiros['DD'].quantile(0.25)
Q3_DD = goleiros['DD'].quantile(0.75)
IQR_DD = Q3_DD - Q1_DD
Q1_DP = goleiros['DP'].quantile(0.25)
Q3_DP = goleiros['DP'].quantile(0.75)
IQR_DP = Q3_DP - Q1_DP
# limites
limite_inf_DD = Q1_DD - 1.5 * IQR_DD
limite_sup_DD = Q3_DD + 1.5 * IQR_DD
limite_inf_DP = Q1_DP - 1.5 * IQR_DP
limite_sup_DP = Q3_DP + 1.5 * IQR_DP
# goleiros fora do esperado em DD ou DP
fora_esperado = goleiros[
   (goleiros['DD'] < limite_inf_DD) | (goleiros['DD'] > limite_sup_DD) |
   (goleiros['DP'] < limite_inf_DP) | (goleiros['DP'] > limite_sup_DP)
]
# exibir resultado
if fora_esperado.empty:
   print("Nenhum goleiro com desempenho fora do esperado em defesas (DD, DP).")
else:
   print("Goleiros com desempenho fora do esperado em defesas (DD, DP):")
   print(fora_esperado[['apelido', 'DD', 'DP']])

   import seaborn as sns
   import matplotlib.pyplot as plt

   # Boxplot da pontuação por posição
   plt.figure(figsize=(10, 6))
   sns.boxplot(data=df, x="posicao", y="pontos_num", palette="Set2")
   plt.title("Variação da Pontuação por Posição (Boxplot)")
   plt.xlabel("Posição")
   plt.ylabel("Pontuação")
   plt.show()

import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
# Selecionar apenas colunas numéricas
numericas = df.select_dtypes(include="number")
# Matriz de correlação
correlacao = numericas.corr()
# Heatmap
plt.figure(figsize=(12,8))
sns.heatmap(correlacao, cmap="coolwarm", center=0, annot=False)
plt.title("Mapa de Correlação entre Variáveis")
plt.show()
# Descobrir as correlações mais fortes (em valor absoluto)
fortes = (
   correlacao.where(~np.eye(correlacao.shape[0], dtype=bool))  # remove diagonal
   .unstack()
   .dropna()
   .sort_values(key=abs, ascending=False)
)
print("Top 5 correlações mais fortes:")
print(fortes.head(5))

import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Carregar o dataset
df = pd.read_csv("scouts_2015.csv")

resumo = df.groupby('clube')[['G','A']].sum().reset_index()

plt.figure(figsize=(10, 7))
sns.scatterplot(data=resumo, x='G', y='A', s= 120, alpha=0.7)
plt.title('Gols x Assistências por Clube')
plt.xlabel('Gols')
plt.ylabel('Assistências')
plt.grid(True)
plt.show()

destaque = resumo.assign(soma=resumo['G'] + resumo['A']).sort_values('soma',ascending=False).iloc[0]
print(f"O clube que mais se destaca é {destaque['clube']} - com {destaque['G']} gols e {destaque['A']} assistencias ")
