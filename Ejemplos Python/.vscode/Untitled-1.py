may=0
men=0
igual=0
for pnum in range (5):
    pnum=int(input("Ingrese el primer número: "))
    if pnum<0:
        may+=1
    elif pnum>0:
        men+=1
    elif pnum==0:
        igual+=1
print ("La cantidad de numeros mayores a 0 es: ", may)
print ("La cantidad de numeros menores a 0 es: ", men)
print ("La cantidad de numeros iguales a 0 es: ", igual)
