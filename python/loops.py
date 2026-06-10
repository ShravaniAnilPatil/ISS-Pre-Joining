# loops
for i in range(1 , 6): #for
    print(i)

count = 1
while count <= 5: #while
    print(count)
    count += 1

for i in range(1,6): #break
    if i==5:
     break
    i+=1
    print(i)

for i in range(1,6): #continue
    if i==4:
     continue
    print(i)

for i in range(1,6): #else with for loop
   print(i)
else:
    print("End of loop")
