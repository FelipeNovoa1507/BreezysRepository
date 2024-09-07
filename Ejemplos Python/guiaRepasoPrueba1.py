#P1
a=[]
tasa=5000000
a.append(tasa)
for i in range(100):
    n=i
    tasa=tasa+(tasa*0.023)
    a.append(tasa)

for i in range(len(a)):
    print(f"a[{i}] = {a[i]}")


#P2
b=[]
arriendo=185000
for i in range(100):
    incr=3000*i
    b.append(arriendo+incr)

for i in range(len(b)):
    print(f"b[{i+1}] = {b[i]}")


#P2
b=[]
arriendo=150000
for i in range(24):
    incr=2000*i
    b.append(arriendo+incr)

for i in range(len(b)):
    print(f"b[{i+1}] = {b[i]}")
