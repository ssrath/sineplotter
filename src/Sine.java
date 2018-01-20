
/* Sine Plotter Program */
import java.awt.*;

public class Sine
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		{
			SineWindow s = new SineWindow();
			s.setVisible(true);
		});

	}
}
