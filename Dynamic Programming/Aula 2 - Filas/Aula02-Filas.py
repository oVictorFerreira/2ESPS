# Criando uma fila inicial

fila = ["Cliente 1", "Cliente 2", "Cliente 3"]
print("Fila inicial:", fila)

# Inserindo novos clientes (enqueue)

fila.append("Cliente 4")  # entra no final da fila
fila.append("Cliente 5")
print("Fila após inserções:", fila)

# Atendendo clientes (dequeue)

while len(fila) > 0:  # enquanto a fila não estiver vazia
    cliente = fila.pop(0)  # remove sempre o primeiro (posição 0)
    print(f"Atendendo {cliente}")  # mostra quem foi atendido
    print("Fila atualizada:", fila)
print("Fila final:", fila)