a, b, c = input().split() # 여러 문자열을 입력할 수 있도록 split() 사용
a = int(a)
b = int(b)
c = int(c)

print((a + b) % c)
print(((a % c) + (b % c)) % c)
print((a * b) % c)
print(((a % c) * (b % c)) % c)