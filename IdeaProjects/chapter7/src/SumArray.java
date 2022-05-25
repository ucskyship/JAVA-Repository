public class SumArray {
    public static void main(String[] args) {

        int[] myArray = {10, 20, 33, -6, -7};
        int sum = 0;
        int largest = myArray[0];
        int smallest = myArray[0];

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];

            if(largest < myArray[i]){
                largest = myArray[i];
            }

            if (smallest > myArray[i]){
                smallest = myArray[i];
            }

        }
        System.out.printf("Sum of arrays is: %d%n\n", sum);
        System.out.println("average is: \n" + sum/myArray.length);
        System.out.println("Largest is: \n" + largest);
        System.out.println("Smallest is:  \n" + smallest);

        int[] myArray2 = {1, 2, 3, 4, 778, 341, 45, -899};

        for (int i = 0; i < myArray2.length; i++){
            int randomIndex = (int) (Math.random() * 10);
            try {
                System.out.println("array at random index " +randomIndex+ " is: " + myArray2[randomIndex]);
            } catch (ArrayIndexOutOfBoundsException error){
                System.out.println(" - Invalid index encountered \n");
            }
        }
        //another for method
        for (int value : myArray){
            sum += value;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
