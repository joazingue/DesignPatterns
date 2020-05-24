
package builder.example;

import builder.example.builders.CarBuilder;
import builder.example.builders.CarManualBuilder;
import builder.example.cars.Car;
import builder.example.cars.Manual;
import builder.example.director.Director;

public class Demo {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		
		/*
		 * Director takes type of builder and creates the car with it
		 * Builder returns the final product, because director only commands the creation
		 */
		CarBuilder builder = new CarBuilder();
		director.constructSportCar(builder);
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getType());
		
		/*
		 * Same process for distinct builder
		 */
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual buil:\n" + carManual.print());
	}

}
