package semana_05;

public class ArregloNotas {
	private int[] nota = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};
	
	public ArregloNotas(){
		
	}
	
	public int tamanio(){
		return nota.length;
	}
	
	public int obtener(int i){
		return nota[i];
	}
	
	public int notaPromedio(){
		int promedio = 0;
		for (int i = 0; i < tamanio(); i++) {
			promedio += nota[i];
		}
		return promedio;
	}
	
	public int notaMayor(){
		int mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < nota[i]) {
				mayor = nota[i];
			}
		}
		return mayor;
	}
	
	public int notaMenor(){
		int menor = nota[0];
		for (int i = 0; i < tamanio(); i++) {
			if (menor > nota[i]) {
				menor = nota[i];
			}
		}
		return menor;
	}
	
	public int cantNotasAprobatorias(){
		int cant = -1;
		for (int i = 0; i <tamanio(); i++) {
			if (nota[i] >= 13) {
				cant ++;
			}
		}
		return cant;
	}
	
	public int cantNotasDesaprobatorias(){
		return tamanio() - cantNotasAprobatorias();
	}
	
	public int cantNotasMayoresA15(){
		int cant = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] >= 15) {
				cant++;
			}
		}
		return cant;
	}
	
	public int posPrimeraNotaAprobatoria(){
		int posicion = -1;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] >= 13) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	public int posPenultimaNotaDesaprobatoria(){
		int posicion = -1;
		for (int i = tamanio(); i < 1; i++) {
			if (nota[i] < 13) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	public void generarNotas(){
		for (int i = 0; i < tamanio(); i++) {
			nota[i] = aleatorio(0, 20);
		}
	}
	
	private int aleatorio(int min, int max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}
}
