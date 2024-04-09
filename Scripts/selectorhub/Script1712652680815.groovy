import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://selectorshub.com/xpath-practice-page/')

WebUI.setText(findTestObject('Object Repository/selector hub/Page_Xpath Practice Page  Shadow dom, neste_c4f084/input_User Email_email'), 
    'asd')

WebUI.setEncryptedText(findTestObject('Object Repository/selector hub/Page_Xpath Practice Page  Shadow dom, neste_c4f084/input_Password_Password'), 
    'tzH6RvlfSTg=')

WebUI.setText(findTestObject('Object Repository/selector hub/Page_Xpath Practice Page  Shadow dom, neste_c4f084/input_Company_company'), 
    'aaa')

WebUI.setText(findTestObject('Object Repository/selector hub/Page_Xpath Practice Page  Shadow dom, neste_c4f084/input_Mobile Number_mobile number'), 
    '123')

WebUI.click(findTestObject('Object Repository/selector hub/Page_Xpath Practice Page  Shadow dom, neste_c4f084/button_Submit'))

WebUI.takeScreenshotAsCheckpoint('insert data')

WebUI.closeBrowser()

