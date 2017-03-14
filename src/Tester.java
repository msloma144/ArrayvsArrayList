import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Michael Sloma on 3/2/2017.
 */
public class Tester {
    static void accessTime(ArrayList<Integer> list, int[] array){
        //Testing random access times

        //testing at 0
        //array
        long starttime = System.nanoTime();
        int temp = array[0];
        long endtime = System.nanoTime();
        System.out.println("Array 0 - Time: " + ((endtime - starttime)/1000) + " us");

        //array list
        starttime = System.nanoTime();
        temp = list.get(0);
        endtime = System.nanoTime();
        System.out.println("ArrayList 0 - Time: " + ((endtime - starttime)/1000) + " us");


        //testing at pos 10,000
        //array
        starttime = System.nanoTime();
        temp = array[10000];
        endtime = System.nanoTime();
        System.out.println("Array 10,000 - Time: " + ((endtime - starttime)/1000) + " us");

        //array list
        starttime = System.nanoTime();
        temp = list.get(10000);
        endtime = System.nanoTime();
        System.out.println("ArrayList 10,000 - Time: " + ((endtime - starttime)/1000) + " us");


        //testing at 500,000
        //Array
        starttime = System.nanoTime();
        temp = array[500000];
        endtime = System.nanoTime();
        System.out.println("Array 500,000 - Time: " + ((endtime - starttime)/1000) + " us");

        //ArrayList
        starttime = System.nanoTime();
        temp = list.get(500000);
        endtime = System.nanoTime();
        System.out.println("ArrayList 500,000 - Time: " + ((endtime - starttime)/1000) + " us");


        //testing at 10,000,000
        //Array
        starttime = System.nanoTime();
        temp = array[10000000-1];
        endtime = System.nanoTime();
        System.out.println("Array 10,000,000 - Time: " + ((endtime - starttime)/1000) + " us");

        //ArrayList
        starttime = System.nanoTime();
        temp = list.get(10000000-1);
        endtime = System.nanoTime();
        System.out.println("ArrayList 10,000,000 - Time: " + ((endtime - starttime)/1000) + " us");
    }

    static int[] addingElements(int[] testing){
        long starttime = System.nanoTime();

        int[] testingLarger = new int[testing.length + 1]; // making a new array
        //transferring elements to new array
        for(int i = 0; i < testingLarger.length; i++){
            testingLarger[i] = testing[i];
        }
        long endtime = System.nanoTime();
        System.out.println("Time: " + ((endtime - starttime)/1000000) + " ms");

        return testingLarger; //return new array
    }

    static ArrayList<Integer> addingElements(ArrayList<Integer> testing){
        return null;
    }

    static ArrayList<Integer> populator(ArrayList<Integer> input){
        Random rand = new Random();
        //fill the list with random ints
        long starttime = System.nanoTime();

        for(int i = 0; i < 10000000; i++){
            input.add(rand.nextInt());
        }

        long endtime = System.nanoTime();
        System.out.println("ArrayList - Time: " + ((endtime - starttime)/1000000) + " ms");

        return input;
    }

    static int[] populator(int[] input){
        Random rand = new Random();
        //fill the array with random ints
        long starttime = System.nanoTime();

        for(int i: input){
            input[i] = rand.nextInt();
        }

        long endtime = System.nanoTime();
        System.out.println("Array - Time: " + ((endtime - starttime)/1000000) + " ms");

        return input;
    }

    public static void main(String[] args){
        //making arrays with several thousand elements
        int[] array1 = new int[10000000];
        ArrayList<Integer> list1 = new ArrayList<>(10000000);

        //populate the arrays
        array1 = populator(array1);
        list1 = populator(list1);

        accessTime(list1, array1);
    }
}
