package PracticeProblemsFromProfessor;

public class Problem1 {
	
    private int result;
    
    public static void main(String args[]) {
        Problem1 p1 = new Problem1();
        
        p1.writeSquares(5); //set n = 5
        System.out.println(); //new line
        p1.writeSquares(1); //set n = 1
        System.out.println(); //new line
        p1.writeSquares(8); //set n = 8
        System.out.println(); //new line
    }
    /* This method will take in a parameter 'n' that stores
     * an integer value passed in through the main() method.
     * Then it will check 'n' against the conditions below for
     * if it's less than 1, equal to 1, or divisible by 2 with
     * no remainder (meaning that it's an even square). Because
     * the call to the method is made in the method, it's recursive
     * so we want to take care of the processing of even squares first
     * and odd squares after that because the stack call will be 
     * in "reverse" when the class is compiled.*/
    public void writeSquares(int n) {
    	//when n is not a valid integer for this function
    	//then throw an exception IllegalArgumentException
        if(n < 1){
            throw new IllegalArgumentException();
        }else if(n == 1) {
            System.out.print(1);
            return;
        }else if(n % 2 == 0) {
            writeSquares(n-1); //recursive call happens BEFORE the print statement
            //so that when this condition is met, the cycle starts over with a new
            //value for n in the parameter for this method
            System.out.print(", " + n * n);
        }else{
            System.out.print(n * n + ", ");
            writeSquares(n-1);
        }
    }
}
