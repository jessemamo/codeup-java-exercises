package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        ArrayList<Integer> student1grades = new ArrayList<>(Arrays.asList(10, 20, 40));
        ArrayList<Integer> student2grades = new ArrayList<>(Arrays.asList(20, 40, 60));
        ArrayList<Integer> student3grades = new ArrayList<>(Arrays.asList(30, 60, 120));
        ArrayList<Integer> student4grades = new ArrayList<>(Arrays.asList(40, 80, 160));


        Student student1 = new Student("bruce", student1grades);
        Student student2 = new Student("gordan", student2grades);
        Student student3 = new Student("ram ", student3grades);
        Student student4 = new Student("mammoth", student4grades);


        students.put("jmamo_1", student1);
        students.put("OG_Gunz", student2);
        students.put("squad_lead", student3);
        students.put("Summer-22", student4);
        System.out.println(students);


    }
}
