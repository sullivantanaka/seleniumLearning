/**
 * 
 */
package com.phpTravel.TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.phpTravel.Pages.topNavBar;

/**
 * @author tanakasu
 *
 * Estes testes verificam a navega??o b?sica dos bot?es do menu superior
 * 
 */
public class VerifyHomePage {

	String baseUrl = "https://www.phptravels.net";
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void setUp() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@After
	public void tearDown() {
		System.out.println("Fim do Teste");
		//driver.quit();
	}
	
	@Test //este teste verifica todos os botoes do menu superior, abrindo cada pagina
	public void verifyBasicTopBarNavigation() {
		
		topNavBar topNavBar = new topNavBar(driver);
		topNavBar.clickHotelButton();
		topNavBar.clickFlightsButton();
		topNavBar.clickToursButton();
		topNavBar.clickCarsButton();
		topNavBar.clickOffersButton();
		topNavBar.clickVisaButton();
		topNavBar.clickBlogButton();
		topNavBar.clickHomeButton();
		//topNavBar.
		
	}
	
} //verifyHompePage
