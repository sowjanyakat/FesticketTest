package Support;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Waits extends Driver {


    public static void waitUntilTitledisplay(String ele,int time)
    {

        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.titleIs(ele));

    }
    public static void waitUntilTextPresent( By element,String value,int time)
    {
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(element,value));
    }

    public static void waitUntilElementLocated(By element,int timeout )
    {
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));

    }
    public static void waitUntilElementToBeClickable(By element, int time){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}

