/**
 * 
 */
package com.phpTravel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author tanakasu
 * 
 * 	Esta classe ira armazenar todos os locators da barra superior
 *
 */
public class topNavBar {

	private WebDriver driver;
	
	// definindo os locators
	private By homeButton    = By.cssSelector("a.navbar-brand:nth-child(1)");
	private By hotelButton   = By.cssSelector("li.main-lnk:nth-child(1) > a:nth-child(1)");
	private By flightsButton = By.cssSelector("li.main-lnk:nth-child(2) > a:nth-child(1)");
	private By toursButton   = By.cssSelector("li.main-lnk:nth-child(3) > a:nth-child(1)");
	private By carsButton    = By.cssSelector("li.main-lnk:nth-child(4) > a:nth-child(1)");
	private By offersButton  = By.cssSelector("li.main-lnk:nth-child(5) > a:nth-child(1)");
	private By visaButton    = By.cssSelector("li.main-lnk:nth-child(6) > a:nth-child(1)");
	private By blogButton    = By.cssSelector("li.main-lnk:nth-child(7) > a:nth-child(1)");

	//definindo o construtor
	public topNavBar(WebDriver driver) {
		this.driver = driver;
	}
	
	//definindo os m�todos de intera��o
	public void clickHomeButton() {
		driver.findElement(homeButton).click();
	}

	public void clickHotelButton() {
		driver.findElement(hotelButton).click();
	}

	public void clickFlightsButton() {
		driver.findElement(flightsButton).click();
	}

	public void clickToursButton() {
		driver.findElement(toursButton).click();
	}

	public void clickCarsButton() {
		driver.findElement(carsButton).click();
	}

	public void clickOffersButton() {
		driver.findElement(offersButton).click();
	}
	
	public void clickVisaButton() {
		driver.findElement(visaButton).click();
	}

	public void clickBlogButton() {
		driver.findElement(blogButton).click();
	}


	// declarar demais metodos aqui depois!!!!
	
}
