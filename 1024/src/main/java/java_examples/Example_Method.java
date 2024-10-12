package java_examples;

public class Example_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = suma(82,25);
		
			System.out.println(resultado);
		String marcaCarro = carro(1);
		System.out.println(marcaCarro);
		
		ejemploid();
		
	}
	
	public static int suma(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static String carro(int n) {
		String[] cars = {"Volvo", "bm","Ford", "MAzda"};
		return cars[n];
	}

	public static void ejemploid() {
		System.out.println("ejecucion metodo void");
	}
}
