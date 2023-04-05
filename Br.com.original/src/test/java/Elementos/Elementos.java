package Elementos;

import org.openqa.selenium.By;

public class Elementos {
    private By validarCoockies = By.id("onetrust-accept-btn-handler");
	
	private By btnAbrirConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
			
	private By btnAbrirContaParaVoce = By.id("bt1");		

    private By campoNome = By.name("nome"); 
	
    private By campoTelefone = By.name("telefone");
    
    private By campoEmail = By.id("email");
    
    private By campoCpf = By.id("cpf");

    private By btnSerCliente = By.id("btnEnviar");
    
    private By textoCapturado = By.xpath("/html/body/div[3]/div[1]/div/div[1]/p");
    
    private By textoEsperado = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p");
    
	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnSerCliente() {
		return btnSerCliente;
	}

	public By getValidarCoockies() {
		return validarCoockies;
	}

	public By getTextoCapturado() {
		return textoCapturado;
	}

	public By getTextoEsperado() {
		return textoEsperado;
	}
    
    
    
    
}
