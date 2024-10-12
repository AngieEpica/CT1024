package java_examples;

public class example_CYO_DemoVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example_CYO_vehicle minivan = new example_CYO_vehicle();
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		int rango;
		rango = minivan.capacidad* minivan.kmh;
		System.out.println("la minivan puede llevar" + minivan.pasajeros + "pasajeros con un rango de "+ rango);
		
		example_CYO_vehicle carro = new example_CYO_vehicle();
		carro.pasajeros = 4;
		System.out.println("num de pasajeros"+ carro.pasajeros);
	}

}
