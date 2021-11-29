package org.generation.italy.utils;

public class CalcoliHelper {
	private CalcoliHelper() {
		
	}
	
//	  viene applicato l'OVERLOAD, un tipo di polimorfismo
	
		
		//metodo Somma di due numeri interi
		public static int somma (int a, int b) {
			return a + b;
		}
		
		//metodo Somma di due numeri double
		public static double somma (double a, double b) {
			return a + b;
		}
		//metodo Differenza di due numeri interi
		public static int differenza (int a, int b) {
			return a - b;
		}
		
		//metodo Differenza di due numeri double
		public static double differenza (double a, double b) {
			return a - b;
		}
		
		//metodo Moltiplicazione di due numeri interi
		public static int moltiplicazione (int a, int b) {
			return a * b;
		}
		//metodo Moltiplicazione di due numeri double
		public static double moltiplicazione (double a, double b) {
			return a * b;
		}
		
		//metodo Valore assoluto di un numero intero
		public static int valoreAssoluto (int a) {
			if (a >= 0) {
				return a;
			} else {
				return a * -1;
			}
		}
		
		//metodo Valore assoluto di un numero double
		public static double valoreAssoluto (double a) {
			if (a >= 0) {
				return a;
			} else {
				return a * -1;
			}
		}
	
		//metodo Minimo tra due numeri interi
		public static int minTraDueN (int a, int b) {
			if (a < b) {
				return a;
			} else if (b < a) {
				return b;
			} else {
				return a = b;
			}
		}
		//metodo Minimo tra due numeri double
		public static double minTraDueN (double a, double b) {
			if (a < b) {
				return a;
			} else if (b < a) {
				return b;
			} else {
				return a = b;
			}
		}
		
		//metodo Massimo tra due numeri interi
		public static int maxTraDueN (int a, int b) {
			if (b < a) {
				return a;
			} else if (a < b) {
				return b;
			} else {
				return a = b;
			}
		}
		//metodo Minimo tra due numeri double
		public static double maxTraDueN (double a, double b) {
			if (b < a) {
				return a;
			} else if (a < b) {
				return b;
			} else {
				return a = b;
			}
		}
		

		
	
}
