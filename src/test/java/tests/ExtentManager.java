package tests;

import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;

/**
 * Created by Rus on 23.01.2017.
 */
public class ExtentManager {
    public static ExtentReports extentReports;

    final static String filePath = "D:\\Selenium group\\KateSpade\\target\\MyReport\\MyReport.html";

    public synchronized static ExtentReports getReporter(String filePath) {
        if (extentReports == null) {
            extentReports = new ExtentReports(filePath,true);
            extentReports.loadConfig(new File("D:\\Selenium group\\KateSpade\\extent-config.xml"));
            extentReports
                    .addSystemInfo("Host Name", "GRus")
                    .addSystemInfo("Environment", "DEV01");

        }

        return extentReports;
    }


}
