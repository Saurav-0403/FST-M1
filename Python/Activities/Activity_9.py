#Given a two list of numbers create a new list 
#such that new list should contain only odd numbers from the first list and 
#even numbers from the second list

list1 = [23,12,45,78,99,13]
list2 = [45,67,89,12,80,35,90,44]

new_list = []
for ele in list1:
    if ele%2 != 0:
        new_list.append(ele)
for ele in list2:
    if ele%2 == 0:
        new_list.append(ele)

print(new_list)
