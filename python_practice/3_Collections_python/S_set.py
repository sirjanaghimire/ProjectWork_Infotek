# set is a collection which is unorder unique items and unindexed.
# duplicate item is not allowed.
#  we can't store list and dictionay.
#  other than that we can store.
#  to remove the duplicate item than we use set.


thisset = {"apple", "banana", "cherry"}
# thisset.add("orange")
# thisset.add("mango")
# thisset.add("grapes")

print(thisset)
# thisset.remove(1)
# thisset.discard(1)
thisset.update(["orange", "mango", "grapes"])
print(thisset)
x = thisset.pop()
print(thisset)

set1 = {"a", "b" , "c"}
set2 = {1, 2, 3}

set3 = set1.union(set2)
print(set3)
set1.update(set2)
print(set1)

# use of intersection(print same value)
print(set1 & set2)


 

