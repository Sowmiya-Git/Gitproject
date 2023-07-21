package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class BookingConfirmPage extends BaseClass {
	static String generatedorderId;
	
	@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement txtnavigatesamepage;
	@FindBy(xpath="//a[@class='dropdown-item padding_manage acc_anchor border-bottom ']")
	private WebElement btnClickmyacc;
	@FindBy(xpath="//div[@class='col-md-5']")
	private WebElement bookingsSuccessMsg;
	@FindBy(xpath="//input[@name='search']")
	private WebElement txtSearchBox;
//	@FindBy(xpath="//input[@class='form-control w-50 d-inline-block']")
//	private WebElement txtpassorderId;
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnFirstedit;
	@FindBy(xpath="//input[@class='form-control from hasDatepicker valid']")
	private WebElement btnclickdate;
	@FindBy(xpath="//a[text()='24']")
	private WebElement btnchangedate;
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnclickconf;
	@FindBy(id="//strong[text()='#UHHZT59700']")
	private WebElement txtSuccessMsgOrderid;
	@FindBy(xpath="//li[text()='Booking updated successfully']")
	private WebElement txtsuccessupdatemsg;

	
@FindBy(xpath="//h5[text()='Hyatt Regency Chennai Deluxe']")
private WebElement txtHotelNameSuccessMsg;
@FindBy(xpath="//button[@class='edit btn filter_btn']")
private WebElement txtmodifydate;
@FindBy(xpath="//h5[text()='Hyatt Regency Chennai Deluxe']")
private WebElement txtselectExistingorderid;

public static String getGeneratedorderId() {
	return generatedorderId;
}
public WebElement getTxtnavigatesamepage() {
	return txtnavigatesamepage;
}
public WebElement getBtnClickmyacc() {
	return btnClickmyacc;
}
public WebElement getBookingsSuccessMsg() {
	return bookingsSuccessMsg;
}
public WebElement getTxtSearchBox() {
	return txtSearchBox;
}
public WebElement getBtnFirstedit() {
	return btnFirstedit;
}
public WebElement getBtnclickdate() {
	return btnclickdate;
}
public WebElement getBtnchangedate() {
	return btnchangedate;
}
public WebElement getBtnclickconf() {
	return btnclickconf;
}
public WebElement getTxtSuccessMsgOrderid() {
	return txtSuccessMsgOrderid;
}
public WebElement getTxtsuccessupdatemsg() {
	return txtsuccessupdatemsg;
}
public WebElement getTxtHotelNameSuccessMsg() {
	return txtHotelNameSuccessMsg;
}
public WebElement getTxtmodifydate() {
	return txtmodifydate;
}
public WebElement getTxtselectExistingorderid() {
	return txtselectExistingorderid;
}

private void myBookingPage() {
	clickButton(txtnavigatesamepage);
	clickButton(btnClickmyacc);
}
private String txtBookingsMsg() {
	String bookings = getText(bookingsSuccessMsg);
	return bookings;
}
	private void clickEditbutton() {
		clickButton(btnFirstedit);
		clickButton(btnclickdate);
		clickButton(btnchangedate);
		clickButton(btnclickconf);

	}
	
	private String changeUpdateSuccessMsg() {
		String text = getText(txtsuccessupdatemsg);
		return text;

	}
private void existingOrderId(String orderId) {
	elementSendkeys(txtSearchBox, orderId);
}
public void firstOrder() {
	
}

}
