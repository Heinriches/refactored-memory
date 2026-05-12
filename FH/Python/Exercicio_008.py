from decimal import Decimal

dist = Decimal(input("Digite uma distância, em metros: "))

print(f" A distância de {dist}m corresponde a: \n")
print(f"{(dist / 1000):>15,.3f} Km.")
print(f"{(dist * 100):>15,.2f} cm.")
print(f"{(dist * 1000):>15,.2f} mm.")