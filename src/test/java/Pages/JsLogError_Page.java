package Pages;

import wrapper.setWrapper;

public class JsLogError_Page extends setWrapper {

    public void setUrl(){
        chromeDriverSetUp();
        goToURL(Url_javascripError);
    }

    public void handleJsErrorLogs(){
        getAvailableLogType();
        findJsErrorLogEntry();
    }
}
