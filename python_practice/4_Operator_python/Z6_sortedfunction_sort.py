# sorted function()- we apply sorted function in tuple and set if we want to sort. sort method is not available in there so that we sorted function.
# sort method- it will sort according to the alphabets.
fruits=['mango','banana','apple','orange']
fruits.sort()
print (fruits)

# sort in tuple
# we use sorted function. it will return you list output.
fruits2=('mango','banana','apple','orange','grapes')
print(sorted(fruits2))
# print(fruits2)


# sort in set
# we use sorted function. it will return you list output.
fruits3={'mango','banana','apple','orange'}
print(sorted(fruits3))

# sorted function in dictionary
all_information=[
    {'name':'sirjana','salary':84000},
    {'name':'narayan','salary':500000}, 
    {'name':'kamana','salary':100000}
]
print(sorted(all_information,key=lambda i: i['salary']))
print(sorted(all_information,key=lambda i: i['salary'],reverse=True))