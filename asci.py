list1=['sruthy','juvi']
print("the original list:\n"+str(list1))
res=[ord(ele)for sub in list1 for ele in sub]
print("the ASCII list is:\n"+str(res))
