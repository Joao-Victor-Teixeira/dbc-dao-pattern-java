Projeto DAO com JDBC em Java
Este projeto é uma implementação do padrão de design Data Access Object (DAO), focado em demonstrar como estruturar uma aplicação Java para separar a lógica de acesso a dados da lógica de negócios. Ele utiliza JDBC (Java Database Connectivity) para realizar a comunicação com um banco de dados MySQL.



Este repositório foi criado com base no material do curso de "Programação Orientada a Objetos com Java" do Prof. Dr. Nelio Alves.

Conceitos Principais
O projeto demonstra os seguintes conceitos e técnicas:

Padrão DAO (Data Access Object): Abstrai e encapsula todo o acesso ao banco de dados. Para cada entidade (como Seller e Department), existe um objeto DAO correspondente.


Interfaces e Implementações: O padrão é implementado usando interfaces (ex: SellerDao ) que definem as operações, e classes concretas (ex: SellerDaoJDBC ) que implementam essas operações usando JDBC.



Padrão Factory: Uma classe DaoFactory é usada para instanciar as implementações concretas do DAO, facilitando a injeção de dependência.




Operações CRUD: Implementação completa das operações de Create, Read, Update e Delete (insert , findById , findAll , update , delete ).






Gerenciamento de Conexão JDBC: Utiliza uma classe auxiliar DB para obter e fechar conexões com o banco de dados , lendo as configurações de um arquivo db.properties.




Tratamento de Exceções: Emprega exceções personalizadas (DbException , DbIntegrityException ) para um melhor gerenciamento de erros de banco de dados.



Controle de Transações: Demonstra como executar operações dentro de uma transação, utilizando setAutoCommit(false) , commit() e rollback().



Mapeamento Objeto-Relacional Manual: Mostra como mapear dados de um ResultSet para objetos Java (como Seller e Department ), incluindo o tratamento correto de associações.





Estrutura do Projeto

/ (raiz): Contém o arquivo db.properties  com os dados de conexão.


db: Pacote com a classe DB para gerenciamento de conexão e as exceções personalizadas.




model/entities: Classes de entidade (POJOs), como Department e Seller.



model/dao: Interfaces DAO, como DepartmentDao e SellerDao.


model/dao/impl: Implementações JDBC das interfaces DAO, como DepartmentDaoJDBC e SellerDaoJDBC.



application: Classes de programa (ex: Program e Program2 ) para testar as implementações do DAO.

Tecnologias Utilizadas
Java


JDBC (Java Database Connectivity) 


MySQL Server 


MySQL Connector/J (Driver JDBC do MySQL) 

Como Executar
Banco de Dados:

Instale o MySQL Server e o MySQL Workbench.

Crie um novo schema (base de dados) chamado coursejdbc.


Execute o script SQL (disponível no material de apoio ) para criar as tabelas department e seller e popular o banco.

Configuração do Projeto:

Baixe o MySQL Java Connector.

Adicione o arquivo .jar do conector ao Build Path do seu projeto Java (no Eclipse, isso pode ser feito via Window -> Preferences -> Java -> Build path -> User Libraries ).

Crie um arquivo db.properties  na raiz do projeto com o seguinte conteúdo, ajustando os valores conforme sua instalação do MySQL:

Properties

dburl=jdbc:mysql://localhost:3306/coursejdbc [cite: 38]
user=seu_usuario_mysql [cite: 36]
password=sua_senha_mysql [cite: 37]
useSSL=false [cite: 39]
Execução:

Compile e execute as classes Program e Program2  no pacote application para ver os testes das operações DAO em funcionamento.
