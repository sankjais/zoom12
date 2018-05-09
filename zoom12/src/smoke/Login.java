package smoke;

import testsuit.TestData;

public class Login {

	public static void main(String args[]) {

	TestData data= new TestData();
	data=data.creatTestData();
	for (int r = 1; r < TestData.row; r++) {
		for (int c = 0; c < TestData.col; c++) {

			//tdata[r][c] = exceldata.getCellDataasstring(r, c);
			System.out.print(  "  ");
		}
		System.out.println("\n****************");
	}
	
	
	}

}
