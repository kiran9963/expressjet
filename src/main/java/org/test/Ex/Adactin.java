package org.test.Ex;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin extends Task {
	public static void main(String[] args) throws IOException {
		
		url("https://adactin.com/HotelApp/Register.php");
			
            send("//input[@name='username']", getData(1,2));
			
			send("//input[@name='password']", getData(1,3));
			
			send("//input[@name='re_password']", getData(1,3));
			
			send("//input[@name='full_name']", getData(2,0));
			
			send("//input[@name='email_add']", getData(4,2));
			
			send("//input[@name='captcha']", getData(4,2));
			
			 xpath("//input[@type='checkbox']").click();
			
			
			


}
}
