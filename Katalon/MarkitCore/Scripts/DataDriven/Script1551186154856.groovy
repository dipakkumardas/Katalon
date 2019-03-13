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

WebUI.waitForPageLoad(4)

WebUI.setText(findTestObject('Password'), 'Czybm6R*')

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('LoginButton'), 5)

WebUI.click(findTestObject('LoginButton'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('ClientSearch'), [('ClientName') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('StartQuote'), [('Currency') : '', ('BrokerName') : '', ('IntroducerName') : '', ('ProductName') : ''
        , ('Term') : '', ('BuildingSumInsure') : '', ('NoofRoom') : '', ('ContentSumInsure') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Logout'))

WebUI.delay(4)

