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