package classes;
import java.util.ArrayList;
public class Classes {
    public static void main(String[] args) {
        ArrayList<String> hobbies =  new ArrayList<String>();
        hobbies.add("coding");
        hobbies.add("sleeping");

        Person personOne = new Person("John", 30, "USA", hobbies);
        System.out.println(personOne.getName());
        System.out.println(personOne.getAge());
        System.out.println(personOne.getCountry());
        System.out.println(personOne.getHobbies());

        personOne.setName("Joe");
        System.out.println(personOne.getName());
    }
}
