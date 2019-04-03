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
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent


//POST object
def request = (RequestObject)findTestObject('POST')

String body = '{"productCode":"Prod_Code","productVersion":"1","coverTypeCode":"WIS","coverVersion":"1","coverVersionId":"175","policyStartDate":"2019-03-08 12:01:00","transactionType":"NB","policyEndDate":"2019-03-14 10:30:59","questionSetBaGroupWise":{"WI":{"questionSet":{"Cho1":[{"Sum1":"1200","Sum2":"1001","Sum3":"2300","Sum4":"3333"}]},"prevHoldingBreakup":[{"insurerEntityCode":"IPINs","riskCode":"riskcode Content","contractCode":"IB","contractVersion":"1","sectionCode":"cc","entityBreakup":[{"entityCode":"rajibBroker","commissionValue":"120.0100"},{"entityCode":"RMGA123","commissionValue":"24.0020"},{"entityCode":"IPINs","commissionValue":"1032.0860"}],"feeBreakup":[{"feeCode":"LBF","feeValue":"12.0010"},{"feeCode":"BF","feeValue":"12.0010"}]}],"bindingAuthorityContract":[{"contractCode":"IB","coverholderCode":"RMGA123","endorsement_no":"1","sectionCode":"cc","placingOrder":"100","sectionDetails":{"riskCodesSplit":{"riskcode Content":"100.00"},"holdingSplit":[{"insurerEntityCode":"IPINs","riskCode":"riskcode Content","holdingPercentage":"100.0000","binderFeeIsPercentageOrFlat":"1","binderFee":"1.00","londonBrokerFeeIsPercentageOrFlat":"1","londonBrokerFee":"1.00","commissionIsPercentageOrFlat":"1","commission":"12.00"}]}}]}},"tobaContract":{"brokerageDetails":[{"entityCode":"rajibBroker","isFlatOrPerc":"1","entityCommissionValue":"15.00","isGwpOrTotalBrokerage":"1"}]},"countryCode":"IN","taxRateDetails":[{"tax_id":"1","tax_short_code":"VAT","tax_version_id":"1","version_no":"1","status":"3","tax_name":"vat","tax_details":"vat","rate_percentage":"14.00","flat_rate":"0.00","flat_rate_currancy":"4","is_allowance":"0","full_on_inception":"No","paid_to":"1","paid_by":"2","tax_applicable_on":"1","applicable_date":"2018-09-26","endorsement_based_on":"2","endorsement_mta_date":"2019-01-02","reason":"","date_added":"2018-09-26 14:51:38","date_updated":"2019-01-08 07:25:33","administeredBy":"1"}]}'

request.setBodyContent(new HttpTextBodyContent (body,"UTF-8","application/json"))
WS.sendRequest(request)