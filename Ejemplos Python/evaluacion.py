import os
os.system("color d")
totalnino=0
totaljov=0
totaladult=0
total1=0
total2=0
total3=0
totalgan=0
det=True
sw=True
while det==True:
    bt1=True
    bt2=True
    bt3=True
    bt4=True
    bt5=True
    os.system("CLS")
    print("Bienvenido al cine Moro")
    while bt1==True:
        try:
            os.system("CLS")
            resp=int(input("Ingrese tipo de entrada: \n1.- Niño (1 a 13 años)\n2.- Jóven (14 a 21 años)\n3.- Adulto (Mayor a 22)\nDigite: ")) 
            bt1=False
            if resp==1:
                total=5500
                while bt2==True:
                    try:
                        os.system("CLS")
                        cantent=int(input(f"El precio de su entrada es de $5500 pesos.\n¿Cuántas entradas desea comprar?\nDigite: "))
                        total*=cantent
                        totalnino+=cantent
                        os.system("CLS")
                        print(f"======BOLETA======\nCategoría: Niño\nCantidad de entradas: {cantent}\nTotal a pagar: ${total} pesos")
                        total1+=total
                        bt2=False
                    except:
                        bt2=True
                        print("Ingrese una opción válida.")
                        input("Presione cualquier tecla para continuar.")
            elif resp==2:
                total=7000
                while bt3==True:
                    try:
                        os.system("CLS")
                        cantent=int(input(f"El precio de su entrada es de $7000 pesos.\n¿Cuántas entradas desea comprar?\nDigite: "))
                        total*=cantent
                        totaljov+=cantent
                        os.system("CLS")
                        print(f"======BOLETA======\nCategoría: Jóven\nCantidad de entradas: {cantent}\nTotal a pagar: ${total} pesos")
                        total2+=total
                        bt3=False
                    except:
                        bt3=True
                        print("Ingrese una opción válida.") 
                        input("Presione cualquier tecla para continuar.")
            elif resp==3:
                total=9000
                while bt4==True:
                    try:
                        os.system("CLS")
                        cantent=int(input(f"El precio de su entrada es de $9000 pesos.\n¿Cuántas entradas desea comprar?\nDigite: "))
                        total*=cantent
                        totaladult+=cantent
                        os.system("CLS")
                        print(f"======BOLETA======\nCategoría: Adulto\nCantidad de entradas: {cantent}\nTotal a pagar: ${total} pesos")
                        total3+=total
                        bt4=False
                    except:
                        bt4=True
                        print("Ingrese una opción válida.")
                        input("Presione cualquier tecla para continuar.")
            else:
                os.system("CLS")
                print("Ingrese una opción válida.")
                bt1=True
        except:
            bt1=True
            print("Ingrese una opción válida.")
            input("Presione cualquier tecla para continuar.")
    input("Presione cualquier tecla para continuar.")
    while bt5==True:
        try:
            os.system("CLS")
            sw=int(input("Desea realizar otra compra?\n1.- Si\n2.- No\nDigite: "))
            bt5=False
            if sw==1:
                det=True
            elif sw==2:
                det=False
            else:
                print("Ingrese una opción válida.")
                bt5=True
        except:
            print("Ingrese una opción válida.")
            bt5=True
        input("Presione cualquier tecla para continuar.")
os.system("CLS")
totalent=(totalnino+totaljov+totaladult)
totalgan=(total1+total2+total3)
print(f"La cantidad de entradas de categoría \"Niño\" vendidas es: {totalnino} ({((totalnino*100)//totalent)}% de las entradas totales.)")
print(f"La cantidad de entradas de categoría \"Jóven\" vendidas es: {totaljov} ({((totaljov*100)//totalent)}% de las entradas totales.)")
print(f"La cantidad de entradas de categoría \"Adulto\" vendidas es: {totaladult} ({((totaladult*100)//totalent)}% de las entradas totales.)")
print(f"Total de ganancias del día: ${totalgan} pesos")
print("\n")
print("Muchas gracias, hasta mañana.")
input("Presione cualquier tecla para continuar.")