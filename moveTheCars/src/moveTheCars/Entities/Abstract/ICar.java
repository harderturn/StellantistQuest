package moveTheCars.Entities.Abstract;

public interface ICar {
	
	int getLocationX();
	
	int getLocationY();
	
	String getDirection();
	
	void setStartLocation(int x, int y, String dir);
	
	void setDirection(String d);
	
	void move();
	
}
