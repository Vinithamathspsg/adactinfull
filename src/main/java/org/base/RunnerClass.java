package org.base;

import java.io.IOException;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass1;
import org.page.PageClass2;
import org.page.PageClass3;
import org.page.PageClass4;

public class RunnerClass extends BaseClass {
public static void main (String []args) throws IOException, InterruptedException {
	
	BaseClass b = new BaseClass();
	
	b.getDriver("Chrome");
	b.winMax();
	b.getUrl(b.readExcel(2, 7));
	Thread.sleep(2000);
	PageClass1 p1 = new PageClass1();
	WebElement userName = p1.getUserName();
	b.textSendByJs(userName, b.readExcel(7, 0));
	WebElement password = p1.getPassword();
	b.textSendByJs(password, b.readExcel(7, 2));
	WebElement login = p1.getLogin();
	login.click();
	
	PageClass2 p2 = new PageClass2();
	WebElement location = p2.getLocation();
	b.selectByValue(location, "London");
	WebElement hotels = p2.getHotels();
	b.selectByVisibleText(hotels, "Hotel Sunshine");
	WebElement roomType = p2.getRoomType();
	b.selectByVisibleText(roomType, "Deluxe");
	WebElement numRooms = p2.getNumRooms();
	b.selectByValue(numRooms, "1");
	WebElement dateIn = p2.getDateIn();
	b.textSendByJava(dateIn, "25/04/2024");
	WebElement dateOut = p2.getDateOut();
	b.textSendByJava(dateOut, "27/04/2024");
	WebElement adultRoom = p2.getAdultRoom();
	b.selectByValue(adultRoom, "2");
	WebElement childRooms = p2.getChildRooms();
	b.selectByValue(childRooms, "1");
	WebElement search = p2.getSearch();
	search.click();
	
	PageClass3 p3 = new PageClass3();
	WebElement hotelSelect = p3.getHotelSelect();
	hotelSelect.click();
	WebElement continues = p3.getContinues();
	continues.click();
	
	Thread.sleep(3000);
	PageClass4 p4 = new PageClass4();
	WebElement firstName = p4.getFirstName();
	b.textSendByJs(firstName,b.readExcel(7, 3));
	WebElement lastName = p4.getLastName();
	b.textSendByJs(lastName, b.readExcel(7, 4));
	Thread.sleep(1000);
	WebElement address = p4.getAddress();
	b.textSendByJava(address, "No:2,Chennai");
	WebElement creaditNum = p4.getCreaditNum();
	b.textSendByJava(creaditNum, "1122334455667788");
	WebElement creaditType = p4.getCreaditType();
	b.selectByValue(creaditType, "VISA");
	WebElement expMonth = p4.getExpMonth();
	b.selectByValue(expMonth, "7");
	WebElement expYear = p4.getExpYear();
	b.selectByValue(expYear, "2028");
	WebElement cvvNum = p4.getCvvNum();
	b.textSendByJs(cvvNum, b.readExcel(11, 3));
	WebElement bookNow = p4.getBookNow();
	bookNow.click();
	
	Thread.sleep(5000);
	WebElement orderNo = p4.getOrderNo();
	String attribute = orderNo.getAttribute("value");
	System.out.println(attribute);
	
	
	WebElement orderNo1 = p4.getOrderNo();
	b.scrollByJs(orderNo1, "Down");
	
	b.screenShot("Booking no");
	
	
	
	
	
	
	
	
	
}
	
	

}
