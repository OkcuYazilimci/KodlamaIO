import java.util.Scanner;

public class Works {
	private Languages language = new Languages();
	private boolean isWorking = true;
	private static Scanner input = new Scanner(System.in);
	
	public void start() {
		
		while(isWorking) {
			System.out.println("1 - Add a new Language");
			System.out.println("2 - Show all Languages");
			System.out.println("3 - Remove a Language");
			System.out.println("0 - Exit");
			System.out.print("Select the operation: ");
			int selection = input.nextInt();
			switch(selection) {
			case 1:
				System.out.print("Please insert the new language name: ");
				input.nextLine();
				String code = input.nextLine();
				language.addUser(code);
				break;
			case 2: 
				language.showUsers();
				break;
			case 3:
				System.out.print("Enter give the ID of the language that will be deleted: ");
				int selection1 = input.nextInt();
				language.deleteUser(selection1);
				break;
			case 0:
				System.out.println("----------------------------------------");
				System.out.println("System shutting down!");
				System.out.println("----------------------------------------");
				isWorking = false;
				break;
			default:
				System.out.println("Please try again");
			}
		}
	}
}
