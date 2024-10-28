package com.ataraxia.Data;

import java.time.LocalDate;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Data {
	public static final Map<Integer, byte[]> daysInMonths;
	public static final NavigableMap<LocalDate, Integer> adToBsYearReference;

	static{
		daysInMonths = new TreeMap<>();
		adToBsYearReference = new TreeMap<>();
	    initializeDaysData();
	    initializeYearReference();
	    }

	private static void initializeDaysData() {
		// BS 2000-2100 data
		daysInMonths.put(1975, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(1976, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(1977, new byte[]{30,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(1978, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1979, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(1980, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(1981, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(1982, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1983, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(1984, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(1985, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(1986, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1987, new byte[]{31,32,31,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(1988, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(1989, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(1990, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1991, new byte[]{31,32,31,32,31,30,30,30,29,29,30,30});
		daysInMonths.put(1992, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(1993, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1994, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1995, new byte[]{31,32,31,32,31,30,30,30,29,29,30,30});
		daysInMonths.put(1996, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(1997, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1998, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(1999, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2000, new byte[]{30,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2001, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2002, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2003, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2004, new byte[]{30,32,31,32,31,30,30,30,30,29,29,31});
		daysInMonths.put(2005, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2006, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2007, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2008, new byte[]{31,31,31,32,31,31,29,30,30,29,29,31});
		daysInMonths.put(2009, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2010, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2011, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2012, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(2013, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2014, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2015, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2016, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(2017, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2018, new byte[]{31,32,31,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2019, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2020, new byte[]{31,31,31,32,31,31,30,29,30,29,30,30});
		daysInMonths.put(2021, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2022, new byte[]{31,32,31,32,31,30,30,30,29,29,30,30});
		daysInMonths.put(2023, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2024, new byte[]{31,31,31,32,31,31,30,29,30,29,30,30});
		daysInMonths.put(2025, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2026, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2027, new byte[]{30,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2028, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2029, new byte[]{31,31,32,31,32,30,30,29,30,29,30,30});
		daysInMonths.put(2030, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2031, new byte[]{30,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2032, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2033, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2034, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2035, new byte[]{30,32,31,32,31,31,29,30,30,29,29,31});
		daysInMonths.put(2036, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2037, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2038, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2039, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(2040, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2041, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2042, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2043, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(2044, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2045, new byte[]{31,32,31,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2046, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2047, new byte[]{31,31,31,32,31,31,30,29,30,29,30,30});
		daysInMonths.put(2048, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2049, new byte[]{31,32,31,32,31,30,30,30,29,29,30,30});
		daysInMonths.put(2050, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2051, new byte[]{31,31,31,32,31,31,30,29,30,29,30,30});
		daysInMonths.put(2052, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2053, new byte[]{31,32,31,32,31,30,30,30,29,29,30,30});
		daysInMonths.put(2054, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2055, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2056, new byte[]{31,31,32,31,32,30,30,29,30,29,30,30});
		daysInMonths.put(2057, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2058, new byte[]{30,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2059, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2060, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2061, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2062, new byte[]{31,31,31,32,31,31,29,30,29,30,29,31});
		daysInMonths.put(2063, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2064, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2065, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2066, new byte[]{31,31,31,32,31,31,29,30,30,29,29,31});
		daysInMonths.put(2067, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2068, new byte[]{31,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2069, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2070, new byte[]{31,31,31,32,31,31,29,30,30,29,30,30});
		daysInMonths.put(2071, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2072, new byte[]{31,32,31,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2073, new byte[]{31,32,31,32,31,30,30,30,29,29,30,31});
		daysInMonths.put(2074, new byte[]{31,31,31,32,31,31,30,29,30,29,30,30});
		daysInMonths.put(2075, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2076, new byte[]{31,32,31,32,31,30,30,30,29,29,30,30});
		daysInMonths.put(2077, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2078, new byte[]{31,31,31,32,31,31,30,29,30,29,30,30});
		daysInMonths.put(2079, new byte[]{31,31,32,31,31,31,30,29,30,29,30,30});
		daysInMonths.put(2080, new byte[]{31,32,31,32,31,30,30,30,29,29,30,30});
		daysInMonths.put(2081, new byte[]{31,32,31,32,31,30,30,30,29,30,29,31});
		daysInMonths.put(2082, new byte[]{31,31,32,31,31,30,30,30,29,30,30,30});
		daysInMonths.put(2083, new byte[]{31,31,32,31,31,30,30,30,29,30,30,30});
		daysInMonths.put(2084, new byte[]{31,31,32,31,31,30,30,30,29,30,30,30});
		daysInMonths.put(2085, new byte[]{31,32,31,32,30,31,30,30,29,30,30,30});
		daysInMonths.put(2086, new byte[]{30,32,31,32,31,30,30,30,29,30,30,30});
		daysInMonths.put(2087, new byte[]{31,31,32,31,31,31,30,29,30,30,30,30});
		daysInMonths.put(2088, new byte[]{30,31,32,32,30,31,30,30,29,30,30,30});
		daysInMonths.put(2089, new byte[]{30,32,31,32,31,30,30,30,29,30,30,30});
		daysInMonths.put(2090, new byte[]{30,32,31,32,31,30,30,30,29,30,30,30});
		daysInMonths.put(2091, new byte[]{31,31,32,31,31,31,30,30,29,30,30,30});
		daysInMonths.put(2092, new byte[]{30,31,32,32,31,30,30,30,29,30,30,30});
		daysInMonths.put(2093, new byte[]{30,32,31,32,31,30,30,30,29,30,30,30});
		daysInMonths.put(2094, new byte[]{31,31,32,31,31,30,30,30,29,30,30,30});
		daysInMonths.put(2095, new byte[]{31,31,32,31,31,31,30,29,30,30,30,30});
		daysInMonths.put(2096, new byte[]{30,31,32,32,31,30,30,29,30,29,30,30});
		daysInMonths.put(2097, new byte[]{31,32,31,32,31,30,30,30,29,30,30,30});
		daysInMonths.put(2098, new byte[]{31,31,32,31,31,31,29,30,29,30,29,31});
		daysInMonths.put(2099, new byte[]{31,31,32,31,31,31,30,29,29,30,30,30});
		daysInMonths.put(2100, new byte[]{31,32,31,32,30,31,30,29,30,29,30,30});

	}
	
	private static void initializeYearReference() {
		//BS years to their 1st Baisakh dates in A.D.
		adToBsYearReference.put(LocalDate.of(1918, 4, 13), 1975);
		adToBsYearReference.put(LocalDate.of(1919, 4, 13), 1976);
		adToBsYearReference.put(LocalDate.of(1920, 4, 13), 1977);
		adToBsYearReference.put(LocalDate.of(1921, 4, 13), 1978);
		adToBsYearReference.put(LocalDate.of(1922, 4, 13), 1979);
		adToBsYearReference.put(LocalDate.of(1923, 4, 13), 1980);
		adToBsYearReference.put(LocalDate.of(1924, 4, 13), 1981);
		adToBsYearReference.put(LocalDate.of(1925, 4, 13), 1982);
		adToBsYearReference.put(LocalDate.of(1926, 4, 13), 1983);
		adToBsYearReference.put(LocalDate.of(1927, 4, 13), 1984);
		adToBsYearReference.put(LocalDate.of(1928, 4, 13), 1985);
		adToBsYearReference.put(LocalDate.of(1929, 4, 13), 1986);
		adToBsYearReference.put(LocalDate.of(1930, 4, 13), 1987);
		adToBsYearReference.put(LocalDate.of(1931, 4, 13), 1988);
		adToBsYearReference.put(LocalDate.of(1932, 4, 13), 1989);
		adToBsYearReference.put(LocalDate.of(1933, 4, 13), 1990);
		adToBsYearReference.put(LocalDate.of(1934, 4, 13), 1991);
		adToBsYearReference.put(LocalDate.of(1935, 4, 13), 1992);
		adToBsYearReference.put(LocalDate.of(1936, 4, 13), 1993);
		adToBsYearReference.put(LocalDate.of(1937, 4, 13), 1994);
		adToBsYearReference.put(LocalDate.of(1938, 4, 13), 1995);
		adToBsYearReference.put(LocalDate.of(1939, 4, 13), 1996);
		adToBsYearReference.put(LocalDate.of(1940, 4, 13), 1997);
		adToBsYearReference.put(LocalDate.of(1941, 4, 13), 1998);
		adToBsYearReference.put(LocalDate.of(1942, 4, 13), 1999);
		adToBsYearReference.put(LocalDate.of(1943, 4, 14), 2000);
		adToBsYearReference.put(LocalDate.of(1944, 4, 13), 2001);
		adToBsYearReference.put(LocalDate.of(1945, 4, 13), 2002);
		adToBsYearReference.put(LocalDate.of(1946, 4, 13), 2003);
		adToBsYearReference.put(LocalDate.of(1947, 4, 14), 2004);
		adToBsYearReference.put(LocalDate.of(1948, 4, 13), 2005);
		adToBsYearReference.put(LocalDate.of(1949, 4, 13), 2006);
		adToBsYearReference.put(LocalDate.of(1950, 4, 13), 2007);
		adToBsYearReference.put(LocalDate.of(1951, 4, 14), 2008);
		adToBsYearReference.put(LocalDate.of(1952, 4, 13), 2009);
		adToBsYearReference.put(LocalDate.of(1953, 4, 13), 2010);
		adToBsYearReference.put(LocalDate.of(1954, 4, 13), 2011);
		adToBsYearReference.put(LocalDate.of(1955, 4, 14), 2012);
		adToBsYearReference.put(LocalDate.of(1956, 4, 13), 2013);
		adToBsYearReference.put(LocalDate.of(1957, 4, 13), 2014);
		adToBsYearReference.put(LocalDate.of(1958, 4, 13), 2015);
		adToBsYearReference.put(LocalDate.of(1959, 4, 14), 2016);
		adToBsYearReference.put(LocalDate.of(1960, 4, 13), 2017);
		adToBsYearReference.put(LocalDate.of(1961, 4, 13), 2018);
		adToBsYearReference.put(LocalDate.of(1962, 4, 13), 2019);
		adToBsYearReference.put(LocalDate.of(1963, 4, 14), 2020);
		adToBsYearReference.put(LocalDate.of(1964, 4, 13), 2021);
		adToBsYearReference.put(LocalDate.of(1965, 4, 13), 2022);
		adToBsYearReference.put(LocalDate.of(1966, 4, 13), 2023);
		adToBsYearReference.put(LocalDate.of(1967, 4, 14), 2024);
		adToBsYearReference.put(LocalDate.of(1968, 4, 13), 2025);
		adToBsYearReference.put(LocalDate.of(1969, 4, 13), 2026);
		adToBsYearReference.put(LocalDate.of(1970, 4, 14), 2027);
		adToBsYearReference.put(LocalDate.of(1971, 4, 14), 2028);
		adToBsYearReference.put(LocalDate.of(1972, 4, 13), 2029);
		adToBsYearReference.put(LocalDate.of(1973, 4, 13), 2030);
		adToBsYearReference.put(LocalDate.of(1974, 4, 14), 2031);
		adToBsYearReference.put(LocalDate.of(1975, 4, 14), 2032);
		adToBsYearReference.put(LocalDate.of(1976, 4, 13), 2033);
		adToBsYearReference.put(LocalDate.of(1977, 4, 13), 2034);
		adToBsYearReference.put(LocalDate.of(1978, 4, 14), 2035);
		adToBsYearReference.put(LocalDate.of(1979, 4, 14), 2036);
		adToBsYearReference.put(LocalDate.of(1980, 4, 13), 2037);
		adToBsYearReference.put(LocalDate.of(1981, 4, 13), 2038);
		adToBsYearReference.put(LocalDate.of(1982, 4, 14), 2039);
		adToBsYearReference.put(LocalDate.of(1983, 4, 14), 2040);
		adToBsYearReference.put(LocalDate.of(1984, 4, 13), 2041);
		adToBsYearReference.put(LocalDate.of(1985, 4, 13), 2042);
		adToBsYearReference.put(LocalDate.of(1986, 4, 14), 2043);
		adToBsYearReference.put(LocalDate.of(1987, 4, 14), 2044);
		adToBsYearReference.put(LocalDate.of(1988, 4, 13), 2045);
		adToBsYearReference.put(LocalDate.of(1989, 4, 13), 2046);
		adToBsYearReference.put(LocalDate.of(1990, 4, 14), 2047);
		adToBsYearReference.put(LocalDate.of(1991, 4, 14), 2048);
		adToBsYearReference.put(LocalDate.of(1992, 4, 13), 2049);
		adToBsYearReference.put(LocalDate.of(1993, 4, 13), 2050);
		adToBsYearReference.put(LocalDate.of(1994, 4, 14), 2051);
		adToBsYearReference.put(LocalDate.of(1995, 4, 14), 2052);
		adToBsYearReference.put(LocalDate.of(1996, 4, 13), 2053);
		adToBsYearReference.put(LocalDate.of(1997, 4, 13), 2054);
		adToBsYearReference.put(LocalDate.of(1998, 4, 14), 2055);
		adToBsYearReference.put(LocalDate.of(1999, 4, 14), 2056);
		adToBsYearReference.put(LocalDate.of(2000, 4, 13), 2057);
		adToBsYearReference.put(LocalDate.of(2001, 4, 14), 2058);
		adToBsYearReference.put(LocalDate.of(2002, 4, 14), 2059);
		adToBsYearReference.put(LocalDate.of(2003, 4, 14), 2060);
		adToBsYearReference.put(LocalDate.of(2004, 4, 13), 2061);
		adToBsYearReference.put(LocalDate.of(2005, 4, 14), 2062);
		adToBsYearReference.put(LocalDate.of(2006, 4, 14), 2063);
		adToBsYearReference.put(LocalDate.of(2007, 4, 14), 2064);
		adToBsYearReference.put(LocalDate.of(2008, 4, 13), 2065);
		adToBsYearReference.put(LocalDate.of(2009, 4, 14), 2066);
		adToBsYearReference.put(LocalDate.of(2010, 4, 14), 2067);
		adToBsYearReference.put(LocalDate.of(2011, 4, 14), 2068);
		adToBsYearReference.put(LocalDate.of(2012, 4, 13), 2069);
		adToBsYearReference.put(LocalDate.of(2013, 4, 14), 2070);
		adToBsYearReference.put(LocalDate.of(2014, 4, 14), 2071);
		adToBsYearReference.put(LocalDate.of(2015, 4, 14), 2072);
		adToBsYearReference.put(LocalDate.of(2016, 4, 13), 2073);
		adToBsYearReference.put(LocalDate.of(2017, 4, 14), 2074);
		adToBsYearReference.put(LocalDate.of(2018, 4, 14), 2075);
		adToBsYearReference.put(LocalDate.of(2019, 4, 14), 2076);
		adToBsYearReference.put(LocalDate.of(2020, 4, 13), 2077);
		adToBsYearReference.put(LocalDate.of(2021, 4, 14), 2078);
		adToBsYearReference.put(LocalDate.of(2022, 4, 14), 2079);
		adToBsYearReference.put(LocalDate.of(2023, 4, 14), 2080);
		adToBsYearReference.put(LocalDate.of(2024, 4, 13), 2081);
		adToBsYearReference.put(LocalDate.of(2025, 4, 14), 2082);
		adToBsYearReference.put(LocalDate.of(2026, 4, 14), 2083);
		adToBsYearReference.put(LocalDate.of(2027, 4, 14), 2084);
		adToBsYearReference.put(LocalDate.of(2028, 4, 13), 2085);
		adToBsYearReference.put(LocalDate.of(2029, 4, 13), 2086);
		adToBsYearReference.put(LocalDate.of(2030, 4, 14), 2087);
		adToBsYearReference.put(LocalDate.of(2031, 4, 14), 2088);
		adToBsYearReference.put(LocalDate.of(2032, 4, 13), 2089);
		adToBsYearReference.put(LocalDate.of(2033, 4, 13), 2090);
		adToBsYearReference.put(LocalDate.of(2034, 4, 14), 2091);
		adToBsYearReference.put(LocalDate.of(2035, 4, 14), 2092);
		adToBsYearReference.put(LocalDate.of(2036, 4, 13), 2093);
		adToBsYearReference.put(LocalDate.of(2037, 4, 13), 2094);
		adToBsYearReference.put(LocalDate.of(2038, 4, 14), 2095);
		adToBsYearReference.put(LocalDate.of(2039, 4, 14), 2096);
		adToBsYearReference.put(LocalDate.of(2040, 4, 13), 2097);
		adToBsYearReference.put(LocalDate.of(2041, 4, 13), 2098);
		adToBsYearReference.put(LocalDate.of(2042, 4, 14), 2099);
		adToBsYearReference.put(LocalDate.of(2043, 4, 14), 2100);


	}
	
	public byte[] getDaysInMonths(int year) {
		return daysInMonths.getOrDefault(year, new byte[]{});
	    }
	
	public LocalDate getClosestAdReference(LocalDate adDate) {
        Map.Entry<LocalDate, Integer> closestEntry = adToBsYearReference.floorEntry(adDate);
        if (closestEntry == null) {
            throw new IllegalArgumentException("No reference date available before the given AD date.");
        }
        return closestEntry.getKey();
    }

    public int getBsYearForReference(LocalDate adDate) {
        Integer bsYear = adToBsYearReference.get(adDate);
        if (bsYear == null) {
            throw new IllegalArgumentException("No BS year found for the given reference AD date.");
        }
        return bsYear;
    }

    public boolean hasYear(int year) {
        return daysInMonths.containsKey(year);
    }
}
