str1=input("enter a string:")
char=str1[0]
str1=str1.replace(char,'$')
str1=char+str1[1:]
print("Replaced string:",str1)
