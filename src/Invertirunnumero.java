
public class Invertirunnumero {
	
	public int invertirnormal(int n){
		
		int a,b;
		int c=0;
		
		//divide la parte entera del numero
		a=(int)n/10;
		//obtiene el cociente 
		b=n%10;
		//permite recorrer un espacio y suma el cociente
		c=(c*10)+b;
		//iguala n y a es el resultado de la division entera
		n=a;
		
		a=(int)n/10;
		b=n%10;
		c=(c*10)+b;
		n=a;
		
		a=(int)n/10;
		b=n%10;
		c=(c*10)+b;
		n=a;
		
		return c;
	}
	public int invertirciclo(int n){
		
		int a,b;
		int c=0;
		
		while (n>0){
			
			//divide la parte entera del numero
			a=(int)n/10;
			//obtiene el cociente
			b=n%10;
			//permite recorrer un espacio y suma lo que obtiene de b o el cociente
			c=(c*10)+b;
			// se iguala n y a es decir a es el resultado de dividir la parte entera o "residuo"
			n=a;
		}
		
		return c;
	}
	public int invertirrecursivo(int n,int m){
		
         int invertido;
		//Caso base 
		if (n==0){
				
			return m;
		}else{
			// Dominio o Funcion recursiva
			invertido = invertirrecursivo(n/10, m*10 + n%10);	
		}
		// retorna lo que obtiene de la funcion recursiva
	 return invertido;
	}	
}
