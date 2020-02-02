# with the help of list comprehension we can create of list in one line.

# square=[]
# for i in range(1,11):
#     square.append(i**2)
# print(square)

square1 =[i**2 for i in range(1,11)]
print(square1)

# list comprehension with if else
num=[1,2,3,4,5,6,7,8,9,10]
new_list=[]
for i in num:
    if i%2==0:
        new_list.append(i*2)
    else:
        new_list.append(-i)
print (new_list)

new_list2=[i*2 if (i%2==0) else -i for i in num]
print(new_list2)

# list comprehension in nested list.
nested_comp=[[i for i in range(1,4)] for  j in range(3)]
print (nested_comp)
nested_comp1=[[i for i in range(1,4)] for  j in range(4)]
print(nested_comp1)
