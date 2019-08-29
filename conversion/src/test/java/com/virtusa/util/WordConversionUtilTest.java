package com.virtusa.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.virtusa.conversion.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class WordConversionUtilTest {

	@Autowired
	WordConversionUtil wordConversionUtil;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertNumberToWord() {
		int inputNumber =  145;
		String output = wordConversionUtil.convertNumberToWord(inputNumber);
		assertNotNull(output);
	}

	@Test
	public void testInvalidConvertNumberToWord() {
		int inputNumber =  -10;
		String output = wordConversionUtil.convertNumberToWord(inputNumber);
		assertEquals("Entered number "+inputNumber+" is not in valid Range",output);
	}
	@Test
	public void testPrepareWord() {
		int inputNumber =  121;
		String output = wordConversionUtil.prepareWord(inputNumber);
		assertNotNull(output);
	}
	
	@Test
	public void testZeroPrepareWord() {
		int inputNumber =  0;
		String output = wordConversionUtil.prepareWord(inputNumber);
		assertEquals("", output);
	}

}
