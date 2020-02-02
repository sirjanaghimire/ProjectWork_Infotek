class Person:
    def __init__(self, fname, lname,age,price):

        self.first_name=fname
        self.last_name=lname
        self.age=age
        self.ssalary= price

    def full_name(self):
        return f"{self.first_name} {self.last_name}"

    def under_age(self):
        return self.age>18

    def apply_discount(self,num):
        off_price=(num/100)*self.ssalary
        return self.ssalary-off_price

p1=Person('sirjana','ghimire',24,65000)
# print(p1.first_name)
print(p1.full_name())
print(p1.under_age())
print(p1.apply_discount(5))