# Advanced Employee Management System
### __Overview__:
  This is an implementation of a company management system that keeps track of all information relevant to a company and its employees.

  The system has 2 major elements:
  - __Admins__: Can store and edit info about company, employees, payrolls as well as manage employee leave status.

  - __Employees__: Can check their personal info including leave status, salary, holidays in addition to voicing grievances or resigning.

### __Functionality__:
An `Employee` logs into an existing account previously created by an `Admin` in the database. The `Employee` then gains access to his personal information. An `Admin`, on the other hand, gains access to functions of workflow management as well as `Employee` data. The whole system is connected to a database which handles storage.

### __Design Pattern__:
The design pattern used in this project was `Singleton`, it was implemented in the `Database Connection` class. The reasoning behind that is that making more than one connection to the database simultaneously will cause the program to crash.
