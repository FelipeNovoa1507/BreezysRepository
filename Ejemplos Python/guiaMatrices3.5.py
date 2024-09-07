#P7
M=[]
i=0
for a in range(8):
    M.append([])
    i+=1
    for j in range(9):
        j+=1
        M[a].append((8*i)+(12*j))
for i in range(len(M)):
    print(M[i])     

print("\n\n")
    
MT=[[M[j][i] for j in range(len(M))] for i in range(len(M[0]))]
for i in range(len(MT)):
    print(MT[i])



print("\n\n")
#P8
i=0
A=[]
for a in range(5):
    A.append([])
    i+=1
    for j in range(7):
        j+=1
        A[a].append(i*j)
for i in range(len(A)):
    print(A[i])
