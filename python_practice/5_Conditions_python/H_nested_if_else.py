winning_number=27
guess_number=int(input("enter your guess number between 1 to 100:"))
if guess_number==winning_number:
    print("YOU WIN!")
else:
    if guess_number < winning_number:
        print ("too low")
    else:
        print ("too high")       
    
        
# in keyword (in is used to verifying the speific character is present or not)

name = "Sirjana"
if 'a' in name:
    print(" a is present")
else:
    print("a is not present")    
