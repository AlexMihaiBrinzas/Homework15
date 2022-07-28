package org.fasttrack.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTest {
    public TemperatureTest() {
    }
    @Test
    public void instantiereClasa(){
        new Temperature();

    }

    //Method 1

    @Test
    public void fahrenheitToCelsius(){
        Temperature temperature=new Temperature();
        Temperature.fahrenheitToCelsius(100.0);
    }
    @Test
    public void methodReturnsADouble() {
        Temperature temperature = new Temperature();
        Double temperature1 = 100.0;
        Double result = Temperature.fahrenheitToCelsius(temperature1);
    }

    //fahrenheitToCelsius(100) -> 37.777777778"-Se asteapta rezultatul sa fie 37

    @Test
    public void returnCelsiusTemperature1() {
        Temperature temperature = new Temperature();
        Double temperature1 = 100.0;
        Double result = Temperature.fahrenheitToCelsius(temperature1);
        Assertions.assertThat(result).isEqualTo(37.77777777777778);
    }

    //Rezultat null


    @Test
    public void returnNullIfTemperatureIsNull() {
        Temperature temperature = new Temperature();
        Double temperature1 = null;
        Double result = Temperature.fahrenheitToCelsius((Double)temperature1);
        Assertions.assertThat(result).isNull();
    }



    @Test
    public void returnCelsiusTemperature2() {
        Temperature temperature = new Temperature();
        Double temperature1 = 50.0;
        Double result = Temperature.fahrenheitToCelsius(temperature1);
        Assertions.assertThat(result).isEqualTo(10.0);
    }

    //Method 2

    @Test
    public void celsiusToFahrenheit(){
        Temperature temperature=new Temperature();
        Temperature.celsiusToFahrenheit(20.0);
    }
    @Test
    public void secondMethodReturnsADouble() {
        Temperature temperature = new Temperature();
        Double temperature1 = 20.0;
        Double result = Temperature.celsiusToFahrenheit(temperature1);
    }
    @Test
    public void returnNullIfCelsiusTemperatureIsNull() {
        Temperature temperature = new Temperature();
        Double temperature1 = null;
        Double result = Temperature.celsiusToFahrenheit((Double)temperature1);
        Assertions.assertThat(result).isNull();
    }

    //Reverse Method 1

    @Test
    public void returnFahrenheitTemperature1() {
        Temperature temperature = new Temperature();
        Double temperature1 = 37.77777777777778;
        Double result = Temperature.celsiusToFahrenheit(temperature1);
        Assertions.assertThat(result).isEqualTo(100.0);
    }

}
