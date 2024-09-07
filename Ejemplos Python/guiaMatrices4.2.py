import numpy as np
##P3
M=np.array([[9,14],
           [4,5]])

Q=np.array([[200,240,220],
           [175,210,215]])

G=np.dot(M,Q)

print(G)
    