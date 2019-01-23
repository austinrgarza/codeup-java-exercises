package grades;
import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentsName;
    private ArrayList<Integer> grades;


    //constructor
    public Student (String name){
        this.studentsName = name;
        this.grades = new ArrayList<>();

    }

    public Student (String name, ArrayList<Integer> grades){
        this.studentsName = name;
        this.grades = grades;
    }

    public String getStudentsName() {
        return this.studentsName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double avg = 0;

//        for (int i = 0; i < grades.size(); i++){
//            avg += grades.get(i);
//        }                                      -- can use this or the for each loop below--

        for (Integer grade : grades) {
            avg += grade;
        }
        return (int) Math.round(avg/grades.size());

    }

    public String toString (){
        return this.studentsName + "'s grades of "+ this.grades;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Jimm-ay");
//        System.out.println(student1.getStudentsName());

        student1.addGrade(100);
        student1.addGrade(33);
        student1.addGrade(99);
        student1.addGrade(22);
        student1.addGrade(90);
        student1.addGrade(74);

        System.out.println(student1 + " comes out to an average of " + student1.getGradeAverage());

    }

}
