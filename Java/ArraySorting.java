import java.util.Arrays;
import java.util.Random;

public class ArraySorting{
    public static int minNumber = 1;
    public static int maxNumber = 200;

    public static int[] array = new int[maxNumber];

    public static int selectedNumber;
    public static boolean foundNumber;

    public static void main(String[] args){
        for(int i = 1; i<array.length; i++){
            Random numbers = new Random();
            array[i] = numbers.nextInt(maxNumber-minNumber);
        }

        System.out.println("Før sortering af array: ");
        System.out.println(Arrays.toString(array) + "\n");

        sortArray();
        System.out.println("Efter sortering af array: ");
        System.out.println(Arrays.toString(array) + "\n");

        Random rand = new Random();
        selectedNumber = rand.nextInt(maxNumber-minNumber);

    }

    static void sortArray(){
        for(int i = 1; i<array.length; i++){
            if(array[i] < array[i-1]){
                boolean done = false;
                int checking = 1;

                while(!done){
                    if(array[i] >= array[i-checking]){
                        int tempNumber = array[i];
                        int[] tempArray = new int[checking-1];

                        for(int b = 0; b<tempArray.length;b++){
                            tempArray[b] = array[i-checking+1+b];
                        }

                        for(int b = 0; b<tempArray.length; b++){
                            array[i-checking+1+b+1] = tempArray[b];
                        }
                        array[i-checking+1] = tempNumber;
                        done = true;
                    }
                    checking++;
                }
            }
        }
    }
}
