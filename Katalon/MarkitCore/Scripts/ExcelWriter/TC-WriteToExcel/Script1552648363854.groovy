import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://dev.markit-systems.com/markit_coreV2/Sites/CoreTest/login/admin_display')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(4)

WebUI.setText(findTestObject('Username'), 'dDasTester')

WebUI.delay(2)

WebUI.setText(findTestObject('Password'), 'Czybm6R*')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LoginButton'))

WebUI.delay(3)

not_run: WebUI.waitForElementClickable(findTestObject('ClientSearch'), 10)

not_run: WebUI.click(findTestObject('ClientSearch'))

not_run: WebUI.delay(5)

not_run: WebUI.sendKeys(findTestObject('SearchText'), 'Dipak')

not_run: WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject('SearchText'), Keys.chord(Keys.ENTER))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementClickable(findTestObject('ClientListingAction'), 5)

not_run: WebUI.click(findTestObject('ClientListingAction'))

ui_variable = WebUI.getAttribute(findTestObject('SearchText'), 'value')

WebUI.callTestCase(findTestCase('ClientSearch'), [('ClientName') : ''], FailureHandling.STOP_ON_FAILURE)

System.out.println(ui_variable)

WebUI.delay(5)

CustomKeywords.'com.helper.excel.ExcelHelper.writeTOExcelFile'('E:\\MarkitCore\\ExcelWriter\\test.xlsx', 'TestData', ui_variable, 
    1, 1)

WebUI.delay(2)

