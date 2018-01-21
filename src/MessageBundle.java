import java.util.ResourceBundle;

public class MessageBundle
{
	private static final String FILENAME = "messages";

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
