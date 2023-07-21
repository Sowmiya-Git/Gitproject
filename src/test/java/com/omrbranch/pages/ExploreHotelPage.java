package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class ExploreHotelPage extends BaseClass {
	public void exploreHotel() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement txtloginsuccessmsg;
	@FindBy(id="state")
	private WebElement txtselectstate;
	@FindBy(xpath="//span[@title='Select City *']")
	private WebElement txtselectcity;
	@FindBy(xpath="//textarea[@placeholder='Select Room Type']")
	private WebElement txtroomtype;
	@FindBy(xpath="//input[@name='check_in']")
	private WebElement txtcheckin;
	@FindBy(xpath="//a[text()='18']")
	private WebElement txtcheckin1;
	@FindBy(xpath="//input[@name='check_out']")
	private WebElement txtcheckout;
	@FindBy(xpath="//a[text()='18']")
	private WebElement txtcheckout1;
	@FindBy(id="no_rooms")
	private WebElement txtrooms;
	@FindBy(id="no_adults")
	private WebElement txtadults;
	@FindBy(id="no_child")
	private WebElement txtchild;
	@FindBy(id="searchBtn")
	private WebElement btnsearch;
	
	
	@FindBy(xpath="//h5[text()='Select Hotel']")
	private WebElement txtsuccesshotelMsg;
	@FindBy(id="invalid-state")
	private WebElement txterrorstate;
	@FindBy(id="invalid-city")
	private WebElement txterrorcity;
	@FindBy(id="invalid-check_in")
	private WebElement txterrorcheckin;
	@FindBy(id="invalid-check_out")
	private WebElement txterrorcheckout;
	@FindBy(id="invalid-no_rooms")
	private WebElement txterrorrooms;
	@FindBy(id="invalid-no_adults")
	private WebElement txterroradults;
	
	public WebElement getTxtsuccessmsg() {
		return txtloginsuccessmsg;
	}
	public WebElement getTxtselectstate() {
		return txtselectstate;
	}
	public WebElement getTxtselectcity() {
		return txtselectcity;
	}
	public WebElement getTxtroomtype() {
		return txtroomtype;
	}
	public WebElement getTxtcheckin() {
		return txtcheckin;
	}
	public WebElement getTxtcheckout() {
		return txtcheckout;
	}
	public WebElement getTxtrooms() {
		return txtrooms;
	}
	public WebElement getTxtadults() {
		return txtadults;
	}
	public WebElement getTxtchild() {
		return txtchild;
	}
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	public WebElement getTxtsuccesshotelMsg() {
		return txtsuccesshotelMsg;
	}
	public WebElement getTxterrorstate() {
		return txterrorstate;
	}
	public WebElement getTxterrorcity() {
		return txterrorcity;
	}
	public WebElement getTxterrorcheckin() {
		return txterrorcheckin;
	}
	public WebElement getTxterrorcheckout() {
		return txterrorcheckout;
	}
	public WebElement getTxterrorrooms() {
		return txterrorrooms;
	}
	public WebElement getTxterroradults() {
		return txterroradults;
	}
	public String loginMsgTxt() {
		String text = getText(getTxtsuccessmsg());
		return text;

	}
	public void exploreHotel(String Statename,String CityName,String roomtype,String Checkindate,String Checkoutdate,String noofrooms,String adultsper,String Childrenpercounnt ) {
		selectByText(getTxtselectcity(), Statename);
       selectByText(getTxtselectcity(), CityName);
       selectByText(getTxtroomtype(), roomtype);
       clickButton(getTxtcheckin());
       clickButton(txtcheckin1);
       clickButton(txtcheckout);
       clickButton(txtcheckout1);
       selectByText(getTxtrooms(), noofrooms);
       selectByText(getTxtadults(), adultsper);
      insertValue(getTxtchild(), Childrenpercounnt);
      frameByid("hotelsearch_iframe");
      clickButton(btnsearch);
       	
		
	}
	public void exploreHotelman(String Statename,String CityName,String Checkindate,String Checkoutdate,String noofrooms,String adultsper ) {
		selectByText(getTxtselectcity(), Statename);
	       selectByText(getTxtselectcity(), CityName);
	       clickButton(getTxtcheckin());
	       clickButton(txtcheckin1);
	       clickButton(txtcheckout);
	       clickButton(txtcheckout1);
	       selectByText(getTxtrooms(), noofrooms);
	       selectByText(getTxtadults(), adultsper);
	       frameByid("hotelsearch_iframe");
	       clickButton(btnsearch);
	}	
//3 frameByid("hotelsearch_iframe");
	public void clickSearchButton() {
    frameByid("hotelsearch_iframe");
	clickButton(btnsearch);
	}
	
	public String getSteteErroMsg() {
		 String text = getText(txterrorstate);
		return text;
		
	}
		public String getCityErroMsg() {
		String text2 = getText(txterrorcity);
		return text2;		
}
		private String getcheckInErrorMsg() {
			
			String text3 = getText(txterrorcheckin);
			return text3;

		}
		public String getErrorcheckOutMsg() {
			String text4 = getText(txterrorcheckout);
			return text4;
		}
		public String getErrorRoomsMsg() {
			String text5 = getText(txterrorrooms);
			return text5;
			
		}
		public String getErrorAdults() {
			String text6 = getText(txterroradults);
			return text6;

		}
		
		//4.verify roomtype
		public void selectRoomtype(String Statename,String CityName,String roomtype,String Checkindate,String Checkoutdate,String noofrooms,String adultsper,String Childrenpercounnt ) {
			selectByText(getTxtselectstate(), Statename);
	       selectByText(getTxtselectcity(), CityName);
	       selectByText(getTxtroomtype(), roomtype);
	       
	       clickButton(getTxtcheckin());
	       clickButton(txtcheckin1);
	       clickButton(txtcheckout);
	       clickButton(txtcheckout1);
	       selectByText(getTxtrooms(), noofrooms);
	       selectByText(getTxtadults(), adultsper);
	      insertValue(getTxtchild(), Childrenpercounnt);
	      frameByid("hotelsearch_iframe");
	      clickButton(btnsearch);
	       	
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}