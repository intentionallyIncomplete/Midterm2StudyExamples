package RecursionDemo;

public class Recursion {
	private int count;
	public static void main(String[] args) {
		
		Recursion recursionTool = new Recursion();
		
		System.out.println(recursionTool.getTriangularNumber(6));
		
		System.out.println(recursionTool.getFactorial(6));
	}

	//summation of n + (n-1)
	//also known as the Triangular Number
	public int getTriangularNumber(int number){
		System.out.println("method: " + number);
		if(number == 1){
			System.out.println("base case has been reached, number is: " + number);
			return 1;
		}else{
			int result = number + getTriangularNumber(number -1);
			count++;
			System.out.println("'number' is now: " + number + 
					", and this is pass ##: " + count + 
					", returned: " + result);
			return result;
		}
	}
	
	//factorial
	public int getFactorial(int number){
		System.out.println("method: " + number);
		
		if(number == 1){
			System.out.println("base case has been reached, number is: " + number);
			return 1;
		}else{
			int result = number * getFactorial(number-1);
			count++;
			System.out.println("'number' is now: " + number + 
					", and this is pass ##: " + count + 
					", returned: " + result);
			return result;
		}
	}
}
