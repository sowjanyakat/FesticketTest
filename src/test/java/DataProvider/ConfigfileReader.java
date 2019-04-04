package DataProvider;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigfileReader {
    private Properties properties;
    private final String propertyFilePath= "Configs\\configfile.properties";


    public ConfigfileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath(){
        String driverPath =System.getProperty("user.dir")+ properties.getProperty("driverPath");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }
    public String getUserName()
    {
        String username=properties.getProperty("username");
        if(username!= null) return username;
        else throw new RuntimeException("username not specified in the Configuration.properties file.");
    }
    public String getPassword()
    {
        String password=properties.getProperty("password");
        if(password!= null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }
    public long getTimeOutValue() {
        String implicitlyWait = properties.getProperty("Time");
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }
    public String getFirstName()
    {
        String firstname=properties.getProperty("firstname");
        if(firstname!= null) return firstname;
        else throw new RuntimeException("firstname not specified in the Configuration.properties file.");
    }
    public String getLastName()
    {
        String lastname=properties.getProperty("lastname");
        if(lastname!= null) return lastname;
        else throw new RuntimeException("lastname not specified in the Configuration.properties file.");
    }
    public String getsearchItem()
    {
        String searchitem=properties.getProperty("searchitem");
        if(searchitem!= null) return searchitem;
        else throw new RuntimeException("searchitem not specified in the Configuration.properties file.");
    }
}
