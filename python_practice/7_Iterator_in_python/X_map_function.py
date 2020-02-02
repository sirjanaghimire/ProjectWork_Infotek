# Python map() function is used to apply a function on all the elements of specified iterable and return map object. 
# Python map object is an iterator, so we can iterate over its elements. 
# We can also convert map object to sequence objects such as list, tuple etc.
# map function we can apply loop only one time.
#  map object is an iterator
#  once you change map to list,tuple etc then we can iterate it multiple time.
#  map function is iterator itself.

number = [1,2,3,4]
# def square(a):
#     return a**2
# squares=list(map(square,number))

# we can use lambda expression also.
# squares=list(map(lambda a:a**2,number))
squares=tuple(map(lambda a:a**2,number))

print(squares)