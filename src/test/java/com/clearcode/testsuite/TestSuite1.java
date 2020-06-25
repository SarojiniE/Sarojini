package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.ContactFormPage;
import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;

import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{


	@Test(enabled=true,priority=1,dataProvider="contactForm",dataProviderClass=LoginData.class)
	public void contactForm(String name, String email, String subject, String msg) throws InterruptedException {
		//wdu.type(HomePage.username_ip, data[0]);
		//wdu.type(HomePage.pwd_ip, data[1]);
		//wdu.click(HomePage.login_btn);
		//wdu.mouseOver(MenuBar.patient_menu);
		//wdu.click(MenuBar.newPatient_menu);
		//wdu.selectByVisibleText(PatientPage.title_select, data[2]);
		//wdu.type(PatientPage.fname_ip, data[3]);
		//wdu.type(PatientPage.lname_ip, data[4]);
		wdu.click(HomePage.blog_btn);
		wdu.click(HomePage.dropUs_lnk);
		wdu.type(ContactFormPage.name_ip, name);
		wdu.type(ContactFormPage.email_ip, email);
		wdu.type(ContactFormPage.subject_ip, subject);
		wdu.type(ContactFormPage.msg_ip, msg);
		wdu.click(ContactFormPage.send_btn);
		//wdu.assertText(ContactFormPage.submit_errormsg, "One or more fields have an error. Please check and try again.");
		wdu.assertText(ContactFormPage.submit_msg, "There was an error trying to send your message. Please try again later.");
		//wdu.exit();
		//wdu.type(ContactFormPage.name_ip, "manzoor111");
		//wdu.type(ContactFormPage.email_ip, "alex@gmail1111.com");
		//wdu.type(ContactFormPage.subject_ip, "apartments");
		//wdu.type(ContactFormPage.msg_ip, "looking for an apartments");
	}
	
	@Test(enabled=true,priority=2,dataProvider="contactForm1",dataProviderClass=LoginData.class)
	public void contactForm1(String name, String email, String subject, String msg) throws InterruptedException {
		wdu.click(HomePage.blog_btn);
		wdu.click(HomePage.dropUs_lnk);
		wdu.type(ContactFormPage.name_ip, name);
		wdu.type(ContactFormPage.email_ip, email);
		wdu.type(ContactFormPage.subject_ip, subject);
		wdu.type(ContactFormPage.msg_ip, msg);
		wdu.click(ContactFormPage.send_btn);
		wdu.assertText(ContactFormPage.submit_errormsg, "One or more fields have an error. Please check and try again.");
		//wdu.exit();
		//wdu.type(ContactFormPage.name_ip, "manzoor111");
		//wdu.type(ContactFormPage.email_ip, "alex@gmail1111.com");
		//wdu.type(ContactFormPage.subject_ip, "apartments");
		//wdu.type(ContactFormPage.msg_ip, "looking for an apartments");
	}
	
	
	//@Test(dataProvider="SearchPatient",dataProviderClass=LoginData.class)
	//public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
	//	wdu.type(HomePage.username_ip, user);
	//	wdu.type(HomePage.pwd_ip, pwd);
	//	wdu.click(HomePage.login_btn);
	//	wdu.mouseOver(MenuBar.patient_menu);
	//	wdu.click(MenuBar.newPatient_menu);
	//	wdu.selectByVisibleText(PatientPage.title_select, title);
	//	wdu.type(PatientPage.fname_ip, fname);
	//	wdu.type(PatientPage.lname_ip, lname);
	//}
	
}
