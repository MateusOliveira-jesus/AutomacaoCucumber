package Steps;
import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {	

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que acesse a url {string}")
	public void que_acesse_a_url(String url) {
    m.abrirNavegador(url);
	}

	@Given("clique no botao abrir conta")
	public void clique_no_botao_abrir_conta() {
       
		m.clicar(e.getValidarCoockies());
		m.clicar(e.getBtnAbrirConta());
		
	}

	@Given("clique no botao abrir conta para voce")
	public void clique_no_botao_abrir_conta_para_voce() {

	m.clicar(e.getBtnAbrirContaParaVoce());	
		
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
	 m.preencher(e.getCampoCpf(), "61793982830");
	 m.preencher(e.getCampoEmail(), "diogo_thales_araujo@dosnu.com.br");
	 m.preencher(e.getCampoTelefone(), "11983607407");
     m.preencher(e.getCampoNome(), "Diogo Thales Araújo");
	}

	@When("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() {
     m.clicar(e.getBtnSerCliente());
	}

	@Then("sera exibido a mensagem falta pouco")
	public void sera_exibido_a_mensagem_falta_pouco() {
    m.validarTexto(e.getTextoCapturado(), e.getTextoEsperado());
	m.fecharNavegador(); 
	}
}
