H, M = input().split()

H = int(H) * 60
M = int(M)

result = (H + M) - 45
hour = result // 60
if (hour < 0):
  hour = 24 + hour
  
minute = result - ((result // 60) * 60)

print(hour, minute)