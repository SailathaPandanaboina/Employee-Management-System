class Employee {
    static int count = 0;//Static variable (common for all)
    int id; // Instance variables (different for each object)
    String name;
    double salary;
    //Constructor (auto ID generation)
    Employee(String name, double salary) {
        count++;
        this.id = count;
        this.name = name;
        this.salary = salary;
    }

    //Method to calculate bonus
    double calculateBonus() {
        if (salary > 30000) {
            return salary * 0.20;
        } else if (salary > 20000) {
            return salary * 0.10;
        } else {
            return salary * 0.05;
        }
    }

    //Method to display details
    void display() {
        double bonus = calculateBonus();
        double finalSalary = salary + bonus;

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
        System.out.println("----------------------");
    }

    //Static method
    static void showTotalEmployees() {
        System.out.println("Total Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Sai", 15000);
        Employee e2 = new Employee("Madhuri", 25000);
        Employee e3 = new Employee("Ravi", 35000);

        e1.display();
        e2.display();
        e3.display();

        Employee.showTotalEmployees();
    }
}