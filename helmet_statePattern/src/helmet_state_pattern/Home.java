package helmet_state_pattern;


public class Home {

	public static void main(String[] args) {
		HelmetFactory hf = new HelmetFactory(13);

		hf.startProduction();

		hf.startSales();
		
		HelmetFactory hf2 = new HelmetFactory(0);

		hf2.startProduction();

		hf2.startSales();

	}
}