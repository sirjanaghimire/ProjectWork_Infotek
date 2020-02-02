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
 
p1=phone('nokia','1100',10000)
p2=smartphone('oneplus','5',30000,8,'6 GB','20 MP')

print(p1.full_name())
print(p2.full_name())


# class phone:
#     def __init__(self,name):
#         self.name = name
    
#     def m1(self):
#         print("i am here")
# class smartphone(phone):
#     p1=phone('sirjana')

#     p1.m1()

