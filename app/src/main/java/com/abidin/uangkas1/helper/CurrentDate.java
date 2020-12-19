package com.abidin.uangkas1.helper;

import java.util.Calendar;

public class CurrentDate {

    public static Calendar calendar = Calendar.getInstance();
    public static int year  = calendar.get(calendar.YEAR);
    public static int month = calendar.get(calendar.MONTH);
    public static int day   = calendar.get(calendar.DAY_OF_MONTH);
}
