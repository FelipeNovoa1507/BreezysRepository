# ejemplo de uso de repositorio
import os
os.system("color a")
print("DATOS PERSONALES")
print("----------------\n")
vNom=str(input("Ingrese su nombre: "))
while True:
    try:
        vEdad=int(input("Ingrese su edad: "))
        break
    except:
        print("Ingreso no válido")
print("----------------\n")
print(f"Su nombre es: {vNom}")
print(f"Su edad es: {vEdad}")

print("Programa finalizado...")