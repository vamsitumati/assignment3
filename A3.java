package task3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A3 extends Super {

	@Test
	public void flightBooking() throws InterruptedException {
		getDriver().findElement(By.id("tab-flight-tab")).click();
		getDriver().findElement(By.id("flight-origin")).sendKeys("New York");
		Thread.sleep(3000);
		List<WebElement> list = getDriver().findElements(By.className("results-item"));
		for (WebElement ele : list) {
			if (ele.getText().contains("LGA - LaGuardia")) {
				ele.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-destination")).sendKeys("las");
		List<WebElement> list1 = getDriver().findElements(By.className("main-suggestion"));
		for (WebElement ele : list1) {
			if (ele.getText().contains("Las Vegas")) {
				ele.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-departing")).click();
		List<WebElement> list2 = getDriver().findElements(By.className("datepicker-cal-date"));
		for (WebElement ele : list2) {
			if (ele.getText().contains("18")) {
				ele.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-returning")).click();
		List<WebElement> list4 = getDriver().findElements(By.className("datepicker-cal-date"));
		for (WebElement ele : list4) {
			if (ele.getText().contains("20")) {
				ele.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-adults")).click();
		Select dropdown = new Select(getDriver().findElement(By.id("flight-adults")));
		List<WebElement> list5 = dropdown.getOptions();
		for (WebElement ele : list5) {
			if (ele.getText().contains("4")) {
				ele.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-children")).click();
		Select dropdown1 = new Select(getDriver().findElement(By.id("flight-children")));
		List<WebElement> list6 = dropdown1.getOptions();
		for (WebElement ele : list6) {
			if (ele.getText().contains("1")) {
				ele.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-age-select-1")).click();
		Select dropdown2 = new Select(getDriver().findElement(By.id("flight-age-select-1")));
		List<WebElement> list7 = dropdown2.getOptions();
		for (WebElement ele : list7) {
			if (ele.getText().contains("2")) {
				ele.click();
				break;
			}
		}
		getDriver().findElement(By.id("search-button")).click();
		String actual = getDriver().findElement(By.className("title-city-text")).getText();
		String expected = "Select your departure to Las Vegas";
		Assert.assertEquals(actual, expected);

	}

}
