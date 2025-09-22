# Programa: Pilha de navegação de páginas (LIFO)
pilha = [] # cria uma lista vazia que será usada como pilha
limite = 3 # limite máximo de elementos (para facilitar o teste de mesa)

# Loop principal do programa (menu interativo)
while True:
    print("\n--- Menu Pilha de Navegação ---")
    print("1. Empilhar (Push)")
    print("2. Desempilhar (Pop)")
    print("3. Ver topo (Peek)")
    print("4. Mostrar pilha")
    print("5. Sair")
    opcao = input("Escolha uma opção: ") # usuário escolhe a ação

    # Caso 1 → Empilhar (PUSH)

    if opcao == "1":
        if len(pilha) < limite:  # verifica se ainda há espaço
            pagina = input("Digite o nome da página: ")
            pilha.append(pagina)  # adiciona no topo (PUSH)
            print("Página adicionada:", pagina)
        else:
            print("A pilha está cheia! Não é possível empilhar mais páginas.")

    # Caso 2 → Desempilhar (POP)
    elif opcao == "2":
        if len(pilha) > 0:  # verifica se a pilha não está vazia
            removida = pilha.pop()  # remove o último elemento (POP)
            print("Página removida:", removida)
        else:
            print("A pilha está vazia! Não há nada para desempilhar")

    # Caso 3 → Ver topo (PEEK)
    elif opcao == "3":
        if len(pilha) > 0:  # verifica se há elementos
            print("Topo da pilha (última página):", pilha[-1])  # acessa topo
        else:
            print("A pilha está vazia!")

    # Caso 4 → Mostrar toda a pilha
    elif opcao == "4":
            print("Pilha atual:", pilha)

    # Caso 5 → Sair do programa

    elif opcao == "5":
        print("Saindo do programa...")
        break  # encerra o loop while
        # Qualquer outra entrada é inválida
else:
    print("Opção inválida! Tente novamente.")


