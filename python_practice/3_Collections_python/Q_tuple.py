# tuple data structure
# tuple can store any data types.
# most important things is tuple are unchangeable, once tuple is created we can't change (update)
# tuple are ordered collection of items.
# when we know our data is not changing than we use tuple.
# tuple are faster than lists

# methods
# . count,index
# len functio
# slicing tuple[]
# example=('one','two','three')
thistuple = (1, 3, 7, 8, 7, 5, 4, 6, 8, 5)

x = thistuple.count(5)

print(x)

thistuple = (1, 3, 7, 8, 7, 5, 4, 6, 8, 5)

x = thistuple.index(8)

print(x)

def num(int1, int2):
    add=int1+int2
    multiply= int1*int2
    return add, multiply
print(num(2,3))
add,multiply=num(2,3)
print(add)
print(multiply)

thistuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(thistuple[2:5])

# change tuple valu fist tuple to list and change
x = ("apple", "banana", "cherry")
y = list(x)
y[1] = "kiwi"
x = tuple(y)

print(x)

# tuple len()
thistuple = ("apple", "banana", "cherry")
print(len(thistuple))

# tuple with one item

thistuple = ("apple",)
print(type(thistuple))

#NOT a tuple
thistuple = ("apple")
print(type(thistuple))

# tuple() constructor

thistuple = tuple(("apple", "banana", "cherry")) # note the double round-brackets
print(thistuple)

