package flying;

import java.util.Arrays;
import java.util.List;

import interfaces.Flying;

public class ControlTower {
	List<Flying> flyings;
	
	public ControlTower(List<Flying> flyings) {
		this.flyings = flyings;
	}
	
	public ControlTower(Flying flyings[]) {
		this.flyings = Arrays.asList(flyings);
	}
	
	public void flyAll() {
		for(Flying flying : flyings) {
			flying.fly();
		}
	}
	
	public void addFlying(Flying flying) {
		flyings.add(flying);
	}
}
