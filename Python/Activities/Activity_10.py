#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
ele_list = []
while True:
    ele = input("Please provide a list of numbers and type 'A' for exit\n")
    if ele == 'A':
        break
    else:
        ele_list.append(int(ele))

ele_tuple = tuple(ele_list)
for ele in ele_tuple:
   if ele%5 ==0:
       print(ele)