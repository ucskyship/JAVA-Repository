import java.util.Arrays;

public class MoneyMain {
    public static void main(String[] args) {

        int money = 10000;
        Stuff.deposit(money);
        System.out.println(money);

        int[] values = {1,2,3,4,5,6,7,8,9};
        Stuff.deposit2(values);
        System.out.println(Arrays.toString(values));
    }
}
