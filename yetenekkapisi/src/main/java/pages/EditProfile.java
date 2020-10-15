package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EditProfile {
	private WebDriver driver;
	private By nameField=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[1]/div/div/input");
	private By surnameField=By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[2]/div/div/input");
	
	public EditProfile(WebDriver driver) {
    	this.driver=driver;
    	
    }
	public void SetName(String name)
	{
		cleartextbox("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[1]/div/div/input");
		driver.findElement(nameField).sendKeys(name);
	}
    public void SetSurname(String Surname)
    {
    	cleartextbox("//*[@id=\"root\"]/div[1]/div/div/main/div/div[2]/div/div/div[1]/div/div/div[1]/form/div[2]/div/div/input");
    	driver.findElement(surnameField).sendKeys(Surname);
    	
    }
    
    // before sendkeys textbox should clean
    private void cleartextbox(String path)
    {
    	driver.findElement(By.xpath(path)).sendKeys(Keys.CONTROL, Keys.chord("a"),(Keys.BACK_SPACE)); //select all text in textbox and delete it
		
    }

    
    
     }
