#  dictionary is a collection which is unorder,changeable,and index. starts with{}
#  key value pairs.
# duplicate key value is not allowed


family_info={'name':'sirjana','age':24,'na':'narayan','ag':29}
print(family_info)
print(family_info['name'])

family_info1=dict(name='sirjana',age=24)
print(family_info1)
print(family_info['name'])

family_info2={
    'name':'sita',
    'age':24,
    'favorate_songs':['nepali songs']
}
print(family_info2)
x=family_info2.get('name')
print(x)
family_info2['name']='rita'
print(family_info2)

family_info3={
    'name':'sita',
    'age':24,
    'favorate_songs':['nepali songs']
}
# for x in family_info3.values():
#     print(x)
for x in family_info3.items():
    print(x)
    print(len(family_info3))

# dictionary inside another dictionary
    child1 = {
  "name" : "Emil",
  "year" : 2004
}
child2 = {
  "name" : "Tobias",
  "year" : 2007
}
child3 = {
  "name" : "Linus",
  "year" : 2011
}

myfamily = {
  "child1" : child1,
  "child2" : child2,
  "child3" : child3
}
print(myfamily)

# nested dictionary
myfamily = {
  "child1" : {
    "name" : "Emil",
    "year" : 2004
  },
  "child2" : {
    "name" : "Tobias",
    "year" : 2007
  },
  "child3" : {
    "name" : "Linus",
    "year" : 2011
  }
}
print(myfamily)
