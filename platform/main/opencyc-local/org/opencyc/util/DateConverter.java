package org.opencyc.util;

import org.opencyc.cycobject.Guid;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycDenotationalTerm;
import java.util.Calendar;
import java.util.TimeZone;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycConstant;
import java.util.Date;

public class DateConverter extends DataTypeConverter<Date>
{
    public static final int DAY_GRANULARITY;
    public static final int HOUR_GRANULARITY;
    public static final int MILLISECOND_GRANULARITY;
    public static final int MINUTE_GRANULARITY;
    public static final int MONTH_GRANULARITY;
    public static final int SECOND_GRANULARITY;
    public static final int WEEK_GRANULARITY;
    public static final int YEAR_GRANULARITY;
    public static final CycConstant YEAR_FN;
    public static final CycConstant SEASON_FN;
    public static final CycConstant MONTH_FN;
    public static final CycConstant DAY_FN;
    public static final CycConstant HOUR_FN;
    public static final CycConstant MINUTE_FN;
    public static final CycConstant SECOND_FN;
    public static final CycConstant MILLISECOND_FN;
    public static final CycConstant JANUARY;
    public static final CycConstant FEBRUARY;
    public static final CycConstant MARCH;
    public static final CycConstant APRIL;
    public static final CycConstant MAY;
    public static final CycConstant JUNE;
    public static final CycConstant JULY;
    public static final CycConstant AUGUST;
    public static final CycConstant SEPTEMBER;
    public static final CycConstant OCTOBER;
    public static final CycConstant NOVEMBER;
    public static final CycConstant DECEMBER;
    public static final CycConstant SPRING;
    public static final CycConstant SUMMER;
    public static final CycConstant FALL;
    public static final CycConstant WINTER;
    public static final CycConstant NTH_SPECIFIED_DATE_TYPE_OF_SUBSUMING_DATE_FN;
    public static final CycConstant CALENDAR_WEEK;
    private static CycConstant[] CYC_MONTH_TERMS;
    private static DateConverter SHARED_INSTANCE;
    
    private DateConverter() {
        DateConverter.SHARED_INSTANCE = this;
    }
    
    public static synchronized DateConverter getInstance() {
        DateConverter dateConverter = DateConverter.SHARED_INSTANCE;
        if (dateConverter == null) {
            dateConverter = new DateConverter();
        }
        return dateConverter;
    }
    
    public static Date parseCycDate(final CycList cycList, final boolean shouldReportFailure) {
        final Object naut = CycNaut.convertIfPromising((Object)cycList);
        if (naut instanceof CycNaut) {
            return parseCycDate((CycNaut)naut, shouldReportFailure);
        }
        if (shouldReportFailure) {
            new IllegalArgumentException(cycList + " cannot be interpreted as a NAUT").printStackTrace();
        }
        return null;
    }
    
    public static Date parseCycDate(final CycNaut naut, final boolean shouldReportFailure) {
        return (Date)getInstance().parse((CycObject)naut, shouldReportFailure);
    }
    
    public static Date parseCycDate(final CycList cycList, final TimeZone timeZone, final boolean shouldReportFailure) {
        final Object naut = CycNaut.convertIfPromising((Object)cycList);
        if (naut instanceof CycNaut) {
            return parseCycDate((CycNaut)naut, timeZone, shouldReportFailure);
        }
        if (shouldReportFailure) {
            new IllegalArgumentException(cycList + " cannot be converted to a NAUT.").printStackTrace();
        }
        return null;
    }
    
    public static Date parseCycDate(final CycNaut naut, final TimeZone timeZone, final boolean shouldReportFailure) {
        try {
            return naut2Date(naut, timeZone);
        }
        catch (ParseException ex) {
            return (Date)getInstance().handleParseException(ex, shouldReportFailure);
        }
    }
    
    public static Date parseCycDate(final CycList cycList) {
        return (Date)getInstance().parse(cycList);
    }
    
    public static Date parseCycDate(final CycNaut naut) {
        return (Date)getInstance().parse((CycObject)naut);
    }
    
    public static int getCycDatePrecision(final CycList cycDate) {
        return getCycDatePrecision(new CycNaut((Iterable)cycDate));
    }
    
    public static int getCycDatePrecision(final CycNaut cycDate) {
        final Object fn = cycDate.getOperator();
        if (DateConverter.YEAR_FN.equals(fn)) {
            return DateConverter.YEAR_GRANULARITY;
        }
        if (DateConverter.MONTH_FN.equals(fn)) {
            return DateConverter.MONTH_GRANULARITY;
        }
        if (DateConverter.DAY_FN.equals(fn)) {
            return DateConverter.DAY_GRANULARITY;
        }
        if (DateConverter.HOUR_FN.equals(fn)) {
            return DateConverter.HOUR_GRANULARITY;
        }
        if (DateConverter.MINUTE_FN.equals(fn)) {
            return DateConverter.MINUTE_GRANULARITY;
        }
        if (DateConverter.SECOND_FN.equals(fn)) {
            return DateConverter.SECOND_GRANULARITY;
        }
        if (DateConverter.MILLISECOND_FN.equals(fn)) {
            return DateConverter.MILLISECOND_GRANULARITY;
        }
        return -1;
    }
    
    public static CycNaut toCycDate(final Date date, final int granularity) throws ParseException {
        return date2Naut(date, granularity);
    }
    
    public static int guessGranularity(final Date date) {
        return TimeGranularity.guessGranularity(date).intValue();
    }
    
    public static int guessGranularity(final long millis) {
        return TimeGranularity.guessGranularity(millis).intValue();
    }
    
    public static CycObject toCycDate(final Date date) throws ParseException {
        return (CycObject)date2Naut(date, guessGranularity(date));
    }
    
    public static CycNaut toCycDate(final Calendar calendar, final int granularity) {
        return calendar2Naut(calendar, granularity);
    }
    
    protected Date fromCycTerm(final CycObject cycObject) throws ParseException {
        CycNaut naut;
        try {
            naut = (CycNaut)CycNaut.convertIfPromising((Object)cycObject);
        }
        catch (ClassCastException ex) {
            throw new IllegalArgumentException();
        }
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        updateCalendar(naut, calendar);
        return calendar.getTime();
    }
    
    protected CycNaut toCycTerm(final Date date) throws ParseException {
        return date2Naut(date, guessGranularity(date));
    }
    
    private static CycNaut date2Naut(final Date date, final int granularity) throws ParseException {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar2Naut(calendar, granularity);
    }
    
    private static CycNaut calendar2Naut(final Calendar calendar, final int granularity) {
        CycNaut dateNaut = new CycNaut((CycDenotationalTerm)DateConverter.YEAR_FN, new Object[] { calendar.get(DateConverter.YEAR_GRANULARITY) });
        if (granularity > DateConverter.YEAR_GRANULARITY) {
            dateNaut = new CycNaut((CycDenotationalTerm)DateConverter.MONTH_FN, new Object[] { lookupMonth(calendar.get(DateConverter.MONTH_GRANULARITY)), dateNaut });
            if (granularity > DateConverter.MONTH_GRANULARITY) {
                dateNaut = new CycNaut((CycDenotationalTerm)DateConverter.DAY_FN, new Object[] { calendar.get(DateConverter.DAY_GRANULARITY), dateNaut });
                if (granularity > DateConverter.DAY_GRANULARITY) {
                    dateNaut = new CycNaut((CycDenotationalTerm)DateConverter.HOUR_FN, new Object[] { calendar.get(DateConverter.HOUR_GRANULARITY), dateNaut });
                    if (granularity > 10) {
                        dateNaut = new CycNaut((CycDenotationalTerm)DateConverter.MINUTE_FN, new Object[] { calendar.get(DateConverter.MINUTE_GRANULARITY), dateNaut });
                        if (granularity > DateConverter.MINUTE_GRANULARITY) {
                            dateNaut = new CycNaut((CycDenotationalTerm)DateConverter.SECOND_FN, new Object[] { calendar.get(DateConverter.SECOND_GRANULARITY), dateNaut });
                            if (granularity > DateConverter.SECOND_GRANULARITY) {
                                dateNaut = new CycNaut((CycDenotationalTerm)DateConverter.MILLISECOND_FN, new Object[] { calendar.get(DateConverter.MILLISECOND_GRANULARITY), dateNaut });
                            }
                        }
                    }
                }
            }
        }
        return dateNaut;
    }
    
    private static Date naut2Date(final CycNaut naut, final TimeZone timeZone) throws ParseException {
        return naut2Calendar(naut, timeZone).getTime();
    }
    
    private static Calendar naut2Calendar(final CycNaut naut, final TimeZone timeZone) throws ParseException {
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        updateCalendar(naut, calendar);
        calendar.set(15, timeZone.getRawOffset());
        return calendar;
    }
    
    private static void updateCalendar(final CycNaut naut, final Calendar calendar) throws ParseException {
        final int arity = naut.getArity();
        final CycFort functor = naut.getFunctor();
        if (arity < 1 || arity > 2) {
            throwParseException((Object)naut);
        }
        final Object arg1 = naut.getArg(1);
        if (arity == 1 && DateConverter.YEAR_FN.equals((Object)functor)) {
            final Integer yearNum = parseInteger(arg1, "year number");
            calendar.set(DateConverter.YEAR_GRANULARITY, yearNum);
        }
        else if (arity == 1) {
            throwParseException((Object)naut);
        }
        else {
            final Object arg2 = naut.getArg(2);
            if (!(arg2 instanceof CycNaut)) {
                throwParseException(arg2);
            }
            if (DateConverter.MONTH_FN.equals((Object)functor)) {
                if (!(arg1 instanceof CycConstant)) {
                    throw new ParseException(arg1 + " is not a valid CycL month.");
                }
                final int monthNum = lookupMonthNum((CycConstant)arg1);
                if (monthNum < 0 || monthNum > 11) {
                    throw new ParseException(arg1 + " is not a valid CycL month.");
                }
                updateCalendar((CycNaut)arg2, calendar);
                calendar.set(DateConverter.MONTH_GRANULARITY, monthNum);
            }
            else if (DateConverter.DAY_FN.equals((Object)functor)) {
                final Object dayNum = parseInteger(arg1, "day number");
                updateCalendar((CycNaut)arg2, calendar);
                calendar.set(DateConverter.DAY_GRANULARITY, (int)dayNum);
            }
            else if (DateConverter.HOUR_FN.equals((Object)functor)) {
                final Object hourNum = parseInteger(arg1, "hour number");
                updateCalendar((CycNaut)arg2, calendar);
                calendar.set(DateConverter.HOUR_GRANULARITY, (int)hourNum);
            }
            else if (DateConverter.MINUTE_FN.equals((Object)functor)) {
                final Object minuteNum = parseInteger(arg1, "minute number");
                updateCalendar((CycNaut)arg2, calendar);
                calendar.set(DateConverter.MINUTE_GRANULARITY, (int)minuteNum);
            }
            else if (DateConverter.SECOND_FN.equals((Object)functor)) {
                final Object secondNum = Integer.valueOf(arg1.toString());
                if (!(secondNum instanceof Integer) || (int)secondNum < 0 || (int)secondNum >= 60) {
                    throw new ParseException(secondNum + " is not a valid second number.");
                }
                updateCalendar((CycNaut)arg2, calendar);
                calendar.set(DateConverter.SECOND_GRANULARITY, (int)secondNum);
            }
            else if (DateConverter.MILLISECOND_FN.equals((Object)functor)) {
                final Object millisecondNum = parseInteger(arg1, "millisecond number");
                updateCalendar((CycNaut)arg2, calendar);
                calendar.set(DateConverter.MILLISECOND_GRANULARITY, (int)millisecondNum);
            }
            else {
                throwParseException((Object)naut);
            }
        }
    }
    
    public static CycConstant lookupSeason(final String season) {
        if (season.equals("SU")) {
            return DateConverter.SUMMER;
        }
        if (season.equals("SP")) {
            return DateConverter.SPRING;
        }
        if (season.equals("FA")) {
            return DateConverter.FALL;
        }
        if (season.equals("WI")) {
            return DateConverter.WINTER;
        }
        return null;
    }
    
    private static CycConstant lookupMonth(final int month) {
        ensureMonthArrayInitialized();
        return DateConverter.CYC_MONTH_TERMS[month];
    }
    
    private static int lookupMonthNum(final CycConstant cycMonth) {
        ensureMonthArrayInitialized();
        for (int monthNum = 0; monthNum <= 11; ++monthNum) {
            if (cycMonth.equals((Object)DateConverter.CYC_MONTH_TERMS[monthNum])) {
                return monthNum;
            }
        }
        return -1;
    }
    
    private static void ensureMonthArrayInitialized() {
        if (DateConverter.CYC_MONTH_TERMS == null) {
            initializeCycMonthTerms();
        }
    }
    
    private static void initializeCycMonthTerms() {
        (DateConverter.CYC_MONTH_TERMS = new CycConstant[12])[0] = DateConverter.JANUARY;
        DateConverter.CYC_MONTH_TERMS[1] = DateConverter.FEBRUARY;
        DateConverter.CYC_MONTH_TERMS[2] = DateConverter.MARCH;
        DateConverter.CYC_MONTH_TERMS[3] = DateConverter.APRIL;
        DateConverter.CYC_MONTH_TERMS[4] = DateConverter.MAY;
        DateConverter.CYC_MONTH_TERMS[5] = DateConverter.JUNE;
        DateConverter.CYC_MONTH_TERMS[6] = DateConverter.JULY;
        DateConverter.CYC_MONTH_TERMS[7] = DateConverter.AUGUST;
        DateConverter.CYC_MONTH_TERMS[8] = DateConverter.SEPTEMBER;
        DateConverter.CYC_MONTH_TERMS[9] = DateConverter.OCTOBER;
        DateConverter.CYC_MONTH_TERMS[10] = DateConverter.NOVEMBER;
        DateConverter.CYC_MONTH_TERMS[11] = DateConverter.DECEMBER;
    }
    
    public static boolean isCycDate(final Object object) {
        if (object instanceof CycList) {
            return parseCycDate((CycList)object, false) != null;
        }
        return object instanceof CycNaut && parseCycDate((CycNaut)object, false) != null;
    }
    
    static {
        DAY_GRANULARITY = TimeGranularity.DAY.intValue();
        HOUR_GRANULARITY = TimeGranularity.HOUR.intValue();
        MILLISECOND_GRANULARITY = TimeGranularity.MILLISECOND.intValue();
        MINUTE_GRANULARITY = TimeGranularity.MINUTE.intValue();
        MONTH_GRANULARITY = TimeGranularity.MONTH.intValue();
        SECOND_GRANULARITY = TimeGranularity.SECOND.intValue();
        WEEK_GRANULARITY = TimeGranularity.WEEK.intValue();
        YEAR_GRANULARITY = TimeGranularity.YEAR.intValue();
        YEAR_FN = new CycConstant("YearFn", new Guid("bd58f29a-9c29-11b1-9dad-c379636f7270"));
        SEASON_FN = new CycConstant("SeasonFn", new Guid("c0fbe0cd-9c29-11b1-9dad-c379636f7270"));
        MONTH_FN = new CycConstant("MonthFn", new Guid("be00fd8d-9c29-11b1-9dad-c379636f7270"));
        DAY_FN = new CycConstant("DayFn", new Guid("be00ff5b-9c29-11b1-9dad-c379636f7270"));
        HOUR_FN = new CycConstant("HourFn", new Guid("be010082-9c29-11b1-9dad-c379636f7270"));
        MINUTE_FN = new CycConstant("MinuteFn", new Guid("be0100d7-9c29-11b1-9dad-c379636f7270"));
        SECOND_FN = new CycConstant("SecondFn", new Guid("be01010a-9c29-11b1-9dad-c379636f7270"));
        MILLISECOND_FN = new CycConstant("MilliSecondFn", new Guid("8c3206d3-1616-11d8-99b1-0002b361bcfc"));
        JANUARY = new CycConstant("January", new Guid("bd58b833-9c29-11b1-9dad-c379636f7270"));
        FEBRUARY = new CycConstant("February", new Guid("bd58c2f7-9c29-11b1-9dad-c379636f7270"));
        MARCH = new CycConstant("March", new Guid("bd58c2bd-9c29-11b1-9dad-c379636f7270"));
        APRIL = new CycConstant("April", new Guid("bd58c279-9c29-11b1-9dad-c379636f7270"));
        MAY = new CycConstant("May", new Guid("bd58c232-9c29-11b1-9dad-c379636f7270"));
        JUNE = new CycConstant("June", new Guid("bd58c1f0-9c29-11b1-9dad-c379636f7270"));
        JULY = new CycConstant("July", new Guid("bd58c1ad-9c29-11b1-9dad-c379636f7270"));
        AUGUST = new CycConstant("August", new Guid("bd58c170-9c29-11b1-9dad-c379636f7270"));
        SEPTEMBER = new CycConstant("September", new Guid("bd58c131-9c29-11b1-9dad-c379636f7270"));
        OCTOBER = new CycConstant("October", new Guid("bd58c0ef-9c29-11b1-9dad-c379636f7270"));
        NOVEMBER = new CycConstant("November", new Guid("bd58c0a5-9c29-11b1-9dad-c379636f7270"));
        DECEMBER = new CycConstant("December", new Guid("bd58b8ba-9c29-11b1-9dad-c379636f7270"));
        SPRING = new CycConstant("CalendarSpring", new Guid("be011735-9c29-11b1-9dad-c379636f7270"));
        SUMMER = new CycConstant("CalendarSummer", new Guid("be011768-9c29-11b1-9dad-c379636f7270"));
        FALL = new CycConstant("CalendarAutumn", new Guid("be011790-9c29-11b1-9dad-c379636f7270"));
        WINTER = new CycConstant("CalendarWinter", new Guid("be0116f3-9c29-11b1-9dad-c379636f7270"));
        NTH_SPECIFIED_DATE_TYPE_OF_SUBSUMING_DATE_FN = new CycConstant("NthSpecifiedDateTypeOfSubsumingDateFn", new Guid("fa33c621-7b6f-4eeb-9801-3acb990b0c8f"));
        CALENDAR_WEEK = new CycConstant("CalendarWeek", new Guid("bd58c064-9c29-11b1-9dad-c379636f7270"));
        DateConverter.CYC_MONTH_TERMS = null;
        DateConverter.SHARED_INSTANCE = null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 143 ms
	
	Decompiled with Procyon 0.5.32.
*/