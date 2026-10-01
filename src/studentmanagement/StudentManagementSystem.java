package studentmanagement;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String... arg){
        Scanner inp = new Scanner(System.in);
//        ---------------------------------------------
        System.out.println("Enter studentID:");
        String studentID = inp.nextLine();
//        ------------------------------------------
        System.out.println("Enter StudentName:");
        String studentName = inp.nextLine();


//        ------------------------------------------
        String[] subjectNames= new String[]{"maths","hindi","social","english"};
        int[] marks = new int[4];
        int i = 0;
       while(i < subjectNames.length){

            System.out.println("Enter Marks for Subject-" + subjectNames[i] + ":");
            int mark = inp.nextInt();

                if(mark>=0 && mark <=100){
                    marks[i]=mark;
                }else {
                    System.out.println("invalide marks pls enter values b/w 0 to 100");
                    continue;
                }
                marks[i] = mark;
                i++;
        }
        Student student = new Student(studentID,studentName,subjectNames,marks);
        System.out.println("------------------------------------------");
        student.displayStudent();
        System.out.println("------------------------------------------");
        System.out.println("Total marks = "+student.calculateTotal());
        System.out.println("------------------------------------------");
        System.out.println("avarage marks ="+student.calculateAvarege());
        System.out.println("------------------------------------------");
        System.out.println("Grades ="+student.calculateGrade());
        System.out.println("------------------------------------------");
    }
}