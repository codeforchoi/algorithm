A, B, C = map(int, input().split())

money = 0

if A == B and B == C:
    money = 10000 + A * 1000
elif (A == B and B != C) or (A == C and B != C) or (B == C and A != B):
    if A == B:
        same = A
    elif A == C:
        same = A
    else:
        same = B
    money = 1000 + same * 100
else:
    money = max(A, B, C) * 100

print(money) 