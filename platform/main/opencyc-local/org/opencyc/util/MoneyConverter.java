package org.opencyc.util;

import org.opencyc.cycobject.Guid;
import java.util.HashMap;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycFort;
import java.util.Currency;
import java.util.Map;
import org.opencyc.cycobject.CycConstant;

public class MoneyConverter extends DataTypeConverter<Money>
{
    private static final CycConstant CURR_USD;
    private static Map<Currency, CycFort> CURRENCY_TO_CYC_CURRENCY_MAP;
    private static MoneyConverter SHARED_INSTANCE;
    
    private MoneyConverter() {
        MoneyConverter.SHARED_INSTANCE = this;
    }
    
    private static MoneyConverter getInstance() {
        MoneyConverter moneyConverter = MoneyConverter.SHARED_INSTANCE;
        if (moneyConverter == null) {
            moneyConverter = new MoneyConverter();
        }
        return moneyConverter;
    }
    
    public static Money parseCycMoney(final CycNaut naut, final boolean shouldReportFailure) {
        return (Money)getInstance().parse((CycObject)naut, shouldReportFailure);
    }
    
    public static Money parseCycMoney(final CycNaut naut) {
        return (Money)getInstance().parse((CycObject)naut);
    }
    
    public static boolean isCycMoney(final Object object) {
        return getInstance().isOfType(object);
    }
    
    public static CycNaut toCycMoney(final Money obj) throws ParseException {
        return getInstance().toCycTerm(obj);
    }
    
    protected Money fromCycTerm(final CycObject cycObject) throws ParseException {
        CycNaut naut;
        try {
            naut = (CycNaut)CycNaut.convertIfPromising((Object)cycObject);
        }
        catch (ClassCastException ex) {
            throw new IllegalArgumentException();
        }
        final Currency currency = lookupCurrency(naut.getFunctor());
        if (currency == null) {
            throwParseException((Object)naut, this.getClass().getName() + " does not recognize " + naut.getFunctor() + " as a currency.");
        }
        else if (naut.getArity() != 1) {
            throwParseException((Object)naut, this.getClass().getName() + " can only parse Cyc terms with an arity of 1.");
        }
        return new Money(parseBigDecimal(naut.getArg(1), "amount"), currency);
    }
    
    protected CycNaut toCycTerm(final Money money) throws ParseException {
        ensureCurrencyMapInitialized();
        final CycFort functor = lookupCycCurrencyTerm(money.getCurrency());
        if (functor == null) {
            throwParseException((Object)("Cannot find Cyc UnitOfMoney for currency code " + money.getCurrency().getCurrencyCode()));
        }
        return new CycNaut((CycDenotationalTerm)functor, new Object[] { money.getQuantity() });
    }
    
    public static CycFort lookupCycCurrencyTerm(final Currency curr) {
        ensureCurrencyMapInitialized();
        return MoneyConverter.CURRENCY_TO_CYC_CURRENCY_MAP.get(curr);
    }
    
    public static Currency lookupCurrency(final CycFort cycTerm) {
        ensureCurrencyMapInitialized();
        return (Currency)lookupKeyByValue((Map)MoneyConverter.CURRENCY_TO_CYC_CURRENCY_MAP, (Object)cycTerm);
    }
    
    private static void ensureCurrencyMapInitialized() {
        if (MoneyConverter.CURRENCY_TO_CYC_CURRENCY_MAP == null) {
            initializeCurrencyCycTermHash();
        }
    }
    
    private static void initializeCurrencyCycTermHash() {
        (MoneyConverter.CURRENCY_TO_CYC_CURRENCY_MAP = new HashMap<Currency, CycFort>()).put(Currency.getInstance("USD"), (CycFort)MoneyConverter.CURR_USD);
    }
    
    static {
        CURR_USD = new CycConstant("Dollar-UnitedStates", new Guid("bd58a636-9c29-11b1-9dad-c379636f7270"));
        MoneyConverter.CURRENCY_TO_CYC_CURRENCY_MAP = null;
        MoneyConverter.SHARED_INSTANCE = null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 69 ms
	
	Decompiled with Procyon 0.5.32.
*/