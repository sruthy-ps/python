str1=input("enter the first string:")
str2=input("enter the second string:")
new_a=str2[:1]+str1[1:]
new_b=str1[:1]+str2[1:]
print("the new string after swapping first two characters of both string:",(new_a+''+new_b))
