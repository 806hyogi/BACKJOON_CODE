num = int(input())

i = 0
while(i < num):
  num1, num2 = input().split()
  num1 = int(num1)
  num2 = int(num2)
  
  x = num1 + num2
  i += 1
  print(x)