## **ExercÃ­cios**
import pandas as pd
import numpy as np

np.random.seed(42)
n = 5000  # Quantidade de registros

df = pd.DataFrame({
    'ID_Transacao': range(1, n+1),
    'Valor': np.random.uniform(10, 10000, n),
    'Tipo_Transacao': np.random.choice(['Compra', 'Transferencia', 'Pagamento'], n),
    'Localizacao': np.random.choice(['SP', 'RJ', 'MG', 'RS', 'BA', 'PR'], n),
    'Horario': np.random.choice(['Manha', 'Tarde', 'Noite', 'Madrugada'], n),
    'Fraude': np.random.choice([0, 1], n, p=[0.7, 0.3])
})

#Comece executando a criaÃ§Ã£o do conjunto de dados na cÃ©lula abaixo e depois faÃ§am os exercÃ­cios abaixo:

#1. Realizar uma amostragem aleatÃ³ria simples com 500 registros.

amostra_simples = df.sample(n=500, random_state=42)
amostra_simples.head() #o head pega as 5 primeiras linhas

#2. Criar uma amostragem sistemática escolhendo cada 10º registro.

amostra_sistematica = df.iloc[::10, :]
amostra_sistematica.head()

#3. Dividir a base em estratos por localização e selecionar amostras proporcionais.

from sklearn.model_selection import train_test_split

amostra_estratificada, _ = train_test_split(df, test_size=0.5, stratify=df["Localizacao"])
amostra_estratificada.head()

#4. Selecionar aleatoriamente transferências fraudulentas e comparar com transferências não fraudulentas.

clusters = df.groupby('Fraude') #Cluster é o que você vai/quer visualizar
fraude = clusters.get_group(1) #Seleciona os fraudulentos
legal = clusters.get_group(0) #Seleciona os legais

# Seleciona 100 transações aleatórias de cada grupo
amostra_fraude = fraude.sample(n=100, random_state=42)
amostra_legal = legal.sample(n=100, random_state=42)

#Visualizar ambos
print(f"As 5 primeiras amostras fraudulentas são:\n \n{amostra_fraude.head()}\n ")
print(f"As 5 primeiras amostras legais são:\n \n{amostra_legal.head()}\n ")

#5. Criar um subconjunto de dados com base em amostragem por julgamento para transferências acima de R$5000.

amostra_julgamento = df[
    ((df['Tipo_Transacao'] == 'Pagamento') |
     (df['Tipo_Transacao'] == 'Transferencia') |
     (df['Tipo_Transacao'] == 'Compra')) &
    (df['Valor'] > 5000)
    ]

amostra_julgamento.head()

#6. Aplicar amostragem por conglomerados dividindo os dados por tipo de transferências e sorteando um grupo.

import random

# Listar os grupos disponíveis
grupos = df['Tipo_Transacao'].unique()
# Sortear um grupo aleatório
grupo_sorteado = random.choice(grupos)
clusters = df.groupby('Tipo_Transacao')
amostra_conglomerados = clusters.get_group(grupo_sorteado)
amostra_conglomerados.head()

#7. Executar uma amostragem por conveniência pegando os 300 primeiros registros.

amostra_conveniencia = df.head(300)
amostra_conveniencia.head()

#8. Criar uma amostragem por cotas considerando o tipo de transferências e localização .

amostra_cotas = df.groupby(['Tipo_Transacao','Localizacao']).apply(lambda x: x.sample(n=25)).reset_index(drop=True)
amostra_cotas.head()

#9. Comparar os resultados das amostras aleatória e estratificada e explicar as diferenças.

amostra_simples = df.sample(n=1000, random_state=42) # Random State tem o mesmo papel do seed.
print(f'{amostra_simples.head()}\n')

from sklearn.model_selection import train_test_split

amostra_estratificada, _ = train_test_split(df, test_size=0.5, stratify=df["Localizacao"])
print(f'{amostra_estratificada.head()}\n')

print('A diferença está no que está sendo analizado e solicitado, amostra simples ele apresenta, num range de 1000 linhas, \nalguns exemplos a partir do ponto de partida 42, já a estratificada solicita uma amostra proporcional a localização.'

