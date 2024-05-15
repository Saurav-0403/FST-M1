#Write a recursive function to calculate the sum of numbers from 0 to 10
def sum(num):
    if num:
        return num + sum(num-1)
    else:
        return 0
    
res = sum(10)
print(res)