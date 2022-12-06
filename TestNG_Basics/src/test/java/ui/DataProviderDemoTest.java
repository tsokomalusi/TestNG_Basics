package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {


	@Test(dataProvider="setData")
	public void test(String username, String password) {

		System.out.println(username+"====="+password);

	}

	@Test(dataProvider="create")
	public void test2(String u_name, String p_word, String status) {

		System.out.println(u_name+"==="+p_word+"==="+status);
	}

	//approach1 for defining a data provider

	@DataProvider
	public Object[][] setData() {

		// 4 rows by 2 columns multidimensional array of objects

		Object[][] setData =  new Object[4][2];

		//first row 
		setData[0][0] = "user1";
		setData[0][1] = "pword1";

		//second row
		setData[1][0] = "user2";
		setData[1][1] = "pword2";

		//third row
		setData[2][0] = "user3";
		setData[2][1] = "pword3";

		//fourth row
		setData[3][0] = "user4";
		setData[3][1] = "pword4";

		return setData;	
	}

	//approach 2

	@DataProvider(name = "create")
	public Object[][] setData2() {

		return new Object[][]   {

			{"username1","password1","valid"},
			{"username2","password2","invalid"},
			{"username3","password3","valid"},

		};
	}

}
