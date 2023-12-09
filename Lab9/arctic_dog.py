from dog import Dog
class ArcticDog(Dog):
    def __init__(self, name, breed, country):
        """
        Ініціалізує собаку з ім'ям, породою, і областю в якій вона допомагає лікарям.
        Успадковуєтсья від класу dog
        """
        super().__init__(name, breed)
        self.country = country
        self.helping_level = 0


    def train(self, hours):
        """Симулює, що арктична собака тренуєтсья і підвищує свій рівень навичок."""
        self.helping_level += hours * 3
        return f"{self.name} тренувався {hours} годин. Рівень навичок: {self.helping_level}"

    #def getHealht(self):
     #return f"{self.name} збільшив на {self.health} очок здоров'я"

    def perform_duty(self):
        """Симулює, що собака виконує завданя і витрачає енергію."""
        if self.energy_level >= 30 and self.helping_level >= 50:
            self.energy_level -= 30
            self.helping_level -= 50
            return f"{self.name} успішно виконав завдання. Рівень енергії: {self.energy_level}. Рівень навичок: {self.helping_level}"
        else:
            return f"{self.name} не готовий виконати завадання."
