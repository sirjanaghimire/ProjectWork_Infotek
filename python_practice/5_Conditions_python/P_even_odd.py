def filter_even_odd(l):
    even_number=[]
    odd_number=[]
    for i in l:
        if i%2==0:
            even_number.append(i)
        else:
            odd_number.append(i)
    output=[even_number,odd_number]
    return output
number=[1,2,3,4,5,6,7,8,9,10]
print(filter_even_odd(number))

# max and min
number=[20,50,100,200]
# print(max(number))
# print(min(number))
def max_min_number(l):
    return max(l)- min(l)
print(max_min_number(number))
    