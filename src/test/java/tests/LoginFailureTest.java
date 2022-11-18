package tests;

import Pages.Login_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginFailureTest extends Login_Page {
    protected String WrongPassword_Text="WrongPassword";

    By loginWrongMessage_IdLoc=By.id("flash"); //*[@id="flash"]
    protected String AssertloginFailed_Text="Your password is invalid!\n" +
            "×";
    @Before
    public void setUp() {
        setUrl();
    }
    @Test
    public void failedloginToDotDash () {
        sendCredentials(WrongPassword_Text);
        assertLogin(AssertloginFailed_Text);
    }
    @After
    public void tearDown() {
       closeAllWindows();
    }
}
