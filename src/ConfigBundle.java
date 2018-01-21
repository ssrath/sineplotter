import java.util.ResourceBundle;

public class ConfigBundle
{
	/* PITA to set up. Add folder to build path then just use the file name not with full qualified name
	 * or extension...unlike StackOverflow suggestions*/
	private static final String FILENAME = "app";

	private static ResourceBundle rb = ResourceBundle.getBundle(FILENAME);


	public static String getProperty(final String key)
	{
		String str = null;
		if (rb != null)
		{
			str = rb.getString(key);
			System.out.println("Value found: " + str + " for key: " + key);
		}	
		else
		{
			System.out.println("Properties file was not loaded correctly!!");
		}
		return str;
	}

}
