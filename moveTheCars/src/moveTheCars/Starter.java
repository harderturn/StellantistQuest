package moveTheCars;

import java.util.Scanner;

import moveTheCars.Entities.Concrete.Car;

public class Starter {

	public static void main(String[] args) {
		
		String[] inputArray = new String[5];  
		
		// Alan Bilgileri
		int maxX = 0;
		int maxY = 0;
		
		
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Bilgileri içeren diziyi giriniz");
		
		for(int i=0; i<inputArray.length; i++) {  
			inputArray[i]=sc.nextLine();  
		}  
		
		/*
		for (int i=0; i<inputArray.length; i++){  
		System.out.println((i + 1)+".: "+inputArray[i]);  
		}  
		*/
		
		maxX = Integer.parseInt(inputArray[0].split(" ")[0]);
		maxY = Integer.parseInt(inputArray[0].split(" ")[1]);
		
		// Ilk araba
		Car car1 = new Car();
		
		// Ikinci araba
		Car car2 = new Car();
		
		// Ilk arabanin bilgileri set ediliyor.
		car1.setStartLocation(Integer.parseInt(inputArray[1].split(" ")[0]), Integer.parseInt(inputArray[1].split(" ")[1]), inputArray[1].split(" ")[2]);
		
		// Ikinci arabanin bilgileri set ediliyor.
		car2.setStartLocation(Integer.parseInt(inputArray[3].split(" ")[0]), Integer.parseInt(inputArray[3].split(" ")[1]), inputArray[3].split(" ")[2]);
		
		
		// Ilk arabanin yonlendirme parametreleri
		String routeParametersForFirst = inputArray[2];
		
		// Ikinci arabanin yonlendirme parametreleri
		String routeParametersForSecond = inputArray[4];		
		
		// CarRouter static hale gelebilir.
		/*
		CarRouter router = new CarRouter(car1, routeParametersForFirst);
		CarRouter router2 = new CarRouter(car2, routeParametersForSecond);
		*/
		/*
		car1 = router.Route();
		car2 = router2.Route();
		*/
		CarRouter router = new CarRouter(car1,routeParametersForFirst);
		car1 = router.Route();
		
		router = new CarRouter(car2, routeParametersForSecond);
		car2 = router.Route();
		
		
		System.out.print(car1.getLocationX() + " " + car1.getLocationY() + " " + car1.getDirection()+ " ");

		System.out.print(car2.getLocationX() + " " + car2.getLocationY() + " " + car2.getDirection());
		
		
	}
	

}
