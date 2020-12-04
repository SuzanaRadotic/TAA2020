package com.taa;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ReporterTestException implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        String className = extensionContext.getTestClass().get().getName();
        String methodName = extensionContext.getTestMethod().get().getName();
        System.out.println("Test " + methodName + "from " + className + " finished executing.");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        String className = extensionContext.getTestClass().get().getName();
        String methodName = extensionContext.getTestMethod().get().getName();
        System.out.println("Test " + methodName + "from " + className + " started executing.");
    }
}
