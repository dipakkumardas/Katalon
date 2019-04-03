package seleniumexcelwriter

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
import org.apache.poi.hssf.usermodel.HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


public class Excelwriter {

	@Keyword
	public void excelwrite(String value)
	{
	FileInputStream file = new FileInputStream("E:\\MarkitCore\\ExcelWriter\\test2.xlsx")
	HSSFWorkbook workbook = new HSSFWorkbook(file)
	HSSFSheet sheet = workbook.getSheetAt(0);
	int noOfColumns = sheet.getRow(0).getLastCellNum()
	//System.out.println(noOfColumns);
	String[] Headers = new String[noOfColumns]
	for (int j=0;j<noOfColumns;j++){
		Headers[j] = sheet.getRow(0).getCell(j).getStringCellValue()
	}
		for (int a=0;a<noOfColumns;a++){
			if(Headers[a].equals("PolicyNo")){
				driver.findElement(By.id("lst-ib")).sendKeys(sheet.getRow(1).getCell(a).getStringCellValue())
				break
				}
}
workbook.close()
file.close()
driver.close()
System.exit(0)
	}
	
		
}

