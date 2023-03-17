# 세자리수 x 세자리수 과정 출력하기

a = input()
b = input() # 처음에 입력받는 b는 str이어야함.
a = int(a) # a는 int로 형변환


print(a * int(b[2]))
print(a * int(b[1]))
print(a * int(b[0]))
print(a * int(b))

