package semana_05;

public class ArregloEdades {
	private int [] edad = {27, 22, 13, 12, 25, 11, 29, 70, 15, 21};
	
	public ArregloEdades(){
		
	}
	
	public int tamanio(){
		return edad.length;
	}
	public int obtener(int i){
		return edad[i];
	}
	
	public int edadPromedio(){
		int edades = 0;
		for (int i = 0; i < tamanio(); i++) {
			edades += edad[i];
		}
		return edades / tamanio();
	}
	
	public int edadMayor(){
		int mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < edad[i]) {
				mayor = edad[i];
			}
		}
		return mayor;
	}
	
	public int edadMenor(){
		int menor = edad[0];
		for (int i = 0; i < tamanio(); i++) {
			if (menor > edad[i]) {
				menor = edad[i];
			}
		}
		return menor;
	}
	
	public int cantMayoresEdad(){
		int cant = 0;
		for (int i = 0; i < edad.length; i++) {
			if (edad[i] >= 18) {
				cant ++;
			}
		}
		return cant;
	}
	
	public int cantMenoresEdad(){
		return tamanio() - cantMayoresEdad();
	}
	
	public int posPrimeraEdadAdolescente(){
		int posicion = -1;
		for (int i = 0; i < tamanio(); i++) {
			if (edad[i] >= 12 && edad[i] <= 20) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	public int posUltimaEdadAdolescente(){
		int posicion = -1;
		for (int i = tamanio() -1; i >= 0; i--) {
			if (edad[i] >= 12 && edad[i] <= 20) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	public void generarEdades(){
		for (int i = 0; i < tamanio(); i++) {
			edad[i] = aleatorio(10, 90);
		}
	}
	
	private int aleatorio(int min, int max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}
}
