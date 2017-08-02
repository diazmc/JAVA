import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.*;

public class PuzzleJava {
    public void task1(){

        int[] array = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        System.out.println(sum);

        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(array[i] > 10){
                newArray.add(array[i]);
            }
        }
        System.out.println(newArray);
    }

    public void task2(String[] array){   

        Collections.shuffle(Arrays.asList(array));
        System.out.println(Arrays.toString(array));

         ArrayList<String> newArray = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            if(array[i].length() > 5){
                newArray.add(array[i]);
            }
        }
        System.out.println(newArray);

    }

    public void task3(){
        // char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        // Collections.shuffle(Arrays.asList(array));
        // System.out.println(array[array.length - 1]);

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] vowels = {"a", "e", "i", "o", "u"};
		ArrayList<String> listAlphabet = new ArrayList<String>(Arrays.asList(alphabet));
		ArrayList<String> listVowels = new ArrayList<String>(Arrays.asList(vowels));
		// shuffle array using the Collections class
		Collections.shuffle(listAlphabet);

		String first = listAlphabet.get(0);
		String last = listAlphabet.get(listAlphabet.size() - 1);

        System.out.println(first);
		System.out.println(last);

    }

    public void task4(){

        ArrayList<Integer> resultArray = new ArrayList<Integer>();
		Random randomGenerator = new Random();

		for(int i = 0; i < 10; i++) {
			resultArray.add(randomGenerator.nextInt(101 - 55) + 55);
		}

		System.out.println(resultArray);
    
    }

    public void task5(){
    
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
		Random randomGenerator = new Random();

		for(int i = 0; i < 10; i++) {
			resultArray.add(randomGenerator.nextInt(101 - 55) + 55);
		}

        Collections.sort(resultArray);
		System.out.println(resultArray);
        System.out.println(resultArray.get(0));
        System.out.println(resultArray.get(resultArray.size() - 1));


    }

    

    
}