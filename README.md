
# App Android: Login com Navegação

Este é um projeto de estudo para Android que demonstra um fluxo de autenticação e navegação entre telas, utilizando conceitos essenciais do desenvolvimento com Kotlin.

## 🚀 Funcionalidades

O aplicativo possui um fluxo simples com duas telas principais:

1.  **Tela de Login (`MainActivity`):**
    -   Um formulário para inserir nome de usuário e senha.
    -   Ao clicar em "Entrar", os dados são validados.
    -   Se o login for bem-sucedido (usuário: `Odair`, senha: `123`), o app navega para a tela de boas-vindas.
    -   Em caso de falha, uma mensagem de erro é exibida.

2.  **Tela de Boas-Vindas (`BemVindoActivity`):**
    -   Exibe uma mensagem simples de "Bem-vindo!".
    -   Apresenta uma `Toolbar` no topo com um botão de **voltar** (Up Action).
    -   Ao clicar no botão "voltar", o usuário retorna para a tela de login.

## 🛠️ Conceitos e Tecnologias Aplicadas

Este projeto foi construído para praticar os seguintes conceitos fundamentais do Android:

-   **Linguagem Kotlin:** Utilizada para todo o código lógico do app.
-   **Activities:** Duas `Activities` (`MainActivity` e `BemVindoActivity`) para gerenciar as telas e seus ciclos de vida.
-   **`Intent`:** Usada para realizar a navegação explícita da tela de login para a tela de boas-vindas.
-   **`Toolbar`:** Implementada como a `ActionBar` da segunda tela para dar controle sobre a interface e permitir a adição de botões.
-   **Navegação "Up":** A relação "pai-filho" entre as Activities foi declarada no `AndroidManifest.xml` para garantir que o botão "voltar" na `Toolbar` funcione corretamente.
-   **Kotlin Extensions:** Funções de extensão foram criadas para simplificar chamadas repetitivas, como a exibição de `Toasts` e a configuração de `onClick`.

## Como Executar

1.  Clone este repositório.
2.  Abra o projeto no Android Studio.
3.  Compile e execute o aplicativo em um emulador ou dispositivo físico.
4.  Use as credenciais abaixo para testar o fluxo:
    -   **Login:** `Odair`
    -   **Senha:** `123`
