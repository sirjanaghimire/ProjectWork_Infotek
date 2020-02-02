name = input("enter your name ")
# if 'a' in name:
#     print(" a is present")
# else:
#     print("a is not present")  
i=0
while i< len(name):
    print (f"{name[i]} : {name.count(name[i])}")
    i += 1
 