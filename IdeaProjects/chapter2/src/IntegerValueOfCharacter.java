/**
 * this programs takes in character of :- A B C a b c 0 1 2 $ * + / and output their integer values each
 * it does not prompt
 * */

public class IntegerValueOfCharacter {
    public static void main(String[] args) {

        System.out.printf("""
                        The characters:
                        %c %c %c %c %c %c %d %d %d %c %c %c %c
                        have the values of:
                        %d %d %d %d %d %d %d %d %d %d %d %d %d respectively
                        """
                ,'A', 'B', 'C', 'a', 'b', 'c', 0, 1, 2, '$', '*', '+', '/',
                ((int) 'A'), ((int) 'B'), ((int) 'C'), ((int) 'a'), ((int) 'b'), ((int) 'c'), ((int) '0'),
                ((int) '1'), ((int) '2'), ((int) '$'), ((int) '*'), ((int) '+'), ((int) '/'));

    }
}