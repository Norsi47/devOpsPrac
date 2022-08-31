package devOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DevOpsPrac {
    public static void main(String[] args) {

        System.out.println("Howdie");
        //to test selenium
        // the \\chromedriver.exe was manually put in at the end
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NorsiTheGreat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        //to remove cookies in browser
        webDriver.manage().deleteAllCookies();
        //allow webpage open ope in full screen mode
        webDriver.manage().window().fullscreen();
        //pulls in webpage
        webDriver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjUtr_68e_5AhXAq4kEHcr8DE8QPAgI");
        webDriver.findElement(By.className("MV3Tnb"));
        //timing to wait
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.quit();

    }
}
