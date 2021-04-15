package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		// caminhos da features
		features = "src/test/resources/feature",
		
		//pacote das class de testes
		glue ="tests",
		
		//nome da tag no arquivo gherkins para executaros casos de testes correspondentes
		tags = "@executa",
		
		//formatar visualizar do codigo no console | report html
		plugin = {"pretty", "html:target/report.html"},
		
		//validar se existem features sem sptes implementados
		dryRun = false
		
		)
		
		

public class Executa {

}
