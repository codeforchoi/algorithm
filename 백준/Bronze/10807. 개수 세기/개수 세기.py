N = int(input())

list = list(map(int, input().split()))
v = int(input())
count = 0

for i in list:
    if i == v:
        count += 1

print(count)