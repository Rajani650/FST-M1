package examples;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void sampleTest()
	{
		Assert.assertEquals(2+2, 4);
	}

}
