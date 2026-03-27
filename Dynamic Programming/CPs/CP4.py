from treelib import Tree


# Etapa A — Modelagem do problema e adaptação do código em Python (obrigatória)

class Estado:
  def __init__(self, cidade, pai):
    self.cidade = cidade
    self.pai = pai

class Busca:
    # Representar em Python o grafo da Figura 1, usando um dicionário.
    def __init__(self):
        self.rotas = {
            'A': ['B', 'C', 'D', 'E'],
            'B': ['A', 'K'],
            'C': ['A', 'I'],
            'D': ['A', 'N'],
            'E': ['A', 'J'],
            'F': ['I', 'N'],
            'G': ['J', 'Q'],
            'H': ['K', 'L'],
            'I': ['C', 'F', 'L', 'M'],
            'J': ['E', 'G', 'N', 'Q'],
            'L': ['H', 'I', 'P'],
            'K': ['B', 'H'],
            'M': ['I', 'O'],
            'N': ['D', 'F', 'J'],
            'O': ['M', 'P', 'R'],
            'P': ['L', 'O', 'R'],
            'Q': ['G', 'J', 'R'],
            'R': ['O', 'P', 'Q']
        }

    # Configurar o problema para encontrar um caminho de A até R.

    def busca(self, origem, destino, fronteira):
        atual = Estado(origem, None)
        fronteira.put(atual)
        visitados = set()
        visitados.add(atual.cidade)
        qtdVisitados = 1
        qtdExpandidos = 0

        arvore = Tree()
        arvore.create_node(atual.cidade, atual)

        resultado = None
        while not fronteira.empty() and resultado is None:
            atual = fronteira.get()
            qtdExpandidos += 1
            resultado, fronteira, visitados, qtdVisitados, arvore = self.geraFilhos(
                atual, destino, fronteira, visitados, qtdVisitados, arvore
            )

        return resultado, qtdVisitados, qtdExpandidos, arvore

    def geraFilhos(self, atual, destino, fronteira, visitados, qtdVisitados, arvore):
        cidades = self.rotas.get(atual.cidade)

        for c in cidades:
            if c == destino:
                qtdVisitados += 1
                novo = Estado(c, atual)
                visitados.add(c)
                arvore.create_node(c, novo, parent=atual)
                return novo, fronteira, visitados, qtdVisitados, arvore

            if c not in visitados:
                qtdVisitados += 1
                novo = Estado(c, atual)
                fronteira.put(novo)
                visitados.add(c)
                arvore.create_node(c, novo, parent=atual)

        return None, fronteira, visitados, qtdVisitados, arvore

    def mostraResultado(self, resultado, qtdVisitados, qtdExpandidos, arvore):
        if resultado is None:
            print('Solução não encontrada.')
        else:
            print('***Rota encontrada***')
            while resultado is not None:
                print(resultado.cidade)
                resultado = resultado.pai

        print('Estados visitados:', qtdVisitados)
        print('Estados expandidos:', qtdExpandidos)
        print('****Árvore gerada****')
        arvore.show()


# Importação da classe Queue que implementa a Fila usada para armazenar a fronteira
from queue import Queue, LifoQueue

# Rode a busca em largura (BFS) e veja se as duas funcionam.
class BuscaLargura(Busca):

  def realizaBusca(self, origem, destino):
    fronteira = Queue()
    resultado, qtdVisitados, qtdExpandidos, arvore = self.busca(origem, destino, fronteira)
    self.mostraResultado(resultado, qtdVisitados, qtdExpandidos, arvore)


algbusca = BuscaLargura()
algbusca.realizaBusca('A','R' )

# Rode a busca em profundidade (DFS) e veja se as duas funcionam.

class BuscaProfundidade(Busca):
    def realizaBusca(self, origem, destino):
        fronteira = LifoQueue()
        resultado, qtdVisitados, qtdExpandidos, arvore = self.busca(origem, destino, fronteira)
        self.mostraResultado(resultado, qtdVisitados, qtdExpandidos, arvore)

algdfs = BuscaProfundidade()
algdfs.realizaBusca('A', 'R')