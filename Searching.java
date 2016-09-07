package mobile;

public class Searching {

	public static void search3num(int[] array){
		
		int arrayLength = array.length;
		int numberSearch = 3;
		int count = 0;
						
		while(count < arrayLength){
			if(array[count] == numberSearch){
				System.out.println("get 3 number "+(count+1)+"th");
				break;
			}
			else{
				count++;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int [] number = {5,4,1,3,9,6,8};
		
		for(int value:number){
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println();
		search3num(number);
	}
}


