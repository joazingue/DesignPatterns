
package builder.example.director;

import builder.example.builders.Builder;
import builder.example.cars.Type;
import builder.example.components.Engine;
import builder.example.components.GPSNavigator;
import builder.example.components.Transmission;
import builder.example.components.TripComputer;

public class Director {
	
	public void constructSportCar(Builder builder) {
		builder.setType(Type.SPORT_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0,  0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
	
	public void constructCityCar(Builder builder) {
		builder.setType(Type.CITY_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(1.2,  0));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
	
	public void constructSUV(Builder builder) {
		builder.setType(Type.SUV);
		builder.setSeats(4);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Transmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
	}
}
