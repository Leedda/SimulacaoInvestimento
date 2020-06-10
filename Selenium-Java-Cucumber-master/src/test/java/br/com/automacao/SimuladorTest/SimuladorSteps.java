package br.com.automacao.SimuladorTest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimuladorSteps {
	
	WebDriver driver;
	SimuladorPage simuladorPage;
	
	@Given("Acesso o sistema")
	public void acessarSistema() {
		driver.navigate().to("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	}
	
	@When("^informo valor inicial da aplicacao \"<valor>\" \"([^\"]*)\",\"([^\"]*)\"e\"([^\"]*)\"")
	public void informoValorInicialDaAplicacao(String valor) {
		simuladorPage.preencherCampoValorInicial(valor);
	}
	
	@And("^informo o valor a investir \"<valor>\" \"([^\"]*)\"$")
	public void informoOValorAInvestir(String valor){
		simuladorPage.preencherCampoValorInvestir(valor);
	}

	@Then("^informo o periodo de tempo \"<tempo>\" \"([^\"]*)\"$")
	public void informoOPeriodoDeTempo(String tempo){
		simuladorPage.preencherCampoPeriodoDeTempo(tempo);
	}
	
	@After(order = 2, value = { "@funcionais" })
	public void screenshot(Scenario cenario) {

		File file = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + cenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 1, value = { "@funcionais" })
	public void fechaBrowser() throws InterruptedException {

		Driver.killDriver();
		System.out.println("finalizando cenário de teste.");
	}
			
}
