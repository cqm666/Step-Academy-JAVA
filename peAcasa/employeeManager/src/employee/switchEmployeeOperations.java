package employee;

import employee.CRUD_Employee.CRUD;

import java.util.Scanner;

public class switchEmployeeOperations {
    public void switchEmployee(){
        Scanner sc = new Scanner(System.in);
        int i; //variable to select case
        CRUD crud = new CRUD();  //object to initalize CRUD options with employee

            System.out.println("***      Employee  MENU     ***");
            System.out.println("***    1. Add new Employee  ");
            System.out.println("***    2. Show all Employee  ");
            System.out.println("***    3. Edit Employee(menu)  ");
            System.out.println("***    4. Delete Employee  ");
            System.out.println("***    5. Search Employee(menu) ");
            System.out.println("***    5.1  Search Employee by name ");
            System.out.println("***    5.2  Search Employee by surname ");
            System.out.println("***    5.3  Search Employee by idnp");
            continueSwitch:
            while(true){
                System.out.print("***    Select new option ::  ");
                   i = sc.nextShort();
                   switch(i){
                       case 1:
                           crud.AddEmployee();
                           break;
                       case 2:
                           crud.showEmployee();
                           break;
                       case 3:
                           System.out.println(" *** 1. Edit name");
                           System.out.println(" *** 2. Edit surname");
                           System.out.println(" choose :: ");
                           int f = sc.nextShort();
                           switch (f){
                               case 1: crud.updateEmployeeName(); break;
                               case 2: crud.updateEmployeeSurame(); break;
                           }
                           break;
                       case 4:
                           crud.deleteEmployee();
                           break;
                       case 5:
                           System.out.println(" *** 1. Search by name");
                           System.out.println(" *** 2. Search by surname");
                           System.out.println(" *** 3. Search by IDNP");
                           System.out.println("  Choose :: ");
                           f = sc.nextShort();
                           switch(f){
                               case 1 : crud.searchEmployeeByName(); break;
                               case 2 : crud.searchEmployeeBySurname(); break;
                               case 3 : crud.searchEmployeeByIdnp(); break;
                           }
                           break;

                       default: System.out.println("No such selection");
                           continue continueSwitch;

                   }
               }

            }
    }

