# special magic method/ dunder method
# operator overloading
# polymorphism-method overriding

class Phone:
    def __init__(self, brand,model_name,price):
        self.brand = brand
        self.model_name = model_name
        self.price = price
    
    def phone_name(self):
        return f'{self.brand} {self.model_name}'
        
        # str, repr(representation)
    def __repr__(self):
        return f'{self.brand} {self.model_name} and price is {self.price}'
    
    def __str__(self):
        return f'{self.brand} {self.model_name} {self.price}'
    
    def __len__(self):
        return len(self.phone_name())

#  operator overloading
    def __add__(self,other):
        return self.price + other.price

    def __mul__(self,other):
        return self.price * other.price

class Smart_phone(Phone):
    def __init__(self, brand,model_name,price,camera):
        super().__init__(brand,model_name,price)
        self.camera = camera
# polymorphism( method overriding)

    def phone_name(self):
        return f'{self.brand} {self.model_name} cost is {self.price}'
    def __len__(self):
        return self.price

    
phone1 = Phone('nokia','5',55000)
phone2 = Phone('nokia','5',55000)
my_smartphone =Smart_phone('hp','9',60000,'16 MP')

# print(phone1.phone_name()
print(repr(phone1))
print(str(phone1))
print(len(phone1))
print(phone1 + phone2)
print(phone1 * phone2)
print(my_smartphone.phone_name())
print(len(my_smartphone))