## Scaling Selenium - Webdriver (Java)

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/Selenium/Java/chap/01/scalesel-0.svg" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/Selenium/Java/chap/01/scalesel-1.svg" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/Selenium/Java/chap/01/scalesel-2.svg" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/Selenium/Java/chap/01/scalesel-2a.svg" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/Selenium/Java/chap/01/scalesel-2b.svg" width="80%" height="80%">
</a>

```Java
public class CreateDriver {

  private static CreateDriver instance = null;
  private String browserHandle = null;
  private static final int IMPLICIT_TIMEOUT = 0;

  private ThreadLocal <WebDriver> webDriver =
    new ThreadLocal<WebDriver>();

  private ThreadLocal<String> sessionId =
    new ThreadLocal<String>();

  private ThreadLocal<String> sessionBrowser =
    new ThreadLocal<String>();

  private ThreadLocal<String> sessionPlatform =
    new ThreadLocal<String>();

  private String getEnv = null;  
}
```
<a>
  <img src="https://github.com/stan-alam/testing/blob/develop/Selenium/Java/chap/01/scalesel-2c.svg" width="80%" height="80%">
</a>
