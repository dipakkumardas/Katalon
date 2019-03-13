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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'helper.login.Login.loginDetails'()

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('ClientSearch'), 10)

WebUI.click(findTestObject('ClientSearch'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('SearchText'), 'Dipak')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('SearchText'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('ClientListingAction'), 5)

WebUI.click(findTestObject('ClientListingAction'))

WebUI.delay(5)

WebUI.click(findTestObject('StartQuote'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementVisible(findTestObject('GeneralInformation/GeneralInfoHeading'), 10)

not_run: WebUI.click(findTestObject('GeneralInformation/currency'))

WebUI.click(findTestObject('GeneralInformation/currency'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/currency', [('variable') : var_currency]), var_currency, false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/GeneralInformation/SelectBroker'), var_brokername, false)

WebUI.delay(2)

WebUI.waitForPageLoad(10)

not_run: WebUI.scrollToElement(findTestObject('GeneralInformation/SelectProduct'), 3)

WebUI.click(findTestObject('GeneralInformation/SelectProduct'))

WebUI.delay(3)

not_run: WebUI.waitForElementClickable(findTestObject('GeneralInformation/SelectProduct'), 5)

WebUI.click(findTestObject('GeneralInformation/SelectProduct'))

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/SelectProduct'), var_productname, false)

WebUI.waitForPageLoad(10)

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/GeneralInformation/PolicyTerm'), var_policyterm, false)

WebUI.delay(5)

