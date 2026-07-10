import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		for (int number : initial_numbers) {
			numbers.add(number);
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to add to the last index: ");
		int new_number = scan.nextInt();
		
		System.out.print("Enter a number to insert: ");
		int insert_number = scan.nextInt();
		
		int insert_index = 5;
		
		int delete_index = 9;
		
		int update_index = 8;
		
		numbers.add(new_number);
		numbers.add(insert_index, insert_number);
		numbers.remove(delete_index);
		numbers.set(update_index, 10);
		
		System.out.println("All elements = " + numbers);
	}

}
