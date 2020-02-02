groups=['mango','banana','orange','grapes']
# for group in groups:
#     print(group)
# number = list(range(1,11))
# print(number)
# print(number.pop())
# print(number.index(1))

# i=0
# while i<len(groups):
#     print(groups[i])
#     i+= 1
    
def Square_list(l):
    square=[]
    for i in l:
        square.append(i**2)
    return square

number=list(range(1,10))
print(Square_list(number))


def reverse_elements(l):

    elements=[]
    for i in l:
        elements.append(i[::-1])
    return elements
words=['abc','def','ghi','jkl']
print(reverse_elements(words))

    

