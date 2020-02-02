name="   sirjana Ghimire    "
# len()function
print(len("sirjana"))
print(len(name))

#lower() method
print(name.lower())

#upper() method
print(name.upper())

#title() method
print(name.title())  

#count() method
print(name.count("a"))

#strip() methos
print(name.rstrip())
print(name.lstrip())

#replace() method
first = "python is my first coding language and python is easy"
print(first.replace(" ","-"))
print(first.replace("is","was ",3))

#find() method
print(first.find("is"))

# center method
first_name= "narayan"
print(first_name.center(11,"*"))
print (first_name.center(len(first_name)+8 , "*"))