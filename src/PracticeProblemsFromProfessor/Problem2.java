package PracticeProblemsFromProfessor;

public class Problem2 {

	public static void main(String[] args) {

		Problem2 p2 = new Problem2();
		System.out.println(p2.mystery(12, 20));
	}
	
	 public int mystery(int x, int y) {
	        if (x % 2 == 1 || y % 2 == 1) {
	            return 1;
	        } else {
	            return 2 * mystery(x / 2, y / 2);
	        }
	    }

}
