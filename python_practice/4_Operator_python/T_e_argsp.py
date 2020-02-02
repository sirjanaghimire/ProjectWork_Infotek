# (*) operators
# *args - if we dont know how many arguments that will be passed 
# into our function than we use *args
#  add a * before the parameter name in the function definition but it's better to args.

def total(a,b):
    return a+b
print(total(20,30))
# print(total(20,30,40))

def all_total(*args):
    total=0
    for num in args:
        total += num
    return total
print(all_total(20,50,60,100))

def to(*args):
    print(args)
    print(type(args))
to(1,2,3,4,5,6)

# *args with normal parameter
def multiply_num(*args):
    multiply=1
    for i in args :
        multiply *= i
    return multiply
print(multiply_num(2,5,6))
    
def multiply_num2( num, *args):
    multiply=1
    for i in args :
        multiply *= i
    return multiply
print(multiply_num2(2,5,6))
    
# *args as arguments
def multiply_num3(*args):
    multiply=1
    for i in args :
        multiply *= i
    return multiply
# print(multiply_num3(2,5,6))
# number=[2,3,6]
number=(2,3,6)

print(multiply_num3(*number)) # if you write * then its goes to unpack