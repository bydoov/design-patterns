
public class Main {

	public static void main(String[] args) {

		Factory factory = new MainFactory();
		User firstUser = factory.newUser("Kristian");
		User secondUser = factory.newUser("Spas");
		User thirdUser = factory.newUser("Maria");

		Room.addUser(firstUser);
		Room.addUser(secondUser);
		Room.addUser(thirdUser);
		
		firstUser.sendMessage("Hi guys!");
		secondUser.sendMessage("Hi");
		thirdUser.sendMessage("Hi Kristian!");

		firstUser.sendMessage("Do you have cat at home?");
		thirdUser.sendMessage("addBot");
	
		secondUser.sendMessage("Yes, but i hate my cat.");
	
		secondUser.sendMessage("What happened?");
		secondUser.sendMessage("Why i cant chat?");
		secondUser.sendMessage("????????");
		firstUser.sendMessage("I think he is banned.");

	}

}
