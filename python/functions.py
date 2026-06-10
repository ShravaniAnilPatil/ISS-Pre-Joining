# functions
def greet(name):
    print("Hello, " + name)

greet("Shravani")

def add(a, b):
    return a + b

result = add(5, 3)
print(result)

def total(*numbers):
    print(sum(numbers))

total(1, 2, 3, 4, 5)