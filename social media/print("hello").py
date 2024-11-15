import numpy as np
import matplotlib.pyplot as plt
np.random.seed(42)
X = np.random.rand(3,3) # real matrix
Z = np.random.rand(3,3) + 1j * np.random.rand(3,3) # bthg a + bi , trong code thì nó là a + bj

print(f"determinant of matrix X = {np.linalg.det(X)}")
print(f"determinant of matrix Z = {np.linalg.det(Z)}")
mat1 = np.random.rand(4,4)
mat2 = np.random.rand(4,4) + 1j * np.random.rand(4,4)

