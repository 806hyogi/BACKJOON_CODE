# input()대신 sys.stdin.readline()을 사용하는 이유
# 한 두줄 입력받는 문제들과 다르게,
# 반복문으로 여러줄을 입력 받아야 할 때는 input()으로 입력 받는다면
# 시간초과가 발생할 수 있습니다.

import sys
count = int(sys.stdin.readline()) # 하나 입력받음

i = 0
while(i < count):
  num1, num2 = map(int, sys.stdin.readline().split())  # 여러개 입력받음
  
  sum = num1 + num2
  print(sum)
  i += 1