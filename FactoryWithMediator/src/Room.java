import java.util.ArrayList;

public class Room {

	private static ArrayList<User> users = new ArrayList();
	private static Bot bot;
	private static MainFactory factory = new MainFactory();
	
	public static void showMessage(User user, String message){
		if(!users.contains(user)){
			System.out.println("System: "+ user.getName()+ " access: denied.");
			return;
		}	
		
		System.out.println(user.getName()+ ": " + message);
		
		if(bot != null && message.contains("cat")){
			bot.removeUser(user);
			bot.printMessage();			
		}		
		else if(message.equalsIgnoreCase("addBot")){
			bot = factory.createBot();		
		}
	}
	public static void addUser(User user) {
		if(user!= null) {
			users.add(user);
		}
	}
	public static void removeUser(User user) {
		if(user!= null && users.contains(user)) {
			users.remove(user);
			System.out.println(user.getName() + " has been banned from the chat!");
		}
	}
}
