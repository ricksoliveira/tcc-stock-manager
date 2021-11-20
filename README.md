# TG - Gerenciador de Estoques

> Esta aplicação é um software para a gestão de estoques e banco de dados utilizando as tecnologias `Java` e `MySQL`.
> 
> Desenvolvido por [Henrique Servidoni de Oliveira](https://www.linkedin.com/in/ricksoliveira/) como TCC da faculdade de
> 
> Análise e Desenvolvimento de Sistemas da [FATEC Campinas](https://www.fateccampinas.com.br/site/)

<br/>

# Sumário

> -  [Instruções de Uso](https://github.com/ricksoliveira/tcc-stock-manager#instruções-de-uso)
> -  [Modelagem](https://github.com/ricksoliveira/tcc-stock-manager#modelagem)
>     - [Requisitos Funcionais](https://github.com/ricksoliveira/tcc-stock-manager#requisitos-funcionais)
>     - [Requisitos Não Funcionais](https://github.com/ricksoliveira/tcc-stock-manager#requisitos-não-funcionais)
>     - [Diagrama de Caso de Uso](https://github.com/ricksoliveira/tcc-stock-manager#diagrama-de-caso-de-uso)
>     - [Diagramas de Sequência](https://github.com/ricksoliveira/tcc-stock-manager#diagramas-de-sequência)
>       - [Realizar Venda](https://github.com/ricksoliveira/tcc-stock-manager#realizar-venda)
>       - [Cadastrar Produto](https://github.com/ricksoliveira/tcc-stock-manager#cadastrar-produto)
>       - [Editar Produto](https://github.com/ricksoliveira/tcc-stock-manager#editar-produto)
>       - [Excluir Produto](https://github.com/ricksoliveira/tcc-stock-manager#excluir-produto)
>       - [Gerar Relatório](https://github.com/ricksoliveira/tcc-stock-manager#gerar-relatório)
>     - [Diagrama de Entidade e Relacionamento (MER)](https://github.com/ricksoliveira/tcc-stock-manager#diagrama-de-entidade-e-relacionamento)
>     - [Diagrama de Classes](https://github.com/ricksoliveira/tcc-stock-manager#diagrama-de-classes)
> - [Telas](https://github.com/ricksoliveira/tcc-stock-manager#telas)
> - [Aplicações Futuras](https://github.com/ricksoliveira/tcc-stock-manager#funcionalidades-a-serem-implementadas)

<br/>

# Instruções de uso

> - ### Requisitos:
>     - [Java](https://www.java.com/en/) (qualquer versão acima da versão 8)
>     - [MySQL](https://www.mysql.com)
> 
> 1. Crie um banco de dados chamado `tgdb` com as seguintes características:
>     - Usuário = root
>     - Senha = root123
>     - Host = localhost
>     - Porta = 3306
> 
> 2. Rode o *script* de criação das tabelas, que pode ser encontrado **[aqui](https://pastebin.com/uu8ME2EZ)**.
>  
> 3. Com o *schema* criado, baixe o ZIP deste projeto conforme mostrado no GIF abaixo:
> 
> ![download](https://user-images.githubusercontent.com/68413884/142742031-b17cd44d-6591-45a8-a4a9-773ff90341bd.gif)
> 
> 4. Extraia o ZIP em qualquer lugar e clique no executável `TG_Estoque.jar` localizado no caminho abaixo (também mostrado no GIF em seguida):
> ```
>   /tcc-stock-manager-master/dist/TG_Estoque.jar
> ```
> 
> ![file](https://user-images.githubusercontent.com/68413884/142742246-848ee64a-32de-40f1-ad64-2d099d3f62c3.gif)
> 
> 5. Caso você desejar, pode retirar a pasta `dist` de dentro do projeto e apagar o resto, uma vez que apenas a pasta `dist` é necessária para a aplicação rodar.
> 
>     - ***AVISO: NÃO REMOVA NENHUM ARQUIVO DA PASTA 'DIST' OU DA PASTA 'LIB' DENTRO DELA, CASO CONTRÁRIO A APLICAÇÃO NÃO FUNCIONARÁ***

<br/>

# Modelagem

> - ### Requisitos Funcionais
> ![RF_TG](https://user-images.githubusercontent.com/68413884/142740375-a68513ae-5872-4491-b65d-c8e09a5d1273.png)
> 
> - ### Requisitos Não Funcionais
> ![RNF_TG](https://user-images.githubusercontent.com/68413884/142740393-24925ec9-3290-485c-8168-791683a80e1f.png)
> 
> - ### Diagrama de Caso de Uso
> ![caso de uso TG](https://user-images.githubusercontent.com/68413884/141940468-94b1e16d-5d31-415c-b3ff-c4faab6ed5e6.png)
> 
> - ### Diagramas de Sequência
>   - ### Realizar Venda
>   ![Realizar Venda](https://user-images.githubusercontent.com/68413884/142740496-13607125-007d-4e3a-8912-f6edd394fa9a.png)
>   
>   - ### Cadastrar Produto
>   ![Cadastrar Produto](https://user-images.githubusercontent.com/68413884/142740497-9ee4852d-e341-47c2-a9cc-3d0459b379ff.png)
>   
>   - ### Editar Produto
>   ![Editar Produto](https://user-images.githubusercontent.com/68413884/142740491-01b2335b-82ae-463a-b4ca-84449376b1e9.png)
>   
>   - ### Excluir Produto
>   ![Excluir Produto](https://user-images.githubusercontent.com/68413884/142740492-c0f65848-d674-42b3-80c7-5229323f69be.png)
>   
>   - ### Gerar Relatório
>   ![Gerar Relatório de Venda](https://user-images.githubusercontent.com/68413884/142740494-cd47be39-c12a-40f4-b8ec-a8eeb0a39524.png)
>   
> - ### Diagrama de Entidade e Relacionamento
> ![MER - TG](https://user-images.githubusercontent.com/68413884/141940465-08cc7290-f399-4786-bc37-e66c680d293c.png)
> 
> - ### Diagrama de Classes
> ![Classe - TG](https://user-images.githubusercontent.com/68413884/141940462-e4080734-6f42-457d-aa43-7f7ecc4325be.png)

<br/>

# Telas

> - ## Tela Inicial
> ![Home](https://user-images.githubusercontent.com/68413884/141942898-0becfb74-1e60-48a2-bc4c-d40e3fca34cb.jpg)
> 
> - ## Categorias
> ![Categorias](https://user-images.githubusercontent.com/68413884/141943626-d9cba2ad-c269-466f-9627-a2a2028cfad1.jpg)
> ![Categorias_Excluidas](https://user-images.githubusercontent.com/68413884/141943630-1d7af2ec-91ad-450c-86a8-e7340fe642fe.jpg)
> 
> - ## Finanças
> ![Financas](https://user-images.githubusercontent.com/68413884/141943921-6bf0858f-c38d-4ed5-8167-37e66c73181f.jpg)
> ![Historico_Mensal](https://user-images.githubusercontent.com/68413884/141943926-865265a6-c9ca-4c18-9bbb-12f6d2b47efe.jpg)
> ![Relatorio_Financa](https://user-images.githubusercontent.com/68413884/141943927-c0363853-7324-4e60-aa33-0512b37cda0a.jpg)
> 
> - ## Fornecedores
> ![Fornecedores](https://user-images.githubusercontent.com/68413884/141944022-f46386da-5855-41fc-8b00-c75c4814833b.jpg)
> ![Fornecedores_Excluidos](https://user-images.githubusercontent.com/68413884/141944026-9ef715ac-b473-432e-8cfa-9e01b34baf07.jpg)
> ![Editar_Fornecedor](https://user-images.githubusercontent.com/68413884/141944019-b3935674-fb35-4adb-b347-ffa4a9a08464.jpg)
> ![Novo_Fornecedor](https://user-images.githubusercontent.com/68413884/141944027-880a5136-cc23-419b-83fe-2fec8ce8665b.jpg)
> 
> - ## Métodos de Pagamento
> ![MetodosPagamento](https://user-images.githubusercontent.com/68413884/141944161-1c30fcf0-f09e-4091-93d6-2dfefa472eac.jpg)
> ![MetodosPagamento_Excluidos](https://user-images.githubusercontent.com/68413884/141944166-19b6812f-0108-4e55-aeb2-223fd6d932eb.jpg)
> 
> - ## Produtos
> ![Produtos_Excluidos](https://user-images.githubusercontent.com/68413884/141944224-44f9f407-438b-42ef-a40a-4054064c930a.jpg)
> ![Produtos](https://user-images.githubusercontent.com/68413884/141944220-9001a1c0-7156-433e-a4ad-c9f396696154.jpg)
> ![Editar_Produto](https://user-images.githubusercontent.com/68413884/141944215-3fb6d8d3-c573-4b31-87a4-af2bf65a894b.jpg)
> ![Novo_Produto](https://user-images.githubusercontent.com/68413884/141944219-1327f051-9fb1-4171-a5b5-2650c733f211.jpg)
> 
> - ## Promoções
> ![Promocoes](https://user-images.githubusercontent.com/68413884/141944285-ce856ff1-dcac-41f3-bf2d-f7157a2e7112.jpg)
> ![Promocoes_Excluidas](https://user-images.githubusercontent.com/68413884/141944290-9acd80b5-4d0d-4182-ada8-cfb79b331c71.jpg)
> 
> - ## Usuários
> ![Usuarios](https://user-images.githubusercontent.com/68413884/141944363-ef42600c-ec61-4488-9d4e-6c6a3fe1216d.jpg)
> ![Usuarios_Excluidos](https://user-images.githubusercontent.com/68413884/141944367-f4824904-08b5-4eeb-a5cf-9f921c9cfd1d.jpg)
> ![Editar_Usuario](https://user-images.githubusercontent.com/68413884/141944371-36a8443a-348b-4d17-9b6c-07444b5f17a3.jpg)
> ![Novo_Usuario](https://user-images.githubusercontent.com/68413884/141944372-ba2596dc-f1f1-43ad-acbb-99720caf5fec.jpg)
> 
> - ## Vendas
> ![Nova_Venda](https://user-images.githubusercontent.com/68413884/141944435-11680b7e-e736-413c-a13d-fa0883cc5808.jpg)
> ![Carrinho](https://user-images.githubusercontent.com/68413884/141944431-98f066f0-253d-4c22-9de2-ece805cf0b85.jpg)
> ![Vendas](https://user-images.githubusercontent.com/68413884/141944442-f72d2f0f-e1cb-4946-a9bd-d0f0ec48bbfa.jpg)
> ![Relatorio_Venda](https://user-images.githubusercontent.com/68413884/141944437-b40e2ebf-c04f-40fc-8a33-65177550c0a8.jpg)
> ![Relatorio_Vendas](https://user-images.githubusercontent.com/68413884/141944440-50332fb8-cc0b-443b-a5e1-f3a9068d75dc.jpg)

<br/>

# Funcionalidades a serem implementadas:

> - ## RF
> ![RF_Futuro](https://user-images.githubusercontent.com/68413884/142740550-71b85303-3f47-4700-b57c-8e09fdeae4b3.png)
> 
> - ## RNF
> ![RNF_Futuro](https://user-images.githubusercontent.com/68413884/142740560-9e7aa236-a604-40ac-a895-ff1a23c1ca59.png)
