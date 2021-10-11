import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Driver {

    public static void main(String args[]) {

        Student student1 = new Student("John Smith", 28, DateTime.parse("07/04/1995",
                DateTimeFormat.forPattern("dd/MM/yyyy")));
        Student student2 = new Student("Mike O'Conner", 21, DateTime.parse("01/02/1999",
                DateTimeFormat.forPattern("dd/MM/yyyy")));

        Module module = new Module("Software Engineering III");

        module.addStudent(student1);
        module.addStudent(student2);

        for(Student student: module.getStudents()) {

            System.out.println(student);
        }
    }
}
