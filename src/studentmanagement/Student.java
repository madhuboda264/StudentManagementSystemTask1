package studentmanagement;

public class Student {
    private String studentId;
    private String studentName;
    private String[] subjectNames;
    private int[] marks;

    // constructor acces the value in the object install
    public Student(String studentId, String studentName,String[] subjectNames, int[] marks){
        this.studentId=studentId;
        this.studentName=studentName;
        this.subjectNames=subjectNames;
        this.marks=marks;
    }
    // dispaly the values
    public void displayStudent(){
        System.out.println("Student ID :"+studentId);
        System.out.println("Student Name :"+studentName);
        for (int i=0; i< subjectNames.length;i++){
            System.out.println(subjectNames[i] + ":"+marks[i]);
        }
    }
    public int calculateTotal(){
        int Total = 0;
        for (int mark : marks){
            Total = Total + mark;
        }
        return Total;
    }
    public double calculateAvarege(){
        double avarege = (double) calculateTotal()/ marks.length;
        return avarege;
    }
    public char  calculateGrade(){
        double avarage = calculateAvarege();
        if(avarage >= 90 ) return 'A';
        else if (avarage >= 75) return 'B';
        else if (avarage >= 60) return 'C';
        else if (avarage >=50) return 'D';
        else return 'F';
    }
}
