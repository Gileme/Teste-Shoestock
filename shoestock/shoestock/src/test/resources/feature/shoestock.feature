#Author:e2etreinamentos@e2etreinamentos.com.br


Feature: Pesquisar no site da loja Shoestock
  Eu como usuario quero criar uma conta na lista de desejos

  
  Scenario: quero criar uma conta na lista de desejos
    Given que eu esteja no site "https://www.shoestock.com.br"
    When acessar a lista de desejos
    And criar uma conta 
    Then valido informacoes

  