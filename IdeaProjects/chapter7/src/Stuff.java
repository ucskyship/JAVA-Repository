public class Stuff {
    public static void deposit(int money){
        money = money * 10;
        System.out.println("money is now: " + money);
    }
    public static void deposit2(int[] values) {
        values[0] = 78;
        values[values.length - 1] = 89;
    }
}
