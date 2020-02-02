# zip function()- it is built function.
# we can pass multiple variable.
#  it is iterator.

user_id=['user1','user2','user3']
user_name=['sirjana','narayan','nitesh']
print(list(zip(user_id,user_name)))

# * operator with zip
l=[(1,2),(3,4),(5,6),(7,8)]
# print(list(zip(*l)))
l1,l2=zip(*l)
print(list(l1))
print(list(l2))

# printing max value using zip () function
new=[1,3,5,7]
new2=[2,4,6,8]
new3=[]
for i in zip(new,new2):
    new3.append(max(i))
print(new3)
