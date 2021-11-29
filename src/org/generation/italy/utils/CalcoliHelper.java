package org.generation.italy.utils;

public class CalcoliHelper {
	private CalcoliHelper() {
		
	}
	
//	 *  viene applicato l'OVERLOAD, un tipo di polimorfismo
	
	
//	* 		Somma di due numeri interi
//	* 		Somma di due numeri double
//	* 		Differenza tra due numeri interi
//	* 		Differenza tra due numeri double
//	* 		Moltiplicazione di due numeri interi
//	* 		Moltiplicazione di due numeri double
//	* 		Valore assoluto di un numero intero
//	* 		Valore assoluto di un numero double
//	* 		Minimo tra due numeri interi
//	* 		Minimo tra due numeri double
//	* 		Massimo tra due numeri interi
//	* 		Massimo tra due numeri double
	

		//
		
		//metodo Somma di due numeri interi
		public static int sommaDueInteri (int primoInt, int secondoInt) {
			return primoInt + secondoInt;
		}
		
		//metodo Somma di due numeri double
		public static double sommaDueDouble (double primoDouble, double secondoDouble) {
			return primoDouble + secondoDouble;
		}
		//metodo Differenza di due numeri interi
		public static int differenzaDueInteri (int primoInt, int secondoInt) {
			return primoInt - secondoInt;
		}
		
		//metodo Differenza di due numeri double
		public static double differenzaDueDouble (double primoDouble, double secondoDouble) {
			return primoDouble - secondoDouble;
		}
		
		//metodo Moltiplicazione di due numeri interi
		public static int moltiplicazioneDueInteri (int primoInt, int secondoInt) {
			return primoInt * secondoInt;
		}
		//metodo Moltiplicazione di due numeri double
		public static double moltiplicazioneDueDouble (double primoDouble, double secondoDouble) {
			return primoDouble * secondoDouble;
		}
	
		//i valori assoluti sono sbagliati, controllare dopo
		//edit per ora li ho messi un attimo in math, poi sistemo
		
		//metodo Valore assoluto di un numero intero
		public static int valoreAssolutoInteri (int primoInt) {
			return Math.abs(primoInt);
		}
		
		//metodo Valore assoluto di un numero double
		public static double valoreAssolutoDouble (double primoDouble) {
			return Math.abs(primoDouble);
		}
	
		//metodo Minimo tra due numeri interi
		public static int minTraDueInteri (int primoInt, int secondoInt) {
			if (primoInt < secondoInt) {
				return primoInt;
			} else if (secondoInt < primoInt) {
				return secondoInt;
			} else {
				return primoInt = secondoInt;
			}
		}
		//metodo Minimo tra due numeri double
		public static double minTraDueDouble (double primoDouble, double secondoDouble) {
			if (primoDouble < secondoDouble) {
				return primoDouble;
			} else if (secondoDouble < primoDouble) {
				return secondoDouble;
			} else {
				return primoDouble = secondoDouble;
			}
		}
		
		//metodo Massimo tra due numeri interi
		public static int maxTraDueInteri (int primoInt, int secondoInt) {
			if (secondoInt < primoInt) {
				return primoInt;
			} else if (primoInt < secondoInt) {
				return secondoInt;
			} else {
				return primoInt = secondoInt;
			}
		}
		//metodo Minimo tra due numeri double
		public static double maxTraDueDouble (double primoDouble, double secondoDouble) {
			if (secondoDouble < primoDouble) {
				return primoDouble;
			} else if (primoDouble < secondoDouble) {
				return secondoDouble;
			} else {
				return primoDouble = secondoDouble;
			}
		}
	
}
