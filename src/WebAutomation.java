import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class WebAutomation {

	public static void main(String[] args) throws FindFailed {
	Screen screen=new Screen();
	Pattern pattern1=new Pattern("C:\\Users\\pravin.dhage\\Desktop\\SikuliImages\\gmail.png");
	Pattern pattern2=new Pattern("C:\\Users\\pravin.dhage\\Desktop\\SikuliImages\\find.png");
	Pattern pattern3=new Pattern("C:\\Users\\pravin.dhage\\Desktop\\SikuliImages\\nextbutton.png");
	System.setProperty("webdriver.firefox.marionette",
			"//Firefox Driver//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.google.com");
	screen.wait(pattern1, 5000);
	screen.click(pattern1);
	screen.wait(pattern1, 5000);
	
	screen.click(pattern2);
	screen.wait(pattern2, 5000);
	screen.click(pattern3);
	//screen.type(pattern3,"vikram.maske@gmail.com");
	}

}
