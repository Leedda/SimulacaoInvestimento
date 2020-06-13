package automacao;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimuladorSteps {
	
	private SimuladorPage simulador;
	
	
	@Before
	public void setUp() {
		DriverFactory.getDriver();
		simulador = new SimuladorPage();
	}
	
	@Given("^Acesso o sistema$")
	public void acesso_o_sistema() throws Throwable {
		simulador.acessarTelaPrincipal();
	    
	}

	@When("^informo valor inicial da aplicacao \"([^\"]*)\"$")
	public void informo_valor_inicial_da_aplicacao(String valorAplicar) throws Throwable {
		simulador.preencherCampoValorAplicar(valorAplicar);
	}

	@When("^informo o valor a investir \"([^\"]*)\"$")
	public void informo_o_valor_a_investir(String valorInvestir) throws Throwable {
		simulador.preencherCampoValorInvestir(valorInvestir);
	}

	@When("^informo o periodo de tempo \"([^\"]*)\"$")
	public void informo_o_periodo_de_tempo(String tempo) throws Throwable {
		simulador.preencherCampoTempo(tempo);
	}

	@When("^acesso o botao simular$")
	public void acesso_o_botao_simular() throws Throwable {
		simulador.cliqueBotaoSimular();
	}

	@Then("^Eu visualizo uma tabela de valores e tempo de investimento \"([^\"]*)\"$")
	public void eu_visualizo_uma_tabela_de_valores_e_tempo_de_investimento(String obterTexto) throws Throwable {
	   assertEquals(obterTexto, simulador.getMensagem());
	}
	@After(order = 2, value = { "@funcionais" })
	public void screenshot(Scenario cenario) {

		File file = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + cenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 1, value = { "@funcionais" })
	public void fechaBrowser() throws InterruptedException {

		DriverFactory.killDriver();
		System.out.println("finalizando cenário de teste.");
	}

}
