package com;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	// 10 9 8 7 ....... -7 -8 -9 -10
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test failed but is within success percentage: "
            + result.getName()
        );
    }
}
