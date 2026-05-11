from decimal import Decimal

nota_1 = Decimal(input("Nota 1: "))
nota_2 = Decimal(input("Nota 2: "))

print(f"A média entre {nota_1} e {nota_2} é igual a {((nota_1 + nota_2) / 2):2f}.")