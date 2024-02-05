# import numpy

# list = []
# for i in range(1, 10):
#     list.append(int(input()))
# print(max(list))
# print(numpy.argmax(list) + 1)

list = []
max_num = 0
max_index = 1
for i in range(1, 10):
    temp = int(input())
    if max_num < temp:
        max_num = temp
        max_index = i
    
print(max_num)
print(max_index)