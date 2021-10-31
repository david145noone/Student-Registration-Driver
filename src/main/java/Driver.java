import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Driver {

    public static void main(String args[]) {

        Student student1 = new Student("John Smith", 28, DateTime.parse("07/04/1995",
                DateTimeFormat.forPattern("dd/MM/yyyy")));


        Student student2 = new Student("Mike O'Conner", 21, DateTime.parse("01/02/1999",
                DateTimeFormat.forPattern("dd/MM/yyyy")));


        Module module1 = new Module("Software Engineering III");
        Module module2 = new Module("Professional Skills III");


        Program program = new Program("Computer Science",
                DateTime.parse("01/09/2021",
                        DateTimeFormat.forPattern("dd/MM/yyyy")),
                DateTime.parse("25/05/1922",
                        DateTimeFormat.forPattern("dd/MM/yyyy")));

        program.addStudent(student1);
        program.addStudent(student2);

        program.addModule(module1);
        program.addModule(module2);

        System.out.println("Program information: ");
        System.out.println(program);


        System.out.println("Student information: ");
        System.out.println(student1);

        System.out.println(student2);

        System.out.println("Module information: ");

        System.out.println(module1);
        System.out.println(module2);

    }
}
