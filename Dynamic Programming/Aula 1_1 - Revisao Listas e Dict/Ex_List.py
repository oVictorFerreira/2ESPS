#Ex Simples
#Lista com 5 numeros inteiros e printar 1º e o ultimo
lista = [1,2,3,4,5]
print("Os números são:", lista[0],"e", lista[-1])

#Lista com 4 nomes - Alterar o terceiro nome da lista e mostrar a lista atualizada
nomes = ["Ana", "Clara", "Paula", "Rosa"]
print(nomes)
tirar_nome = nomes.pop(2)
adc_nome= nomes.insert(2, "Jorge")
print(nomes)

# Criar uma lista com 3 numeros - Adicionar 2 novos numeros no final da lista
lista1 = [1,2,3]
lista1.extend([4, 5])
print(lista1)

# Crie uma lista com 6 números - Remova o segundo elemento - Remova o ultimo elemento
lista2 = [1,2,3,4,5,6]
lista2.pop(1)
lista2.pop(-1)
print(lista2)

#Crie uma lista com 5 numeros fora de ordem - ordene em ordem crescente e mostre o resultado

lista = [20,10,15,245,12]
lista.sort()
print(lista)

#Crie uma lista com 5 numeros - percorra a lista e mostre cada numero multiplicado por 3
lista = [12,15,22,24,30]
for i in lista:
    i = i * 3
    print(i)


#Exercícios rotas
# 1 - Criar uma lista chamada rota sul contendo as cidades: Porto alegre, Florianópolis,Curitiba e São Paulo

rota_sul = ["Porto Alegre", "Florianópolis", "Curitiba", "São Paulo"]

#A - Imprima a primeira cidade
print(rota_sul[0])

#B - Imprima a ultima cidade
print(rota_sul[-1])

#C - Mostre o número de cidades na rota
print(len(rota_sul))

# 2 - Expandindo a rota
rota = ["Manaus","Brasília","São Paulo"]

#A - Adicione o Rio de Janeiro ao final da lista
rota.append("Rio de Janeiro")

#B - Insira Salvador na posição 1
rota.insert(1, "Salvador")

#C - Remova Manaus
rota.remove("Manaus")

#D - Mostre a lista final
print(rota)

# 3 - Crie uma lista chamada distancias
distancias = [376,251,408,716]

#A - Calcule a soma total das distâncias
print(sum(distancias))
#B - Mostre a maior distância
print(max(distancias))
#C - Mostre a menor distância
print(min(distancias))