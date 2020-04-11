# CRUD
New CRUD
// Get all employees
http://localhost:8080/employee/all
 
// Get employee by id
http://localhost:8080/employee/1003
 
// Create new employee
http://localhost:8080/employee/add

{
    "id": 1,
    "name": "name",
    "department": "Dep",
    "salary": 2000
}
 
// Update existing employee by id
http://localhost:8080/employee/update/1008
 
// Delete employee by id
http://localhost:8080/employee/delete/1002
 
// Delete all employees
http://localhost:8080/employee/deleteall


SQl
Query
insert into employee values ("1","Dep","name","2000");
