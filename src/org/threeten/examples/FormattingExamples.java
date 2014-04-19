package org.threeten.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;

public class FormattingExamples {

    public String formatSimpleDate() {
        return LocalDate.now().toString();
    }

    //MM/DD/yyyy
    public String formatMonthDayYear() {
        
        
        
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MM/DD/yyyy")).toString();
    }

    public LocalDate parseLocalDate(String dateString) {
        return LocalDate.parse(dateString);
    }
}
