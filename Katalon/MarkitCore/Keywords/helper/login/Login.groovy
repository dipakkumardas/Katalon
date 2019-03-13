package helper.login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Login {

	@Keyword
	public void loginDetails() {
		WebUI.openBrowser('https://dev.markit-systems.com/markit_coreV2/Sites/CoreTest/login/admin_display')

		WebUI.maximizeWindow()

		WebUI.waitForPageLoad(4)

		WebUI.setText(findTestObject('Username'), 'dDasTester')

		WebUI.waitForPageLoad(4)

		WebUI.setText(findTestObject('Password'), 'Czybm6R*')

		WebUI.delay(5)

		WebUI.waitForElementClickable(findTestObject('LoginButton'), 5)

		WebUI.click(findTestObject('LoginButton'))
	}
}
