import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertyFile
{
    public static void main(String[] args) 
    {
        try (OutputStream output = new FileOutputStream("config.properties")) 
        {
            Properties prop = new Properties();
            prop.setProperty("database", "Localhost");
            prop.setProperty("username", "kalaioffl");
            prop.setProperty("password", "Artak");
            prop.store(output, null);
        } 
        catch (IOException exception) 
        {
            exception.printStackTrace();
        } 
 
    }
}