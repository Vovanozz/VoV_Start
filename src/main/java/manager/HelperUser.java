package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Type;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginRegistrationForm(){
//click(By.xpath("//a[normalize-space()='LOGIN']"));
        click(By.cssSelector("a:last-child"));

    }
    public void fillLoginRegistrationForm(String email,String password){
    type(By.cssSelector("input[placeholder='Email']"),email);
    type(By.cssSelector("input[placeholder='Password']"),password);

    }
    public void submitLogin(){
        click(By.cssSelector("button[name='login']"));


    }
}
