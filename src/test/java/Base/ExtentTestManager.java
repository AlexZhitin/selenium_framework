package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {

  static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
  static ExtentReports extent = ExtentManager.getInstance();

  public static synchronized ExtentTest getTest() {
    return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
  }

  public static synchronized void endTest() {
    extent.flush();
  }

  public static synchronized ExtentTest startTestMethod(String testMethod, String testName) {
    ExtentTest test = extent.createTest(testMethod).assignCategory(testName);
    extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
    return test;
  }
}
