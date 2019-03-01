public class Calculadora {

	private static float sum(int a, int b) {
		return a + b;
	}

	private static float substraction(int a, int b) {
		return a - b;
	}

	private static float product(int a, int b) {
		return a * b;
	}

	private static float division(int a, int b) {
		return a / b;
	}

	private static int bigger(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		
		int n1 = Integer.valueOf(args[0]);
		int n2 = Integer.valueOf(args[1]);

		System.out.println("Soma: " + sum(n1, n2)); 
		System.out.println("Produto: " + product(n1, n2));
		System.out.println("Diferença: " + substraction(n1, n2));
		System.out.println("Divisão: " + division(n1, n2));
		System.out.println(bigger(n1, n2) + " é maior");

	}
}

