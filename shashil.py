def add(x,y):
    return x+y
def subtract(x,y):
    return x-y
def multiply(x,y):
    return x*y
def divide(x,y):
    return x/y

print("select option /n 1.add /n 2.sub /n 3.mul /n 4.div")

while True:
    choice = input("enter choice (1,2,3,4): ")
    if choice in ('1','2','3','4'):
        try:
            num1 = int(input("enter first number: "))
            num2 = int(input("enter second number"))
        except ValueError:
            print("Invalid Input")
            continue

        if choice == '1':
            print(add(num1,num2))
        elif choice == '2':
            print(subtract(num1,num2))

    else:
        print("Invalid Input")
