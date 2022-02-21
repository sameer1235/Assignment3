package assignedment3;

public class Program3 extends Exception {
	 public Program3(int age) {		 
	}
	static void canVote(int age){
		if(age<18)
			try {
				throw new Program3(age);
			} catch (Exception e) {
				System.out.println("your age is less ");
				e.printStackTrace();
			}
		else 
		   System.out.println("you can vote!");
	}


	public static void main(String[] args) {
		canVote(20);
		canVote(10);

	}

}
