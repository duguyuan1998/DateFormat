package com.duguyuan;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 12, 10, 10, 30, 0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(calendar.getTime());
        System.out.println(dateTime);
    }
}
