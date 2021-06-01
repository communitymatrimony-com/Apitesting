package com.Base;


	import java.io.BufferedReader;
	import java.io.DataOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.InputStreamReader;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Properties;
	import java.util.Random;

	import javax.activation.DataHandler;
	import javax.activation.DataSource;
	import javax.activation.FileDataSource;
	import javax.mail.Message;
	import javax.mail.MessagingException;
	import javax.mail.Multipart;
	import javax.mail.PasswordAuthentication;
	import javax.mail.Session;
	import javax.mail.Transport;
	import javax.mail.internet.InternetAddress;
	import javax.mail.internet.MimeBodyPart;
	import javax.mail.internet.MimeMessage;
	import javax.mail.internet.MimeMultipart;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;







	public class BaseTest_PP {
	        /*public static ExtentReports reports;
	    public static ExtentTest test;*/
	   // ExtentHtmlReporter reporter;
	    String html = "DivorceeReport.html";
	    public static WebDriver driver;
	    static String currentUrl,Clasfiation,a,b,c,d,e1,f;
	    public static String
	Profile_Created,Name,Age,Height,Gender,Marital_status,Mother_Tongue,
	    Physical_Status,Body_Type,Complexion,Language__Known,Star,Rasi,SubCaste,
	    Gothram,Dosham,Education,Education_Detail,Occupation,Occupation_Detail,
	    Employeed_In,Annual_Income,City,State,Country,Citizenship, Religion;
	    //public static Calendar calendar;
	    public static ExtentReports extent;
	    public static ExtentTest test;
	    
	    public static void click(WebElement element) {        
	                element.click();

	        }
	         
	         public static void clear(WebElement element) {        
	                        element.clear();
	         }
	                        
	         public static void typeData(WebElement element, String Value) {
	                element.sendKeys(Value);

	        }
	         ////////////////////////////
	         
	         
	    
	     
	         
	         
	////////////////Drop Down Base//////////////////
	                
	public static void select_string(WebElement element, String Value) {
	Select s = new Select(element);
	s.selectByValue(Value);
	}


	public static void select_index(WebElement element, int Value) {
	Select s = new Select(element);
	s.selectByIndex(Value);        
	}


	public static void select_text(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}


	public static void select_deselectAll(WebElement element) {
	        Select s = new Select(element);
	        s.deselectAll();
	}


//////////	    Excel    COde   ///////////////////////
	public static String getExcelDataUrl(String sheetName, int rowNum, int colNum)
	throws Throwable{
	        FileInputStream fis = new FileInputStream("//Excel//LoginTestData_Mohan2222.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 String data = row.getCell(colNum).getStringCellValue();
	 wb.close();
	        return data;
	}



	public static String getExcelData(String sheetName, int rowNum, int colNum) throws
	Throwable{
	        FileInputStream fis = new FileInputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 String data = row.getCell(colNum).getStringCellValue();
	 wb.close();
	        return data;
	}


	public static int getExcelRandomRowNum(String sheetName) throws Throwable{
	        FileInputStream fis = new FileInputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Random rand = new Random();
	 int rowNum = rand.nextInt(sh.getLastRowNum());
	 return rowNum;
	}
	public static void setExcelData(String sheetName, int rowNum, int colNum,String
	data) throws Throwable{
	        FileInputStream fis = new FileInputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	        wb.write(fos);
	        wb.close();
	}



	public static void setExcelDataUrl(String sheetName, int rowNum, int colNum,String
	data) throws Throwable{
	        FileInputStream fis = new FileInputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	        wb.write(fos);
	        wb.close();
	}



	public static int getRowCount(String sheetName) throws Throwable {
	        FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 int rowIndex = wb.getSheet(sheetName).getLastRowNum();
	 return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int
	data) throws Throwable{
	        FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	        wb.write(fos);
	        wb.close();

	}


	public static int getCellCount(String sheetName) throws Throwable {
	        FileInputStream fis = new FileInputStream("C:\\Users\\Saijyothi-44227\\Downloads\\API_Testing_new\\API_Testing\\driver\\SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(0);
	int cell = row.getLastCellNum();
	return cell;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//  Mail 

	public static void mail_report() {
	        
	         extent.flush();
	   final String username = "mohantest.mm@gmail.com";
	   final String password = "mohanmmteam";
	/*  final String username = "cbsautomationreport@gmail.com";
	final String password = "cbstest123";*/
	 Date date=new Date();
	   Properties props = new Properties();
	   props.put("mail.smtp.auth", true);
	   props.put("mail.smtp.starttls.enable", true);
	   props.put("mail.smtp.host", "smtp.gmail.com");
	   props.put("mail.smtp.port", "587");

	   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	       protected PasswordAuthentication getPasswordAuthentication() {
	           return new PasswordAuthentication(username, password);
	       }
	   });
	   Message message = new MimeMessage(session);

	   try {

	       message.setFrom(new InternetAddress("mohantest.mm@gmail.com"));
	    //   message.setFrom(new InternetAddress("cbsautomationreport@gmail.com"));
	       message.setSubject("QA - CBS - Daily Bug Report"+date);

	      message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("amudhan.nagarajan@matrimony.com"));
	       //message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("pavithra.govarthanan@matrimony.com,karthik.srinivasan@matrimony.com,Ashokkumar@bharatmatrimony.com"));
	//,thanikachalam.thirunanasambandan@matrimony.com
	       Multipart multipart = new MimeMultipart();

	       MimeBodyPart messageBodyPart = new MimeBodyPart();
	       messageBodyPart.setText("Hi Team,"+"\n\n"+"Please find the attached BugzillaURL which will get the entire list of observations posted for theday."+"\n"+"\n"+Clasfiation+"\n"+"The Productare"+"\n"+a+"\n"+b+"\n"+c+"\n"+d+"\n"+e1+"\n"+f+"\n"+"\n"+"Kindly scrollthrough the page and click on the 'Long Format' button to view the entire bug description."+"\n\n\n"+"Regards,"+"\n"+"Testing Team.");
	       MimeBodyPart attachmentBodyPart = new MimeBodyPart();


	     //  String file = "C:\\Users\\Admin\\Desktop\\21_sep_2019-BUGList.txt";
	       String url=currentUrl;

	       //String fileName = "CBS-AutomationReport-Desktop";
	       DataSource source = new FileDataSource(url);
	       // messageBodyPart.setDataHandler(new DataHandler(source));
	       attachmentBodyPart.setDataHandler(new DataHandler(source));
	       attachmentBodyPart.setText(url);
	       //attachmentBodyPart.setFileName("Login.png");

	       multipart.addBodyPart(messageBodyPart);
	       multipart.addBodyPart(attachmentBodyPart);

	       message.setContent(multipart);
	       

	       System.out.println("Sending....");

	       Transport.send(message);

	       System.out.println("Mail Sent Successfully");

	   } catch (MessagingException e) {
	       e.printStackTrace();
	   }

	//28327   28329 

	}









	         
	         ///////////////////////////////
	         
	         public static void sendVFSms1() throws Exception {
	         String message="PASS : Divrocee_Login_Desktop-Adyar,Chennai";
	         String mobileno="918098882244,916302165648,";
	         String[] s = mobileno.split(",");
	         for (int i = 0; i < s.length; i++) {


	         String url = 
	"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
	         URL obj = new URL(url);
	         HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	         //add reuqest header
	         con.setRequestMethod("POST");
	         //con.setRequestProperty("User-Agent", USER_AGENT);
	         con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	         String urlParameters = "data=<?xml version=\"1.0\"encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM\"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USERUSERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\"CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESSFROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside randomdata\" /></SMS></MESSAGE>&action=send";

	         // Send post request
	         con.setDoOutput(true);
	         DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	         wr.writeBytes(urlParameters);
	         wr.flush();
	         wr.close();

	         int responseCode = con.getResponseCode();
	         System.out.println("\nSending 'POST' request to URL : " + url);
	         System.out.println("Post parameters : " + urlParameters);
	         System.out.println("Response Code : " + responseCode);

	         BufferedReader in = new BufferedReader(
	                 new InputStreamReader(con.getInputStream()));
	         String inputLine;
	         StringBuffer response = new StringBuffer();

	         while ((inputLine = in.readLine()) != null) {
	             response.append(inputLine);
	         }
	         in.close();

	         //print result
	         System.out.println(response.toString());

	     } 
	  }
	  public static void sendVFSms() throws Exception {
	         String message="FAIL : Divorcee_Login_Desktop-Adyar,Chennai";
	                         
	         String mobileno="918098882244,916302165648";
	         String[] s = mobileno.split(",");
	         for (int i = 0; i < s.length; i++) {
	         String url ="http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
	         URL obj = new URL(url);
	         HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	         //add reuqest header
	         con.setRequestMethod("POST");
	         //con.setRequestProperty("User-Agent", USER_AGENT);
	         con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	         String urlParameters = "data=<?xml version=\"1.0\"encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM\"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USERUSERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\"CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESSFROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside randomdata\" /></SMS></MESSAGE>&action=send";

	         // Send post request
	         con.setDoOutput(true);
	         DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	         wr.writeBytes(urlParameters);
	         wr.flush();
	         wr.close();

	         int responseCode = con.getResponseCode();
	         System.out.println("\nSending 'POST' request to URL : " + url);
	         System.out.println("Post parameters : " + urlParameters);
	         System.out.println("Response Code : " + responseCode);

	         BufferedReader in = new BufferedReader(
	                 new InputStreamReader(con.getInputStream()));
	         String inputLine;
	         StringBuffer response = new StringBuffer();

	         while ((inputLine = in.readLine()) != null) {
	             response.append(inputLine);
	         }
	         in.close();

	         //print result
	         System.out.println(response.toString());

	     }
	     }

	///////////////////////////////////////////////////////////////////////
	  
	  public static void sendVFSms2() throws Exception {
	      String message="PASS : Divrocee_Negative_Payment-Desktop-Adyar,Chennai";
	      String mobileno="918098882244,916302165648,";
	      String[] s = mobileno.split(",");
	      for (int i = 0; i < s.length; i++) {


	      String url = 
	"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
	      URL obj = new URL(url);
	      HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	      //add reuqest header
	      con.setRequestMethod("POST");
	      //con.setRequestProperty("User-Agent", USER_AGENT);
	      con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	      String urlParameters = "data=<?xml version=\"1.0\"encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM\"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USERUSERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\"TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\"TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\"/></SMS></MESSAGE>&action=send";

	      // Send post request
	      con.setDoOutput(true);
	      DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	      wr.writeBytes(urlParameters);
	      wr.flush();
	      wr.close();

	      int responseCode = con.getResponseCode();
	      System.out.println("\nSending 'POST' request to URL : " + url);
	      System.out.println("Post parameters : " + urlParameters);
	      System.out.println("Response Code : " + responseCode);

	      BufferedReader in = new BufferedReader(
	              new InputStreamReader(con.getInputStream()));
	      String inputLine;
	      StringBuffer response = new StringBuffer();

	      while ((inputLine = in.readLine()) != null) {
	          response.append(inputLine);
	      }
	      in.close();

	      //print result
	      System.out.println(response.toString());

	  } 
	}
	public static void sendVFSms3() throws Exception {
	      String message="FAIL : Divorcee_Negative_Payment_Desktop-Adyar,Chennai";
	                      
	      String mobileno="918098882244,916302165648";
	      String[] s = mobileno.split(",");
	      for (int i = 0; i < s.length; i++) {
	      String url ="http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
	      URL obj = new URL(url);
	      HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	      //add reuqest header
	      con.setRequestMethod("POST");
	      //con.setRequestProperty("User-Agent", USER_AGENT);
	      con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	      String urlParameters = "data=<?xml version=\"1.0\"encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM\"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USERUSERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\"TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\"TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\"/></SMS></MESSAGE>&action=send";

	      // Send post request
	      con.setDoOutput(true);
	      DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	      wr.writeBytes(urlParameters);
	      wr.flush();
	      wr.close();

	      int responseCode = con.getResponseCode();
	      System.out.println("\nSending 'POST' request to URL : " + url);
	      System.out.println("Post parameters : " + urlParameters);
	      System.out.println("Response Code : " + responseCode);

	      BufferedReader in = new BufferedReader(
	              new InputStreamReader(con.getInputStream()));
	      String inputLine;
	      StringBuffer response = new StringBuffer();

	      while ((inputLine = in.readLine()) != null) {
	          response.append(inputLine);
	      }
	      in.close();

	      //print result
	      System.out.println(response.toString());

	  }
	  }

	  ///////////////////////////////////////////////////////////////////////////////////////

	public static void sendVFSms4() throws Exception {
	    String message="PASS : Community_Login-Desktop-Adyar,Chennai";
	    String mobileno="918098882244,916302165648,";
	    String[] s = mobileno.split(",");
	    for (int i = 0; i < s.length; i++) {


	    String url = 
	"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	    //add reuqest header
	    con.setRequestMethod("POST");
	    //con.setRequestProperty("User-Agent", USER_AGENT);
	    con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	    String urlParameters = "data=<?xml version=\"1.0\"encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM\"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USERUSERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\"TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\"TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\"/></SMS></MESSAGE>&action=send";

	    // Send post request
	    con.setDoOutput(true);
	    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	    wr.writeBytes(urlParameters);
	    wr.flush();
	    wr.close();

	    int responseCode = con.getResponseCode();
	    System.out.println("\nSending 'POST' request to URL : " + url);
	    System.out.println("Post parameters : " + urlParameters);
	    System.out.println("Response Code : " + responseCode);

	    BufferedReader in = new BufferedReader(
	            new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();

	    //print result
	    System.out.println(response.toString());

	} 
	}
	public static void sendVFSms5() throws Exception {
	    String message="FAIL : Community_Login-Adyar,Chennai";
	                    
	    String mobileno="918098882244,916302165648";
	    String[] s = mobileno.split(",");
	    for (int i = 0; i < s.length; i++) {
	    String url ="http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	    //add reuqest header
	    con.setRequestMethod("POST");
	    //con.setRequestProperty("User-Agent", USER_AGENT);
	    con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	    String urlParameters = "data=<?xml version=\"1.0\"encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM\"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USERUSERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\"TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\"TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\"/></SMS></MESSAGE>&action=send";

	    // Send post request
	    con.setDoOutput(true);
	    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	    wr.writeBytes(urlParameters);
	    wr.flush();
	    wr.close();

	    int responseCode = con.getResponseCode();
	    System.out.println("\nSending 'POST' request to URL : " + url);
	    System.out.println("Post parameters : " + urlParameters);
	    System.out.println("Response Code : " + responseCode);

	    BufferedReader in = new BufferedReader(
	            new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();

	    //print result
	    System.out.println(response.toString());

	}
	}
	////////////////////////////////////////////////////////////////////////////////

	////////////////   Who Viewed Me SmS  /////

	public static void sms_who_viewed() throws Exception {
	     String message="PlatForm : Desktop"+"\n"+"Module : Who Viewed My Profile Listing Page " +"\n"+ "Reason : No profile was displayed in Who Viewed My Profile Listing - Reasonmight be SOLR down "+"\n"+
	               "Location : Adyar, Chennai "+"\n";
	     
	     String
	mobileno="918098882244,916302165648,919092859363,919789352793,918754736294";
	     String[] s = mobileno.split(",");
	     for (int i = 0; i < s.length; i++) {


	     String url = 
	"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	     //add reuqest header
	     con.setRequestMethod("POST");
	     //con.setRequestProperty("User-Agent", USER_AGENT);
	     con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	     String urlParameters = "data=<?xml version=\"1.0\"encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM\"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USERUSERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\"TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\"TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\"/></SMS></MESSAGE>&action=send";

	     // Send post request
	     con.setDoOutput(true);
	     DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	     wr.writeBytes(urlParameters);
	     wr.flush();
	     wr.close();

	     int responseCode = con.getResponseCode();
	     System.out.println("\nSending 'POST' request to URL : " + url);
	     System.out.println("Post parameters : " + urlParameters);
	     System.out.println("Response Code : " + responseCode);

	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();

	     while ((inputLine = in.readLine()) != null) {
	         response.append(inputLine);
	     }
	     in.close();

	     //print result
	     System.out.println(response.toString());

	 } 
	}

	}
  
	  //////////////////////////////////////////////////////////////////////////



	/*public static List<HashMap<String, String>> readValueFromExcelSheet1()  throws
	NullPointerException  {
	List<HashMap<String, String>> mapDatasList = new ArrayList();
	try {
	        File excelLocaltion = new File("D:\\New folder\\SMS and MAIL JenkinCode\\Sms_Test_Data.xlsx");

	        String sheetName = "Sheet1";

	        FileInputStream f = new FileInputStream(
	                        excelLocaltion.getAbsolutePath());
	        Workbook w = new XSSFWorkbook(f);
	        Sheet sheet = w.getSheet(sheetName);
	        Row headerRow = sheet.getRow(0);
	        //HashMap<String, String> mapDatas = new HashMap<String, String>();
	        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	                Row currentRow = sheet.getRow(i);
	                HashMap<String, String> mapDatas = new HashMap<String, String>();
	                for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
	                        Cell currentCell = currentRow.getCell(j);

	                        switch (currentCell.getCellType()) {
	                        case Cell.CELL_TYPE_STRING:
	                                mapDatas.put(headerRow.getCell(j).getStringCellValue(),
	                                                currentCell.getStringCellValue());
	                                break;
	                        case Cell.CELL_TYPE_NUMERIC:
	                                mapDatas.put(headerRow.getCell(j).getStringCellValue(),
	                                                String.valueOf(currentCell
	                                                                .getNumericCellValue()));

	                                break;

	                        }
	                }

	                mapDatasList.add(mapDatas);
	        }

	} catch (Throwable e) {
	        e.printStackTrace();
	}
	return mapDatasList;

	}*/
       /////////////////////////////////////////////////////////

	/*public static List<HashMap<String, String>> readValueFromExcelSheet()  throws NullPointerException  {
	        
	        List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
	        try {
	                File excelLocaltion = new File("C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Excel\\SMSTEST.xlsx");

	                String sheetName = "Sheet2";

	                FileInputStream f = new FileInputStream(excelLocaltion.getAbsolutePath());
	                Workbook w = new XSSFWorkbook(f);
	                Sheet sheet = w.getSheet(sheetName);
	                Row headerRow = sheet.getRow(0);
	                for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	                        Row currentRow = sheet.getRow(i);
	                        HashMap<String, String> mapDatas = new HashMap<String, String>();
	                        for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
	                                Cell currentCell = currentRow.getCell(j);

	                                switch (currentCell.getCellType()) {
	                                case Cell.CELL_TYPE_STRING : mapDatas.put(headerRow.getCell(j).getStringCellValue(),currentCell.getStringCellValue());
	                                        break;
	                                case Cell.CELL_TYPE_NUMERIC:mapDatas.put(headerRow.getCell(j).getStringCellValue(),String.valueOf(currentCel.getNumericCellValue()));

	                                        break;

	                                }
	                        }

	                        mapDatasList.add(mapDatas);
	                }

	        } catch (Throwable e) {
	                e.printStackTrace();
	        }
	        return mapDatasList;

	}
*/
	         
	/////////////////////////////////////////////////////////////////////////////////

	/*public static List<HashMap<String, String>> readValueFromExcelSheet2()  throws
	NullPointerException  {
	        
	        List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
	        try {
	                File excelLocaltion = new
	File("C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Excel\\Divorcee_Test_Data.xlsx");

	                String sheetName = "Sheet3";

	                FileInputStream f = new FileInputStream(
	                                excelLocaltion.getAbsolutePath());
	                Workbook w = new XSSFWorkbook(f);
	                Sheet sheet = w.getSheet(sheetName);
	                Row headerRow = sheet.getRow(0);
	                for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	                        Row currentRow = sheet.getRow(i);
	                        HashMap<String, String> mapDatas = new HashMap<String, String>();
	                        for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
	                                Cell currentCell = currentRow.getCell(j);

	                                switch (currentCell.getCellType()) {
	                                case Cell.CELL_TYPE_STRING:
	                                        mapDatas.put(headerRow.getCell(j).getStringCellValue(),
	                                                        currentCell.getStringCellValue());
	                                        break;
	                                case Cell.CELL_TYPE_NUMERIC:
	                                        mapDatas.put(headerRow.getCell(j).getStringCellValue(),
	                                                        String.valueOf(currentCell
	                                                                        .getNumericCellValue()));

	                                        break;

	                                }
	                        }

	                        mapDatasList.add(mapDatas);
	                }

	        } catch (Throwable e) {
	                e.printStackTrace();
	        }
	        return mapDatasList;

	}*/

	         

	        


	////////////////////////////////////////////////////////////////////////////////////////

	        
	        
	//}
	        


	
//}
