package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public static String hotelName;
	public static String hotelprice;
	@FindBy(xpath="//h5[@class='font35 font-weight-bold mb-4']")
	private WebElement txthotelSuccessmessage;
	@FindBy(xpath="//strong[text()='$ 1,770']")
	private WebElement txtsaveprice;
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement btnClick;
	
	@FindBy(xpath="//label[text()='Price low to high']")
	private WebElement txtlowtohighclick;
	@FindBy(xpath="//div[@class='prize']//strong[@class='total-prize']")
	List<WebElement>ascendprice;
	@FindBy(xpath="//label[text()='Deluxe']")
	private WebElement txtclickroomtype;
	@FindBy(xpath="//div[@class='col-md-5 hotel-suites']//h5")
	private WebElement txtdesroomname;
	@FindBy(xpath="//h2[text()='Book Hotel - Hyatt Regency Chennai Deluxe']")
	private WebElement BookHotelsuccesmsgbook;
	public WebElement getBookHotelsuccesmsgbook() {
		return BookHotelsuccesmsgbook;
	}
	public WebElement getTxthotelSuccessmessage() {
		return txthotelSuccessmessage;
	}
	public WebElement getTxtsaveprice() {
		return txtsaveprice;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	public WebElement getTxtlowtohighclick() {
		return txtlowtohighclick;
	}
	public List<WebElement> getAscendprice() {
		return ascendprice;
	}
	public WebElement getTxtclickroomtype() {
		return txtclickroomtype;
	}
	public WebElement getTxtdesroomname() {
		return txtdesroomname;
	}
	//1.
private String getSelectHotelSuccessMsg() {
	String text = getText(txthotelSuccessmessage);
	return text;
}
	private void selectHotelName() {
     hotelName="Hyatt Regency Chennai Deluxe";
     hotelprice="$ 1,416";
     clickButton(btnClick);
	}
	private void acceptHotelSelect() {
		clickokAlert();
	}
	private String bookHotelSuccesMsgtxt() {
		String text1 = getText(txthotelSuccessmessage);
		return text1;

	}
	//2.
	private void dismissHotelSelect() {
		clickcancelAlert();

	}
	

//3.clickhotel low to high
	private void clickHotelLowtoHigh() {
		clickButton(txtlowtohighclick);

	}
	private void verifyHotelAsc() {
		List<Integer>ascendprice=new ArrayList<Integer>();
		for (Integer a : ascendprice) {
			System.out.println(a);
			
		}
Collections.sort(ascendprice);
System.out.println(ascendprice);
	
	Collections.reverse(ascendprice);
	//3.Equality
	
	
	
	
	}
	
	

}
