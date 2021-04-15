package elementos;

import org.openqa.selenium.By;

public class ElementosSho {

	public By siteLoja = By.cssSelector("#header-content > header > div > div > section.logo > h1");
	public By listaDesejo = By.xpath("//span[contains(text(),'Lista de Desejos')]");
	public By criarConta = By.cssSelector("#create-account > h2");
	public By cookies = By.cssSelector("body > section > div > div.cookie-notification-button");
	public By email = By.id("sign-up-username");
	public By prosseguir = By.cssSelector("#verify-email-button");

	// Cadastro na lista de desejo
	
	public By nome = By.id("person-name");
	public By sobreNome = By.id("person-last-name");
	public By sexo = By.id("label-female");
	public By dia = By.id("dateofbirth-day");
	public By mes = By.id("dateofbirth-month");
	public By ano = By.id("dateofbirth-year");
	public By cpf = By.id("cpf");
	public By cep = By.id("address-zipcode");
	public By tipoEndereco = By.id("address-street-type");
	public By endereco = By.id("address-name");
	public By numero = By.id("address-number");
	public By bairro = By.id("neighborhood");
	public By estado = By.id("address-state");
	public By cidade = By.id("city");
	public By telefone = By.id("phones-home");
	public By senha = By.id("password");
	public By btContinuar = By.id("save-register-natural");
	
	
}
