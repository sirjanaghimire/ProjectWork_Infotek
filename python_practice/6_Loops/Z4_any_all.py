#  any() and all()function
# all() function - it will check our iterable value all true or not if all true than it will return true output.
# any() function- it will check our parameter atleast one value also true or not.

numbers1=[2,4,6,8,10]
numbers2=[1,2,3,4,5,6]

# in simple method
number3=[]
for num in numbers1:
    # num%2==0
    # number3.append(True)
    number3.append(num%2==0)
# print(number3)
print(all([True, True, True, True, True]))

# list comprehension with all
print(all([num%2==0 for num in numbers2]))

# list comprehension with any function
print(any([num%2==0 for num in numbers2]))