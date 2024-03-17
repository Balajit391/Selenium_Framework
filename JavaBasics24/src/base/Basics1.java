package base;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Balaji Basss");
		
		
		Basics1 obj1 = new Basics1();
		obj1.jaggedArray();
		
		int magesh[] = new int[2];
		System.out.println(magesh[0]);
		System.out.println(magesh[1]);
		
	}
	
	// Jogged array concept 
	
	private void jaggedArray() {

		Object book[][] = new Object[4][];

		book[0] = new Object[3];
		book[1] = new Object[7];
		book[2] = new Object[1];
		book[3] = new Object[5];

		
		for(int i=0;i<book.length; i++ ) {
			for (int j=0;j< book[i].length; j++) {
				 book[i][j]=RandomGen();
			}
			
		}
		
//		
//		for (Object m[] : book) {
//			for (Object n : m) {
//				n = RandomGen();				
//			}
//		}

		for (Object m[] : book) {
			for (var n : m) {
				System.out.print(n+" | ");
			}
			System.out.println();
		}

	}
	
	private int RandomGen() {
		
		return((int)(Math.random()*100));
	}

}
