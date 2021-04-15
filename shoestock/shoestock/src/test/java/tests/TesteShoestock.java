package tests;

import java.io.IOException;

import elementos.ElementosSho;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MetodosSho;

public class TesteShoestock {

	MetodosSho metodos = new MetodosSho();
	ElementosSho el = new ElementosSho();

	@Given("que eu esteja no site {string}")

	public void que_eu_esteja_no_site(String url) throws InterruptedException, IOException {

		metodos.abrirNavegador(url);
		metodos.pausa(3000);
		metodos.clicar(el.cookies,("Fechar cookies"));
		metodos.screenshot("site da loja");

	}

	@When("acessar a lista de desejos")
	public void acessar_a_lista_de_dessejo() throws InterruptedException, IOException {
		metodos.clicar(el.listaDesejo, ("acessar a lista de sejo"));
		metodos.clicar(el.criarConta,("Entrar no cadastro"));
		metodos.pausa(3000);
		metodos.preencher(el.email, ("sophietaniagalvao-99@lta-am.com.br"));
		metodos.clicar(el.prosseguir, ("Botão prosseguir"));
		metodos.screenshot("Lista de desejo");

	}

	@When("criar uma conta")
	public void criar_uma_conta() throws InterruptedException, IOException {

		metodos.preencher(el.nome, ("Sophie Tânia "));
		metodos.preencher(el.sobreNome, ("Galvão"));
		metodos.clicar(el.sexo, ("Feminino"));
		metodos.preencher(el.dia, ("05"));
		metodos.preencher(el.mes, ("Fev"));
		metodos.preencher(el.ano, ("1991"));
		metodos.preencher(el.cpf, ("34420482818"));
		metodos.preencher(el.cep, ("04872025"));
		metodos.preencher(el.tipoEndereco, ("Rua"));
		metodos.preencher(el.endereco, ("Rua Particular"));
		metodos.preencher(el.numero, ("533"));
		metodos.preencher(el.bairro, ("Jardim Recanto do Sol"));
		metodos.preencher(el.estado, ("SP"));
		metodos.preencher(el.cidade, ("São Paulo"));
		metodos.preencher(el.telefone, ("11982043378"));
		metodos.preencher(el.senha, ("Hc0a1Un4ze"));
		metodos.screenshot("Cadastro");
		metodos.pausa(3000);
		metodos.clicar(el.btContinuar, ("Continuar"));
		metodos.screenshot("Cadastro finalizado");
		
		
		
		
	}

	@Then("valido informacoes")
	public void valido_informacoes() {

	}
}