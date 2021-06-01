package com.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class profile_Details {
	
	@Test(priority=2,enabled=true)
	public void dailySeven() {

		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("admin");
		authScheme.setPassword("lRqW6WNT");
		RestAssured.authentication = authScheme;

		RestAssured.baseURI = "https://www.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=KMC333738&PackageName=com.community.matrimony&AppVersionCode=123&SignalStrength=&AppVersion=4.9&EncryptId=3dde775f4a4498c676fa56ed040a4492931b8be8&Referrer=inbox_unread&NetworkType=WIFI&UniqueId=0164d5978f&mima=yes&Opposite_MatriId=KMC333738&DeviceVersion=9&DeviceModel=Mi%20A1&TokenId=d82b25913b008625dc785df759f2c7be13b40fca&DevicePlatform=IOS&SenderRequest=1&OutputType=2&CommunityId=153&AppType=10&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=1&RequestFor=1&RequestVal=1&Gender=1&ContactGov=1&PPWeb=1";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://www.communitymatrimony.com/api/webservicecall.php?filename=profileDetailCurl&Module=viewprofile&Field_Empty=1&Field_Label=1&EnablePhotoRequest=1&MatriId=KMC333738&PackageName=com.community.matrimony&AppVersionCode=123&SignalStrength=&AppVersion=4.9&EncryptId=3dde775f4a4498c676fa56ed040a4492931b8be8&Referrer=inbox_unread&NetworkType=WIFI&UniqueId=0164d5978f&mima=yes&Opposite_MatriId=KMC333738&DeviceVersion=9&DeviceModel=Mi%20A1&TokenId=d82b25913b008625dc785df759f2c7be13b40fca&DevicePlatform=IOS&SenderRequest=1&OutputType=2&CommunityId=153&AppType=10&CarrierName=&MarkAsViewed=1&InterestFlag=1&IncomeRangeEnable=yes&ChkBlockIgnoreProfile=0&PaidStatus=1&RequestFor=1&RequestVal=1&Gender=1&ContactGov=1&PPWeb=1");

		JsonPath jsonPathEvaluator = response.jsonPath();

		int statusCode = response.getStatusCode();

		// int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String statusLine = response.getStatusLine();
		System.out.println("Status Line : " + statusLine);

		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: " + contentType);

		String serverType = response.header("Server");
		System.out.println("Server value: " + serverType);

		String acceptLanguage = response.header("Content-Encoding");
		System.out.println("Content-Encoding: " + acceptLanguage);

		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		String ERRORDESC = response.jsonPath().get("ERRORDESC").toString();
		System.out.println(ERRORDESC + " . ' . ' ");
	
	
	
	
	}
	
	
	
}