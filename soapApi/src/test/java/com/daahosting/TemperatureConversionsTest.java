package com.daahosting;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by student on 2/20/17.
 */
public class TemperatureConversionsTest {


    @org.junit.Test
    public void getTemperatureConversionsSoap() throws Exception {

    }

    @org.junit.Test
    public void getTemperatureConversionsSoap1() throws Exception {

    }

    @org.junit.Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();


        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("failed", BigDecimal.valueOf(32), result);
    }

    @org.junit.Test
    public void getTemperatureConversionsSoap121() throws Exception {

    }

}