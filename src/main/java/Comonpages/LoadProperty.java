package Comonpages;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    static String filecollection="C:\\Users\\heman\\IdeaProjects\\HYbridFramework\\src\\test\\resources\\Testdata\\Config.properties";

    public String getProperty(String keyName){
        prop = new Properties();
        try {
            input = new FileInputStream(filecollection);
            prop.load(input);
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }
}
