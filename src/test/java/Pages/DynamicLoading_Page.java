package Pages;

import org.openqa.selenium.By;
import wrapper.setWrapper;

import java.awt.*;

public class DynamicLoading_Page extends setWrapper {
    By StartButton_loc= By.xpath("//*[@id=\"start\"]/button");
    By HelloWorld_loc =By.xpath("//div[@id=\"finish\"]/h4");
    String HelloWorld_Text= "Hello World!";

    public void setUrl(){
        chromeDriverSetUp();
        goToURL(Url_DynamicLoading);
    }

    public void startbtnNdAssert (){
        clickonButton(StartButton_loc);
        waitFor(10,HelloWorld_loc);
        myassertValidation("Hello World!",
              getTextFromLocator(HelloWorld_loc),1);
    }
}
