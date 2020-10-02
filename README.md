# UPES-JAVA
This repository contains solutions to all lab experiments of OOPS lab (UPES CSEG-238). Non-UPESites can practice questions related to Java and refer to solutions.


# What's Included

## OOPS lab (UPES CSEG-238)

### [Basic-I](/Basic)

- Write, compile and execute my first java program.
- Write a program to print Fibonacci series using a loop.
- Write a program to find the largest of 3 numbers.
- Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.

### [Basic-II](/Basic-II)

- Write a program to input a number of a month (1 - 12) and print its equivalent name of the month (e.g 1 to Jan., 2 to Feb., 12 to Dec.)
- Write a program to add two numbers using command line arguments.
- Write a program to implement a command line calculator.
- Write a program to take student information using Scanner class and display output. Use appropriate mutator.
  
### [Objects-and-Methods](/Objects-and-Methods)

- Write a program that demonstrates the working of class, objects and methods.
- Write a program to implement compile-time polymorphism.
- Write a program to implement type promotion in method overloading.
 
### [Inheritance](/Inheritance)

- Write a Java program to show that private members of a super class cannot be accessed from derived classes.
- Write a program in Java to create a Player class. Inherit the classes Cricket _Player, Football _Player and Hockey_ Player from Player class.
- Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.
- Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. Supply a test program that uses these classes and methods.

### [Interface](/Interface)

- Write a program to create an interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.
- Write a program to create interface A with two methods meth1 and meth2. Implement this interface in another class named MyClass.
- Write a program to implement multiple and multilevel inheritance using Interface.
- Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.

### [Package](/Package)

- Write a Java program to implement the concept of importing classes from user defined packages and created packages.
- Write a program to make a package Balance. This has an Account class with Display_Balance method. Import Balance package in another program to access Display_Balance method of Account class.
- Write a program that creates a package calculation. Add addition, subtraction, division and multiplication classes in it. Write another Test class to import and use the above package.

### [Exceptions](/Exceptions)

- Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of the program.
- Write a Java program to enable the user to handle any chance of divide by zero exception.
- Create an exception class, which throws an exception if the operand is non-numeric in calculating
modules. (Use command-line arguments).
- Write a java program to throw an exception for employee details - If an employee's name is a number, a name exception must be thrown, If an employee's age is greater than 50, an age exception must be thrown, Or else an object must be created for the entered employee details

### [Threads](/Threads)

- Write a program to implement the concept of threading by extending Thread Class.
- Write a program to implement the concept of threading by implementing Runnable interface.
- Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.
- Write a Java program that implements multithreading among 3 threads. Use  sleep() and join() methods in this program and show appropriate output.
- Write a Java program that shows multithreading between three threads. Set different priorities to each thread and show output.

### [String-Handling-and-Wrapper-Class](/String-Handling-and-Wrapper-Class)

- Write Java program using the following string methods - String concat(String str), boolean equals(Object anObject), boolean equalsIgnoreCase(String anotherString), String toUpperCase(), char charAt(int index), int compareTo(String anotherString)
- Write Java program using the following string methods - int hashCode(), String trim(), String intern(), int length(), String replace(char oldChar, char newChar), String substring(int beginIndex, int endIndex)
- Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts String to Integer convert Integer to int.
- Write a Java code that converts a float to Float, converts Float to String, converts String to float, converts float to String, converts String to Float, converts Float to float.

### [JDBC](/JDBC)

- Create a database table to store the records of employees in a company. Use the getConnection function to connect the database. The statement object uses executeUpdate function to create a table. Create a database of employees of the company in mysql and then use a java program to access the database for inserting information of employees in the database. The SQL statement can be used to view the details of the data of employees in the database.

### [JSP-and-Servlets](/JSP-and-Servlets)

- Write a Servlet page to display the current date of the server (1).
- Write a JSP page to display student information(2).

## [Online Banking System](/Online Banking System)
  A project using JSP, Servlets and JDBC. JSP is used for only viewing things. Servlets are used for processing, basically business logic is written here. A simple java class which acts as DAO(Data Access Object) is used to perform operations on MySQL using JDBC.


