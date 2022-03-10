package org.step4;
import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseClass{
	
	@Before
	public void beforeClass() {
	browserConfigChrome();
	openUrl("https://www.facebook.com/");
	maximizeWindow();
	}
	
	@After
	public void afterClass() {
		closeBrowser();
	}
	

}
