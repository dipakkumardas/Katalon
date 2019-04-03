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


suiteProperties.put('id', 'Test Suites/DataDrivenDemo')

suiteProperties.put('name', 'DataDrivenDemo')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\MarkitCore\\Katalon\\MarkitCoreWebService\\Reports\\DataDrivenDemo\\20190325_140832\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/DataDrivenDemo', suiteProperties, [new TestCaseBinding('Test Cases/DataDrivenDemoTest - Iteration 1', 'Test Cases/DataDrivenDemoTest',  [ 'Sum_4' : '3333' , 'Sum_3' : '2300' , 'Sum_2' : '1001' , 'Sum_1' : '1200' , 'ProductCode' : 'WSI' ,  ]), new TestCaseBinding('Test Cases/DataDrivenDemoTest - Iteration 2', 'Test Cases/DataDrivenDemoTest',  [ 'Sum_4' : '4000' , 'Sum_3' : '3000' , 'Sum_2' : '2000' , 'Sum_1' : '1500' , 'ProductCode' : 'WSI' ,  ])])
