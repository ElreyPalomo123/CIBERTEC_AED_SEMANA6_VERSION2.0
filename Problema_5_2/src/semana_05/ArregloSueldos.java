package semana_05;

public class ArregloSueldos {
	private double[] sueldo = {2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7};
	
	public ArregloSueldos(){
		
	}
	
	public int tamanio(){
		return sueldo.length;
	}
	
	public double Obtener(int i){
		return sueldo[i];
	}
	
	public double sueldoPromedio(){
		int promedio = 0;
		for (int i = 0; i < tamanio(); i++) {
			promedio += sueldo[i];
		}
		return promedio/tamanio();
	}
	
	public double sueldoMayor(){
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < sueldo[i]) {
				mayor = sueldo[i];
			}
		}
		return mayor;
	}
	
	public double sueldoMenor(){
		double menor = sueldo[0];
		for (int i = 0; i < tamanio(); i++) {
			if (menor > sueldo[i]) {
				menor = sueldo[i];
			}
		}
		return menor;
	}
	
	public int cantMayoresSueldoPromedio(){
		int cant = 0;
		for (int i = 1; i < tamanio(); i++) {
			if (sueldo[i] >= cant) {
				cant ++;
			}
		}
		return cant;
	}
	
	public int cantMenoresSueldoPromedio(){
		return tamanio() - cantMayoresSueldoPromedio();
	}
	
	public int posSegundoSueldoMayorAlMinimo(){
		int posicion = -1;
		for (int i = 1; i < tamanio(); i++) {
			if(sueldo[i] > 850) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}	
	
	public int posUltimoSueldoMenorAlMinimo(){
		int posicion = -1;
		for (int i = tamanio() - 1; i < 0; i++) {
			if (sueldo[i] < 850) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	public void generarSueldos(){
		for (int i = 0; i < tamanio(); i++) {
			sueldo[i] = aleatorio(799.9, 4999.9);
		}
	}
	
	private double aleatorio(double min, double max) {
		 return (double)((max - min + 1) * Math.random()) + min;
	}
}
