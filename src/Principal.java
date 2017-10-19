import java.util.Scanner;

public class Principal {
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		Pesos pesos =  new Pesos();
		Scanner sc = new Scanner(System.in);
		float w1 = 0;
		float w2 = 0;
		float w3 = 0;
		float x1 = 0;
		float x2 = 0;
		float x3 = 0;
		float valorEsperado = 0;
		float n = 0;
		float E = 0;
		
		
		// Lectura de variables
		System.out.println("Ingresa w1");
		w1 = sc.nextFloat();
		System.out.println("Ingresa w2");
		w2 = sc.nextFloat();
		System.out.println("Ingresa w3");
		w3 = sc.nextFloat();
		System.out.println("Ingresa n");
		n = sc.nextFloat();
		
		do{
			System.out.println("Ingresa x1");
			x1 = sc.nextFloat();
			System.out.println("Ingresa x2");
			x2 = sc.nextFloat();
			System.out.println("Ingresa x3");
			x3 = sc.nextFloat();
			
			float sum = pesos.sumatoria(w1, w2, w3, x1, x2, x3);
			
			System.out.println("Ingresa valor esperado");
			valorEsperado = sc.nextFloat();
			E = valorEsperado-sum;
			System.out.println("Sumatoria = " + sum);
			System.out.println("E=Ve-Vo = "+E);
			
			// Se sustituyen pesos
			System.out.println("Wn=Wa+(E+n*X)");
			System.out.println("W1="+w1+"+("+E+"*"+n+"*"+x1+
					")="+pesos.error(w1,E,n,x1));
			System.out.println("W2="+w2+"+("+E+"*"+n+"*"+x2+
					")="+pesos.error(w2,E,n,x2));
			System.out.println("W3="+w3+"+("+E+"*"+n+"*"+x3+
					")="+pesos.error(w3,E,n,x3));
			
			//Sobreescribir variables
			w1=pesos.error(w1,valorEsperado,n,x1);
			w2=pesos.error(w2,valorEsperado,n,x2);
			w3=pesos.error(w3,valorEsperado,n,x3);
			E=0;
		}while(true);
	}
}
