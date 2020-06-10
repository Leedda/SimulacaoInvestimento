package br.com.automacao.SimuladorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimuladorPage {

	WebDriver driver;

	public SimuladorPage(WebDriver driver) {

		this.driver = driver;
	}

	public void preencherCampoValorInicial(String valor) {
		int valorMinimo = 0;
		driver.findElement(By.id("valorAplicar")).sendKeys(valor);
		valorMinimo = Integer.parseInt(valor);
		if(valorMinimo < 20.00) {
			String mensagem = "";
			driver.findElement(By.id("valorAplicar-error")).sendKeys(mensagem);
		}
	}

	public void preencherCampoValorInvestir(String valor) {
		driver.findElement(By.id("valorInvestir")).sendKeys(valor);
	}
	
	public void preencherCampoPeriodoDeTempo(String tempo) {
		driver.findElement(By.id("tempo")).sendKeys(tempo);
		driver.findElement(By.name("submit")).click();
	}

}
