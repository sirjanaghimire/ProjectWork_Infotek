# # for loop with range function
# # for i in range (10):
# #     print (f"hello :{i}")
# # total =0
# # for i in range(1,11):
# #     total += i
# # print(total)

# # num=input("enter your number : ")
# # for i in range(0,len(num)):
# #      total += int(num[i])
# # print(total)

# name = input("enter your name : ")
# temp = ""
# for i in range (len(name)):
#     if name[i] not in temp:
#         print(f"{name[i]}: {name.count(name[i])}")
#         temp += name[i] 

# #Step argument

for i in range(0,11,2): # print even number
    print(i)

for i in range(1,11,2): # print odd number
    print(i)
