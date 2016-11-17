package task3;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class A2 extends Super {
	@Test
	public void dataPolicy() throws InterruptedException
	{
		getDriver().findElement(By.id("privacy-link")).click();
		switchToWindow(1);
		getDriver().findElement(By.className("_1tv_")).click();
		String actual = getDriver().findElement(By.className("_1z2h")).getText();
		String expected ="Things you do and information you provide.";
		Assert.assertEquals(actual, expected);
		String actual1 = getDriver().findElement(By.xpath(".//*[contains(text(),'Things others do and information they provide.') and contains(@class,'_1z2h')]")).getText();
		String expected1 ="Things others do and information they provide.";
		Assert.assertEquals(actual1, expected1);
		String actual2 = getDriver().findElement(By.xpath(".//*[contains(text(),'Your networks and connections') and contains(@class,'_1z2h')]")).getText();
		String expected2 ="Your networks and connections.";
		Assert.assertEquals(actual2, expected2);
		String actual3 = getDriver().findElement(By.xpath(".//*[contains(text(),'Information about payments.') and contains(@class,'_1z2h')]")).getText();
		String expected3 ="Information about payments.";
		Assert.assertEquals(actual3, expected3);
		String actual4 = getDriver().findElement(By.xpath(".//*[contains(text(),'Device information.') and contains(@class,'_1z2h')]")).getText();
		String expected4 ="Device information.";
		Assert.assertEquals(actual4, expected4);
		String actual5 = getDriver().findElement(By.xpath(".//*[contains(text(),'Information from websites and apps that use our Services.') and contains(@class,'_1z2h')]")).getText();
		String expected5 ="Information from websites and apps that use our Services.";
		Assert.assertEquals(actual5, expected5);
		String actual6 = getDriver().findElement(By.xpath(".//*[contains(text(),'Information from third-party partners.') and contains(@class,'_1z2h')]")).getText();
		String expected6 ="Information from third-party partners.";
		Assert.assertEquals(actual6, expected6);
		String actual7 = getDriver().findElement(By.xpath(".//*[contains(text(),'Facebook companies.') and contains(@class,'_1z2h')]")).getText();
		String expected7 ="Facebook companies.";
		Assert.assertEquals(actual7, expected7);
		Thread.sleep(4000);
		switchToRootCloseCurrent();
		Thread.sleep(4000);
		
		
		
	}

}
