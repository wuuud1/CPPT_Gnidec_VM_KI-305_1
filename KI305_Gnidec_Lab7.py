import os
import struct
import math

rows_num = int(input("Введіть розмір квадратної матриці: "))
filler = input("Введіть символ-заповнювач: ")
#filler1 = input("Введіть символ-заповнювач для непарних рядків: ")

if len(filler) == 0:
    print("Не введено символ-заповнювач")
    sys.exit(1)

n_subarrays = (rows_num + 1) // 2
newline_count = (rows_num // 2) - 1
leading_spaces = 0

for i in range(n_subarrays):
    for _ in range(leading_spaces):
        print(" ", end="  ")

    num_elements = rows_num - 2 * i
    arr = []

    # Вибір символу-заповнювача в залежності від парності рядка
    #current_filler = filler1 if i % 2 != 0 else filler

    for _ in range(num_elements):
        if len(filler) == 1:
            arr.append(ord(filler))
            print(chr(arr[0]), end="  ")
        else:
            print("Забагато символів-заповнювачів")
            sys.exit(1)
    print()
    leading_spaces += 1

for _ in range(newline_count):
    print()
