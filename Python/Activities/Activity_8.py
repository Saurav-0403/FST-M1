# Given a list of numbers, return True if first and last number of a list is same
ele_list = []
while True:
    ele = input("Please provide a list of numbers and type 'A' for exit\n")
    if ele == 'A':
        break
    else:
        ele_list.append(ele)

ele_len = len(ele_list)
if ele_list[0] == ele_list[ele_len-1]:
    print("first and last element of list is same")
else:
    print("first and last element of list is not same")