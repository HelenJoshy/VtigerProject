package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ListenersClass implements ITestListener {

	ExtentReports report;
	ExtentTest test;

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("----Execution Finished----");
		report.flush();
	}

	@Override
	public void onStart(ITestContext context) {

		Reporter.log("----Execution Started----");
		report = new ExtentReports("./Reports/extentReport_Vtiger.html");

		report.addSystemInfo("OS", "Windows 11");
		report.addSystemInfo("browser", "edge");
		report.addSystemInfo("User Name", "Helen Tissa Joshy");
		report.addSystemInfo("Project Name", "Vtiger");
		report.addSystemInfo("BaseURL", "http://localhost:8888/");
		report.addSystemInfo("username", "admin");
		report.addSystemInfo("password", "admin");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
	Reporter.log(methodName + "testcase Failed");
		Reporter.log(result.getThrowable().toString());
		GenericUtilities gu = new GenericUtilities();
		String path = "C:\\Users\\Administrator\\eclipse-workspace\\testing\\Vtiger\\src\\test\\resources\\defectimages\\Vtiger_"
				+ methodName + "_" + gu.currentDate() + ".jpg";
		test.log(LogStatus.FAIL, test.addScreenCapture(gu.CaptureScreenshot(BaseClass.sdriver,path))+" Failed");
		
		report.endTest(test);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
//		Reporter.log(methodName + "testcase Skipped");
//		Reporter.log(result.getThrowable().toString());
		test.log(LogStatus.SKIP, methodName+" skipped");
		report.endTest(test);
	
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "testcase Started");
		test = report.startTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
//		Reporter.log(methodName + "testcase passed");
		test.log(LogStatus.PASS, methodName+" Passed");
		
		report.endTest(test);
	}

}
