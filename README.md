<h4> App Android: Login com NavegaçãoDescrição:</h4> 
<br><br>

    Este é um projeto Android de estudo que implementa um fluxo básico de autenticação e navegação entre telas. <br>
    O aplicativo consiste em uma tela de login que, após a validação, leva o usuário a uma tela de boas-vindas.<br><br>
    Funcionalidades Implementadas:1.Tela de Login (MainActivity):<br>
    ◦Captura os dados de login e senha inseridos pelo usuário.<br>
    ◦Valida as credenciais com valores pré-definidos no código.<br>
    ◦Utiliza Intent para iniciar a próxima tela em caso de sucesso.2.Tela de Boas-Vindas (BemVindoActivity):<br>
    ◦Exibe uma mensagem de boas-vindas ao usuário.<br>
    ◦Apresenta uma Toolbar no topo da tela.<br>
    ◦Inclui um botão de "voltar" (Up Action) na Toolbar que permite ao usuário retornar à tela de login.<br><br>
    Principais Conceitos e Tecnologias:<br>
    •Kotlin: A linguagem de programação utilizada.<br>
    •Activities: Duas telas (MainActivity e BemVindoActivity) compõem o app.<br>
    •Intent: Usada para a navegação entre as duas Activities.<br>
    •Toolbar: Implementada como a ActionBar da tela de boas-vindas.<br>
    •Navegação "Up": Configurada no AndroidManifest.xml para criar uma hierarquia de navegação entre as telas.<br><br>

•Kotlin Extensions: Funções de extensão foram utilizadas para deixar o código da MainActivity mais limpo e legível.
