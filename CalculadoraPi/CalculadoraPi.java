public class CalculadoraPi {

	public static float mathPi(int n) {
		float j = 1, pi = 0;
	
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) pi -= 1 / j;
			else pi += 1 / j;
			
			j += 2;
		}

		if (pi < 0) pi *= -1;
		return (4 * pi);	
	}

	public static float mathTheError(float n1, float n2) {
		float d = 0;
		d = Math.abs(100 - ((100 * n2) / n1));

		return d;
	}

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		float pi = mathPi(n);

		System.out.println("Valor de pi: " + pi);
		System.out.println("Erro: " + mathTheError((float) Math.PI, pi) + "%");

	}
}

/**
  x = 3.141592653589793 = 100
 	n = ?

	 3.141592653589793 * X = 100 * n
 	 x = (100 * n / 3.141592653589793)
	
*/
