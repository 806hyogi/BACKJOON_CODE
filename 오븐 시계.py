H, M = input().split()
Cook = input()

H = int(H)
M = int(M)
Cook = int(Cook)

if (H > 12):
  H = (H - 12) * 60
  
  result = (H + M) + Cook
  hour = 12 + (result // 60)
  
  if (hour >= 24):
    hour = hour - 24
    
  minute = result - ((result // 60) * 60)

else:
  H = H * 60 #o
  
  result = (H + M) + Cook
  hour = result // 60
  
  if (hour < 0):
    hour = hour + 24
      
  if (hour >= 24):
    hour = hour - 24
  
  
  minute = result - ((result // 60) * 60)
  
print(hour, minute)