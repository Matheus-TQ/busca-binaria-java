public class BuscaBinaria {
	
	public static Integer pesquisaBinaria(int[] lista, int item) {
		int baixo = 0; // Inicio do Array
		int alto = lista.length - 1; // Final do Array
		
		while(baixo <= alto) {
			int meio = (baixo + alto) / 2;
			int chute = lista[meio];
			
			if (chute == item) {
				return meio;
			}
			
			if (chute > item) {
				alto = meio - 1;
			} else {
				baixo = meio + 1;
			}
		}
		
		return null;
	}
}
