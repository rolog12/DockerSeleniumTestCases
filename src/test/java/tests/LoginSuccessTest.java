package tests;

import Pages.Login_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginSuccessTest extends Login_Page {
    protected String RightPassword_Text="SuperSecretPassword!";
    protected String AssertloginSucess_Text="You logged into a secure area!\n" +
            "×";

    @Before
    public void setUp() {
        setUrl();
    }
    @Test
    public void loginToDotDash () {
        sendCredentials(RightPassword_Text);
        assertLogin(AssertloginSucess_Text);
    }
    @After
    public void tearDown() {
        closeAllWindows();
    }
}
