public class Main {
    public static void main(String[] args) {

       Person.name="Phani";
//        System.out.println(Person.Details());
        Student student=new Student();
        System.out.println(student.Details());
        System.out.println("------------");
//        System.out.println(Person.Details());
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setAge(23);
        System.out.println(student.Details());



    }
}

class Person{
    public static  String name;
    public static String  Details(){
        return name;
    }

}

class Student{
 private String firstName;
 private String lastName;
 private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){

    }
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String Details(){
        return "FullName :"+this.getFirstName()+" "+this.getLastName()+"\nAge :"+this.getAge();
    }
}
