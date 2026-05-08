from decimal import Decimal

distancia = Decimal(input("Digite uma distância, em metros: "))

print(f"A distância de {distancia}m corresponde a :")
print(f"{(distancia / 1000):.2f} km.")
print(f"{(distancia * 100):.2f} cm.")
print(f"{(distancia * 1000):.2f} mm.")