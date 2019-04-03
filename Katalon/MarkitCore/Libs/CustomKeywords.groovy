
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "seleniumexcelwriter.Excelwriter.excelwrite"(
    	String value	) {
    (new seleniumexcelwriter.Excelwriter()).excelwrite(
        	value)
}

def static "com.helper.excel.ExcelHelper.writeTOExcelFile"(
    	String excelPath	
     , 	String sheetName	
     , 	String value	
     , 	int rowNo	
     , 	int colNo	) {
    (new com.helper.excel.ExcelHelper()).writeTOExcelFile(
        	excelPath
         , 	sheetName
         , 	value
         , 	rowNo
         , 	colNo)
}

def static "helper.login.Login.loginDetails"() {
    (new helper.login.Login()).loginDetails()
}

def static "com.helper.excel2.excelwrite.WriteExcel"(
    	String name	) {
    (new com.helper.excel2.excelwrite()).WriteExcel(
        	name)
}

def static "helper.logout.Logout.LogoutDetails"() {
    (new helper.logout.Logout()).LogoutDetails()
}
