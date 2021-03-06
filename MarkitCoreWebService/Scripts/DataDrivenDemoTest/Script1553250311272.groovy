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

println('..Using Product Code :' + ProductCode)

WS.sendRequest(findTestObject('POST', [('Prod_Name') : ProductCode]))

println('..Using Sum1 :' + Sum_1)

WS.sendRequest(findTestObject('POST', [('Sum1') : Sum_1]))

println('..Using Sum2 :' + Sum_2)

WS.sendRequest(findTestObject('POST', [('Sum2') : Sum_2]))

println('..Using Sum3 :' + Sum_3)

WS.sendRequest(findTestObject('POST', [('Sum3') : Sum_3]))

println('..Using Sum4 :' + Sum_4)

WS.sendRequest(findTestObject('POST', [('Sum4') : Sum_4]))

