package org.threeten.examples;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondExamples {

    public boolean isTodayAfterTomorrow() {
        
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);        
        
        return tomorrow.isAfter(today);
    }

    public DayOfWeek getLastDayOfMonth() {        
        return LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
    }

    //Longest day of year June 21st
    public int howManyDaysUntilLongestDayOfTheYear() {
        
        LocalDate today = LocalDate.now();
        LocalDate longestDay = today.with(Month.JUNE).withDayOfMonth(21);
        
        return Period.between(today, longestDay).getDays();
    }

    public Duration howLongUntilNewYear() {
        return null;
    }

    public LocalDate createDateFromJavaUtilDate() {
        return null;
    }

    public List<DayOfWeek> lastDaysOfMonthsInYear(int year) {
        return null;
    }
}
