N = int(input())
score = list(map(int, input().split()))
sum = 0
max_score = max(score)
for i in score:
    sum += i /max_score * 100
print(sum/N)