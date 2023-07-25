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

Mobile.startApplication('/home/pedrosilva/Downloads/courier-debug-3.0.14.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - E-mail de acesso'), 0)

Thread.sleep(2000)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - E-mail de acesso (1)'), 'pedrotestesp@boxdelivery.com.br', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Senha cadastrada'), 0)

Thread.sleep(2000)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Senha cadastrada (1)'), '123456', 0)

Thread.sleep(2000)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - Entrar'), 0)

Thread.sleep(2000)
Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Thread.sleep(2000)
Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Thread.sleep(4000)
Mobile.closeApplication()

