import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("voce digitou: " + x);
		sc.close();*/
		
		/*Scanner sc = new Scanner(System.in);
		int y;
		y = sc.nextInt();
		System.out.println("voce digitou: " + y);
		sc.close();*/
		
		/*Scanner sc = new Scanner(System.in);
		double y;
		y = sc.nextDouble();
		System.out.println("voce digitou: " + y);
		sc.close();*/
		
		String x;
		int y;
		double z;
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: " + x + ", " + y + ", " + z);
		sc.close();
	}

}
