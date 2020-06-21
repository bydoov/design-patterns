
public class Main {

	public static Employee getChain()
	{
		Employee cityEmployee = new CityShipment();
		Employee nationalEmployee = new NationalShipment();
		Employee abroadEmployee = new AbroadShipment();
		
		Observer worker = new WorkerBoy("Slave");
		
		cityEmployee.setNextChain(nationalEmployee);
		nationalEmployee.setNextChain(abroadEmployee);
		abroadEmployee.setNextChain(cityEmployee);
	
		cityEmployee.register(worker);
		nationalEmployee.register(worker);
		abroadEmployee.register(worker);
		
		return nationalEmployee;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee chain = getChain();
		chain.takeOrder(1, " City employee accepts shipment.");
		chain.takeOrder(2, " Contry employee accepts shipment.");
		chain.takeOrder(3, " Abroad employee accepts shipment.");
		
	}

}
