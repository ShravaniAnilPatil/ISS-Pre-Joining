#args
def total(*numbers):
    print(sum(numbers))

total(1, 2, 3, 4, 5)

#kwargs
def person_info(**info):
    for key, value in info.items():
        print(f"{key}: {value}")
person_info(name="Shravani", age=22, city="Mumbai")