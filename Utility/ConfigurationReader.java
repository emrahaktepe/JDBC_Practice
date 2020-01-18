package Utility;

import java.util.Properties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {
    
     private static Properties configFile;
        static {
            try {
           
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
           
            configFile = new Properties();
            configFile.load(fileInputStream);
                
                fileInputStream.close();
            } catch (IOException e) {
            }
        }
        
        public static String getProperty(String key) {
            return configFile.getProperty(key);
        }
        
}


