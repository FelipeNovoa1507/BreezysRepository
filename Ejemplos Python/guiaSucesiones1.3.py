#SUCESIONES ARITMETICAS


#P11 (25.72,26.93,28.14)
#a (diferencia aritmetica)
f=26.93-25.72

#b (expresion algebraica)
#c (calcule el termino 50)
a=[]
a1=25.72
for i in range(50):
    n=i+1
    rest=round(a1+(f*i),3)
    a.append(rest)
    print(f"a[{n}]={a[i]}")

print("")

#d (termino 411,71)
n = 0
a1=25.72
termino = 0
vfinal = 411.71 #valor del teermino al cual hay que llegar
dif=vfinal-termino
while dif > 0:
    n=n+1
    termino = a1+(f*n)
    dif=vfinal-termino
print (f'El termino de lugar {n+1} es {termino}')

print("")


#P12 (diferencia es 4 y el termino 10 es -20)
#a (primer termino)
a=-20
for i in range(9):
    a-=4
    n=(9-i)
    print(f"[{n}]={a}") #el termino 1 es -56

print("")

#b (expresion algebraica)
#c (termino de lugar 100)
a=[]
a1=-56
rest=4
for i in range(100):
    n=i+1
    f=rest*i
    a.append(a1+f)
    print(f"a[{n}]={a[i]}")

print("")

#d (termino 1.680)
n = 0
a1=-56
rest=4
termino = 0
vfinal = 1680 #valor del teermino al cual hay que llegar
dif=vfinal-termino
while dif > 0:
    n=n+1
    f=rest*n
    termino = a1+f
    dif=vfinal-termino
print (f'El termino de lugar {n+1} es {termino}')

print("")

