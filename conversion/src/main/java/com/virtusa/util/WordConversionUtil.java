/**
 * 
 */
package com.virtusa.util;

import org.springframework.context.annotation.Configuration;

/**
 * @author ramesh.vasantula
 *
 */
@Configuration
public class WordConversionUtil {

	public String convertNumberToWord(int inputNumber) {
		StringBuilder word = new StringBuilder();
		if (inputNumber == 0) {
			return "Zero";
		}
		if (inputNumber > 999999999 || inputNumber <0) {
			return "Entered number " + inputNumber + " is not in valid Range";
		}		
		return word.append(prepareWord(inputNumber)).toString().trim();
	}
	
	public String prepareWord(int inputNumber) {
		String wordFormat = "";
		int digitIndex = 0;
		do {
			int minimalNumber = inputNumber % 1000;
			if (minimalNumber != 0) {
				String subString = prepareShortWord(minimalNumber);
				wordFormat = subString + WordUnits.LEVEL3_UNITS.get(digitIndex) + wordFormat;
			}
			digitIndex++;
			inputNumber /= 1000;
		} while (inputNumber > 0);
		
		return wordFormat;
	}
	
	private String prepareShortWord(int number) {
		String wordFormat;
		if (number % 100 < 20) {
			wordFormat = WordUnits.LEVEL1_UNITS.get(number % 100);
			number /= 100;
		} else {
			wordFormat = WordUnits.LEVEL1_UNITS.get(number % 10);
			number /= 10;
			wordFormat = WordUnits.LEVEL2_UNITS.get(number % 10) + wordFormat;
			number /= 10;
		}
		if (number == 0)
			return wordFormat;
		return WordUnits.LEVEL1_UNITS.get(number) + " Hundred" + wordFormat;
	}

	

	
}
