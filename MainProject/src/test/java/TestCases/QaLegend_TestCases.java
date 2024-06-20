package TestCases;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;

public class QaLegend_TestCases extends BaseClass {

WebDriver driver;
Properties props;
FileReader reader;
@BeforeMethod
public void intialization()throws Exception
{
		driver= browserIntialization("Chrome");
		driver.manage().window().maximize();
		props=new Properties();
		reader=new FileReader("D:\\MainProject\\src\\main\\resources\\TestData\\TestData.properties");
		props.load(reader);
		driver.get(props.getProperty("url"));
		
}
@Test
public void addEditNotes()
{
System.out.println("Testcase1");	
	
	
}

















}
