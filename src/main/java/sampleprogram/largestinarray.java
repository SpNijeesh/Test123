package sampleprogram;

import java.util.ArrayList;
import java.util.Collections;

public class largestinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(70);
        numbers.add(20);
        int largestNumber = Collections.max(numbers); //to find the largest number
        int smallestNumber = Collections.min(numbers); //to find the smallest number
        Collections.sort(numbers, Collections.reverseOrder()); //option to find the reverse order 
        int secondLargest = numbers.get(1);// to get the second largest number
        
        System.out.println("largest number:"+largestNumber);
        System.out.println("2nd largest number:"+secondLargest);
        System.out.println("Smallest number:"+smallestNumber);
        int sum=0;
        for (int number : numbers) {
            sum += number; //get the sum of all numbers in the array
        }
        System.out.println("The sum of the numbers in the ArrayList is: " + sum);
        
        System.out.println("Numbers in the ArrayList in descending order:");
        for (int number : numbers) {
            System.out.println(number);// print the list of array
        }

	}

}
