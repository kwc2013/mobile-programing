package mobile;

public class Sorting {
	
	 public void sorting(int[] array){
		
		int arrayLength = array.length;
		int change;
		
		for(int i = 0; i<array.length-1 ; i++){
						
			while(arrayLength > 0){
				if(array[i]>array[i+1]){
				change = array[i+1];
				array[i+1] = array[i];
				array[i] = change;
				}
				else{
					break;
				}
				arrayLength--;
			}
		}
		if(array[0] > array[1]){
			for(int i = 0; i<array.length-1 ; i++){
				
				while(arrayLength > 0){
					if(array[i]>array[i+1]){
					change = array[i+1];
					array[i+1] = array[i];
					array[i] = change;
					}
					else{
						break;
					}
					arrayLength--;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Sorting srt = new Sorting();
		
		int [] number = {5,4,1,3,9,6,8};
		
		for(int value:number){
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println();
		srt.sorting(number);
		for(int value:number){
			System.out.print(value);
			System.out.print(" ");
		}

	}

}
