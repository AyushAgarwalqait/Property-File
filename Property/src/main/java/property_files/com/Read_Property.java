package property_files.com;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;

public class Read_Property 
{
    public static void main( String[] args ) throws IOException
    {  
       FileReader file = new FileReader("src/main/resources/config.properties");
       Properties prop = new Properties();
       prop.load(file);
       System.out.println(prop.get("username"));
       System.out.println(prop.getProperty("username"));
       System.out.println(prop.getProperty("password"));
       System.out.println(prop.getProperty("Browser"));
       
    }
}
