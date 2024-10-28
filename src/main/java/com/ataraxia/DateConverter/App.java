package com.ataraxia.DateConverter;

import com.ataraxia.Models.BSDate;
import com.ataraxia.Utils.Converter;
import com.ataraxia.Exception.DateConversionException;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

    /**
     * Main method to demonstrate date conversion.
     * It allows a user to input a date or uses the system date by default.
     * @param args string args
     */
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
	        System.out.println("Enter a date in A.D. (YYYY-MM-DD) or press Enter to use today's date:");
	        String inputDate = scanner.nextLine().trim();
	        
	        // Default to system date if no input is given
	        LocalDate adDate = inputDate.isEmpty() ? LocalDate.now() : LocalDate.parse(inputDate);
	        
	        try {
	            BSDate convertedBsDate = Converter.convertADtoBS(adDate);
	            System.out.printf("AD Date: %s → BS Date: %s%n", adDate, convertedBsDate);
	        } catch (DateConversionException e) {
	            System.err.println("Date conversion error: " + e.getMessage());
	        }
	    } catch (Exception e) {
	        System.err.println("Error: " + e.getMessage());
	    }
	}
}