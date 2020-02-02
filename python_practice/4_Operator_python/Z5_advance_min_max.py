# simple min max 
# num=[1,5,10,20]
# print (min(num))

# advance 
name=['sirjana ghimire','narayan','ab','az']
print(max(name,key=lambda item: len(item)))

#  another example with dictionary.
students2= [
    {'name':'sirjana','score':90,'age':25},
    {'name':'narayanacharya','score':70,'age':24},
    {'name':'rayan','score':80,'age':21}
]
print(max(students2,key=lambda item: item.get('score')))
print(min(students2,key=lambda item: item.get('score'))['name'])



# students3= {}
#     'sirjana':{'score':90,'age':25},
#     'narayanacharya':{'score':70,'age':24},
#     'rayan':{'score':80,'age':21}
#     }
#     print(max(students3,key=lambda item: students3[item]['score']))