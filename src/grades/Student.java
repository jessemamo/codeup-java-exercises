package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, ArrayList<Integer> gradesList) {
        this.name = name;
        this.grades = gradesList;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double accumulator = 0;
        for (Integer grade : grades) {
            accumulator += (double) grade;
        }
        return accumulator / grades.size();
    }


}
