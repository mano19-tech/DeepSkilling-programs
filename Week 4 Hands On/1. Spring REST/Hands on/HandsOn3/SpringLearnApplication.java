package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("START");
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
		displayCountry();
		displayCountries();
		LOGGER.info("END");

    }

	public static void displayDate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date date = format.parse("06/04/2005");
			System.out.println("Parsed Date: " + date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void displayCountry() {
		LOGGER.info("START of displayCountry()");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class); // second reference

		LOGGER.debug("Country: {}", country);
		LOGGER.debug("Another Country: {}", anotherCountry);
		LOGGER.info("Are both beans the same? {}", country == anotherCountry);

		LOGGER.info("END of displayCountry()");
	}

	public static void displayCountries() {
		LOGGER.info("START of displayCountries()");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		List<Country> countryList = context.getBean("countryList", ArrayList.class);

		for (Country c : countryList) {
			LOGGER.debug("Country: {}", c);
		}

		LOGGER.info("END of displayCountries()");
	}

}