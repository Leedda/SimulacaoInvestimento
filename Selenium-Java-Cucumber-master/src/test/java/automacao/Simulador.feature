# encoding: iso-8859-1

Feature: Simula Investimentos

  Scenario Outline: Simular investimento
    Given Acesso o sistema
    When informo valor inicial da aplicacao "<valorAplicar>"
    And informo o valor a investir "<valorInvestir>"
    And informo o periodo de tempo "<tempo>"
    When acesso o botao simular
    Then Eu visualizo uma tabela de valores e tempo de investimento "<texto>"

    Examples: 
      | valorAplicar | valorInvestir | tempo    | texto                             | 
      | 20.00        |   2.802,00    |  112     | Em 112 meses você terá guardado   |
      | 20.00        |   3.174,00    |  124     | Em 124 meses você terá guardado   |
      | 20.00        |   3.564,00    |  136     | Em 136 meses você terá guardado   |
      | 20.00        |   3.971,00    |  148     | Em 148 meses você terá guardado   |
      | 19.99        |   3.971,00    |  148     | Valor mínimo de 20.00             |
