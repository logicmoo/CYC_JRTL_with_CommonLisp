package org.opencyc.util;

import java.util.logging.Logger;
import java.math.BigDecimal;
import java.util.Currency;
import java.io.Serializable;

public class Money implements Serializable, Comparable<Money>
{
    public static final Currency DEFAULT_CURRENCY;
    private final BigDecimal quantity;
    private final Currency currency;
    
    public Money(final BigDecimal quantity, final Currency currency) {
        this.quantity = quantity;
        this.currency = currency;
    }
    
    public Money(final BigDecimal quantity) {
        this(quantity, Money.DEFAULT_CURRENCY);
    }
    
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    
    public Currency getCurrency() {
        return this.currency;
    }
    
    public boolean isSameCurrencyAs(final Money m) {
        return this.getCurrency().equals(m.getCurrency());
    }
    
    @Override
    public int compareTo(final Money o) {
        if (o == null || !this.isSameCurrencyAs(o)) {
            throw new ClassCastException();
        }
        return this.getQuantity().compareTo(o.getQuantity());
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        final Money m = (Money)obj;
        return this.isSameCurrencyAs(m) && this.getQuantity().equals(m.getQuantity());
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + ((this.quantity != null) ? this.quantity.hashCode() : 0);
        hash = 71 * hash + ((this.currency != null) ? this.currency.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString() {
        return this.getQuantity() + " " + this.getCurrency().getSymbol();
    }
    
    public static void main(final String[] args) {
        final Logger logger = Logger.getLogger(Money.class.toString());
        logger.info("Starting");
        final Money thisObj = null;
        if (thisObj != null) {}
        logger.info("Finished.");
        System.exit(0);
    }
    
    static {
        DEFAULT_CURRENCY = Currency.getInstance("USD");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 57 ms
	
	Decompiled with Procyon 0.5.32.
*/