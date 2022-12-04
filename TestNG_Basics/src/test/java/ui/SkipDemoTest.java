package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

	/**Using dummy test cases to show how test cases are skipped in testNG
	//We have different approaches but each depends on the given scenario
	 **/

	//Boolean dataAvailable = true;
	Boolean dataAvailable = false;

	//approach1: when not complete, skipped and not executed

	@Test(enabled=false)
	public void skipTest1()  {

		System.out.println("skipping this test, because it is still in-progress");
	}

	//approach2: skipping forcefully but executed

	@Test
	public void skipTest2()  {

		System.out.println("forcefully skipping this test");
		throw new SkipException("Skipping this test");
	}

	//approach3: skip based on condition, also executed

	@Test
	public void skipTest3()  {

		if(dataAvailable != true) {

			System.out.println("Do not execute further tests");
			throw new SkipException("Do not execute further test");
		}

		else {

			System.out.println("Execute the test");
		}

	}
}
