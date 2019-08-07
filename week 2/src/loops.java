
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loops
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x += 2;
		}
	    int y = 100;
		while (y >= 0) {
		System.out.println(y);
		y -= 3;		} 	//for loops
		for (int i = 1; i <= 100; i = i +2) {
			System.out.println(i);
		}
		for (int z = 0; z <= 100; z++) {
			if (z % 3 == 0) {
				System.out.println("Hello");
			}
			if (z % 5 == 0) {
				System.out.println("World");
			}
			if (z % 3 == 0 && z % 5 == 0) {
				System.out.println("HelloWorld");			}
		}
		
 }
	
}
