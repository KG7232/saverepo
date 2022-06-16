import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
		obj.load(objfile);
		String value = obj.getProperty("url");
		return value;


}
	
	public static  String getstringdata(int rowIndex, int cellIndex) throws EncryptedDocumentException,IOException, InvalidFormatException {
		FileInputStream file = new FileInputStream("C:\\Users\\kunal\\AppData\\Roaming\\kingsoft\\office6\\templates\\et\\en_US\\demo1.xlsx");
		Sheet st = WorkbookFactory.create(file).getSheet("Sheet1");
		String Value = st.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return Value;
	
}
	
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\kunal\\new eclipse-workspace\\ProUsa\\Screenshots"+TCID+".png");

		FileHandler.copy(src, dest);
}
}