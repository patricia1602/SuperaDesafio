#pares e ímpares

listaPar = []
listaImpar = []
entrada = int(input()
)
for i in range(entrada): #entrada ->digite um número
    numero = int(input())
    if numero % 2 == 0: #um número divisível por 2 igual a zero é par
        listaPar.append(numero)
    else:
        listaImpar.append(numero)

        listaPar.sort() #par em ordem crescente
        listaImpar.sort(reverse=True) #ímpar em ordem de crescente
        lista = listaPar + listaImpar #lista na horizontal
        print(lista) 


        for i in range(len(lista)): #lista na vertical
            print(lista[i])


            