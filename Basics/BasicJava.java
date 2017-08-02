import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {

    public void print1To255() {
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255() {
        for(int i = 1; i < 256; i++){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum(){
        int sum = 0;
        for(int i = 0; i < 255; i++){
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum );

        }
    }

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void findMax(int[] array1){
        int max = array1[0];
        for(int i = 0; i < array1.length; i++){
            if(array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println(max);
    }

    public void getAvg(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }  
        System.out.println(sum/array.length);
    }

    public void arrayWithOdd(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 1; i < 256; i++){
            if(i % 2 != 0){
                array.add(i);
            }
        }
        System.out.println(array);
    }

    public void greaterThanY(int[] array, int y){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > y ){
                count ++;
            }
        }
        System.out.println(count);
    }   

    public void squareValues(int[]array){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            newArray.add(array[i] * array[i]);
        }
        System.out.println(newArray);
    }

    public void eliminateNeg(int[] array){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                array[i] = 0;
            }
            newArray.add(array[i]);
        }
        System.out.println(newArray);
    }

    public void maxMinAvg(int[] array){
       
        int max = array[0];
        int min = array[0];
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            if(array[i] > max) {
                max = array[i];
            }
            if(array[i] < min) {
                min = array[i];
            }
            avg = sum / array.length;
        }

        newArray.add(max);
        newArray.add(min);
        newArray.add(avg);
        System.out.println(newArray);
    }

    public void shiftingValues(int[] array){
        int[] newArray;
        newArray = new int[array.length];

        for(int i = 1; i < array.length; i++){
            newArray[i - 1] = array[i];
        }

        newArray[newArray.length - 1] = array[0];
        
        System.out.println(Arrays.toString(newArray));
    }

}