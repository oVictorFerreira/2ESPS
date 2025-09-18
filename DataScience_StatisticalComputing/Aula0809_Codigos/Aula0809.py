import numpy as np
import scipy.stats as stats #Busca informações em outras bibliotecas ex.: numpy, pandas e é focado em estatísticas
import pandas as pd

#dados de exemplo
dados = [12, 20, 30, 40, 50, 100, 150, 200, 300, 500]

#média (mean)
media = np.mean(dados)
print(f'Média: {media}')

#mediana (median)
mediana = np.median(dados)

#média ponderada (weighted mean) - recebe o argumento dataframe (dados, peso) //ordena o df do menor para o maior //soma acumulada //divide por 2
pesos = [1, 1, 1, 1, 1, 2, 2, 2, 3, 3] #Pesos de cada elemento

media_ponderada = np.average(dados, weights=pesos)
print(f'Média Ponderada: {media_ponderada}')

## Mediana Ponderada // recebe o argumento do dataframe -> ordena o df e os pesos do menor para o maior ->  #Soma acmulada dos pesos - EX: dados -> 10, 20, 30 Pesos criados -> 0 - 10; 1 - 30; 2 - 60 -> soma acumulada // divide por 2 para encontrar o valor do meio // localiza o valor da mediana
def mediana_ponderada(dados, pesos):
  dados_ordenados, pesos_ordenados = zip(*sorted(zip(dados, pesos))) #ordena o df do menor para o maior
  soma_pesos = np.cumsum(pesos_ordenados) #Soma acmulada dos pesos - EX: dados -> 10, 20, 30 Pesos criados -> 0 - 10; 1 - 30; 2 - 60
  return dados_ordenados[np.searchsorted(soma_pesos, soma_pesos[-1] / 2)]

mediana_ponderada = mediana_ponderada(dados, pesos)
print(f'Mediana Ponderada: {mediana_ponderada}')

# Média aparada - Remove o 10% menores e maiores valores

media_aparada= stats.trim_mean(dados, proportiontocut=0.1) #0.1 = 10%
print(f'Média aparada: {media_aparada}')

# IQR - Intervlo interquartil
p25, p75 = np.percentile(dados, [25, 75]) #25% e 75%
iqr = p75 - p25
print(f'IQR: {iqr}')

# Detecção de OUTLIER com IQR
# 1.5 = uma parte e meia
limite_inferior = p25 - 1.5 * iqr
limite_superior = p75 + 1.5 * iqr
outliers = [x for x in dados if x < limite_inferior or x > limite_superior]

# Variancia

variancia = np.var(dados)

# DP Amostral
desvio_padrao_amostral = np.std(dados, ddof=1)

# DP Populacional
desvio_padrao_amostral = np.std(dados, ddof=0)

# Amplitude - range
amplitude = np.max(dados) - np.min(dados) # ex 500 - 10 = range -> 490

# Estatísticas ordinais - MODA
moda = stats.mode(dados, keepdims=True).mode[0]
print(f'Moda: {moda}')

#Percentil

percentil_25 = np.percentile(dados, 25)
percentil_50 = np.percentile(dados, 50)
percentil_75 = np.percentile(dados, 75)

# Quantil

quantil_05 = np.quantile(dados, 0.5)
quantil_075 = np.quantile(dados, 0.75)

# Desvio absoluto mediano da mediana

#mad = stats.median_absolute_deviation(dados)


