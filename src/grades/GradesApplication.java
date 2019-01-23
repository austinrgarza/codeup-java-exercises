package grades;


import util.Input;

import java.util.*;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("username1", new Student("Ryan"));
        students.get("username1").addGrade(94);
        students.put("username2",new Student("Alyssa"));
        students.get("username2").addGrade(55);
        students.put("username3",new Student("Easton"));
        students.get("username3").addGrade(33);
        students.get("username3").addGrade(99);
        students.get("username3").addGrade(66);
        students.get("username3").addGrade(100);
        students.put("username4",new Student("Elijah"));
        students.get("username4").addGrade(99);

        System.out.println(students.get("username3").getGradeAverage());

        System.out.println("Welcome!\nHere are the names of out students!");

        String usernames ="";
        for (String user : students.keySet()){
            usernames += "| " +user + " | ";
        }
        System.out.println(usernames);

        System.out.println("");

        Input input = new Input();
        do {
            String username = input.getString("What student would you like to see?");
            students.containsKey(username);

        } while (input.yesNo());
    }
}
