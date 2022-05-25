public class ArrayFirst {
    public static void main(String[] args) {

        //write code here
        int[] myArray = new int[10];
        int[] myArray2 = {1,2,3,4,5,6};
        String[] stringArray = new String[5];
        String[] stringArray2 = {"Hello", "World", "How"};

        System.out.println("my array length is: " + myArray.length);
        System.out.println("my array2 length is: " + myArray2.length);
        System.out.println("my array length is: " + stringArray.length);
        System.out.println("my array2 length is: " + stringArray2.length);

        System.out.println("my array at index 0 is: " + myArray[0]);
        System.out.println("my array2 at index 2 is: " + myArray2[3]);
        System.out.println("my array at index 0 is: " + stringArray[0]);
        System.out.println("my array2 at index 0 is: " + stringArray2[0]);
        System.out.println("my array at index 2 is: " + stringArray[2]);

        for (int i = 0; i < myArray2.length; i++){
            myArray2[i] = myArray2[i];

            System.out.println(myArray2[i]);
        }

        for (int i = 0; i < myArray2.length; i++){
            myArray2[i] = myArray2[i] * 20;

            System.out.println(myArray2[i]);
        }
    }
}
