package automacao;

import org.openqa.selenium.By;

public class SimuladorPage extends SimuladorBasePage{
	
	
	public void acessarTelaPrincipal() {
		acessar(BaseURL);
	}
	
	public void preencherCamposDatela(String valorAplicar, String valorInvestir, String tempo, String blocoResultadoSimulacao) {
		escrever(By.id("valorAplicar"),valorAplicar);
		escrever(By.id("valorInvestir"),valorInvestir);
		escrever(By.id("tempo"),tempo);
		
	}
	
	public void preencherCampoValorAplicar(String valorAplicar) {
		escrever(By.id("valorAplicar"),valorAplicar);
	}
	
	public void preencherCampoValorInvestir(String valorInvestir) {
		escrever(By.id("valorInvestir"),valorInvestir);
	}
	
	public void preencherCampoTempo(String tempo) {
		escrever(By.id("tempo"),tempo);
	}

	public void cliqueBotaoSimular() {
		clique(By.className("btn btnAmarelo btnSimular"));
	}

	public String getMensagem() {
		return obterTexto(By.className("blocoResultadoSimulacao"));
	}
	
}
