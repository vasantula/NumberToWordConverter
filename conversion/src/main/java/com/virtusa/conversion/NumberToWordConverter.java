/**
 * 
 */
package com.virtusa.conversion;

import com.virtusa.util.WordConversionUtil;

/**
 * @author ramesh.vasantula
 *
 */
public class NumberToWordConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number =  -798743;
//		int number =  999999999;
//		int number =  2147483630;
		WordConversionUtil conversionUtil = new WordConversionUtil();
		String word = conversionUtil.convertNumberToWord(number);
		System.out.println(word);
	}	
}
