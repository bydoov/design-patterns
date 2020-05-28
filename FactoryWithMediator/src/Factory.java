
public abstract class Factory {

	protected FactoryUser userFactory;
	protected FactoryBot botFactory;
	
	public User newUser(String name)
	{
		return userFactory.newUser(name);		
	}
	public Bot createBot()
	{
		return botFactory.createBot();
	}
	
	
}
