a=[]
suma = 0
for i in range (24):
    a.append(190000+3500*i)
    suma=a[i]+suma
    print (f'a({i})={a[i]}')
print (f'total = {suma}')

#P1 (exprese las sumas de la guia)
#a1(a5,a6,.....,a13)
#empieza en a5 y termina en a13, con 8 terminos por identificar

#a2(b38,b39,....,b48)
#empieza en b38 y termina en b48, con 10 terminos por identificar  

#a3(c21,c22,....,c93)
#empieza en c21 y termina en c93, con 72 terminos por identificar



#P2 (3N**2+7)
#a (primeros 12 terminos)
a=[]
suma=0
for i in range(12):
    m=i+1
    a.append(3*(m**2)+7)
    suma+=a[i]
    print (f'a({i})={a[i]}')
print (f'total primeros 12 terminos = {suma}')

print("")
#b (terminos del 13 a 24)
suma=0
for i in range(12):
    m=i+13
    suma+=(3*(m**2)+7)
print (f'total terminos 13 a 24 = {suma}')


#P3 (Sn Y Tn son multiplos de 6 y 13)
#b (Sn)
suma=0
for i in range(27):
    m=i+35
    suma+=(6*m)
print (f'total multiplos de 6 = {suma}')

print("")

#c (Tn)
suma=0
for i in range(22):
    m=i+15
    suma+=(13*m)
print (f'total multiplos de 13 = {suma}')


#P4 (Xn = -1.5*(n**2)+(6*n))/3
suma=0
for i in range(3):
    n=i+1
    suma+=(-1.5*(n**2)+(6*n))/3
print (f'promedio = {suma}')

