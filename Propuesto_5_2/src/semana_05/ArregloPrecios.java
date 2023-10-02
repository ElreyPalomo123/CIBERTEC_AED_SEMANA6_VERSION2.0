package semana_05;

public class ArregloPrecios {
	private double[] precio = {240.5, 350.2, 80.4, 100.3, 470.1, 60.0, 330.8, 260.6, 510.9, 200.7};
	
	public ArregloPrecios(){
		
	}
	
	public int tamanio(){
		return precio.length;
	}
	
	public double obtener(int i){
		return precio[i];
	}
	
	public double precioPromedio(){
		double promedio = 0;
		for (int i = 0; i < tamanio(); i++) {
			promedio += precio[i];
		}
		return promedio/tamanio();
	}
	
	public double precioMayor(){
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < precio[i]) {
				mayor = precio[i];
			}
		}
		return mayor;
	}
	
	public double precioMenor(){
		double menor = precio[0];
		for (int i = 0; i < tamanio(); i++) {
			if (menor > precio[i]) {
				menor = precio[i];
			}
		}
		return menor;
	}
	
	public double cantMayoresPrecioPromedio(){
		int cant = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] > cant) {
				cant ++;
			}
		}
		return cant;
	}
	
	public double cantMenoresPrecioPromedio(){
		return tamanio() - cantMayoresPrecioPromedio();
	}
	
	public double posPrimerPrecioMayorAlSegundo(){
		int pos = -1;
		for (int i = 1; i < tamanio(); i++) {
			if (precio[i] > pos) {
				pos = i;
			}
		}
		return pos;
	}
	
	public double posUltimoPrecioMenorAlPenultimo(){
		int pos1 = -1;
		for (int i = tamanio() - 1; i < 0; i++) {
			if (precio[i] < pos1) {
				pos1 = i;
			}
		}
		return pos1;
	}
	
	public void generarPrecios() {
		for (int i=0; i<tamanio(); i++){
			precio[i] = aleatorio(99.9, 999.9);
		}
	}
	//  Método privado
	private double aleatorio(double min, double max) {
	    return (int)((max - min + 1) * Math.random()) + min;
  	}
}
