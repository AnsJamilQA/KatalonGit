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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://workbench.xiq.io/digest/versions/5311/10479/')

WebUI.click(findTestObject('Page_LOGIN - WORKBENCH/input_To process the download request, you have to login first._username', 
        [('variable') : 'ans_admin']))

WebUI.setText(findTestObject('Page_LOGIN - WORKBENCH/input_To process the download request, you have to login first._username'), 
    'ans_admin')

WebUI.click(findTestObject('Page_LOGIN - WORKBENCH/input_To process the download request, you have to login first._passwd', 
        [('variable') : 'ans_admin']))

WebUI.setText(findTestObject('Page_LOGIN - WORKBENCH/input_To process the download request, you have to login first._passwd'), 
    'ans_isadmin123')

WebUI.click(findTestObject('Page_LOGIN - WORKBENCH/button_LOG IN'))

WebUI.click(findTestObject('Page_VERSIONS - WORKBENCH/svg_( 2 )_svg replaced-svg'))

