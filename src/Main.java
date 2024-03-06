
public class Main {
    public static void main(String[] args) {
Student BS=new Student("Bartosz","Stefaniak");
        Student RX=new Student("RURa","xero");
Teacher MD=new Teacher("Mariusz","Depta");
Subject math=new Subject("Mathematics",MD);
math.addToClassList(BS);
math.subjectOut();
    }

}