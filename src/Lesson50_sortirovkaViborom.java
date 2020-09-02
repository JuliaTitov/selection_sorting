/*сортировка выыбором: ищется максимальный и ставится на свое место(последнее), далее ищется максимальный из оставшихся 
 * и ставится на свое место и т.д.*/
public class Lesson50_sortirovkaViborom {

	public static void main(String[] args) {
		int [] array = new int [10];
		fill(array);
		print(array);
		sort(array);
		print(array);
	}

	static void fill(int [] array) {
		for (int i = 0; i < array.length; i++) 
			array[i] = (int)(Math.random() * 100);
	}
	
	static void print(int [] array) {
		for (int i = 0; i < array.length; i++) 
			System.out.println("array[" + i + "]= " + array[i]);
	}
	
	static void sort(int [] array) {
		int unsorted = array.length;
		while (unsorted != 0) {
			int indexMax = 0;
			for (int i = 0; i < unsorted; i++) {
				if (array[i] > array[indexMax]) {
					indexMax = i;
				}
			}				
			int a = array[unsorted-1];
			array[unsorted-1] = array[indexMax]; 
			array[indexMax] = a;
			unsorted--;
		}
			
	}
}


