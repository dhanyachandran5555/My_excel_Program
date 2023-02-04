package myExcelRead;

import java.io.IOException;

public class MyExcelMain {

	public static void main(String[] args) throws IOException {
		String val1 = MyXLCode.stringDataRead(0, 1); // displays the String value from 0,1 position in Excel
		System.out.println(val1);
		String val2 = MyXLCode.stringDataRead(1, 0);
		System.out.println(val2);
		int i1 = MyXLCode.integerDataRead(1, 1);// displays the String value from 0,1 position in Excel
		System.out.println(i1);
		int i2 = MyXLCode.integerDataRead(2, 1);
		System.out.println(i2);

	}

}
