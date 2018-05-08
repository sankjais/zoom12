package testdata;

public class TestData {

	String company_name, contact_person, emailID, password, business_description, industry_caters, primary_expertise,
			secondary_expertise, website, year_of_incorporation, status_of_product, last_yr_revenue,
			current_monthy_rate, register_address, city, state, country, contact_prefix, contact_sufix, founder_tag,
			employees, LoginURL = "http://staging.zoom12.com/#/",
			signUpURL = "http://staging.zoom12.com/#/startupregistration",
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestData data = new TestData();
		String setdir= System.getProperty("user.dir").concat("\\src\\testdata\\zoom12user.xlsx");
		
		
	
		try {
			ExcelUtils exceldata = new ExcelUtils(setdir,"Sheet3");
			int col=exceldata.excel_get_rows() - 1;
			int row=exceldata.excel_get_columns();
			
			for(int c=1;c< col;c++ )
			{
				for(int r=0;r<row;r++)
				{
			System.out.print(exceldata.getCellDataasstring(c, r)+"  ");	
				}
				System.out.println("\n****************");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}