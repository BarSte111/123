import java.util.Scanner;

public class Subject {
    public static String newline = System.getProperty("line.separator");

        private int NOSTUDS;
        private  String subject;
        private  Teacher lecturer;
        private final Student[] classList=new Student[NOSTUDS+2];

    public Subject(Student[] classList) {

    }

    public Subject(String subject, Teacher lecturer) {
            this.subject = subject;
            this.lecturer = lecturer;


        }

        public void addToClassList(Student stud) {
for(int i=NOSTUDS;i<NOSTUDS+1;i++){
    classList[i]=stud;


}
NOSTUDS+=1;
        }
    public void subjectOut(){

            System.out.format("Subject's name= %s " + newline + "Teacher's name= %s %s" + newline ,subject,lecturer.getName(),lecturer.getSurname());
for(int j=0;j<NOSTUDS;j++){

    System.out.format("Student %d name= %s %s",j,classList[j].getName(),classList[j].getSurname());


}


    }

}




