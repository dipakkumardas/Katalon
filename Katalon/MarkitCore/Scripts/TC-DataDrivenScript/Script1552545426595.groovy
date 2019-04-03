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
import com.kms.katalon.core.annotation.SetUp as SetUp
import com.kms.katalon.core.annotation.TearDown as TearDown
import com.kms.katalon.core.annotation.TearDownIfError
import com.kms.katalon.core.annotation.TearDownIfFailed
import com.kms.katalon.core.annotation.TearDownIfPassed



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

WebUI.waitForJQueryLoad(5)

not_run: TestData exceldata = findTestData('Data Files/Quote')

not_run: WebUI.selectOptionByLabel(findTestObject('GeneralInformation/currency'), var_currency, false)

not_run: WebUI.deselectOptionByLabel(findTestObject('GeneralInformation/currency'), exceldata.getValue(Currency, 2), false)

@SetUp
void SetUpMethod() {
    CustomKeywords.'helper.login.Login.loginDetails'()

    System.out.println('[------------This is the setup Method-------------')
}

@TearDown
void TearDown() {
    System.out.println('[------------This is the Tear Down Method-------------')
	CustomKeywords.'helper.logout.Logout.LogoutDetails'()
}


