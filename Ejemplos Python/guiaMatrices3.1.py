X=[[3200,1500],[6200,2800],[5100,1700]]
Y=[[4800,1700],[5600,4300],[5700,3400]]
Z=[]
for i in range(3):  #i desde 0 hasta 2
    Z.append([])
    for j in range(2): # j desde 0 hasta 1
        Z[i].append(X[i][j]+Y[i][j])
print(Z)


#P1
A=[[0],[1596],[2070],[2582]]
L=[[1596],[0],[473],[989]]
S=[[2070],[473],[0],[516]]
C=[[2582],[989],[516],[0]]
#A (es una matriz 4x4 (4 filas y 4 columnas ))
#B (es 989)
#C (es 516)
#D (es 1596)


#P2 .....

#P3
A=[[2.6,4.8,1.8,0.9],[3.2,4.4,2.5,2.8],[2.4,3.6,3.8,2.5]]

B=[[3.6,2.5,3.0,2.5],[4.5,5.0,3.5,3.8],[2.9,3.0,4.6,4.0]]

S=[]

for i in range(len(A)):
    S.append([])
    for j in range(len(A[i])):
        S[i].append((A[i][j]+B[i][j]))
print(S)



#P4
A=[[71,80,75,90],[65,58,74,82]]

D=[[75,83,80,94],[67,60,78,85]]

V=[]

for i in range(len(A)):
    V.append([])
    for j in range(len(A[i])):
        #A y B
        V[i].append((D[i][j]-A[i][j]))
print(V)
