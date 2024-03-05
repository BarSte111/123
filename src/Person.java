public class Person {
    private String name, surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String printName(){
        return String.format( "name: %d surname: %d",name,surname);
    }
}
