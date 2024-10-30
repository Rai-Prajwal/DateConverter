# DateConverter

**DateConverter** is a Java library that converts dates between the AD (Gregorian calendar) and BS (Bikram Sambat calendar) systems. This utility is useful for applications that need to support both calendar systems, especially for regions where the Bikram Sambat calendar is in common use.

## Features

- Convert dates from AD to BS.
- Support for dynamic reference dates for accurate conversions.
- Easy integration into Java projects.

## Installation

1. Clone this repository or add it as a dependency if available in a Maven repository.

   ```bash
   git clone https://github.com/your-username/DateConverter.git

2. If using Maven, add the following dependency to your pom.xml:

   ```bash
     <dependency>
       <groupId>com.ataraxia</groupId>
       <artifactId>DateConverter</artifactId>
       <version>0.0.1-SNAPSHOT</version>
     </dependency>

## Usage

  ```bash
      import com.ataraxia.dateconverter.Converter;
      import com.ataraxia.dateconverter.BSDate;

      public class DateConverterExample {
        public static void main(String[] args) {
          LocalDate adDate = LocalDate.of(2023, 10, 1);
          BSDate bsDate = Converter.convertToBS(adDate);
          System.out.println("AD Date: " + adDate + " -> BS Date: " + bsDate);
        }
      }
```

### Data Source
The data used in this project is sourced from the [Days-In-Month-of-BS-Calender](https://github.com/Rai-Prajwal/Days-In-Month-of-BS-Calender).


