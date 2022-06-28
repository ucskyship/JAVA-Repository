/**
 * this program calculates the square and cubes of number 0 - 10
 * and outputs result in tables format
 */

public class TablesOfSquareAndCubes {
    public static void main(String[] args) {
        int number0 = 0;
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int number6 = 6;
        int number7 = 7;
        int number8 = 8;
        int number9 = 9;
        int number10 = 10;

        int square0 = (int) Math.pow(number0, 2);
        int square1 = (int) Math.pow(number1, 2);
        int square2 = (int) Math.pow(number2, 2);
        int square3 = (int) Math.pow(number3, 2);
        int square4 = number4 * number4;                //required method
        int square5 = (int) Math.pow(number5, 2);
        int square6 = (int) Math.pow(number6, 2);
        int square7 = (int) Math.pow(number7, 2);
        int square8 = (int) Math.pow(number8, 2);
        int square9 = (int) Math.pow(number9, 2);
        int square10 = (int) Math.pow(number10, 2);

        int cube0 = (int) Math.pow(number0, 3);
        int cube1 = number1*number1*number1;            //required method
        int cube2 = (int) Math.pow(number2, 3);
        int cube3 = (int) Math.pow(number3, 3);
        int cube4 = (int) Math.pow(number4, 3);
        int cube5 = (int) Math.pow(number5, 3);
        int cube6 = (int) Math.pow(number6, 3);
        int cube7 = (int) Math.pow(number7, 3);
        int cube8 = (int) Math.pow(number8, 3);
        int cube9 = (int) Math.pow(number9, 3);
        int cube10 = (int) Math.pow(number10, 3);

        String output = """
               number   square   cube
               %d%10d%9d
               %d%10d%9d
               %d%10d%9d
               %d% 10d%10d
               %d% 10d%10d
               %d% 10d %10d
               %d% 10d %10d
               %d% 10d %10d
               %d% 10d %10d
               %d% 10d %10d
               %d% 10d %10d
     
                """;
       output = output.formatted(number0, square0, cube0, number1, square1, cube1, number2, square2, cube2, number3, square3, cube3, number4, square4, cube4, number5, square5, cube5, number6, square6, cube6, number7, square7, cube7, number8, square8, cube8, number9, square9, cube9, number10, square10, cube10);
        System.out.println(output);
    }
}
