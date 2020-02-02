# def add_three(a,b,c):
#     return a+b+c

# print(add_three(10,10,10))

# def is_even(number):
#     return number%2 ==0
# print (is_even(10))

# def songs():
#     return "this your fevorate songs"
# print(songs())

# def even_odd(number):
#     if number%2==0:
#         return "even"
#     else:
#         return "odd"
# print(even_odd(9))

# def greter_than(a,b):
    
#     if a>b:
#         return "a is greater than b"
#     else:
#         return "a is not greater than b"
# print (greter_than(30,20))

# def my_function(fname):
#   print(fname + " Refsnes")

# my_function("Emil")
# my_function("Tobias")
# my_function("Linus")

# def my_function(*kids):
#   print("The youngest child is " + kids[1])

# my_function("Emil", "Tobias", "Linus")

def tri_recursion(k):
  if(k>0):
    result = k+tri_recursion(k-1)
    print(result)
  else:
    result = 0
  return result

print("\n\nRecursion Example Results")
tri_recursion(6)

