package vpngate;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Main implements WebDriver {

	static void run() {
		WebDriverManager.edgedriver().setup();
		driver.get("https://www.vpngate.net/en/");
		Random random = new Random();
		int rand = random.nextInt(110);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table[3]/tbody/tr[" + String.valueOf(rand) + "]/td[7]/a/b")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/ul[2]/li[2]/a/strong")));
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/ul[2]/li[2]/a/strong")).click();
		driver.quit();
	}

	public static void main(String[] args) {
		run();
	}
}