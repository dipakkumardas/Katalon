import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/BasicDemoProduct/BasicDemoProduct')

suiteProperties.put('name', 'BasicDemoProduct')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\MarkitCore\\Katalon\\MarkitCoreWebService\\Reports\\BasicDemoProduct\\BasicDemoProduct\\20190403_160937\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/BasicDemoProduct/BasicDemoProduct', suiteProperties, [new TestCaseBinding('Test Cases/BasicDemoProduct/BasicDemoProductData - Iteration 1', 'Test Cases/BasicDemoProduct/BasicDemoProductData',  [ 'BuildingSumInsure' : '1000' , 'Type' : 'Flat' , 'NoOfRoom' : '10' , 'ContentSumInsure' : '1000' ,  ]), new TestCaseBinding('Test Cases/BasicDemoProduct/BasicDemoProductData - Iteration 2', 'Test Cases/BasicDemoProduct/BasicDemoProductData',  [ 'BuildingSumInsure' : '2000' , 'Type' : 'StandAlone' , 'NoOfRoom' : '5' , 'ContentSumInsure' : '1500' ,  ]), new TestCaseBinding('Test Cases/BasicDemoProduct/BasicDemoProductData - Iteration 3', 'Test Cases/BasicDemoProduct/BasicDemoProductData',  [ 'BuildingSumInsure' : '3000' , 'Type' : 'Duplex' , 'NoOfRoom' : '4' , 'ContentSumInsure' : '2500' ,  ]), new TestCaseBinding('Test Cases/BasicDemoProduct/BasicDemoProductData - Iteration 4', 'Test Cases/BasicDemoProduct/BasicDemoProductData',  [ 'BuildingSumInsure' : '2000' , 'Type' : 'FirmHouse' , 'NoOfRoom' : '2' , 'ContentSumInsure' : '3000' ,  ])])
