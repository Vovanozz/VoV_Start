package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void LoginSuccess(){
    app.getHelperUser() .openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("vladimirozz@gmail.com","Vova1234$");
    app.getHelperUser().submitLogin();


    }
    @Test
    public void LoginWrongEmail(){


    }
    @Test
    public void LoginWrongPassword(){


    }
    @Test
    public void LoginUnregisterUser(){

    }
}
