import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.google.common.collect.FilteredEntryMultimap.Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('ClientSearch'), 10)

WebUI.click(findTestObject('ClientSearch'))

WebUI.waitForJQueryLoad(5)

WebUI.sendKeys(findTestObject('SearchText'), 'Dipak')

WebUI.waitForJQueryLoad(4)

WebUI.sendKeys(findTestObject('SearchText'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('ClientListingAction'), 5)

WebUI.click(findTestObject('ClientListingAction'))

WebUI.delay(5)

