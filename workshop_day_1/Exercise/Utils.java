package workshop_day_1.Exercise;

import java.time.LocalDate;
import java.time.Period;

public class Utils {

    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] parts = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            String firstLetter = part.substring(0, 1).toUpperCase();
            String remainingLetters = part.substring(1);

            result.append(firstLetter).append(remainingLetters).append(" ");
        }

        return result.toString().trim();
    }

    public static int CalculateDate(int year, int month, int day) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        Period age = Period.between(birthday, currentDate);
        int yourAge = age.getYears();

        return yourAge;
    }

}
