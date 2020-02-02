# key value pairs
square={num:num**2 for num in range(1,11)}
print(square)
square2={f"square of {num}is " :num**2 for num in range(1,11)}
print(square2)
for i,v in square2.items():
    print(f"{i}:{v}")
    
even_number={i:('even'if i%2==0 else'odd')for i in range(1,11)}
print(even_number)
