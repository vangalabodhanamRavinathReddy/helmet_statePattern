package helmet_state_pattern;


public class Production implements State {
	 
	HelmetFactory helmetFactory;
 
    public Production(HelmetFactory helmetFactory) {
        this.helmetFactory = helmetFactory;
    }


	public void startProduction() {
		System.out.println("The helmet production is running");
		
	}

	public void startSales() {
		System.out.println("Sales only start after production, please wait");
		
	}

	
	public String toString() {
		return "Starting the mattress factory machine";
	}
}
