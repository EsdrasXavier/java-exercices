public class PopulacaoMundial {
	
	static int POPULATION_PER_YEAR = 11626355;
	
	public static void main(String[] args) {	
		int populationInNextYear = Integer.valueOf(args[0]) * POPULATION_PER_YEAR;
		System.out.println(populationInNextYear);
	}
}	
