d1={'a':100,'b':200}
d2={'x':300,'y':200}
print("dictionary 1:",d1)
print("dictionary 2:",d2)
d=d1.copy()
d.update(d2)
print("merged dictionary:",d)
