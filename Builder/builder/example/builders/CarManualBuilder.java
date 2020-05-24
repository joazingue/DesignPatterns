
package builder.example.builders;

import builder.example.cars.Manual;
import builder.example.cars.Type;
import builder.example.components.Engine;
import builder.example.components.GPSNavigator;
import builder.example.components.Transmission;
import builder.example.components.TripComputer;

/**
 * 
 * @author joatam
 *
 * Creates a manual type product
 */

public class CarManualBuilder implements Builder{

	private Type type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	
	@Override
	public void setType(Type type) {
		// TODO Auto-generated method stub
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		// TODO Auto-generated method stub
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		// TODO Auto-generated method stub
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		// TODO Auto-generated method stub
		this.gpsNavigator = gpsNavigator;
	}

	public Manual getResult() {
		return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
