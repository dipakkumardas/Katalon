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


suiteProperties.put('id', 'Test Suites/BuyProcess')

suiteProperties.put('name', 'BuyProcess')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\MarkitCore\\Katalon\\Katalon\\MarkitCore\\Reports\\BuyProcess\\20190313_182907\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/BuyProcess', suiteProperties, [new TestCaseBinding('Test Cases/Login', 'Test Cases/Login',  null), new TestCaseBinding('Test Cases/ClientSearch', 'Test Cases/ClientSearch',  [ 'ClientName' : 'Dipak' ,  ]), new TestCaseBinding('Test Cases/StartQuote', 'Test Cases/StartQuote',  [ 'BuildingSumInsure' : '4000' , 'ProductName' : 'BasicDemoProduct' , 'BrokerName' : 'New Broker' , 'Term' : 'Yearly' , 'var_buildingtype' : 'Flat' , 'NoofRoom' : '3' , 'IntroducerName' : 'Select Introducer      ' , 'ContentSumInsure' : '5000' , 'var_currency' : 'USD' ,  ])])