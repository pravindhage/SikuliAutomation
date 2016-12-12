import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Sikulidownload {

	public static void main(String[] args) throws FindFailed {
		Screen screen=new Screen();
		Pattern pattern=new Pattern("C:\\Users\\pravin.dhage\\Desktop\\SikuliImages\\save.png");
		System.setProperty("webdriver.firefox.marionette",
				"//Firefox Driver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.cssSelector("#menu_download>a")).click();
		driver.findElement(By.linkText("3.0.1")).click();
		screen.click(pattern);
		
	}

}
