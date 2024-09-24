package sampleprogram;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers=new ArrayList();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);	
	numbers.add(40);
	numbers.add(25);
	numbers.add(27);
	System.out.println(numbers);
	Collections.sort(numbers,Collections.reverseOrder());
	for(int number:numbers)
	{
		System.out.println(number);
		
	}
	int secondnumber=numbers.get(1);
	System.out.println("Second largerst number" +secondnumber);
	System.out.println("largest number"+Collections.max(numbers));
	int sum=0;
	
	for(int number:numbers)
	{
		sum=sum+number;
		
		
	}
	System.out.println("Sum of nos " +sum);
	}
}
