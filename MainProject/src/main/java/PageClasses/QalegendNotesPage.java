package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QalegendNotesPage {
WebDriver driver;

@FindBy(xpath="//div[@class='title-button-group']/a")
WebElement AddNotesButton;
@FindBy(xpath="//div[@class='col-md-12']/input")
WebElement Titlefield;
@FindBy(xpath="//textarea[@id='description']")
WebElement Descriptionfield;
@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement SaveButton;








public QalegendNotesPage(WebDriver driver) {
	
this.driver=driver;
PageFactory.initElements(driver, this);


}








public void addNotes(String title,String description)
{
	
PageUtilities.clickOnElement(AddNotesButton);
PageUtilities.EnterText(Titlefield, title);
PageUtilities.EnterText(Descriptionfield, description);
PageUtilities.clickOnElement(SaveButton);

}



}
