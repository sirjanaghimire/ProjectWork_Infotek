# class variables.

class Person:
    apply_num = 10
    def __init__(self, fname, lname,age,price):

        self.first_name=fname
        self.last_name=lname
        self.age=age 
        self.ssalary= price

    
    def apply_discount(self):
        off_price=(Person.apply_num/100)*self.ssalary
        return self.ssalary-off_price

p1=Person('sirjana','ghimire',24,65000)

print(p1.apply_discount())