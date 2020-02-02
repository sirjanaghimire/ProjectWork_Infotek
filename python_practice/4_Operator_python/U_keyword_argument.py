# ** kwargs (keyword arguments)
# it will receive dictionary argument,and access the items accordingly.

def all_total(**kwargs):
    # print (type(args))
    for k,v in kwargs.items():
        print(type(kwargs))
        print(f"{k}:{v}")
d= {'name':'sirjana', 'age':24}
print(all_total(**d))
