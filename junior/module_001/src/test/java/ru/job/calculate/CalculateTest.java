package ru.job.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test
* @author Vakhtangova Tatyana (sharkka@mail.ru)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
	
	/**
	* Test echo
	*/
	@Test
	public void whenTakeNameThenTwoWords() {
	 
	 String input = "elena";
	 String expected = "Echo, elena";
	 
	 //Создаем новый объект
	 Calculate calc = new Calculate();
	 
	 String result = calc.echo("elena");
	 assertThat(result, is(expected));
	}
	
	
}