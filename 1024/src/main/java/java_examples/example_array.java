package java_examples;

public class example_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArray[];
		int[] Array2;
		String[] arr;
		arr= new String[5];
		
		arr[0]= "zero";
		arr[1]="one";
		arr[2]="two";
		arr[3]="three";
		arr[4]="four";
			
		//System.out.println("Indice  i"+ arr[1]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("elemento en el indice "+ i + ": "+ arr[i]);
		}
		
		
		
		
		
	}

}
