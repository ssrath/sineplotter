import javax.swing.JFrame;
import java.util.ResourceBundle;

public class SineWindow extends JFrame
{
//	private static final long serialVersionUID = 1L;
//	private static final int WINDOW_HEIGHT = ResourceBundle.getBundle(WINDOW_HEIGHT);
//	private static final int WINDOW_WIDTH = 1000;
	//private static final String WINDOW_TITLE = "Sine Plotter";

	private static final String APP = "res/app.properties";

	
	public SineWindow()
	{
		intializeUI();
	}

	private void intializeUI()
	{
		ProjectBundle pb = new ProjectBundle();

		setTitle(pb.getProperty("WINDOW_TITLE"));
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
