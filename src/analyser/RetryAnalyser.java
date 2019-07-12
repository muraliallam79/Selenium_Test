package analyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryAnalyser implements IRetryAnalyzer,IAnnotationTransformer{

	
	
	int counter = 0;
	int retrylimit = 3;
	
	public boolean retry(ITestResult result) {
		
		if(counter < retrylimit)
		{
			counter++;
			return true;
		}
		return false;
	}

	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		
		annotation.setRetryAnalyzer(RetryAnalyser.class);
		
		
	}
	
	

}
