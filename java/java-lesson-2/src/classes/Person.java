package classes;

import java.util.ArrayList;

public class Person {
    private String name;
    private byte age;
    private String country;
    private ArrayList<String> hobbies = new ArrayList<>();

    public Person(String newName, int i, String newCountry, ArrayList<String> newHobbies) {
        setName(newName);
        setAge((byte) age);
        setCountry(newCountry);
        setHobbies(newHobbies);
    }

    /**
     * Returns the name of the object.
     *
     * @return  the name of the object
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the object.
     *
     * @param  name  the new name to set
     * @throws IllegalArgumentException  if the name is null or empty
     */
    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null");
        } else {
            this.name = name;
        }
    }

    /**
     * Retrieves the age of the object.
     *
     * @return the age of the object as a byte value
     */
    public byte getAge() {
        return age;
    }

    /**
     * Validates and sets the age of the object.
     *
     * @param  age  the age to be set
     * @throws IllegalArgumentException if the age is negative
     */
    public void setAge(byte age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            this.age = age;
        }
    }

    /**
     * Retrieves the country associated with this object.
     *
     * @return  the country associated with this object
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country for this object.
     *
     * @param  country  the country to set
     * @throws IllegalArgumentException if the country is null or empty
     */
    public void setCountry(String country) {
        if (country == null || country.equals("")) {
            throw new IllegalArgumentException("Country cannot be null");
        } else {
            this.country = country;
        }
    }

    /**
     * Returns the list of hobbies.
     *
     * @return     the list of hobbies
     */
    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    /**
     * Sets the hobbies of the object.
     *
     * @param  hobbies  the list of hobbies to set
     */
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }
}
