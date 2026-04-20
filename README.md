# Employee-Management-System(Java mini project using variables and methods)
============================

Project Description
--------------------

-->This is a simple Java mini project that demonstrates the use of:
  * Instance Variables
  * Static Variables
  * Methods
  * Constructors

-->The system manages employee details and calculates salary, bonus, and total employees.

Features
---------
  * Auto-generated Employee ID using static variable
  * Bonus calculation using methods
  * Final salary calculation
  * Count total employees

which type of java Concepts Used in this project:
------------------------------------------------
  * Instance Variables:
       -- Each object has its own copy (Inside object-->id,name,salary)
  * Static Variable:
       -- Used to track total number of employees(count)
  * Methods:
    -------
    calculateBonus() → calculates bonus
    display()→ prints employee details

 Working Process
 --------------

1. When an object is created:

   * Constructor is called
   * Static variable "count" increases
   * Employee ID is assigned automatically

2. Bonus is calculated based on salary:

   * Salary > 30000 → 20%
   * Salary > 20000 → 10%
   * Else → 5%

3. Final salary = salary + bonus

How to Run:
-----------

1. Compile the program:
   javac Main.java

2. Run the program:
   java Main

Sample Output:
-------------
ID: 1
Name: SaiLatha
Salary: 15000.0
Bonus: 750.0
Final Salary: 15750.0

Real-World Use
--------------

This concept is used in:

* Payroll systems
* Employee management software
* HR applications

  
Author
======

Pandanaboina Sailatha

