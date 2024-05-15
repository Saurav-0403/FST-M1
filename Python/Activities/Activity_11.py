#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not
fruit_dict = {"apple":100,"mango":89,"orange":20,"banana":30,"kiwi":140}
fruit_check = input("fruit name that needs to be checked\n").lower()
count = 0
for fruit in fruit_dict:
    if fruit == fruit_check:
        print(fruit_check," is present")
        count+=1
if count ==0:
    print(fruit_check," is not present")