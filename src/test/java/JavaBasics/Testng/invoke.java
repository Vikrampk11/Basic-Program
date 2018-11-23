package JavaBasics.Testng;

import org.testng.annotations.Test;

public class invoke {
	@Test(invocationCount=5, threadPoolSize=3)
	public void invocation()
	{
	System.out.println("running");
	System.out.println("running1");
	}

}
