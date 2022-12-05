package FizzBuzzTDD;

public class FizzBuzz {

    public String FizzBuzz(int maxNumber) {

        String result = "";

        if (maxNumber > 50 || maxNumber == 0) {

            throw new IllegalArgumentException("The number must be greater than 0 and less than 50!");
        }

        for (int i = 1; i <= maxNumber; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                result = result.concat("FizzBuzz");
                result = result.concat(" ");
            } else if (i % 3 == 0) {
                result = result.concat("Fizz");
                result = result.concat(" ");
            } else if (i % 5 == 0) {
                result = result.concat("Buzz");
                result = result.concat(" ");
            } else {
                result = result.concat(Integer.toString(i));
                result = result.concat(" ");
            }

        }

        return result;

    }

}
