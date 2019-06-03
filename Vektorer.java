/*
 * Uppgift om vektorer
 */
public class Vektorer {

	public static void main(String[] args) {
		
		int[] heltal = new int[100];
		
		for(int i = 0; i < heltal.length; i++) {
			int tal = (int)Math.floor(Math.random() * 100);
			heltal[i] = tal;
		}
		
		for(int i = 0; i < heltal.length; i++) {
			System.out.println(sort(heltal)[i]);
		}
	}
	
	/**
	 * Sorterar en lista med heltal med hjälp av "bubblesort"
	 * 
	 * @param v, en "vektor"
	 * @return sorterad version av v
	 */
	public static int[] sort(int[] v) {
		
		v = v.clone(); //Exkluderas denna så kommer variabeln man använder som argument att ändras senare
		
		for(int j = 1; j < v.length - 2; j++) {
			for(int i = 0; i < v.length - j; i++) {
				int i1 = v[i];
				int i2 = v[i + 1];
			
				v[i] = Math.min(i1, i2);
				v[i + 1] = Math.max(i1, i2);
			}
		}
		
		return v;
	}
}
