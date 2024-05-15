#Write a function sum() such that it can accept a list of elements and print the sum of all elements

def sum(ele_list):
    sum = 0
    for ele in ele_list:
        sum += ele
    return sum

res = sum([12,26,28,90,100,15])
print(res)