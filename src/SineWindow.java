import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SineWindow extends JFrame
{
	private static final long serialVersionUID = 1L;

	public SineWindow()
	{
		intializeUI();
	}

	private void intializeUI()
	{
		setTitle(ConfigBundle.getProperty("WINDOW_TITLE"));
		setSize(Integer.valueOf(ConfigBundle.getProperty("WINDOW_WIDTH")),
				Integer.valueOf(ConfigBundle.getProperty("WINDOW_HEIGHT")));

		initializeMenuBar();

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void initializeMenuBar()
	{
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu(ConfigBundle.getProperty("FILE"));
		file.setMnemonic(KeyEvent.VK_F);
				
		JMenuItem saveButton = menuButtonHelper(ConfigBundle.getProperty("SAVE"),
				   ConfigBundle.getProperty("SAVE_DESC"),
				   KeyEvent.VK_S, "SAVE");
		
		file.add(saveButton);
		
		JMenuItem exitButton = menuButtonHelper(ConfigBundle.getProperty("EXIT"),
											   ConfigBundle.getProperty("EXIT_DESC"),
											   KeyEvent.VK_E, "EXIT");
		
		file.add(exitButton);
		
		
		
		menubar.add(file);

		setJMenuBar(menubar);
	}
	
	private static void prepareActionEvent(JMenuItem jmi, String eventName)
	{		
		switch (eventName)
		{
			case "EXIT" :
				jmi.addActionListener((ActionEvent event) ->
				{
					System.exit(0);
				});
				break;
			
			case "SAVE" :
				jmi.addActionListener((ActionEvent event) ->
				{
					//TODO Add in save capabilities
					System.out.println("DICKUS LICKUS");
				});
				break;
				
			default:
				throw new IllegalArgumentException(MessageBundle.getProperty("UNKNOWN_ACTION"));
				
		}
		
	}
	
	private static JMenuItem menuButtonHelper(String buttonType, String buttonDesc, 
											  int keyCode, String actionName)
	{
		
		JMenuItem jmi = new JMenuItem(buttonType);
		jmi.setMnemonic(keyCode);
		jmi.setToolTipText(buttonDesc);
		prepareActionEvent(jmi, actionName);

		return jmi;
	}
}
