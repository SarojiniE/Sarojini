package com.clearcode.po;

import org.openqa.selenium.By;

public class ContactFormPage {
	// public static By username_ip = By.id("authUse");
	// public static By pwd_ip = By.id("clearPass");
	// public static By login_btn = By.className("fa-sign-in");
	
	public static By name_ip = By.name("name");
	public static By email_ip = By.name("email");
	public static By subject_ip = By.name("subject");
	public static By msg_ip = By.name("id:comments");
	public static By send_btn = By.xpath("//input[@value='Send']");
	public static By submit_msg = By.className("wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng");
	public static By submit_errormsg = By.className("wpcf7-response-output wpcf7-display-none wpcf7-validation-errors");
}
