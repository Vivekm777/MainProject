package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities 
{

	public static void clickOnElement(WebElement element)
	{
		
		element.click();
		
	}
	
	public static void EnterText(WebElement element, String value)
	{
		element.sendKeys(value);
		
	}
	public static String getElementText(WebElement element)
	{
		
		return(element.getText());
	}
	
	public static void ClearText(WebElement element) 
	{
		
		element.clear();
		
	}
	public static void NavigateToBack(WebDriver driver)
	{
		
		driver.navigate().back();
		
	}
	public static void DragAndDropElement(WebDriver driver,WebElement source,WebElement target)
	{
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		
	}
	
	public static void NavigateForward(WebDriver driver)
	{
		driver.navigate().forward();
		
	}
	
	public static void selectByValuefromDropDown(WebElement element , String value) 
	{
		
	Select obj=new Select(element);
	obj.selectByValue(value);
		
		
		
	}
	
	
public static void moveToWebElement(WebDriver driver,WebElement element)
{
	
	Actions action=new Actions(driver);
	action.moveToElement(element).build().perform();
	
}

public static void DoubleClickWebElement(WebDriver driver,WebElement element) 
{
	
	Actions action=new Actions(driver);
	action.moveToElement(element).doubleClick().build().perform();
	
	
}
	
	
public static void RightClickWebElement(WebDriver driver,WebElement element)	
{
	Actions action= new Actions(driver);
	action.moveToElement(element).contextClick().build().perform();
	
}
	
public static void  refreshpage(WebDriver driver)	
{
	
	driver.navigate().refresh();
}

public static void clickOnWebElement(WebDriver driver ,WebElement element)
{
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click",element );
	
	
}

public static void Scrollpage(WebDriver driver)
{
	
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("window.scrollBy(0,5000)", " ");
		
	
}

public static boolean isAnElementEnabled(WebElement element)
{
	
	return(element.isEnabled());
	
}

public static boolean isAnElementDisplayed(WebElement element)
{
	
	return(element.isDisplayed());
	
}

public static boolean isAnElementSelected(WebElement element)
{
	
	return(element.isSelected());
	
}

public static void enterKeyPress(WebDriver driver)
{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ENTER);
	action.build().perform();
	
	
}
 public static String getAttributeValue(WebElement element,String attribute)
 {
	 
	 return(element.getAttribute(attribute));
	 
 }

public static String getText(WebElement element)
{
	return(element.getText());
	
	
}

public static void ArrowDownKey(WebDriver driver)
{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ARROW_DOWN);
	action.build().perform();
	
	
}

public static void ArrowUpKey(WebDriver driver)
{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ARROW_UP);
	action.build().perform();
	
	
}

public static void ArrowRightKey(WebDriver driver)
{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ARROW_RIGHT);
	action.build().perform();
	
	
}

public static void ArrowLeftKey(WebDriver driver)
{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ARROW_LEFT);
	action.build().perform();
	
	
}


public static void BackspaceKey(WebDriver driver)
{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.BACK_SPACE);
	action.build().perform();
	
	
}
public static void ShiftKey(WebDriver driver)
{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.SHIFT);
	action.build().perform();
	
	
}



}




























