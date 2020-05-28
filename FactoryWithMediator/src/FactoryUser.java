
public class FactoryUser {


	public User newUser(String name)
	{
		return new User(name);
	}
}
