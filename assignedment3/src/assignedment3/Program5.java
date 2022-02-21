package assignedment3;

import java.util.Scanner;

class WeightLimitExceeded extends Exception{
    WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}
 class Main{
void validWeight(int weight) {
    if(weight>15)
		try {
			throw new WeightLimitExceeded(weight);
		} catch (WeightLimitExceeded e) {
			System.out.println("You cant fly!");
			e.printStackTrace();
		}
	else
        System.out.println("You are ready to fly!");
}
 }
public class Program5 {
	  

	public static void main(String[] args) throws WeightLimitExceeded {
		 Main ob=new Main();
	        Scanner in=new Scanner(System.in);
			 System.out.println("Enter the weight in kg");
	        for(int i=0;i<2;i++){
	            ob.validWeight(in.nextInt());
	        }
	        

	}

}
