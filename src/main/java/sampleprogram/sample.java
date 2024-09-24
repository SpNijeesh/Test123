package sampleprogram;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=2;
	    //    updateIntValue(number);
		 updateIntValue(number);
	        System.out.println("main method output "+number);
	}

	private static void updateIntValue(int number1) {
		// TODO Auto-generated method stub
		 number1 = number1 + 2; 
		    System.out.println("method output "+number1);
	}

}
