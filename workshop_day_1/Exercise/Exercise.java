package workshop_day_1.Exercise;

public class Exercise {

    /**
     * Create a chain method for a "Person" that converts the firstName and lastName
     * to as capital letter. Set the birthdate to be parameterized to get your age
     * dynamically to be based on your date of birth. Validate the age it should be
     * 18 and above as legal age
     * 
     * @param args
     */

    public static void main(String[] args) {

        Person person = new Person()
                .setFirstName("ansel").validateString()
                .setLastName("workshop").validateString()
                .setBirthDate(2023, 01, 01);

        person.introduce(); // Get your firstName, lastName and Age
    }

}
