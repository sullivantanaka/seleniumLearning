package com.phpTravel.TestCases;

import com.phpTravel.Pages.hotelsPage;
import com.phpTravel.Pages.topNavBar;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class verifyHotelsPage {
	
	WebDriver driver = new FirefoxDriver();
	
	String baseUrl = "https://www.phptravels.net";
	
	topNavBar topNavBar = new topNavBar(driver);
	hotelsPage hotelsPage = new hotelsPage(driver);
	
	@Before
	public void setUp() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@After
	public void tearDown() {
		System.out.println("Fim do Teste");
		driver.quit();
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
@Ignore	@Test //este teste valida a exibi��o do mapa
	public void verifyMap() {
		topNavBar.clickHotelButton();
		hotelsPage.clickViewMapBtn();
		assertTrue(hotelsPage.mapVisible());
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
@Test //este teste valida que os valores de checkin = hoje e checkout = amanh�
	public void verifyFilterbyDefaultDate() {
		
		//obtendo as datas de hoje e amanh�
			// converter date para calendar
	        Calendar c = Calendar.getInstance();
	        c.getTime();
	        
	        Date tempToday = c.getTime();
	
	        // somar um dia
	        c.add(Calendar.DATE, 1);	
	        
	        //criando formatador de data de acordo com a aplica��o
	        Date tempTomorrow = c.getTime();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        
	        String today    = formatter.format(tempToday);
	        String tomorrow = formatter.format(tempTomorrow);
		
		//iniciando a navega��o
        topNavBar.clickHotelButton();
		hotelsPage.clickModifyFilterBtn();
		
		//obtendo as datas default exibidas na tela
		String checkinDate  = hotelsPage.getCheckinDate();
		String checkoutDate = hotelsPage.getCheckoutDate();
		
		//fazendo as asser��es
		Assert.assertEquals(today   , checkinDate);
		Assert.assertEquals(tomorrow, checkoutDate);		
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
@Test //este teste valida o filtro por datas Checkin e Checkout somente
	public void verifyFilterByDate() {
		topNavBar.clickHotelButton();
		topNavBar.clickBlogButton();
		hotelsPage.clickModifyFilterBtn();
		hotelsPage.fillCheckin("01/08/2018");
		hotelsPage.fillCheckout("10/08/2018");
		hotelsPage.clickSearchBtn();
		//concluir verificacoes aqui depois
	}
	
////////////////////////////////////////////////////////////////////////////////////////
	
	@Ignore @Test //este teste verifica o filtro de hot�is por estrelas
	public void filterSearchByStarRating() {
		topNavBar.clickHotelButton();
		hotelsPage.selectOneStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectTwoStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectThreeStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectFourStarRating();
		hotelsPage.clickFilterSearchBtn();
		
		hotelsPage.selectFiveStarRating();
		hotelsPage.clickFilterSearchBtn();
	}
	
	
} //verifyHotelsPage
