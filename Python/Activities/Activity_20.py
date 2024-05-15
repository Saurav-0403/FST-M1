'''
Use pandas to read data the Excel file
Print the number of rows and columns
Print the data in the emails column only
Sort the data based on FirstName in ascending order and print the data
Hint: You can use DataFrame.shape to get the number of rows and columns
'''
import pandas
dataframe = pandas.read_excel("contact.xlsx", sheet_name="Sheet1")
print(dataframe.shape)
print(dataframe["Email"])
print(dataframe.sort_values("FirstName"))