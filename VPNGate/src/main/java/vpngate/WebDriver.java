package vpngate;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface WebDriver {
	static EdgeDriver driver = new EdgeDriver();
	static WebDriverWait wait = new WebDriverWait(driver, 5);
}
