# Projeto Base BDD+SeleniumWebDriver+Cucumber

- Projeto base para testes automatizando em Java com escrita de BDD utilizando a linguagem Gherkin e utilizando Cucumber com o Selenium WebDriver. 

Pré-requisito para execução dos testes
1- Possuir o jdk instalado.

2- Baixar o projeto e importar na IDE de sua preferência. Deve configurar para utilizar a versão mais atual do JRE instalado na sua máquina.

Para configurar no eclipse siga os passos abaixo:

Clique com botão direito sobre o projeto e clique em "Properties".
Selecione no menu lateral esquerdo a opção "Java Build Path" e depois a aba "Libraries".
Em seguida verifique se a versão jre já é a mais atual, caso não seja(se por exemplo estiver a versão 1.5) selecione e remova.
Caso tenha removido, clique em "Add Library" e com a opção "JRE System Library" marcada clique em "Next".
Com a opção "Workspace default JRE (jre1......) selecionada clique em "Finish".
Para finalizar clique em "OK".
3- Alterando o Encoding do projeto. O enconding file do Projeto deve ser o UTF-8.

Para configurar o encoding no eclipse siga os passos abaixo:

Clique com botão direito sobre o projeto e clique em "Properties".
No menu lateral esquerdo selecione a opção "Resource".
Em seguida dentro de "Text file encoding" selecione a opção "Other" selecionando para ela o valor "UTF-8" e clique em "OK".
4- Verificar a versão do seu navegador Chrome. A versão utilizada no projeto é a 83. Caso esteja usando outra versão do navegador deve substituir o driver no caminho resources/drivers. Você pode estar baixando o driver referente a versão do navegador chrome utilizado em https://chromedriver.chromium.org/downloads.

5- Instalação do framework lombok na ide que esteja utilizando.

Para instalar na IDE Eclipse deve seguir os passos descritos em https://projectlombok.org/setup/eclipse.
Para instalar na IDE InlelliJ deve seguir os passos descritos em https://projectlombok.org/setup/intellij.
Executando os testes
Os testes devem ser executados a partir das classes que estão dentro do pacote runners que está no caminho src/teste/java/br.com.automacao.SimulacaoInvestimento.

Geração de relatório de execução de teste
Após a execução dos testes serão gerados dois tipos de relatório, um em html e o segundo em json. Eles ficam armazenados no path target > reports.

Geração de screenshots
Após a execução de cada cenário de teste uma foto da tela é capturada e armazenada no path target > screenshots.
