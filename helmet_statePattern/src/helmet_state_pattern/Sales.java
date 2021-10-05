package helmet_state_pattern;

public class Sales implements State {
	 
	HelmetFactory helmetFactory;
 
    public Sales(HelmetFactory helmetFactory) {
        this.helmetFactory = helmetFactory;
    }


	public void startProduction() {
		System.out.println("Production cant start now. Clear stock via sales first");
		
	}

	public void startSales() {
		System.out.println("Sales are ongoing");
		
	}

	
	public String toString() {
		return "Starting the mattress factory machine";
	}
}
