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

WebUI.click(findTestObject('StartQuote'))

WebUI.delay(3)

// Quote Journey General Details 
//WebUI.selectOptionByValue(findTestObject('GeneralInformation/currency'), 'ZAR', false)
WebUI.selectOptionByLabel(findTestObject('GeneralInformation/currency'), 'ZAR', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/SelectBroker'), 'New Broker', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/SelectProduct'), 'BasicDemoProduct', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/PolicyTerm'), 'Monthly', false)

WebUI.delay(3)

WebUI.click(findTestObject('GeneralInformation/PolicyStartDate'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/Policy_Start_Year'), '2019', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/Policy_Start_Month'), 'Feb', false)

WebUI.delay(3)

WebUI.click(findTestObject('GeneralInformation/Policy_Start_Day'))

WebUI.delay(3)

WebUI.click(findTestObject('GeneralInformation/PolicyEndDate'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/Policy_Start_Year'), '2019', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/Policy_Start_Month'), 'Mar', false)

WebUI.delay(3)

WebUI.click(findTestObject('GeneralInformation/Policy_Start_Day'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/GeneralInformation/NextButton'))

WebUI.delay(5)

//Risk Details 
WebUI.selectOptionByLabel(findTestObject('RiskDetails/Page_Markit core new  Risk details/select_Select'), 'StandAlone', 
    false)

WebUI.delay(2)

WebUI.setText(findTestObject('RiskDetails/Page_Markit core new  Risk details/SumInsure'), '1000')

WebUI.delay(2)

WebUI.setText(findTestObject('RiskDetails/Page_Markit core new  Risk details/RoomNo'), '10')

WebUI.setText(findTestObject('RiskDetails/Page_Markit core new  Risk details/ContentSumInsure'), '1000')

WebUI.click(findTestObject('RiskDetails/Page_Markit core new  Risk details/ButtonSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('PremiumPage/PremiumBreakUpButton'))

WebUI.delay(3)

WebUI.getText(findTestObject('PremiumPage/InsurerName'))

WebUI.delay(5)

