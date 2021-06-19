package moveTheCars;

import moveTheCars.Entities.Concrete.Car;

public class CarRouter {
	private Car car;	
	
	private String commands;
	
	private char[] commandChars;
	
	public CarRouter(Car _car,String _commands) {
		
		this.car = _car;
		
		this.commands = _commands;
		
		this.commandChars = this.commands.toCharArray();
		
		
	}
	
	public Car Route() {
		
		for(int i = 0; i< this.commandChars.length; i++) {
			
			if(this.commandChars[i] == 'L' ||  this.commandChars[i] == 'R') {
				this.car.setDirection(String.valueOf(this.commandChars[i]));
			}
			else {
				this.car.move();
			}
		}
		
		return this.car;
		
	}
}
