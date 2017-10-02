
public class Programa {
	public static void main(String[] args){
		
		Invertirunnumero inv = new Invertirunnumero();
		
		System.out.println("el numero 123 invertido mediante paso por paso: " + inv.invertirnormal(123));
		
		System.out.println("el numero 258 invertido mediante un ciclo: " + inv.invertirciclo(258));
		
		System.out.println("el numero 355 invertido mediante recursividad: " + inv.invertirrecursivo(355,0));
	}

}
