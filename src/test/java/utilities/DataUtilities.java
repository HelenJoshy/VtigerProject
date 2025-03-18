package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.AsynchronousSocketChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtilities {
	String propertyFilepath = "C:\\Users\\Administrator\\eclipse-workspace\\testing\\Vtiger\\src\\test\\resources\\datas\\Vtigerdata.properties";
	String ExcelFilePath = "C:\\Users\\Administrator\\eclipse-workspace\\testing\\Vtiger\\src\\test\\resources\\datas\\DataBook.xlsx";

	public void setDataIntoPropertyFile(String key, String value) {
		try {
			// specif the path by creating object for
			FileInputStream fis = new FileInputStream(propertyFilepath);

			// create object for property class
			Properties p = new Properties();
			// load the file into property object
			p.load(fis);

			// set data
			p.setProperty(key, value);

			// create Object for fout
			FileOutputStream fout = new FileOutputStream(propertyFilepath);

			// store data
			p.store(fout, "data store succesfully");
			System.out.println("data store succesfully");
		} catch (Exception e) {
			System.out.println("unable to store data");
		}

	}

	public String getDataFromPropertyFile(String property) {
		String value = "";
		try {
			// specify the path
			FileInputStream fis = new FileInputStream(propertyFilepath);
			// create object for properties
			Properties p = new Properties();
			// load the file into the object
			p.load(fis);
			// get property
			value = p.getProperty(property);

		} catch (Exception e) {
			System.out.println("unable to get the data");

		}
		return value;
	}

	public void removeDataFromPropertyFile(String property) {
		try {
			// specify the path
			FileInputStream fis = new FileInputStream(propertyFilepath);
			// create object for property class
			Properties p = new Properties();
			// load the file
			p.load(fis);
			// remove property
			p.remove(property);

			// create object for fout
			FileOutputStream fout = new FileOutputStream(propertyFilepath);
			// store the value
			p.store(fout, "data removed suucesfully");
			// print the cucces message
			System.out.println("data removed suucesfully");
		} catch (Exception e) {
			System.out.println("unable to remove the data from property file");
		}

	}

	public void setDataIntoExcel(String sheet, int row, int cell, String value) {

		try {
			// specify the path
			FileInputStream fis = new FileInputStream(ExcelFilePath);
			// create work book
			Workbook wb = WorkbookFactory.create(fis);
			// get sheet , create roe, create cell,create cell value
			wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
			// create object for fout
			FileOutputStream fout = new FileOutputStream(ExcelFilePath);
			// write inside file
			wb.write(fout);
		} catch (Exception e) {
			System.out.println("unavble to set data into excel");
		}
	}

	public String getDataFromExcel(String sheet, int row, int cell) {
		String value = "";
		try {
			// specify the path
			FileInputStream fis = new FileInputStream(ExcelFilePath);
			// create work book
			Workbook wb = WorkbookFactory.create(fis);
			// get sheet get row get cell , get cell value
			value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {
			System.out.println("unable to fetch the data from the excel");
		}
		return value;
	}

	public void setDataIntoDatabase(String query) {
		try {
			// fetch the jdbc url,jdbcun,jdbcpwd
			String jdbcurl = getDataFromPropertyFile("jdbcurl");
			String jdbcun = getDataFromPropertyFile("jdbcun");
			String jdbcpwd = getDataFromPropertyFile("jdbcpwd");
			// load the driver
			Class.forName("com.msql.cj.jdbc.Driver");
			// create connection
			Connection conn = DriverManager.getConnection(jdbcurl, jdbcun, jdbcpwd);
			// create statement and execute
			conn.createStatement().execute(query);
			// print the succes message
			System.out.println("query executed succesfully");
		} catch (Exception e) {
			System.out.println("unable to execute the query");
		}
	}

	public ArrayList<Object[]> getDataFromDatabase(String query) {
		// create object for arraylist
		ArrayList<Object[]> al = new ArrayList<Object[]>();

		try {
			// fetch the jdbc url,jdbcun,jdbcpwd
			String jdbcurl = getDataFromPropertyFile("jdbcurl");
			String jdbcun = getDataFromPropertyFile("jdbcun");
			String jdbcpwd = getDataFromPropertyFile("jdbcpwd");
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			Connection conn = DriverManager.getConnection(jdbcurl, jdbcun, jdbcpwd);
			// create statement and execute
			ResultSet rs = conn.createStatement().executeQuery(query);

			while (rs.next()) {

				int columnCount = rs.getMetaData().getColumnCount();

				String[] rowData = new String[columnCount];

				for (int i = 1; i <= columnCount; i++) {

					rowData[i - 1] = rs.getString(i);

				}

				al.add(rowData);

			}

		} catch (Exception e) {
			System.out.println("unable to get the data");
		}
		return al;
	}
}
