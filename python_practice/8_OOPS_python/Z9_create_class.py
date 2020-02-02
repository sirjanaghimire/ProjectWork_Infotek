#  inside class we define init method,it is constructor.
# after that we need to create instance variable.

# class Person:
    # def__init__(self,fname,lname,age):
#         self.first_name =fname
#         self.last_name =lname
#         self.Age=Age
# p1=Person('sirjana','ghimire',20)
# print(p1.First_name)

class Laptop:  
  def __init__(self, bbrand, nname,prrice):
        self.brand = bbrand
        self.name = nname
        self.price = prrice

Laptop1=Laptop('hp','ssss',63000)
print(Laptop1.brand)


