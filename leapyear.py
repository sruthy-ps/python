import datetime
date = datetime.date.today()
currentYear = int(date.strftime("%Y"))
print("enter the last year")
endYear = int(input())
print("list of leap year:")
for year in range(currentYear,endYear):
    if((year%4==0)and(year%100!= 0)or(year%400==0)):
        print(year)
