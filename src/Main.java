
public class Main {

	public static void main(String[] args) {

		Fighter f1 = new Fighter("A",10,120,100,45);
		Fighter f2 = new Fighter("B", 20 ,85 , 85,35);
		
		Match m1 = new Match(f1,f2,85,100);
		m1.run();
		
	}

}
