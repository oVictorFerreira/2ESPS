lista = [3, 7, 11, 18, 22, 27, 34, 41, 49, 56, 64, 72, 85, 93, 101]

# Exercício 1

busca = int(input("Digite o número a buscar: "))

comparacoes = 0
encontrado = False

for i in range(len(lista)):
    comparacoes += 1
    if lista[i] == busca:
        print(f"Número encontrado na posição {i}!")
        encontrado = True
        break

if not encontrado:
    print("Número não encontrado.")

print("Comparações realizadas:", comparacoes)

# Exercício 2
def busca_binaria(lista, valor):
    inicio = 0
    fim = len(lista) - 1

    while inicio <= fim:
        meio = (inicio + fim) // 2
        if lista[meio] == valor:
            return meio
        elif lista[meio] < valor:
            inicio = meio + 1
        else:
            fim = meio - 1

    return -1  # não encontrado


# Programa principal
num = int(input("Digite o número que deseja buscar: "))

pos = busca_binaria(lista, num)

if pos != -1:
    print(f"Número encontrado na posição {pos}.")
else:
    print("Número não encontrado.")


