numA = int(input())
numB = input()

numB_list = list(map(int, numB))

print(numA * numB_list[2])
print(numA * numB_list[1])
print(numA * numB_list[0])
print(numA * int(numB))