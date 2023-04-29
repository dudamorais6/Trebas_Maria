class Employee:
    def __init__(self, name, experience, hourly_rate, total_hours_worked):
        self.name = name
        self.experience = experience
        self.hourly_rate = hourly_rate
        self.total_hours_worked = total_hours_worked

    def calculate_salary(self):
        base_salary = self.hourly_rate * self.total_hours_worked * 4  # assuming 4 weeks in a month
        if self.experience < 8:
            total_salary = base_salary
        elif self.experience > 15:
            total_salary = base_salary * 1.1  # bonus of 10% for experienced employees
        else:
            total_salary = base_salary

        tax_deduction = total_salary * 0.13
        net_salary = total_salary - tax_deduction
        return net_salary


# Get input from user
name = input("Enter employee name: ")
experience = int(input("Enter employee experience (in years): "))
hourly_rate = float(input("Enter employee hourly rate: "))
total_hours_worked = int(input("Enter employee total hours worked: "))

# Create employee object and calculate salary
emp = Employee(name, experience, hourly_rate, total_hours_worked)
salary = emp.calculate_salary()
print(f"{emp.name}'s net salary is: {salary:.2f}")
