#notas e moedas

valor = float(input())
centavos = int(valor * 100)

print("Notas: ")
notas = [10000, 5000, 2000, 1000, 500, 200]
for nota in notas:
    quantidade_notas = centavos // nota
    print(quantidade_notas, "nota(s) de R$", nota / 100)
    centavos %=nota

print("Moedas:")
moedas = [100, 50, 25, 10, 5, 1]
for moeda in moedas:
    quantidade_moedas = centavos // moeda

    print(quantidade_moedas, "moeda(s) de R$", moeda / 100)
    centavos %= moeda  

    
    
    