a = int(input())
arr = list(map(int, input().split()))
b = int(input())

count = 0

for i in arr:
    if i == b:
        count += 1  

print(count)  
