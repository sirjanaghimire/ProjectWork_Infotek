# multilevel inharitance
# method overriding
# isinstance() function - if we try to find this object is belongs to class name or not.
#  issubclass() function

class phone:
    def __init__(self, brand,model_name,price):
        self.brand = brand
        self.model_name = model_name
        self.price = price
    def full_name(self):
        return f"{self.brand} {self.model_name}"
    
    def make_a_call(self,number):
        return f"calling {number}....."


class smartphone(phone):
    def __init__(self,brand, model_name, price, ram, internal_memory,rear_camera):

        phone.__init__(self,brand, model_name, price)

        # super().__init__(brand,model_name,price)
        self.ram = ram
        self.internal_memory = internal_memory
        self.rear_camera = rear_camera
    def full_name(self):
        return f"{self.brand} {self.model_name} and price is{self.price}"
 
class apple_phone(smartphone):
    def __init__(self,brand, model_name, price, ram, internal_memory,rear_camera,front_camera):
        super().__init__(brand, model_name, price, ram, internal_memory,rear_camera)
        self.front_camera=front_camera
    # def full_name(self):
    #     return f"{self.brand} {self.model_name} price is {self.price} and rare camera is{self.r}"

        
p1=phone('nokia','1100',10000)
p2=smartphone('oneplus','5',30000,8,'6 GB','20 MP')
p3=apple_phone('apple','8',100000,9,'6 GB','23 MP','32 MP')
print(p2.full_name())
# print(isinstance(p3,apple_phone))
# print(isinstance(p1,apple_phone))
print(issubclass(apple_phone,phone))
print(issubclass(phone,apple_phone))

