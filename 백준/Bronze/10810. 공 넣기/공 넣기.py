N, M = map(int, input().split())
list = [0 for _ in range(N)]    # list = [0] * N
for _ in range(M):
    i, j, k = map(int, input().split())
    list[i-1:j] = [k for _ in range(j-i+1)]
print(*list)