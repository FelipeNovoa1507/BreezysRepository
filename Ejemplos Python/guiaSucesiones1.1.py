#SUCESIONES


#P1  (3n**2+7)
#a (los 5 primeros terminos)
a=[]
for i in range(5):
    n=i+1
    a.append(3*(n**2)+7)
    print(f"a[{n}]={a[i]}")

#b (5 terminos despues del 15)
b=[]
for i in range(5):
    n=i+16
    b.append(3*(n**2)+7)
    print(f"b[{n}]={b[i]}")


print("")


#P2 (5n**3)
#a (los primeros 4 terminos)
a=[]
for i in range(4):
    n=i+1
    a.append(5*(n**3))
    print(f"a[{n}]={a[i]}")

#b (los 4 terminos despues del 8)
b=[]
for i in range(4):
    n=i+9
    b.append(5*(n**3))
    print(f"b[{n}]={b[i]}")

#c (40000 pertenece a la sucesion?)
n = 0
termino = 0
vfinal = 40000 #valor del teermino al cual hay que llegar
dif=vfinal-termino
while dif > 0:
    n=n+1
    termino = 5*(n**3)
    dif=vfinal-termino
anterior =3*(n-1)**2+7
print (f'El termino de lugar {n} es {termino}')
print (f'El termino de lugar {n-1} es {anterior}')


print("")


#P3 6*(n-1)**2
#a (primeros 2 terminos)
a=[]
for i in range(20):
    n=i+1
    a.append((-1)**n)
    print(f"a[{n}]={a[i]}")

#b (que se afirma de la sucesion)
''' 
se puede afirmar que ya que la base es -1, no importa a cuanto se eleve, siempre será 1 o -1
'''

#c (que posicion usa el 2020)
'''
ninguno ya que el resultado jamas sera mayor a 1
'''

#P4 (6n*(-1)**n)
#a (los primeros 100 terminos)
a=[]
for i in range(100):
    n=i+1
    a.append(6*n*(-1)**n)
    print(f"a[{n}]={a[i]}")

#b (que caracteristicas observas en la sucesion)
'''
se puede ver que los resultados se van intercalando entre negativo y positivo
'''
