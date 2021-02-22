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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://workbench.xiq.io/login/?next=/digest/campaigns/')

WebUI.setText(findTestObject('Object Repository/Page_LOGIN - WORKBENCH/input_To process the download request, you _d25763'), 
    'ans_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGIN - WORKBENCH/input_To process the download request, you _d402d7'), 
    'h1trQinB+8s4SYEQAoTXlQ==')

WebUI.click(findTestObject('Object Repository/Page_LOGIN - WORKBENCH/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Page_CAMPAIGNS - WORKBENCH/button_CREATE CAMPAIGN                     _8d1015'))

WebUI.setText(findTestObject('Object Repository/Page_CAMPAIGNS - WORKBENCH/input_Campaign Folder Name_campaign_name'), 'Campaign')

WebUI.click(findTestObject('Object Repository/Page_CAMPAIGNS - WORKBENCH/button_CREATE'))

WebUI.setText(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input_Asset Name_asset-name'), 'Hybrid')

WebUI.click(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/label_HYBRID EMAIL'))

WebUI.click(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/button_CREATE'))

WebUI.setText(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), 'Google')

WebUI.sendKeys(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), 'Apple')

WebUI.sendKeys(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), 'Microsoft')

WebUI.sendKeys(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), 'Adobe')

WebUI.sendKeys(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ASSETS - WORKBENCH/button_get content'))

WebUI.click(findTestObject('Object Repository/Page_CAMPAIGN - Hybrid/input_Filter by Trigger Strength_364075124'))

WebUI.click(findTestObject('Object Repository/Page_CAMPAIGN - Hybrid/input_Created with Sketch._364119425'))

WebUI.click(findTestObject('Object Repository/Page_CAMPAIGN - Hybrid/input_Created with Sketch._364054307'))

WebUI.click(findTestObject('Object Repository/Page_CAMPAIGN - Hybrid/a_PUBLISH'))

WebUI.click(findTestObject('Object Repository/Page_CAMPAIGN - Hybrid/a_Created with sketchtool.                 _919c20'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/select_--- Select Sender Email ---         _04449b'), 
    'digest@xiqdigest.com', true)

WebUI.click(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/div_Lists_bootstrap-tagsinput'))

WebUI.click(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/span_ansHere'))

WebUI.setText(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/input'), 'w')

WebUI.click(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/b_wsaleemxiqinc.com'))

WebUI.setText(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/input_Subject_exportemailsubject'), 'Test Email')

WebUI.click(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/label_Compliance'))

WebUI.click(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/button_Send Now'))

WebUI.click(findTestObject('Object Repository/Page_SEND DIGEST  WORKBENCH/button_SEND'))

WebUI.click(findTestObject('Object Repository/Page_VERSIONS - WORKBENCH/span_Draft Hybrid'))

WebUI.click(findTestObject('Object Repository/Page_VERSIONS - WORKBENCH/button_CANCEL'))

