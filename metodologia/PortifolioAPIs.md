<h1>Portifólio das APIs - Larissa Reis</h1>
<h2>Introdução</h2>
<p>Este portifólio foi criado com o intuito de apresentar os projetos desenvolvidos ao longo do curso de Banco de Dados na Faculdade de Tecnologia de São José dos Campos - Prof. Jessen Vidal.</p>
<h2>Sumário</h2>
<ul>
    <li><a href="#sobre_mim">Sobre mim</a></li>
    <li><a href="#contato">Contato</a></li>
    <li><a href="#projetos">Projetos</a></li>
</ul>

<h2 id="sobre_mim">Sobre mim</h2>
<p>Atualmente, atuo como Engenheira de Dados na Quero Educação, EdTech brasileira, onde sou responsável por manter pipelines de dados e desenvolver soluções para o time de BI. Além disso, sou estudante de Banco de Dados na FATEC São José dos Campos.</p>

<h1 id="contato">Contato</h1>


<h1 id="projetos">Projetos</h1>
<ul>
    <li><a href="#api3">Projeto 3: Sistema de lançamento de horas-extras e sobreavisos</a></li>
</ul>

<h2 id="api3">Sistema de lançamento de horas-extras e sobreavisos</h2>

<h3>Descrição</h3>

<p align="justify">Este projeto foi desenvolvido em parceria com a empresa 2RP. O objetivo era criar uma aplicação web que permitisse a gestão de horas extras e sobreavisos dos colaboradores. A aplicação foi desenvolvida em Java, utilizando o framework Spring Boot e o banco de dados PostgreSQL. No front-end, foram utilizadas as tecnologias HTML, CSS e JavaScript.</p>

<p align="justify">A empresa parceira possuía dificuldades na gestão de horas extras e sobreavisos dos colaboradores, uma vez que o processo era manual e demandava muito tempo. A aplicação desenvolvida permitiu a automatização do processo, facilitando a gestão e o controle das horas lançadas.</p>

<p align="justify">Além disso, permitiu a geração de relatórios com base nas informações lançadas, facilitando a análise e tomada de decisão.</p>

<p align="justify">A aplicação foi dividida em três perfis de usuários: colaborador, gestor e administrador.</p>


<h3>Atuação</h3>
<p>Atuei como Scrum Master e desenvolvedora full-stack. A seguir, estão listadas as minhas contribuições para o projeto:</p>

<details>
    <summary>Modelagem do banco de dados</summary>
    <p>Realizei a modelagem do banco de dados, utilizando o PostgreSQL. O banco de dados foi modelado de acordo com as necessidades da empresa parceira, contemplando as entidades e relacionamentos necessários para a aplicação.</p>
    <p>Nesse processo, fui responsável pela criação do DER (Diagrama de Entidade-Relacionamento) e pela criação dos scripts de criação das tabelas e relacionamentos.</p>
</details>

<details>
    <summary>Criação das rotas PATCH e DELETE da entidade User</summary>
    <p>Criei as rotas PATCH e DELETE da entidade User, utilizando o framework Spring Boot. As rotas permitiam a atualização e inativação de um usuário, respectivamente.</p> 
    <p>Para a rota PATCH, foi necessário validar os dados enviados pelo usuário, garantindo que apenas os campos permitidos fossem atualizados.</p>
    <p>Para a rota DELETE, foi necessário realizar a inativação do usuário, alterando o status do usuário para inativo no banco de dados.</p>
    <p>Além disso, criei a rota para reativação do usuário.</p>
</details>

<details>
    <summary>Criação das rotas Patch e Delete da entidade CR</summary>
    <p>Criei as rotas PATCH e DELETE da entidade CR, utilizando o framework Spring Boot. As rotas permitiam a atualização e inativação de um CR, respectivamente.</p>
    <p>Para a rota PATCH, foi necessário validar os dados enviados pelo usuário, garantindo que apenas os campos permitidos fossem atualizados.</p>
    <p>Para a rota DELETE, foi necessário realizar a inativação do CR, alterando o status do CR para inativo no banco de dados.</p>
    <p>Além disso, criei a rota para reativação do CR.</p>
</details>

<details>
    <summary>Desenvolvimento da tela de cadastro da entidade Cliente, utilizando HTML, CSS e JavaScript.</summary>
    <p>Desenvolvi a tela de cadastro da entidade Cliente, utilizando HTML, CSS e JavaScript. A tela permitia o cadastro de um novo cliente, com informações como nome, e-mail e telefone.</p>
    <p>Para o desenvolvimento da tela, consumi as rotas do back-end, garantindo a integração entre front-end e back-end.</p>
</details>

<details>
    <summary>Desenvolvimento do back-end do apontamento de horas pelo gestor</summary>
    <p>Desenvolvi o back-end do apontamento de horas pelo gestor, utilizando o framework Spring Boot. A rota permitia o gestor apontar as horas trabalhadas por um colaborador, informando o colaborador, a data, a quantidade de horas e o tipo de hora (extra ou sobreaviso).</p>
    <p>Para o desenvolvimento da rota, foi necessário validar as regras de negócio relacionadas ao ciclo de vida da hora, garantindo que as horas fossem aprovadas ou rejeitadas pelo gestor somente caso ainda não tivessem passado pelo ciclo de aprovação do administrador</p>
</details>

<details>
    <sumary>Desenvolvimento do back-end do sistema de aprovação de horas do administrador</sumary>
    <p>Desenvolvi o back-end do sistema de aprovação de horas do administrador, utilizando o framework Spring Boot. A rota permitia o administrador aprovar ou rejeitar as horas apontadas pelo gestor, informando o colaborador, a data, a quantidade de horas e o tipo de hora (extra ou sobreaviso).</p>
    <p>Para o desenvolvimento da rota, foi necessário validar as regras de negócio relacionadas ao ciclo de vida da hora, garantindo que as horas fossem aprovadas ou rejeitadas pelo administrador somente caso ainda não tivessem passado pelo ciclo de aprovação do gestor ou caso o gestor tivesse aprovado somente</p>
    <p>Além disso, criei a rota para rejeição em massa das horas apontadas pelo gestor.</p>
</details>

<details>
    <summary>Desenvolvimento do painel de controle do colaborador</summary>
    <p>Desenvolvi o painel de controle do colaborador, utilizando HTML, CSS e JavaScript. O painel permitia ao colaborador visualizar informações sobre as horas já registradas, com a capacidade de filtrar por período, equipe e obter uma visão geral abrangente.</p>
    <p>Para o desenvolvimento do painel, consumi as rotas do back-end, garantindo a integração entre front-end e back-end.</p>
</details>



<h3>Hard Skills</h3>

<h3>Soft Skills</h3>
