list=[10,1,5,0,6,8,7,3,11,4]
print("array before sorting")
print(list)
i=1
while(i<10):
  element=list[i]
  j=i
  i=i+1

  while(j>0 and list[j-1]>element):
    list[j]=list[j-1]
    j=j-1

  list[j]=element
print("Array after sorting")
print(list)
