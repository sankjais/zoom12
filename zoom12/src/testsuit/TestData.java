package testsuit;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class TestData {

	// TODO Auto-generated constructor stub

	 String company_name, contact_person, emailID, password, business_description, industry_caters, primary_expertise,
			secondary_expertise, website, year_of_incorporation, status_of_product, last_yr_revenue,
			last_yr_revenue_currency, current_monthy_rate, current_monthy_rate_currency, register_address, city, state,
			country, contact_prefix, contact_sufix, founder_tag, employees, pincode,
			LoginURL = "http://staging.zoom12.com/#/", signUpURL = "http://staging.zoom12.com/#/startupregistration",
			dashboardURL = "http://staging.zoom12.com/#/dashboard/",
			changePasswordURL = "http://staging.zoom12.com/#/changePassword",
			editprofileURL = "http://staging.zoom12.com/#/editProfile",
			viewprofileURL = "http://staging.zoom12.com/#/myProfile",
			manageteamURL = "http://staging.zoom12.com/#/manageTeam",
			searchZoomerURL = "http://staging.zoom12.com/#/searchZoomer/",
			searchInvestorURL = "http://staging.zoom12.com/#/searchInvestor/",
			searchCommunityURL = "http://staging.zoom12.com/#/searchCommunity//Announcements",
			searchArticleURL = "http://staging.zoom12.com/#/searchArticle/",
			searchServiceProviderURL = "https://staging.zoom12.com/#/searchServiceProvider/";
	 TestData data = new TestData();

	/*public TestData creatTestData()*/
	 public static void main(String args[]) {
		
	}{
		// TODO Auto-generated method stub

		String setdir = System.getProperty("user.dir").concat("\\src\\testsuit\\zoom12user.xlsx");

		try {
			ExcelUtils exceldata = new ExcelUtils(setdir, "Sheet3");
			int row = exceldata.excel_get_rows() - 1;// 3
			int col = exceldata.excel_get_columns();// 24
			System.out.println(row + "   " + col);
			String[][] tdata = new String[row][col];
			for (int r = 1; r < row; r++) {
				for (int c = 0; c < col; c++) {

					tdata[r][c] = exceldata.getCellDataasstring(r, c);
					// System.out.print(tdata[r][c] + " ");
				}
				// System.out.println("\n****************");
			}

			for (int r = 1; r < row; r++) {
				data.company_name = tdata[r][0];
				data.contact_person = tdata[r][1];
				data.emailID = tdata[r][2];
				data.password = tdata[r][3];
				data.business_description = tdata[r][4];
				data.industry_caters = tdata[r][5];
				data.primary_expertise = tdata[r][6];
				data.secondary_expertise = tdata[r][7];
				data.website = tdata[r][8];
				data.year_of_incorporation = tdata[r][9];
				data.status_of_product = tdata[r][10];
				data.last_yr_revenue = tdata[r][11];
				data.last_yr_revenue_currency = tdata[r][12];
				data.current_monthy_rate = tdata[r][13];
				data.current_monthy_rate_currency = tdata[r][14];
				data.register_address = tdata[r][15];
				data.city = tdata[r][16];
				data.state = tdata[r][17];
				data.country = tdata[r][18];
				data.pincode = tdata[r][19];
				data.contact_prefix = tdata[r][20];
				data.contact_sufix = tdata[r][21];
				data.founder_tag = tdata[r][22];
				data.employees = tdata[r][23];
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return data;
		System.out.println(data.company_name);

	}
}