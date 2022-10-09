import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallbackTest {


        private WebDriver driver;

        @BeforeAll
        static void setUpAll() {
            System.setProperty("webdriver.chrome.driver","driver/mac/chromedriver.exe");
        }

        @BeforeEach
        void setUp() {
            driver = new ChromeDriver();
        }

        @AfterEach
    void tearDown() {
            driver.quit();
            driver = null;
        }
}
