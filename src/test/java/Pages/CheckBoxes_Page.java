package Pages;

import org.openqa.selenium.By;
import wrapper.setWrapper;

public class CheckBoxes_Page extends setWrapper {

    By checkBox_loc1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
    By checkBox_loc2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");

    public void setUrl(){
        chromeDriverSetUp();
        goToURL(Url_CheckBox);
    }

    public void chooseCheckBoxes (){
    clickonButton(checkBox_loc1);
    clickonButton(checkBox_loc2);
    }
    public void assertCheckBox(){
        System.out.println(webelement_meth(checkBox_loc1).isSelected());
        myassertValidation("true",String.valueOf(webelement_meth(checkBox_loc1).isSelected()),1);
        myassertValidation("false",String.valueOf(webelement_meth(checkBox_loc2).isSelected()),1);
    }
}
