package org.Builder.builders;

import org.Builder.cars.CarType;
import org.Builder.components.Engine;
import org.Builder.components.GPSNavigator;
import org.Builder.components.Transmission;
import org.Builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}