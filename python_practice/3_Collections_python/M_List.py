# list is a ordered collection of items.
# list  are changeable
# we can store any data type.(data structures)
#  list is a data structure that can hold any type of data

# number=[1,20,30,40,50,'sirjana','maya']
# print(number)
# # print(number[1])
# print(number[:6])
# number[6]= 100
# print(number)

# list1=[1,2,3,4]
# list2 =['sirjana','ghimire','sita']
# list1.extend(list2)
# print(list1)

# Add item in a list
fruits=['apple','orange']
fruits.append('mango')
print(fruits)

name=['ram','sirjana','sita']
age=[24,25,26,27]
name.extend(age)
print(name)

x=name.count('ram')
print(x)

thislist = ["apple", "banana", "cherry"]
print(len(thislist))
thislist.reverse()
print(thislist)

thislist.insert(1,"grapes")
print(thislist)

thislist.sort()
print(thislist)