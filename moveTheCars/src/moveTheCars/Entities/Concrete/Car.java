package moveTheCars.Entities.Concrete;

import moveTheCars.Entities.Abstract.ICar;

public class Car implements ICar {

	private int locationX;
	
	private int locationY;
	
	private String direction;
	
	@Override
	public void setStartLocation(int x, int y, String dir) {
		// TODO Auto-generated method stub
		this.locationX = x;
		this.locationY = y;
		this.direction = dir;	
	}

	@Override
	public void move() {
		
		switch (this.direction) {
		case "N": {
			locationY +=1;
			break;
		}
		case "S":{
			locationY -=1;
			break;
		}
		case "E": {
			locationX +=1;
			break;
		}
		case "W":{
			locationX -=1;
			break;
		}
		default:
			throw new IllegalArgumentException("Böyle bir yon olamaz ki: " + this.direction);
		}
		
	}

	@Override
	public void setDirection(String d) {
		
		switch (d) {
		case "L": 
		{
			switch(this.direction) {
			case "N": {
				this.direction = "W";
				break;
			}
			case "S": {
				this.direction = "E";
				break;
			}
			case "E": {
				this.direction = "N";
				break;
			}
			case "W": {
				this.direction = "S";
				break;
			}
			
			
			}
			break;
			
		}
		case "R": 
		{
			
			switch(this.direction) {
			case "N": {
				this.direction = "E";
				break;
			}
			case "S": {
				this.direction = "W";
				break;
			}
			case "E": {
				this.direction = "S";
				break;
			}
			case "W": {
				this.direction = "N";
				break;
			}
			
			
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + d);
		}
		
	}

	@Override
	public int getLocationX() {
		return this.locationX;
	}

	@Override
	public int getLocationY() {
		return this.locationY;
	}

	@Override
	public String getDirection() {
		return this.direction;
	}
	
	
	
	
}
