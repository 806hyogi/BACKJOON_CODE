a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)


if (a == b == c):
  money = 10000 + a * 1000

elif ((a == b) | (b == c) | (c == a)):
  
  if (a == b):
    same = a
  if (b == c):
    same = b
  if (c == a):
    same = c
  
  money = 1000 + same * 100

elif (a != b != c):
  
  max = a
    
  if (b > max):
    max = b
      
  if (c > max):
    max = c
  
  money = max * 100

print(money)



