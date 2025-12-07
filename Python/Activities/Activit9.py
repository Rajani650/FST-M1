listone = [10, 20, 23, 11, 17]
listtwo = [13, 43, 24, 36, 12]
print("First list is",  listone)
print("second list is", listtwo)

thirdList=[]
for num in listone:
    if(num % 2 != 0):
      thirdList.append(num)

for num in listtwo:
    if(num % 2 == 0):
       thirdList.append(num) 
print("The final list is: ")       
print(thirdList)            
       