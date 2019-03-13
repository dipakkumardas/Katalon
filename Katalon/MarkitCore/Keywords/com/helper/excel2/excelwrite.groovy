package com.helper.excel2

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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String

import internal.GlobalVariable

public class excelwrite {

	@Keyword
	public void WriteExcel() {
		FileInputStream file = new FileInputStream (new File("E:\\MarkitCore\\ExcelWriter\\test.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		'Read data from excel'
		String Data_fromCell=sheet.getRow(1).getCell(1).getStringCellValue();
		'Write data to excel'
		sheet.getRow(1).createCell(1).setCellValue("Mahesh2");

		file.close();
		FileOutputStream outFile =new FileOutputStream(new File("E:\\MarkitCore\\ExcelWriter\\test.xlsx"));
		workbook.write(outFile);
		outFile.close();
	}
}
