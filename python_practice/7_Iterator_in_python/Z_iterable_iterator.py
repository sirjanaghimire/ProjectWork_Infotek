number=[1,2,3,4,5] # it can anything like tuple list etc  iterables
square=map(lambda a:a**2, number) # iterator
# if we call number directly then we need to apply iter function() while printing output with appling next method.
# numbers= iter(number)
# print(next(numbers))
# print(next(numbers))
# print(next(numbers))
# print(next(numbers))
# print(next(numbers))
# print(next(numbers))

#  if we call square then we dont need to apply iter function because it already define while appling the next method.
print(next(square))
print(next(square))
print(next(square))
print(next(square))
print(next(square))