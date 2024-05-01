package com.ecp.ecommerceproject.domain.valueobjects;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import jakarta.persistence.Embeddable;

@Embeddable
public class Rating {

    private double value;
    
    public Rating (double value){
        setValue(roundToOneDecimalPoints(value));
    }

    public void setValue (double value){
        if ( value < 0 || value > 5){
            throw new IllegalArgumentException("Value must be between 0 and 5.");
        }
        this.value = value;
    }

    public double getValue (){
        return value;
    }

    private double roundToOneDecimalPoints (double value){
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return Double.parseDouble(decimalFormat.format(value));
    }

    public Rating parseDouble (double value){
        return new Rating(value);
    }
}
