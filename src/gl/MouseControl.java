package gl;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class MouseControl {

	public static void main(String[] args) {
		try {
			 
            Robot robot = new Robot();
            robot.mouseMove(600, 500);
            
            TimeUnit.SECONDS.sleep(1);
            
            robot.mousePress(InputEvent.BUTTON3_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_MASK);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
