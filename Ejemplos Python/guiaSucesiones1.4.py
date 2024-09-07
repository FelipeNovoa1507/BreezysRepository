#SUCECIONES GEOMETRICAS


#P13 (4,6,9....)
#a (razon geometrica)
razon=6/4

#b (expresion algebraica)
#c (termino de lugar 60)
a=[]
for i in range(60):
    n=i+1
    a.append(n*razon)
    print(f"a[{n}]={a[i]}")     