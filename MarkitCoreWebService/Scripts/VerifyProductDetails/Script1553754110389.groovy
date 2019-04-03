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

WS.sendRequest(findTestObject('POST', [('Prod_Name') : findTestData('ProductDetails').getValue(1, 1), ('Sum1') : findTestData(
                'ProductDetails').getValue(2, 1), ('Sum2') : findTestData('ProductDetails').getValue(3, 1), ('Sum3') : findTestData(
                'ProductDetails').getValue(4, 1), ('Sum4') : findTestData('ProductDetails').getValue(5, 1)]))

response = WS.sendRequestAndVerify(findTestObject('POST', [('Prod_Name') : findTestData('ProductDetails').getValue(1, 1)
            , ('Sum1') : findTestData('ProductDetails').getValue(2, 1), ('Sum2') : findTestData('ProductDetails').getValue(
                3, 1), ('Sum3') : findTestData('ProductDetails').getValue(4, 1), ('Sum4') : findTestData('ProductDetails').getValue(
                5, 1)]))

WS.verifyElementPropertyValue(response, '1.138.contractInfo[0].holdingBreakup[0].entityBreakup[0].entityCode', 'rajibBroker')

