import sys
from random import randint as r
from math import floor

def karatsuba(x,y, b=10):
    """
    KARATSUBAS ALGORITHM - by bermed28

    Algorithm to multiply two numbers in O(n^1.6) running time
    Compared to grade-school multiplication algorithm which is O(n^2) running time

    :param x: First number to be multiplied
    :param y: Second number to be multiplied
    :return: The product of x and y
    """

    lengthX = len(str(x))
    lengthY = len(str(y))

    N = max(lengthX,lengthY)

    if(x < 10 or y < 10):
        return x * y
    exponent = floor(N / 2)
    A = floor(x / (b ** exponent))
    B = floor(x % (b ** exponent))
    C = floor(y / (b ** exponent))
    D = floor(y % (b ** exponent))


    AC = karatsuba(A,C)
    BD = karatsuba(B,D)
    ABCD= karatsuba(A+B,C+D) - AC - BD


    return (AC * (b**(exponent*2))) + (ABCD * (b**(exponent))) + BD



"""TESTING KARATSUBAS ALGORITHM IMPLEMENTATION"""


print("Expceted", str(2617314)  + ",", "got", karatsuba(1234,2121), "-", karatsuba(1234,2121) == 2617314)
print("Expceted", str(15975366)  + ",", "got", karatsuba(4567, 3498), "-", karatsuba(4567, 3498) == 15975366)

print("Expected 7006652, got", karatsuba(1234,5678), "-", karatsuba(1234,5678) == 7006652)
print("Expected ",str(-469*134), "got", karatsuba(-469,134), "-", karatsuba(-469,134) == -469*134)
print("Expected ",str(-46*134), "got", karatsuba(-46,134), "-", karatsuba(-46,134) == -46*134)

numbers = [0,0,0,0,0,0,0,0,0,0,0,0]

for i in range(len(numbers)):
    numbers[i] = r(-1 * sys.maxsize, sys.maxsize)



print("Expceted", str(numbers[0] * numbers[11]) + ",", "got", karatsuba(numbers[0], numbers[11]), "-", karatsuba(numbers[0], numbers[11]) == numbers[0] * numbers[11])
print("Expceted", str(numbers[1] * numbers[10]) + ",", "got", karatsuba(numbers[1], numbers[10]), "-", karatsuba(numbers[0], numbers[11]) == numbers[0] * numbers[11])
print("Expceted", str(numbers[2] * numbers[9]) + ",", "got", karatsuba(numbers[2], numbers[9]), "-", karatsuba(numbers[0], numbers[11]) == numbers[0] * numbers[11])
print("Expceted", str(numbers[3] * numbers[8]) + ",", "got", karatsuba(numbers[3], numbers[8]), "-", karatsuba(numbers[0], numbers[11]) == numbers[0] * numbers[11])
print("Expceted", str(numbers[4] * numbers[7]) + ",", "got", karatsuba(numbers[4], numbers[7]), "-", karatsuba(numbers[0], numbers[11]) == numbers[0] * numbers[11])
print("Expceted", str(numbers[5] * numbers[6]) + ",", "got", karatsuba(numbers[5], numbers[6]), "-", karatsuba(numbers[0], numbers[11]) == numbers[0] * numbers[11])






