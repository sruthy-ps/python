list=input("enter a list:")
list1=map(int,list.split())
sum=0
for i in list1:sum+=i
print("the sum of all items in list",list,"is",sum)
