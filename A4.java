package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A4 extends Super {
	@Test
	public void hover() throws InterruptedException {
		WebElement web = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/a"));
		Actions action = new Actions(getDriver());
		action.moveToElement(web).build().perform();
		WebElement web1 = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
		action.moveToElement(web1).build().perform();
		WebElement  web3=getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/ul/li[6]/ul[2]/li[2]/a"));
		action.moveToElement(web3).click(web3).build().perform();
		WebElement web4 = getDriver().findElement(By.xpath("html/body/div[4]/header/div[1]/div/div/div/div/nav/ul/li[4]/a"));
		action.moveToElement(web4).build().perform();
		WebElement web5 = getDriver().findElement(By.xpath("html/body/div[4]/header/div[1]/div/div/div/div/nav/ul/li[4]/ul/li[3]/a"));
		action.moveToElement(web5).build().perform();
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", web5); 
		getDriver().findElement(By.id("email")).sendKeys("vamsiTumati@gmail.com");
		getDriver().findElement(By.id("license")).sendKeys("123446");
		getDriver().findElement(By.className("btn-thin-blue")).click();
		String actual = getDriver().findElement(By.cssSelector(".submit-error.m-bottom-30")).getText();
		String expected ="ERROR: Invalid e-mail or license number";
		Assert.assertEquals(actual, expected);
		
	}

}
