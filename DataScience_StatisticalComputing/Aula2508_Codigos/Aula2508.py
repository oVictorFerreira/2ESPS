import pandas as pd
import numpy as np

# Criando um dataframe ficticio
np.random.seed(42) # garante a reprodução do experimento - a reprodução vai por ex: 0, 42, 84...
#Ex rodei 42* a bola do bingo e tirei 1 vez pra saber o resultado, 42 é o numero tradicional.
n = 10000 # Quantidade de clientes que queremos gerar dados ficticios

df = pd.DataFrame({
    "ID": range(1, n+1),
    "Idade": np.random.randint(18, 65, n), #entre 18, 65 até completar os 10k)
    "Renda": np.random.randint(2000, 30000, n),
    "Regiao": np.random.choice(["Norte", "Sul", "Leste", "Oeste"], n) #escolhe aleatoriamente até chegar aos 10k
})

df.sample(5) #chacoalhei um saco e saiu 5 linhas aleatorias

## **Amostragem AleatÃ³ria Simples**

amostra_simples = df.sample(n=1000, random_state=42) # Random State tem o mesmo papel do seed.
amostra_simples.head() #o head pega as 5 primeiras linhas

## **Amostragem AleatÃ³ria Sistematica**

intervalo = np.random.randint(1, 50) # Gera intervalo com base na quantidade de registros arrendondando para baixo
amostra_sistematica = df.iloc[::intervalo, :]
amostra_sistematica.head()

## **Amostragem Estratificada**

from sklearn.model_selection import train_test_split

amostra_estratificada, _ = train_test_split(df, test_size=0.5, stratify=df["Regiao"])
amostra_estratificada.head()

## **Amostragem por Conglomerados**

clusters = df.groupby('Regiao')
amostra_conglomerados = clusters.get_group('Sul')
amostra_conglomerados.head()

## **Amostragem Por ConveniÃªncia**

amostra_conveniencia = df.head(1000)
amostra_conveniencia.head()

## **Amostragem por Julgamento**

amostra_julgamento = df[(df['Idade'] > 30) &
                        (df['Idade'] <=55) &
                        (df['Renda'] > 1500) |
                        (df['Regiao'] != 'Oeste')].sample(n=1000, random_state=42)

amostra_julgamento.head()

## **Amostragem por Cotas**

amostra_cotas = df.groupby('Regiao').apply(lambda x: x.sample(n=25)).reset_index(drop=True)
amostra_cotas.head()