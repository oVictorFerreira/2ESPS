lista = [3, 8, 12, 7, 5]
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