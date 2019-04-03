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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

int i = 1

WebUI.click(findTestObject('StartQuote'))

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/currency'), var_currency, false)

WebUI.delay(5)

WebUI.click(findTestObject('GeneralInformation/SelectBroker'))

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/SelectBroker'), BrokerName, false)

WebUI.delay(5)

WebUI.click(findTestObject('GeneralInformation/SelectProduct'))

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/SelectProduct'), ProductName, false)

WebUI.waitForJQueryLoad(5)

not_run: WebUI.delay(3)

WebUI.click(findTestObject('GeneralInformation/PolicyTerm'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('GeneralInformation/PolicyTerm'), Term, false)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('GeneralInformation/PolicyStartDate'))

WebUI.click(findTestObject('GeneralInformation/Policy_Start_Year'))

WebUI.click(findTestObject('GeneralInformation/Policy_Start_Month'))

WebUI.click(findTestObject('GeneralInformation/Policy_Start_Month'))

WebUI.delay(4)

WebUI.click(findTestObject('GeneralInformation/NextButton'))

WebUI.delay(3)

if (var_cancelAlertCondition.equals('cancel')) {
    WebUI.click(findTestObject('GeneralInformation/CancelAlert'))

    WebUI.delay(4)

    WebUI.waitForElementVisible(findTestObject('RiskDetails/Page_Markit core new  Risk details/General_Info_Risk_Details'), 
        5)

    WebUI.delay(2)

    WebUI.selectOptionByLabel(findTestObject('RiskDetails/Page_Markit core new  Risk details/SelectType'), var_buildingtype, 
        false)

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('RiskDetails/Page_Markit core new  Risk details/SumInsure'), BuildingSumInsure, FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('RiskDetails/Page_Markit core new  Risk details/RoomNo'), NoofRoom)

    WebUI.sendKeys(findTestObject('RiskDetails/Page_Markit core new  Risk details/ContentSumInsure'), ContentSumInsure)

    WebUI.delay(2)

    WebUI.click(findTestObject('RiskDetails/Page_Markit core new  Risk details/ButtonSubmit'))
} else {
    WebUI.click(findTestObject('GeneralInformation/AcceptAlert'))

    WebUI.getText(findTestObject('PremiumPage/Total'))

    WebUI.delay(4)
}

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('PremiumPage/Bind'))

WebUI.delay(10)

WebUI.click(findTestObject('PaymentDetails/PaymentMethods'))

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('PaymentDetails/SelectInstallment'), '1', false)

WebUI.scrollToElement(findTestObject('PaymentDetails/ConfirmPaymentType'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('PaymentDetails/ConfirmPaymentType'))

WebUI.scrollToElement(findTestObject('PaymentDetails/BindAndSendPolicySchedule'), 5)

WebUI.delay(4)

WebUI.click(findTestObject('PaymentDetails/BindAndSendPolicySchedule'))

var_policyno = WebUI.getText(findTestObject('PremiumPage/PolicyNo'))

Confirmmsg = WebUI.getText(findTestObject('PaymentDetails/ConfirmationMessage'))

WebUI.callTestCase(findTestCase('ClientSearch'), [('ClientName') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: log.logInfo(PolicyNo)

not_run: log.logInfo(Confirmmsg)

not_run: WebUI.delay(2)

not_run: CustomKeywords.'com.helper.excel2.excelwrite.WriteExcel'(GlobalVariable.PolicyNo)

CustomKeywords.'com.helper.excel.ExcelHelper.writeTOExcelFile'('E:\\MarkitCore\\ExcelWriter\\test.xlsx', 'TestData', var_policyno, 
    i, 1)

not_run: CustomKeywords.'com.helper.excel2.excelwrite.WriteExcel'()

i++

WebUI.delay(5)

