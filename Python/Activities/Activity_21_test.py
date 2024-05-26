
'''
Sum of two numbers
Difference of two numbers
Product of two numbers
Quotient of two numbers
'''
import math

def test_sum():
    num1 = 10
    num2 = 23
    sum = num1 + num2
    assert sum == 33

def test_substract():
    num1 = 26
    num2 = 13
    diff = num1 - num2
    assert diff == 13

def test_multiplication():
    num1 = 10
    num2 = 23
    mul = num1 * num2
    assert mul == 230

def test_quotient():
    num1 = 28
    num2 = 3
    quot = num1 // num2
    assert quot == 9