#SUCESIONES MONOTONAS


#P5 (1/n)
#a (terminos 10,100,1000,10000,100000)
a=[]
for i in range(5):
    n=10**(i+1)
    a.append(1/n)
    print(f"a[{n}]={a[i]}")

print("")


#b (mayor entre a9 y a99)
'''
el mayo es a9 ya que siempre sera 1/n, y mientras mas se divida, menor sera el resultado
'''

#P6 ((1+(1/n))**n)
#a (terminos 10,100,1000,10000,100000)

a=[]
for i in range(5):
    n=10**(i+1)
    a.append((1+(1/n))**n)
    print(f"a[{n}]={a[i]}")

print("")

#b (que tipo de sucesion es)
# es una sucesion monotona creciente

#c (algun resultado es mayor al numero de Euler e(2,71828))
# no, ya que el ultimo numero de la sucecion (100000) es 2.7182682371922975


#P7 (5,10,15,20,25...)
#a (que caracteriza a los numeros)
# son numeros enteros con una secuencia de razon 2

#b (la expresion algebraica del termino)
#la expresion es 5n

#c (expreselo en python)
c=[]
for i in range(10):
    n=i+1
    c.append(5*n)
    print(f"c[{n}]={c[i]}")

print("")

    
#P8 (7,14,21,28,35,42...)
#a (que caracteriza a los numeros)
# son numeros enteros con una secuencia de razon 2

#b (la expresion algebraica del termino)
#la expresion es 5n

#c (expreselo en python)
c=[]
for i in range(10):
    n=i+1
    c.append(7*n)
    print(f"c[{n}]={c[i]}")

print("")



#P9 tn=(2,5,10,17,26,37...) un= (0,3,8,15,24,35...) vn=(10,40,90,160,150,360...)
#a y b (expresion algrebraica de cada caso)

#caso tn
a=[]
for i in range(6):
    n=i+1
    a.append((n**2)+1)
    print(f"a[{n}]={a[i]}")

print("")

#caso un
b=[]
for i in range(6):
    n=i+1
    b.append((n**2)-1)
    print(f"b[{n}]={b[i]}")

print("")

#caso vn
c=[]
for i in range(6):
    n=i+1
    c.append((n**2)*10)
    print(f"c[{n}]={c[i]}")

print("")
