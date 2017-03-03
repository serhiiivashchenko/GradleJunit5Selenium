import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by sergey on 03.03.17
 */
public class SeleniumSimpleTest {
    private static final String URL = "https://ivashchenko.info";
    private WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        ChromeDriverManager.getInstance().version("2.27").setup();
    }

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void simpleSeleniumTestSerg() {
        driver.get(URL);
        Assertions.assertTrue(driver.findElement(By.id("site-title")).getText().equalsIgnoreCase("ivashchenko.info"), "Site tile is incorrect");
        System.out.println("THE END");
    }
}
