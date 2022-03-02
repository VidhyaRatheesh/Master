package flipkart;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileData {

	public ArrayList<String> getData(String Testcase) throws Exception {

		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fil = new FileInputStream("D:\\vidhya\\flipkart.xlsx");

		// load file

		XSSFWorkbook ws = new XSSFWorkbook(fil);

		int sheets = ws.getNumberOfSheets();
		// System.out.println("No:of sheets:" + sheets);

		// finding the required sheet via iteration
		for (int i = 0; i < sheets; i++) {
			// fetched the required sheet
			if (ws.getSheetName(i).equalsIgnoreCase("FlipkartData")) {

				XSSFSheet sheet = ws.getSheetAt(i);
				Iterator<Row> rows = sheet.rowIterator();

				// getting access to the specific row

				Row firstrow = rows.next();

				Iterator<Cell> cell = firstrow.cellIterator();
				int k = 0;
				int col = 0;
				// identifying the column "pasd"by scanning the row
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {
						col = k;
					}
					k++;
				}
				// System.out.println(col);
				// once the column is identified,scan for "Sadmin"
				// now scan the entire row for Sadmin for that particular row details
				while (rows.hasNext()) // checks new row avail, goto to 63
				{
					Row r = rows.next();
					if (r.getCell(col).getStringCellValue().equalsIgnoreCase("Login")) {
						Iterator<Cell> cells = r.cellIterator();
						// cells.next();
						while (cells.hasNext()) {
							Cell num = cells.next();
							switch (num.getCellType()) {
							case STRING:
								// System.out.println(num.getStringCellValue()+ "\t");
								a.add(num.getStringCellValue());
								// System.out.println(a.add(num.getStringCellValue()) + "\t");
								break;
							case NUMERIC:
								// System.out.println((long)num.getNumericCellValue()+ "\t");
								a.add(NumberToTextConverter.toText((double) num.getNumericCellValue()));
								// System.out.println(a.add(NumberToTextConverter.toText((double)num.getNumericCellValue()))
								// + "\t");
								break;
							default:

							}
							// System.out.println(a.get(1));
						}
					}
				}

			}
		}

		ws.close();
		return a;

	}
}
