package de.ovgu.icse.assignment04;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class VehicleTest {

    //Vehicle testVehicle;

    @BeforeEach
    public void setUp() {
        /*testVehicle = Mockito.mock(Vehicle.class, Mockito.CALLS_REAL_METHODS);
        testVehicle.wiper_active = false;*/
    }

    @Test
    public void testToggleWiper() {
        Vehicle testVehicle = Mockito.mock(Vehicle.class, Mockito.CALLS_REAL_METHODS);

        testVehicle.toggle_wiper();

        Assertions.assertTrue(testVehicle.getWiperState());
    }
}
