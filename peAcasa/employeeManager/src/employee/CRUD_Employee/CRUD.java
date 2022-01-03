package employee.CRUD_Employee;
import employee.employeeData;


import java.util.Scanner;

public class CRUD {
    Scanner sc = new Scanner(System.in);
    static int j=0; //iterator for all new created objects
    boolean B=false;  //bool to work with adding employee loop
    employeeData em[] = new employeeData[4];
    String[] list;



    public void AddEmployee(){
        short gen;  // variable to set gender
        em[j] = new employeeData();
        //Create new employee
//        addingNewEmployee:
           do{

                   System.out.print("Enter name:: ");
                   String a=sc.next();
                   System.out.print("Enter surname:: ");
                   String b=sc.next();
                   System.out.print("Enter gender( 0/1) :: ");
                   gen = sc.nextShort();
                   System.out.print("Enter idnp :: ");
                   String idnp = sc.next();

                   if(gen==1) em[j].employeeData(a, b, true, idnp);
                   else if(gen==0) em[j].employeeData(a, b, false, idnp);

               j++;

                   B=false;
//               System.out.println("------------------------- ");
//               System.out.println("Add new employee? 1/0 :: ");
//                int y=1;
//                y=sc.nextShort();
//                if(y == 1){
//                    B=true;
//                    continue addingNewEmployee;
//
//                } else {
//                    B=false;
//                }
           } while (B);
    }
    //show all employee
    public void showEmployee(){
        System.out.println("[ " + j+ " ] = ");
        for (int i = 0; i < j; i++) {
            em[i].employeename();
        }
    }
    //search employee
    public void searchEmployeeBySurname() {
        System.out.print("Enter surname for search:: ");
        String s = sc.next();
        boolean f=true;
        int k=0;
        for (int i = 0; i < em.length; i++, k++) {
            if(s.equals(em[k].surname)){
                System.out.println("found name :: " + em[k].surname);
                System.out.println("found name :: " + em[k].name);
                System.out.println("found gender :: " + em[k].gen);
                System.out.println("found idnp :: " + em[k].idnp);
                break;
            } else {
                System.out.print(" ");
            }
        }

    }
    public void searchEmployeeByName() {
        System.out.print("Enter name for search:: ");
        int k=0;
        String s = sc.next();
        for (int i = 0; i < em.length; i++,k++) {
            if(s.equals(em[k].name)){
                System.out.println("found surname :: " + em[k].surname);
                System.out.println("found name :: " + em[k].name);
                System.out.println("found gender :: " + em[k].gen);
                System.out.println("found idnp :: " + em[k].idnp);
                break;
            } else {
                System.out.print(" ");
            }
        }
    }
    public void searchEmployeeByIdnp() {
        System.out.print("Enter idnp for search:: ");
        int k=0;
        String s = sc.next();
        for (int i = 0; i < em.length; i++,k++) {
            if(s.equals(em[k].idnp)){
                System.out.println("found surname :: " + em[k].surname);
                System.out.println("found name :: " + em[k].name);
                System.out.println("found gender :: " + em[k].gen);
                System.out.println("found idnp :: " + em[k].idnp);
                break;
            } else {
                System.out.print(" ");
            }
        }
    }
    public void updateEmployeeName(){
        if(em.length != 0){
            System.out.println("Sorry no new entries!");
            return;
        } else {
        System.out.print("Enter name for search:: ");
        int k=0;
        String s = sc.next();
        for (int i = 0; i < em.length; i++,k++) {
            if (s.equals(em[k].name)) {
                System.out.println("found :: " + em[k].name);
                System.out.print("insert new name :: ");
                String ss = sc.next();
                em[k].name = ss;
                System.out.println("changed to :: " + em[k].name + " from -- " + s);

                break;
            } else {
                System.out.print(" ");
            }
        }
        }
    }
    public void updateEmployeeSurame(){
        if(em.length != 0){
            System.out.println("Sorry no new entries!");
            return;
        } else {
            System.out.print("Enter surname for search:: ");
            int k=0;
            String s = sc.next();
            for (int i = 0; i < em.length; i++,k++) {
                if(s.equals(em[k].surname)){
                    System.out.println("found :: " + em[k].surname);
                    System.out.print("insert new surname :: ");
                    String ss = sc.next();
                    em[k].surname = ss;
                    System.out.println("changed to :: " + em[k].surname + " from -- " + s);

                    break;
                } else {
                    System.out.print(" ");
                }
        }

        }
    }
    public void deleteEmployee(){

     System.out.print("Enter idnp for search:: ");
    int k=0;
    String s = sc.next();
        for (int i = 0; i < em.length; i++,k++) {
        if(s.equals(em[k].idnp)){
            System.out.println("delete surname :: " + em[k].surname);
            em[k].surname = "";
            System.out.println("delete name :: " + em[k].name);
            em[k].name = "";
            System.out.println("delete gender :: " + em[k].gen);
            em[k].gen = null;
            System.out.println("delete idnp :: " + em[k].idnp);
            em[k].idnp = "";
            break;
        } else {
            System.out.print(" ");
        }
    }
}


    }



