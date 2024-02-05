N, M = map(int, input().split())
arr = [i for i in range(1,N+1)]
for _ in range(M):
    i , j = map(int, input().split())
    for k in range((j-i)//2 + 1):
        arr[i-1+k], arr[j-1-k] = arr[j-1-k], arr[i-1+k]
print(*arr)