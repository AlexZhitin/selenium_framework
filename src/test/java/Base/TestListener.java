package Base;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends TestBase implements ITestListener {


    public void onStart(ITestContext context) {
        System.out.println(context.getName() + " started ***");
    }

    public void onFinish(ITestContext context) {

        System.out.println((context.getName() + " ending ***"));
        ExtentTestManager.endTest();
        ExtentManager.getInstance().flush();
    }

    public void onTestStart(ITestResult result) {
        System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
        ExtentTestManager.startTestMethod(result.getMethod().getMethodName(), result.getTestContext().getCurrentXmlTest().getName());

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("*** Executed " + result.getMethod().getMethodName() + " test method successfully...");
        String testClassName = " Test class: " + result.getMethod().getRealClass().getName();
        ExtentTestManager.getTest().log(Status.PASS, "Test passed").log(Status.INFO, testClassName);
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("*** Execution of a test method" + result.getMethod().getMethodName() + " of a test class " + result.getMethod().getRealClass().getName() + " failed...");
        String testClassName = " Test class: " + result.getMethod().getRealClass().getName();

        //Get driver from BaseTest and assign to local webDriver variable.
        Object testClass = result.getInstance();
        WebDriver webDriver = ((TestBase) testClass).getDriver();

        //Take base64Screenshot screenshot.
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) webDriver).
                getScreenshotAs(OutputType.BASE64);

        //ExtentReports log and screenshot operations for failed tests.
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed").addScreenCaptureFromBase64String(base64Screenshot).log(Status.INFO, testClassName);
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("*** Tests " + result.getMethod().getMethodName() + " skipped...");
        String testClassName = " Test class: " + result.getMethod().getRealClass().getName();
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped").log(Status.INFO, testClassName);
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("*** Tests failed but within percentage % " + result.getMethod().getMethodName());
    }

}