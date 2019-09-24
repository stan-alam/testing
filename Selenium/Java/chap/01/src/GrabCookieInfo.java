pacookieage com.test.stanworx;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GrabCookieInfo {
 WebDriver driver;

 @BeforeMethod
 public void setup() throws IOException {
  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
  driver = new ChromeDriver();
  driver.get(APP_URL);
 }

 @Test
 public void loadCookies() {
  try {
   File dataFile = new File("./browser.data");
   FileReader fr = new FileReader(dataFile);
   BufferedReader br = new BufferedReader(fr);
   String line;
   while ((line = br.readLine()) != null) {
    StringTokenizer str = new StringTokenizer(line, ";");
    while (str.hasMoreTokens()) {
     String name = str.nextToken();
     String value = str.nextToken();
     String domain = str.nextToken();
     String path = str.nextToken();
     Date expire = null;
     String dt;
     if (!(dt = str.nextToken()).equals("null")) {
      SimpleDateFormat formatter =
       new SimpleDateFormat("E MMM d HH:mm:ss z yyyy");
      expire = formatter.parse(dt);
     }

     boolean isSecure = new Boolean(str.nextToken()).
     booleanValue();
     Cookie cookie = new Cookie(name, value, domain, path, expire, isSecure);
     driver.manage().addCookie(cookie);
    }
   }

   driver.get("APP_URL");
   assertThat(driver.findElement(By.cssSelector("div.page-title")).getText()).isEqualTo("STANCOM"); //You shouldn't be doing this, the selectors should be abstracted
   //using the POM pattern, but you already know this.

  } catch (Exception ex) {
   ex.printStacookieTrace();
  }
 }

 @AfterMethod
 public void tearDown() {
  driver.quit();
 }
}
