package employee;

public class employeeData{
    public String name;
    public String surname;
    public gender gen;
    public String idnp;

    public enum gender{
        masculin,
        feminin;
    }

    public void employeeData(String name, String surname, boolean gen, String idnp) {
      this.name = name;
      this.surname = surname;
      this.idnp = idnp;
      if(gen){
          this.gen = gender.masculin;
      } else {
          this.gen = gender.feminin;
      }
    }

    public void employeename(){
        System.out.print(" name:: ");
        System.out.println(this.name);
        System.out.print(" surname:: ");
        System.out.println(this.surname);
        System.out.print(" gender:: ");
        System.out.println(this.gen);
        System.out.print(" idnp:: ");
        System.out.println(this.idnp);
        System.out.println("--------------------");
    };


}
