package base;

public class WorkBench {


	


		public static void main(String[] args)
		{
			//to find given number is prime or not ?
			
		int m =21;
		
		int init =0;
		int next =1, temp =0;
		System.out.print("0, 1");
		
		while(true) {
			
			
			temp =init+next ;
			init =next;
			next = temp;
			if(next<=m)
				System.out.print(", "+temp);
			else
				break;
			
		}
		
				
			
		}
		
		

}
