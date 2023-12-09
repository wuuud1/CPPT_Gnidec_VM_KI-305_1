class Dog:
    def __init__(self, name, breed):
        """Створює собаку з ім'ям і породою."""
        self.name = name
        self.breed = breed
        self.energy_level = 100

    def bark(self):
        """Повертає звук який робить собака."""
        return "Гав!"

    def play(self, hours):
        """Симулює, що собака грає і витрачає енергію."""
        energy_consumed = hours * 5
        if self.energy_level >= energy_consumed:
            self.energy_level -= energy_consumed
            return f"{self.name} грав {hours} годин. Рівень енергії: {self.energy_level}"
        else:
            return f"{self.name} дуже змучений щоб грати."

    def sleep(self, hours):
        """Симулює, що собака спить і відновлює енергію."""
        self.energy_level += hours * 5
        return f"{self.name} спав {hours} годин. Рівень енергії: {self.energy_level}"