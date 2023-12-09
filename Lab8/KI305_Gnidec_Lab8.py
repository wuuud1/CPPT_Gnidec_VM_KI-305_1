import os
import struct
import math

# Функція для запису результату у текстовому форматі
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

# Функція для читання результату з текстового файлу
def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"Файл {fName} не знайдено.")
    except FileNotFoundError as e:
        print(e)
    return result

# Функція для запису результату у двійковому форматі
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        # Використовуємо struct.pack для збереження числа у двійковому форматі
        f.write(struct.pack('f', result))

# Функція для читання результату з двійкового файлу
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                # Використовуємо struct.unpack для розпакування числа з двійкового формату
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"Файл {fName} не знайдено.")
    except FileNotFoundError as e:
        print(e)
    return result

# Функція для обчислення виразу sin(x)/cos(x) в радіанах
EPSILON = 1e-10  # Дуже мале число для порівняння з нулем

def calculate(degrees):
    radians = math.radians(degrees)  # Конвертуємо градуси в радіани

    if abs(math.cos(radians)) < EPSILON:
         # Викидаємо виключення, якщо cos(x) дуже близький до нуля
        raise ValueError("Косинус дуже близький до 0, виникає ділення на 0.")

    return math.sin(radians) / math.cos(radians)

# Головна частина програми
if __name__ == "__main__":
    try:
        # Зчитуємо вхідні дані від користувача (градуси)
        data = float(input("Введіть значення(в градусах): "))
        # Обчислюємо результат у радіанах
        result = calculate(data)
        # Виводимо результат у радіанах
        print(f"Результат: {result}")
        # Записуємо результат у файли
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        # Читаємо результат із двійкового та текстового файлів та виводимо їх
        print("Результат з бінаного файлу: {0}".format(readResBin("binRes.bin")))
        print("Результат з текстового файлу: {0}".format(readResTxt("textRes.txt")))
    except ValueError as e:
        # Виводимо повідомлення про помилку, якщо виникає ValueError
        print(e)
    except FileNotFoundError as e:
        # Виводимо повідомлення про помилку, якщо файл не знайдено
        print(e)
    except Exception as e:
        # Виводимо загальне повідомлення про будь-яку іншу помилку
        print("Виникла помилка: {0}".format(e))