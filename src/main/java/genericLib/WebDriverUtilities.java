package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	public void dropDown(WebElement ele,String text)
	{
		Select s= new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebElement ele,WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();	
	}
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a= new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement scr,WebElement des)
	{
		Actions a =new Actions(driver);
		a.dragAndDrop(scr,des).perform();
	}
	public void switchToFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	public void switchBackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void alertPopups(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
}
