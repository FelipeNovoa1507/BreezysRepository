import math

an=[]
sw=True

sl=math.log((68.34375/4),1.5)+1
print(sl)



n1=int(input("Digite el primer numero de la sucesion: "))
n2=float(input("Digite la razon de la sucesion: "))
an.append(n1)
for i in range(10):
    susg=n1*n2
    n1=susg
    an.append(susg)
    print(f"Posicion[{i+1}]:{an[i]}")