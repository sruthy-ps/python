num1=input("enter an integer list(space seperated):")
num=list(map(int,num1.split()))
num=[x for x in num if x%2!=0]
print("list after removing even numbers:",end=' ')
print(num)
