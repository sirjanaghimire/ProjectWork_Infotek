# lambda expression is a function we called it as a anonymous fumction as well.
# A lambda function can take any number of arguments, but can only have one expression.

multiply=lambda a,b:a*b
print(multiply(3,5))
iseven = lambda a: a%2==0
print(iseven(6))

# lambda with if ,else
func=lambda s: True if len(s) > 5 else False
print(func('555555'))