# variables
import numbers
name ="Shravani"
age=22
print("My name is",name,"and I am",age,"years old.")

# data types
print(type(name))
print(type(age))

# boolean values
is_student = False
is_employed = True
print(is_student)
print(is_employed)

# lists
fruits = ["apple", "banana", "cherry"]
print(fruits)

#tuples
my_tuple = (1, 2, 3)
print(my_tuple)

# dictionaries
person = {"name": "Shravani", "age": 22, "city": "New York"}
print(person)

# sets
my_set = {1, 2, 3, 4, 5}
print(my_set)

# type conversion
age = "22"
age_int = int(age)

print(age_int)
print(type(age_int))

#control flow
age= 22
if age >= 18:
    print("You are eligible to vote.")
else:    
    print("You are not eligible to vote.")

# loops
for i in range(1 , 6): #for
    print(i)

count = 1
while count <= 5: #while
    print(count)
    count += 1

for i in range(1,6): #break
    if i==5:
     break
    i+=1
    print(i)

for i in range(1,6): #continue
    if i==4:
     continue
    print(i)

for i in range(1,6): #else with for loop
   print(i)
else:
    print("End of loop")


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

#error handling

#try-except
try:
    result = 10 / 0 
except ZeroDivisionError:
    print("Error: Division by zero is not allowed.")

#try-except-else
try:
    result = 10 / 0
except ZeroDivisionError as e:
    print("Error:", e)
else:
    print("Result:", result)
finally:
    print("This block will always execute.")

#raise 
age = 15
if age < 18:
    raise ValueError("Age must be 18 or above")