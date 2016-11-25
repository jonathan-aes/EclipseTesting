
public class Main {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.print(i+" ");
			System.out.println("What the hell is going on?");
			int factors = 0;
			if (i!=2 && i%2!=0) {
				for (int k=1; k<= i; k++) {
					if (i%k==0) {
						factors++;
					}
				}
			}
			if (factors==2) {
				System.out.print("Newchange");
			}
			System.out.println();
			//comment? w
			//comment from the website!!!!!!
			//another comment from the website!!!!
			//edited from notepad!!!!!!
			//Comment after renaming working tree to EclipseTesting
			//changed with initial change staged
		}
	}
}
