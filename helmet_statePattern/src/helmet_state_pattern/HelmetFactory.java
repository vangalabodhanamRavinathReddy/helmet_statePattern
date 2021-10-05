package helmet_state_pattern;


public class HelmetFactory {
	 
	State production;
	State sales;
 
	State state;
	int count = 0;
 
	public HelmetFactory(int num) {
		production = new Production(this);
		sales = new Sales(this);

		this.count = num;
 		if (num > 0) {
			state = production;
		} else {
			state = sales;
		}
	}
 
	public void startProduction() {
		state.startProduction();
	}
 
	public void startSales() {
		state.startSales();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getProduction() {
        return production;
    }

    public State getSales() {
        return sales;
    }

}
