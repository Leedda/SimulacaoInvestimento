# encoding: iso-8859-1

Feature: Simula Investimentos

  Scenario Outline: Simular investimento
    Given Acesso o sistema
    When informo valor inicial da aplicacao "<valor>"
    And informo o valor a investir "<valor>"
    And informo o periodo de tempo "<tempo>"
    When acesso o botao simular
    Then Eu visualizo uma tabela de valores e tempo de investimento "<mensagem>"

    Examples: 
      | valor | tempo    | mensagem      | 
      | 2.802 |  112     | Rendimentos   |
      | 3.174 |  124     | Rendimentos   |
      | 3.564 |  136     | Rendimentos   |
      | 3.971 |  148     | Rendimentos   |

      



