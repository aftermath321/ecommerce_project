package com.ecp.ecommerceproject.domain.valueobjects;

import java.math.BigDecimal;

import com.ecp.ecommerceproject.DDD.enums.Currency;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Money {

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    public Money (BigDecimal amount, Currency currency){
        setAmount(amount);
        this.currency = currency;
    }

    public void setAmount(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Amount can't be lower than zero!");
        } 
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setCurrency(Currency currency){
        this.currency = currency;
    }

    public Currency getCurrency(){
        return currency;
    }



}
