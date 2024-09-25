# import regexp
import re

#Function for testing
def TestReg(x ,n):
    #Compile regexp
    pattern = re.compile(n)

    #Finditer
    matches = pattern.finditer(x)

    #Iterate 
    for match in matches:
        print(f'"{match.group()}" is found at index {match.start()}')

#Samples
print("Test cases 1")
x1 = "abaaaabbbaabba"
n1 = "ab"
TestReg(x1, n1)

print(" ")
print("Test cases 2")

x2 = "abaaaaabbbaabbaa"
n2 = "ab+"
TestReg(x2, n2)

