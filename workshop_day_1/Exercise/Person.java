package workshop_day_1.Exercise;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int legalAge = 18;

    public Person() {
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person setBirthDate(int years, int month, int day) {
        this.age = Utils.CalculateDate(years, month, day);

        return this;
    }

    public Person validateString() {
        if (firstName != null) {
            firstName = Utils.capitalizeFirstLetter(firstName);
        }
        if (lastName != null) {
            lastName = Utils.capitalizeFirstLetter(lastName);
        }
        return this;
    }

    public void introduce() {
        if (age >= legalAge) {
            System.out.println("My name is " + firstName + " " + lastName + " and I am " + age + " years old.");
        } else {
            System.out.println("Age below " + legalAge + " is not allowed");
        }

    }
}
