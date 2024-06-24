package TestCases;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.QaLegendLoginPage;
import PageClasses.QalegendDashboard;
import PageClasses.QalegendNotesPage;

public class QaLegend_TestCases extends BaseClass {

WebDriver driver;
Properties props;
FileReader reader;
QaLegendLoginPage loginpage;
String path="";
QalegendDashboard dashboard;
QalegendNotesPage notespage;
@BeforeMethod
public void intialization()throws Exception
{
		driver= browserIntialization("Chrome");
		loginpage=new QaLegendLoginPage(driver);
		dashboard=new QalegendDashboard(driver);
		notespage=new QalegendNotesPage(driver);
		driver.manage().window().maximize();
		props=new Properties();
		path=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\TestData.properties";
		reader=new FileReader(path);
		props.load(reader);
		driver.get(props.getProperty("url"));
		
}
@Test
public void addEditNotes()
{
System.out.println("Testcase1");	
loginpage.LoginIntoQaLegend(props.getProperty("username"),props.getProperty("Password") );	
dashboard.clickonnotesoption();
notespage.addNotes(props.getProperty("Notestitle"),props.getProperty("Description"));
}

















}
