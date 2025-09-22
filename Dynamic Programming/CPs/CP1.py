# Criamos uma fila vazia (lista que vamos usar como fila)
fila = []
# Definimos que a fila terá no máximo 3 clientes
quantidade = 3
# Inserindo os clientes na fila (ENQUEUE)
for i in range(quantidade):
 nome = input(f"Digite o nome do cliente {i+1}: ") # pede o nome
 fila.append(nome) # adiciona no fim da fila
 # Até aqui estamos apenas formando a fila inicial
# Atendendo os clientes (DEQUEUE)
while len(fila) > 0: # enquanto a fila não estiver vazia
 cliente = fila.pop(0) # remove o primeiro da fila (posição 0)
 print(f"Atendendo {cliente}") # mostra quem foi atendido
# Quando a fila acabar, mostramos a mensagem final
print("Todos foram atendidos!")

pilha = []  # cria pilha vazia

# Empilhando até 3 elementos
for i in range(3):  # repete 3 vezes
    valor = input(f"Digite o valor {i + 1}: ")
    pilha.append(valor)  # push
    print("Pilha atual:", pilha)

# Mostrando o topo antes de começar a remoção
print("\nTopo da pilha (peek):", pilha[-1])  # acesso O(1)

# Desempilhando todos os elementos
while len(pilha) > 0:  # repete até ficar vazia
    removido = pilha.pop()  # pop → remove último
    print(f"Removido: {removido}")
    print("Pilha atual:", pilha)
print("\nPilha final:", pilha)