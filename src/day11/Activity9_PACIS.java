public class Activity9_PACIS {

    public static void main(String[] args) {

        String country = "SwitzerLand";

        char firstCharacter = country.charAt(0);

        char lastCharacter = country.charAt(country.length() - 1);

        System.out.println("Country: " + country);
        System.out.println("First character: " + firstCharacter);
        System.out.println("Last character: " + lastCharacter);

        int aCount = 0;
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char letter = country.charAt(i);

            if (letter == 'A' || letter == 'a') {
                aCount++;
            }

            if (letter == 'a' || letter == 'e' ||
                    letter == 'i' || letter == 'o' ||
                    letter == 'u' ||
                    letter == 'A' || letter == 'E' ||
                    letter == 'I' || letter == 'O' ||
                    letter == 'U') {

                vowelCount++;
            }
        }

        System.out.println("Number of A/a: " + aCount);
        System.out.println("Total number of vowels: " + vowelCount);
    }
}