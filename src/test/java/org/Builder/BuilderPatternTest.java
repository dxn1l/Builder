package org.Builder;

import org.Builder.builders.CarBuilder;
import org.Builder.builders.CarManualBuilder;
import org.Builder.cars.Car;
import org.Builder.cars.Manual;
import org.Builder.director.Director;
import org.Builder.components.Engine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderPatternTest {

    private Director director;
    private CarBuilder carBuilder;
    private CarManualBuilder manualBuilder;

    @BeforeEach
    void setUp() {
        director = new Director();
        carBuilder = new CarBuilder();
        manualBuilder = new CarManualBuilder();
    }

    @Test
    void testSportsCarConstruction() {
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        assertNotNull(car);
        assertEquals(2, car.getSeats());
        assertEquals(3.0, car.getEngine().getVolume());
    }

    @Test
    void testCityCarConstruction() {
        director.constructCityCar(carBuilder);
        Car car = carBuilder.getResult();
        assertNotNull(car);
        assertEquals(2, car.getSeats());
        assertEquals(1.2, car.getEngine().getVolume());
    }

    @Test
    void testSUVConstruction() {
        director.constructSUV(carBuilder);
        Car car = carBuilder.getResult();
        assertNotNull(car);
        assertEquals(4, car.getSeats());
        assertEquals(2.5, car.getEngine().getVolume());
    }

    @Test
    void testSportsCarManualConstruction() {
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        assertNotNull(manual);
        assertTrue(manual.print().contains("Type of car: SPORTS_CAR"));
    }
}

