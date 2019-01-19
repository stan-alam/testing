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
