package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Ed");
        student1.addGrade(1);
        student1.addGrade(3);
        student1.addGrade(15);

        Student student2 = new Student("Edd");
        student2.addGrade(100);
        student2.addGrade(100);
        student2.addGrade(110);

        Student student3 = new Student("Eddy");
        student3.addGrade(23);
        student3.addGrade(57);
        student3.addGrade(70);
        System.out.println(student1.getName() + "'s grade average is: " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s grade average is: " + student2.getGradeAverage());
        System.out.println(student3.getName() + "'s grade average is: " + student3.getGradeAverage());

        System.out.println("Trying overloaded Student constructor");

        ArrayList<Integer> student4grades = new ArrayList<>(Arrays.asList(115, 120, 125));

        Student student4 = new Student("Plank", student4grades);

        System.out.println(student4.getName() + "'s grade average is: " + student4.getGradeAverage());

    }
}
