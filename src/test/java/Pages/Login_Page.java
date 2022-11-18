package Pages;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import wrapper.setWrapper;

public class Login_Page extends setWrapper {

    //protected String loginUrl="http://localhost:7080/login";
    protected String userName_Text="tomsmith";
    By MessageAfterLogin_IdLoc=By.id("flash");

    By user_loc =By.id("username");
    By pwd =By.id("password");
    By loginBtn = By.xpath("//*[@id=\"login\"]/button/i");
    public void setUrl(){
    chromeDriverSetUp();
    goToURL(Url_Login);
    }

    public void sendCredentials (String password){
    waitFor(7,user_loc);
    sendkeys(user_loc,userName_Text);
    sendkeys(pwd,password);
    clickonButton(loginBtn);
    }
    public void assertLogin (String loginMessage_text ){
        waitFor(10,MessageAfterLogin_IdLoc);
        myassertValidation(loginMessage_text,getTextFromLocator(MessageAfterLogin_IdLoc),1);
    }
}
