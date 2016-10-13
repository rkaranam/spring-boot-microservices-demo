# Not Working as of now

use microservicedb

db.createCollection("employees")

db.employees.insert([{
  	"id" : "101",
	"email" : "employee1@xyz.com",
    "fullName" : "Employee 1",
    "managerEmail" : "managerEmployee1@xyz.com"
}, {
	"id" : "102",
    "email" : "employee2@xyz.com",
    "fullName" : "Employee 2",
    "managerEmail" : "managerEmployee2@xyz.com"
}, {
	"id" : "222",
    "email" : "abc@xyz.com",
    "fullName" : "ABC",
    "managerEmail" : "managerAbc@xyz.com"
}])