# Write a Python program to calculate the sum of all the elements in a list
ele_list = []
while True:
    ele = input("Please provide a list of numbers and type 'A' for exit\n")
    if ele == 'A':
        break
    else:
        ele_list.append(int(ele))

sum=0
for ele in ele_list:
    sum += ele
print(sum) 
