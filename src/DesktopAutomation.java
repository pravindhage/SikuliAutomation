import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class DesktopAutomation {

	public static void main(String[] args) throws FindFailed {
		Screen screen=new Screen();
		Pattern pattern=new Pattern("C:\\Users\\pravin.dhage\\Desktop\\SikuliImages\\sikuliimages.png");
		screen.rightClick(pattern);
		
	}

}
