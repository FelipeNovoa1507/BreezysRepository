import numpy as np
a=np.array([[1,2],
            [3,2]])
b=np.array([[290,312],
            [345,413]])

c=(a*b)+b
print(c)


##P2
v=np.array([[1300,900,800],
           [2100,1700,1500],
           [1500,1200,900]])

p=np.array([[3600,900,1500]])

r=np.dot(p,v)

print(r)