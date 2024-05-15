#Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.

def fibonnaci(count):
    if count <= 1:
        return count
    else:
        return (fibonnaci(count-1) + fibonnaci(count-2))

total_count = int(input("how many Fibonnaci numbers you want to generate\n"))

if total_count <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(total_count):
        print(fibonnaci(i))