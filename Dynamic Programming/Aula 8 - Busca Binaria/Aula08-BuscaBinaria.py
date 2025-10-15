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
lista = sorted([int(x) for x in input("Digite 5 números ordenados: ").split()])
num = int(input("Digite o número que deseja buscar: "))

pos = busca_binaria(lista, num)

if pos != -1:
    print(f"Número encontrado na posição {pos}.")
else:
    print("Número não encontrado.")
