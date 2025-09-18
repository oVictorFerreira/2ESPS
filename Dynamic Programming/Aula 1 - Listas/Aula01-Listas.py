#Exemplo. 1 - Lista de frutas usando FOR

frutas = ["Maçã", "Banana", "Laranja"] # Cria uma lista
for fruta in frutas: # Percorre cada elemento da lista
  print(fruta)

# Exemplo 2 - Lista de Frutas usando WHILE
frutas = ["Maçã", "Banana", "Laranja"] # Cria uma lista
i = 0

while i <len(frutas): #Quando ja tem condição de parada pré definida
  print(frutas[i])
  i+=1