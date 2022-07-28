package org.fasttrack.kit;

public class Temperature {
    public Temperature(){
        
    }

    public static Double fahrenheitToCelsius(Double temperature) {
        return temperature == null?null :(temperature -32.0)*5.0/9.0;
    }


    public static Double celsiusToFahrenheit(Double temperature) {
        return temperature == null?null :(temperature *9.0)/5.0+32.0;
    }

}
