Astr=input("Enter the string\n")
char=input("Enter the character\n")
print("Given string:\n",Astr)
print("Given character:\n",char)
res=0
for i in range(len(Astr)):
    if(Astr[i]==char):
        res=res+1
print("Number of time character is present in string:\n",res)
