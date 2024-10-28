package com.ataraxia.Utils;

import com.ataraxia.Data.Data;
import com.ataraxia.Exception.DateConversionException;
import com.ataraxia.Models.BSDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Converter {
    
    /**
     * Converts an A.D. date to B.S. date
     * @param adDate The LocalDate object representing the A.D. date
     * @return BSDate object representing the converted B.S. date
     * @throws DateConversionException if the date is outside valid range
     */
    public static BSDate convertADtoBS(LocalDate adDate) {
        validateInput(adDate);
        
        // Get the reference date
        LocalDate referenceDate = new Data().getClosestAdReference(adDate);
        int bsYear = new Data().getBsYearForReference(referenceDate);
        
        // Calculate days difference
        long daysBetween = ChronoUnit.DAYS.between(referenceDate, adDate);
        
        // Convert to BS date
        return addDaysToBsDate(bsYear, 1, 1, daysBetween);
    }
    
    /**
     * Validates if the input date is within the supported range
     */
    private static void validateInput(LocalDate adDate) {
        LocalDate minDate = LocalDate.of(1918, 4, 13);
        LocalDate maxDate = LocalDate.of(2043, 4, 14);
        
        if (adDate.isBefore(minDate) || adDate.isAfter(maxDate)) {
            throw new DateConversionException(
                String.format("Date must be between %s and %s", minDate, maxDate)
            );
        }
    }
    
    /**
     * Adds the specified number of days to a B.S. date
     */
    private static BSDate addDaysToBsDate(int year, int month, int day, long daysToAdd) {
        while (daysToAdd > 0) {
            byte[] monthDays = new Data().getDaysInMonths(year);
            if (monthDays.length == 0) {
                throw new DateConversionException("Invalid BS year: " + year);
            }
            
            // Convert byte to unsigned int to handle the days correctly
            int daysInCurrentMonth = monthDays[month - 1] & 0xFF;
            
            if (daysToAdd + day <= daysInCurrentMonth) {
                day += daysToAdd;
                daysToAdd = 0;
            } else {
                daysToAdd -= (daysInCurrentMonth - day + 1);
                day = 1;
                month++;
                
                if (month > 12) {
                    month = 1;
                    year++;
                    if (!new Data().hasYear(year)) {
                        throw new DateConversionException(
                            "Resulting BS date is outside the valid range"
                        );
                    }
                }
            }
        }
        return new BSDate(year, month, day);
    }
    
    /**
     * Validates a BS date
     * @throws DateConversionException if the date is invalid
     */
    public static void validateBsDate(BSDate date) {
        byte[] monthDays = new Data().getDaysInMonths(date.getYear());
        if (monthDays.length == 0) {
            throw new DateConversionException("Invalid BS year: " + date.getYear());
        }
        
        if (date.getMonth() < 1 || date.getMonth() > 12) {
            throw new DateConversionException("Month must be between 1 and 12");
        }
        
        int daysInMonth = monthDays[date.getMonth() - 1] & 0xFF;
        if (date.getDay() < 1 || date.getDay() > daysInMonth) {
            throw new DateConversionException(
                String.format("Day must be between 1 and %d for month %d", 
                    daysInMonth, date.getMonth())
            );
        }
    }
}
