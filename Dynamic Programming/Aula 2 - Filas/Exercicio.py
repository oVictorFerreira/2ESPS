# Uma loja possui um sistema de atendimento por ordem de chegada.
# - A quantidade máxima de clientes na fila é 3.
# - Os clientes entram na fila e são atendidos na mesma ordem (FIFO).
# - O programa deve pedir o nome dos clientes, adicionar à fila e depois atendê-los na ordem correta.
# - Ao final, exibir: "Todos foram atendidos!".
# - Faça o teste de mesa.

fila = []
atendidos = 0
maximo = 3
for i in range(maximo):
    cliente = input("Informe o nome do cliente: ")
    fila.append(cliente)
    print(f"O cliente {cliente} foi adicionado na fila com sucesso!")
    print(f"Fila: {fila}")
    maximo += 1

while len(fila) > 0:
    cliente_atual = fila.pop(0)  # remove sempre o primeiro
    print(f"Atendendo cliente {cliente_atual}")
    print(f"Fila: {fila}")
print("Todos foram atendidos!")

