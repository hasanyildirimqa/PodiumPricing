package Podium.Utils;

import java.util.concurrent.TimeUnit;

public class BrowserUtils extends Driver {

    public static void staticWait(int second){
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void implicitlyWait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



}
