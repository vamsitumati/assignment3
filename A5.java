package task3;

import java.util.List;


import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A5 extends Super {
	@Test
	public void hover() throws InterruptedException {
		WebElement web = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/a"));
		Actions action = new Actions(getDriver());
		action.moveToElement(web).build().perform();
		WebElement web1 = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
		action.moveToElement(web1).build().perform();
		WebElement  web3=getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/ul/li[6]/ul[2]/li[2]/a"));
		action.moveToElement(web3).click(web3).build().perform();
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("scroll(0, 10000);");
		WebElement footer= getDriver().findElement(By.cssSelector(".dhx-footer"));
		List<WebElement> actuallinks = footer.findElements(By.tagName("a"));
		List<WebElement> expectedlinks = footer.findElements(By.tagName("a"));
		//System.out.println(footer.findElements(By.tagName("a")).size()) ; 
		for(int i=0;i<actuallinks.size();i++)
		{
			for(int j=0;j<expectedlinks.size();j++)
			{
				if(actuallinks.get(i).getText()==(expectedlinks.get(j)).getText())
				{
					
					System.out.println("true");
					break;
				}
				if(actuallinks.get(i).getText() != (expectedlinks.get(j)).getText())
				{
					Assert.fail("failed");
				}
			}
			
				
		}
		
		
		

}
}
