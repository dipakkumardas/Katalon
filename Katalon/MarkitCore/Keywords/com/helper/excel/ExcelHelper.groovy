package com.helper.excel

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
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

public class ExcelHelper {

	// Create work Book
	private XSSFWorkbook getWorkBook()
	{
		return new XSSFWorkbook();
	}



	// Create Sheet

	private XSSFSheet getSheet(XSSFWorkbook workBook,String sheetName){
		return workBook.createSheet(sheetName);
	}


	//Keyword , which write data to excel

	@Keyword
	public void writeTOExcelFile(String excelPath, String sheetName,String value, int rowNo, int colNo)
	{
		XSSFWorkbook book = getWorkBook() //Created the Book
		XSSFSheet sheet = getSheet(book,sheetName) //Created the Sheet
		XSSFRow aRow = sheet.createRow(rowNo) // Created the row->index
		XSSFCell bCell = aRow.createCell(colNo) // Created the col->index
		bCell.setCellValue(value)
		writeToFileSystem(book,excelPath)
	}

	//Write the excel to the file system
	public void writeToFileSystem(XSSFWorkbook book, String excelPath){
		try{
			FileOutputStream aOut =new FileOutputStream(excelPath)
			book.write(aOut)
			aOut.close()
		}catch(Exception e)
		{
			KeywordUtil.markError(e.toString())
		}
	}

}