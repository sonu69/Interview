package testNg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

class Campaign extends BaseClass{

	@Test
	public void addCampaign() {
		//		System.out.println("1 - Click on Campaign, "
		//				+ "2 - Click on ADD, "
		//				+ "3 - Fill all the detils, "
		//				+ "4 - Click on Submit, "
		//				+ "5 - Verify success message, ");
	}


	@Test
	public void searchCampaign() {
		//		System.out.println("1 - Enter Campaign Name on search Field, "
		//				+ "2 - Click on search Button, "
		//				+ "3 - Store all the results, "
		//				+ "4 - Verify Each results, "
		//				+ "5 - If found then Pass, "
		//				+ "6 - Else Fail");
	}


	@Test
	public void verifyCampaignErrMsg() {
		//		System.out.println("1 - Enter invalid data in field, "
		//				+ "2 - wait for element to appear, "
		//				+ "3 - Get error text, "
		//				+ "4 - Verify Error Message, "
		//				+ "5 - If error message matched then Pass, "
		//				+ "6 - Else error message is incorrect");
	}

	@Test
	public void verifyLoginSkipVald() {
		//		System.out.println("1 - If breadcrumb text matched then proceed, "
		//				+ "2 - If breadcrumb text not matched then skipped");
		throw new SkipException(null);
	}

	@Test
	public void cloneCampaign(){
		//		System.out.println("1 - Open campaign"
		//				+ "2 - Click on clone campaign");
		Assert.fail("Test case Failed");
	}



}
