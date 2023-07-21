package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.BaseClass;

public class BookHotelPage extends BaseClass{
	@FindBy(xpath="//h2[text()='Book Hotel - Hyatt Regency Chennai Deluxe']")
	private WebElement txtsuccesmsgbook;
	@FindBy(id="own")
	private WebElement btnClickmyself;
	@FindBy(id="user_title")
	private WebElement txtsalutation;
	@FindBy(id="first_name")
	private WebElement txtfname;
	@FindBy(id="last_name")
	private WebElement txtlastname;
	@FindBy(id="user_phone")
	private WebElement txtphoneno;
	@FindBy(id="user_email")
	private WebElement txtemail;
	@FindBy(id="gst")
	private WebElement clickgst;
	@FindBy(id="gst_registration")
	private WebElement txtgstreg;
	@FindBy(id="company_name")
	private WebElement txtcompanyname;
	@FindBy(id="company_address")
	private WebElement txtcompanyadress;
	@FindBy(xpath="//button[text()='Next']")
	private WebElement btnClicknext;
	@FindBy(id="early")
	private WebElement btnClickcheckin;
	@FindBy(id="other_request")
	private WebElement sendreq;
	@FindBy(id="step2next")
	private WebElement btnClicknxt;
	@FindBy(xpath="//div[@class='credit-card pm']")
	private WebElement clickcredit;
	@FindBy(id="payment_type")
	private WebElement txtselectcard;
	@FindBy(id="card_type")
	private WebElement txtcardType;
	@FindBy(id="card_no")
	private WebElement txtcardNo;
	@FindBy(id="card_name")
	private WebElement txtcardname;
	@FindBy(id="card_month")
	private WebElement txtcardmonth;
	@FindBy(id="card_year")
	private WebElement txtcardyear;
	@FindBy(id="cvv")
	private WebElement txtcvv;
	@FindBy(id="submitBtn")
	private WebElement btnsubmit;
	@FindBy(xpath="//div[text()='Please select your card type']")
	private WebElement txterrcard;
	@FindBy(xpath="//div[text()='Please select your card']")
	private WebElement txterrselectcar;
	@FindBy(xpath="//div[text()='Please provide your card number']")
	private WebElement txterrcarnum;
	@FindBy(xpath="//div[text()='Please provide name on your card']")
	private WebElement txterrcardnam;
	@FindBy(xpath="//div[text()='Please provide your Card Expiry Date']")
	private WebElement txterrcardedate;
	@FindBy(xpath="//div[@id='invalid-cvv']")
	private WebElement txterrcvv;
	@FindBy(xpath="//h2[@class='couppon-code']")
	private WebElement txtBookConfirm;
	@FindBy(xpath="//strong[text()='Hyatt Regency Chennai']")
	private WebElement txtconfirmhtl;
	public WebElement getTxtsuccesmsgbook() {
		return txtsuccesmsgbook;
	}
	public WebElement getBtnClickmyself() {
		return btnClickmyself;
	}
	public WebElement getTxtsalutation() {
		return txtsalutation;
	}
	public WebElement getTxtfname() {
		return txtfname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtphoneno() {
		return txtphoneno;
	}
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getClickgst() {
		return clickgst;
	}
	public WebElement getBtnClickgstreg() {
		return txtgstreg;
	}
	public WebElement getClickcompanyname() {
		return txtcompanyname;
	}
	public WebElement getClickcompanyadress() {
		return txtcompanyadress;
	}
	public WebElement getBtnClicknext() {
		return btnClicknext;
	}
	public WebElement getBtnClickcheckin() {
		return btnClickcheckin;
	}
	public WebElement getSendreq() {
		return sendreq;
	}
	public WebElement getBtnClicknxt() {
		return btnClicknxt;
	}
	public WebElement getClickcredit() {
		return clickcredit;
	}
	public WebElement getTxtselectcard() {
		return txtselectcard;
	}
	public WebElement getTxtcardType() {
		return txtcardType;
	}
	public WebElement getTxtcardname() {
		return txtcardname;
	}
	public WebElement getTxtcardmonth() {
		return txtcardmonth;
	}
	public WebElement getTxtcardyear() {
		return txtcardyear;
	}
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	public WebElement getTxterrcard() {
		return txterrcard;
	}
	public WebElement getTxterrselectcar() {
		return txterrselectcar;
	}
	public WebElement getTxterrcarnum() {
		return txterrcarnum;
	}
	public WebElement getTxtcardnam() {
		return txterrcardnam;
	}
	public WebElement getTxterrcardedate() {
		return txterrcardedate;
	}
	public WebElement getTxterrcvv() {
		return txterrcvv;
	}
	public WebElement getTxtBookConfirm() {
		return txtBookConfirm;
	}
	public WebElement getTxtconfirmhtl() {
		return txtconfirmhtl;
	}
	public String getBookHotelSuccessMsg() {
String text = getText(txtBookConfirm);
return text;
	}
	private void addguestDetails(String salution,String firstName,String lastName,String mobileNo,String email) {
clickButton(btnClickmyself);
selectByIndex(txtsalutation, 1);
elementSendkeys(txtfname, "Sowmiya");
elementSendkeys(txtlastname, "Chinnusamy");
elementSendkeys(txtphoneno, "9597903361");
elementSendkeys(txtemail, "sowmiyaec2015@gmail.com");
	}
	private void addGstDetails(String registrationNumber,String companyName,String companySAdress) {
clickButton(clickgst);
elementSendkeys(txtgstreg, "9043592058");
elementSendkeys(txtcompanyname, "Greens Tech OMR Branch");
elementSendkeys(txtcompanyadress, "Thoraipakkam");
clickButton(btnClicknext);

	}
	private void addSpecialReq() {
		
		clickButton(btnClickcheckin);
		elementSendkeys(sendreq, "Floral design");
		clickButton(btnClicknxt);

	}
	private void addPayment(String selectcardType,String selectcard,String cardNumber,String cardName,String selectMonth,String selectYear,String cvv) {
clickButton(clickcredit);
selectByText(txtselectcard, "DebitCard");
selectByText(txtcardType, "Visa");
elementSendkeys(txtcardNo, "5555555555552222");
elementSendkeys(txtcardname, "Sowmi");
selectoptionBytext(txtcardmonth, "March");
selectByText(txtcardyear, "2025");
elementSendkeys(txtcvv, "354");
clickButton(btnsubmit);
//error Message

	}
	private String txtErrorcard() {
		String errcard = getText(txterrcard);
		return errcard;

	}
	private String txtErrorCardType() {
		String text = getText(txterrselectcar);
		return text;

	}
	private String txtErrCardNumber() {
String errCardNumber = getText(txterrcarnum);
return errCardNumber;
	}
	private String txtErrorNameCard() {
		String errname = getText(txterrcardnam);
		return errname;

	}
	private String txtErrorMonth() {
		String errmonth = getText(txterrcardedate);
		return errmonth;

	}
	private String txtErrorCvv() {
		String errcvv = getText(txterrcvv);
		return errcvv;

	}
	
	
	


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

	



}
