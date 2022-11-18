package Pages;

import org.openqa.selenium.By;
import wrapper.setWrapper;

public class iFramePage extends setWrapper {
   By iFrame_loc= By.id("mce_0_ifr");
   By textBox_loc=By.xpath("//*[@id=\"tinymce\"]/p");
   By CloseMsg_loc=By.xpath("//button/div[@aria-label='Close']");//div[@aria-label='Close']
   protected String TextSent="This is my Test";
   public void setURL(){
      chromeDriverSetUp();
      goToURL(Url_iFrame);
   }
   public void switchToFrameNdwrite (){
      waitFor(3,iFrame_loc);
      switchotherFrame(webelement_meth(iFrame_loc));
      webelement_meth(textBox_loc).clear();
     // waitFor(5,CloseMsg_loc);
//      clickonButton(CloseMsg_loc);
      sendkeys(textBox_loc,"This is my Test");
      myassertValidation(TextSent,getTextFromLocator(textBox_loc),1);
   }
}
