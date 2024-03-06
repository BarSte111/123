import java.util.Scanner;

public class Subject {
    public static String newline = System.getProperty("line.separator");

        private int NOSTUDS=0;
        private String subject;
        private Teacher lecturer;
        private Student[] classList;

        public Subject(String subject, Teacher lecturer) {
            this.subject = subject;
            this.lecturer = lecturer;
        }

        public void addToClassList(Student stud) {
classList[NOSTUDS]=stud;
NOSTUDS+=1;
        }
    public void subjectOut(){

            System.out.format("Subject's name= %s" + newline + "Teacher's name= %s" + newline );



    }
}




