#  we use enumerate function() with for loop to track position of our item in iterable.

#  hoe to without using enumerate function.
names=['sirjana','ritesh','nabin']
pos=0
# for name in names:
#     print(f"{pos}.........>{name}")
#     pos+= 1

# with enumerate function
for pos,name in enumerate(names):
    print(f"{pos}.........>{name}")
    

def find_pos(l,target):
    for pos,name in enumerate(l):
        if name==target:
            return pos
    return -1
print(find_pos(names,'ritesh'))
