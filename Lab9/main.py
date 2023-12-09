from dog import Dog
from arctic_dog import ArcticDog
from dog_health import dog_health

if __name__ == "__main__":
 dog1 = Dog("Buddy", "Labrador")
 print(f"{dog1.name} is a {dog1.breed}. {dog1.bark()}")
 print(dog1.play(2))  # Собака грає 2 години
 print(dog1.sleep(5))  # Собака спить 5 годин

# Створюємо першу піддослідну собаку
arctic_dog1 = ArcticDog("Rex", "German Shepherd", "K9 Unit")
print(f"{arctic_dog1.name} is a police dog of {arctic_dog1.breed} breed.")
print(arctic_dog1.bark())
print(arctic_dog1.train(3))  # Поліцейська собака навчається 3 години

# Створюємо другу піддослідну собаку, яка успішно виконує обов'язки
arctic_dog2 = ArcticDog("Max", "Doberman", "K9 Unit")
arctic_dog2.energy_level = 40  # Налаштовуємо рівень енергії
arctic_dog2.training_level = 60  # Налаштовуємо рівень навчання
print(f"{arctic_dog2.name} is a police dog of {arctic_dog2.breed} breed.")
print(arctic_dog2.bark())
print(arctic_dog2.perform_duty())  # Поліцейська собака успішно виконує обов'язок

# Створюємо першу піддослідну собаку
police_dog1 = ArcticDog(f"Амур", "Сербернар", "Підніжжя західних Альп")
print(f"{police_dog1.name} є арктичною собакою породи {police_dog1.breed} .")
print(police_dog1.train(3))  # Арктична собака навчається 3 години
