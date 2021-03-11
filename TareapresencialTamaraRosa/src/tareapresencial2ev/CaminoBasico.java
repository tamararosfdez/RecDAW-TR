package tareapresencial2ev;
public class CaminoBasico {
	
	public int miMetodo(int numero1, int numero2) {
	/** Aqui empieza el proceso**/
		int resultado = 0;
	/**Comprueba si el numero es mayor a 5**/
		if (numero1 > 5) {
			resultado = 55;
	/** Si lo es el resultado es 55**/
			
	/** si no comprueba si el segundo numero es mayor a 10**/ 
		} else if (numero2 < 10) {
	/** si lo es el resultado es 100**/ 
			resultado = 100;
		}
		return resultado;
	}
}