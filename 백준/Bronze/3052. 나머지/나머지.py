list = [0 for _ in range(42)]
for i in range(10):
    A = int(input())
    remain = A % 42
    if list[remain] == 0:
        list[remain] = 1
print(list.count(1))