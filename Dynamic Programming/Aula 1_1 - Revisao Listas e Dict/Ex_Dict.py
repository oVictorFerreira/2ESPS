# Exercício 1
distancia_sp = {
    "Belo Horizonte":490, "Curitiba":339,"Porto Alegre":852, "Salvador":1454
}

#A - Mostre a distancia de SP até Curitiba
print("A distancia é de",distancia_sp["Curitiba"],"KM")

#B - Some todas as distâncias do dicionário

soma = 0
for km in distancia_sp.values():
    soma += km
print("O valor total das distancias a partir de SP é de:",soma,"KM")

#C - Mostre qual cidade tem a maior distância saindo de SP

print(max(distancia_sp))

#Exercício 2 - Crie um dicionário chamado conexões onde cada cidade guarda uma lista com as cidades conectadas diretamente
conexoes = {
    "Porto Alegre":["Florianópolis","São Paulo"],
    "Florianópolis":["Curitiba","Porto Alegre"],
    "Curitiba":["Florianópolis","Rio de Janeiro","São Paulo"],
    "São Paulo":["Belo Horizonte","Curitiba","Porto Alegre","Salvador"],
    "Rio de Janeiro":["Belo Horizonte","Cuiabá","São Paulo","Rio de Janeiro"],
    "Belo Horizonte":["Brasília","Cuiabá","São Paulo","Rio de Janeiro"],
    "Brasília":["Belo Horizonte","Fortaleza"],
    "Salvador":["Fortaleza","São Paulo"],
    "Cuiabá":["Belo Horizonte","Manaus","Rio de Janeiro"],
    "Fortaleza":["Manaus","Salvador","Brasília"],
    "Manaus":["Cuiabá","Fortaleza"]
}
#A - mostre apenas as conexões de Curitiba
print(conexoes["Curitiba"])

#B - Verifique se o Rio de Janeiro está conectado diretamente a Curitiba

if conexoes["Curitiba"][1] == "Rio de Janeiro":
    print(f"O Rio de Janeiro se conecta sim com Curitiba: {conexoes['Curitiba']}")
else:
    print("Não conecta")

# Exercício 3 - Crie um dict chamado grafo representando parte do mapa (cidades -> lista de vizinhos), usando os dados

grafo = {
    "Manaus":["Cuiabá","Fortaleza"],
    "Fortaleza":["Manaus","Salvador","Brasília"],
    "Salvador":["Fortaleza","São Paulo"],
    "Brasília":["Belo Horizonte","Fortaleza"],
    "Belo Horizonte":["Brasília","Cuiabá","São Paulo","Rio de Janeiro"],
    "Cuiabá":["Belo Horizonte","Manaus","Rio de Janeiro"],
    "Rio de Janeiro":["Belo Horizonte","Cuiabá","Curitiba"],
    "São Paulo":["Belo Horizonte","Curitiba","Porto Alegre","Salvador"],
    "Curitiba":["Florianópolis","Rio de Janeiro","São Paulo"],
    "Florianópolis":["Curitiba","Porto Alegre"],
    "Porto Alegre":["Florianópolis","São Paulo"],
}

# A - Mostre as cidades vizinhas de Brasilia

vizinhas = grafo["Brasília"]
print(vizinhas)

# B - Conte quantas conexões são paulo possui
qntdconex = len(grafo["São Paulo"])
print("A quantidade de conexões é de: ",qntdconex)
# C - Verifique se Porto Alegre está diretamente conectado a Curitiba
if "Curitiba" in grafo["Porto Alegre"]:
    print(f"Curitiba se conecta sim")
else:
    print("Curitiba não se conecta")