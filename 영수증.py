import math
totalPrice = int(input())
num = int(input())

i = 0
sum = 0

while(i < num):
  
  price, number = input().split()
  price = int(price)
  number = int(number)
  
  sumPrice = price * number

  sum = sum + sumPrice
  
  i += 1
  
if(totalPrice == sum):
  print('Yes')
  
else:
  print('No')