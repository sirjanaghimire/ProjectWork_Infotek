#  average value using zip,*args
def average_finder(*args):
    average =[]
    for pair in zip(*args):
        average.append(sum(pair)/len(pair))
    return average
print(average_finder([1,2,3],[4,5,6],[7,8,9]))

# print same thing using lambda and make this anonymous function in one line
average_finder2=lambda *args:[sum(pair2)/len(pair2) for pair2 in zip(*args)]
print(average_finder2([1,2,3],[4,5,6],[7,8,9],[10,11,12]))
