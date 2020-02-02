#  generators is also iterator.
# yield keyword - it will create generator.
#  it's never generate all squance in same time.
import time 

def num_generator(n):
     for num in range(1,n+n):
         if num%2==0:
             yield(num)
even_number=num_generator(20)
for n in even_number:
    print(n)

# list comprehension
squares=[i**2 for i in range(1,11)]
print (squares)

t1=time.time()
l=[i**2 for i in range(100000)]
print(time.time() -t1)


# generator comprehension
squares2=(i**2 for i in range(1,11))
# print(squares2)
print(next(squares2))
print(next(squares2))
print(next(squares2))

t2=time.time()
l=(i**2 for i in range(100000))
print(time.time() -t2)
