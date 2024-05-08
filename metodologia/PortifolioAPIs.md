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
<ul>
    <li><a href="https://www.linkedin.com/in/larissa-reis-693568250">Linkedin</a></li>
    <li><a href="mailto:larireis.contato@gmail.com">Email</a></li>
    <li><a href="https://github.com/larissa-fernanda">GitHub</a></li>
</ul>

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


<h3>Contribuições Individuais</h3>
<p>Atuei como Scrum Master e desenvolvedora full-stack. A seguir, estão listadas as minhas contribuições para o projeto:</p>
<ul>
<details>
    <summary>Modelagem do banco de dados</summary>
    <p>Realizei a modelagem do banco de dados, utilizando o PostgreSQL. O banco de dados foi modelado de acordo com as necessidades da empresa parceira, contemplando as entidades e relacionamentos necessários para a aplicação.</p>
    <p>Nesse processo, fui responsável pela criação do DER (Diagrama de Entidade-Relacionamento) e pela criação dos scripts de criação das tabelas e relacionamentos.</p>
    <image src="./assets/DER.png" alt="Diagrama de Entidade-Relacionamento">
</details>

<details>
    <summary>Criação das rotas PATCH e DELETE da entidade Employee</summary>
    <p>Criei as rotas PATCH e DELETE da entidade Employee, utilizando o framework Spring Boot. As rotas permitiam a atualização e inativação de um usuário, respectivamente.</p> 
    <p>Para a rota PATCH, foi necessário validar os dados enviados pelo usuário, garantindo que apenas os campos permitidos fossem atualizados.</p>
    <p>Para a rota DELETE, foi necessário realizar a inativação do usuário, alterando o status do usuário para inativo no banco de dados.</p>
    <p>Além disso, criei a rota para reativação do usuário.</p>
    <pre>
    <code>
    @PatchMapping("/{matricula}")
    public Employee updateEmployee(@PathVariable String matricula, @RequestBody EmployeeDTOs.EmployeeRequestDTO partialData) {
        Employee employee = repository.findById(matricula).orElseThrow(
            () -> new RuntimeException("Funcionário não encontrado com a matrícula: " + matricula)
            );
        try {
            if (partialData.nome() != null) {
                employee.setNome(partialData.nome());
            }
            if (partialData.senha() != null) {
                employee.setSenha(partialData.senha());
            }
            if (partialData.funcao() != null) {
                employee.setFuncao(partialData.funcao());
            }
            if (partialData.status_usuario() != null) {
                employee.setStatus_usuario(partialData.status_usuario());
            }
        } catch (Exception e) {
            throw new ApiException("Erro ao atualizar o funcionário: " + e.getMessage());
        }

        repository.save(employee);
        return employee;
    }

</code></pre>
</details>

<details>
    <summary>Criação das rotas PATCH e DELETE da entidade CR</summary>
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
    <summary>Desenvolvimento do back-end do sistema de aprovação de horas do administrador</summary>
    <p>Desenvolvi o back-end do sistema de aprovação de horas do administrador, utilizando o framework Spring Boot. A rota permitia o administrador aprovar ou rejeitar as horas apontadas pelo gestor, informando o colaborador, a data, a quantidade de horas e o tipo de hora (extra ou sobreaviso).</p>
    <p>Para o desenvolvimento da rota, foi necessário validar as regras de negócio relacionadas ao ciclo de vida da hora, garantindo que as horas fossem aprovadas ou rejeitadas pelo administrador somente caso ainda não tivessem passado pelo ciclo de aprovação do gestor ou caso o gestor tivesse aprovado somente</p>
    <p>Além disso, criei a rota para rejeição em massa das horas apontadas pelo gestor.</p>
</details>

<details>
    <summary>Desenvolvimento do painel de controle do colaborador</summary>
    <p>Desenvolvi o painel de controle do colaborador, utilizando HTML, CSS e JavaScript. O painel permitia ao colaborador visualizar informações sobre as horas já registradas, com a capacidade de filtrar por período, equipe e obter uma visão geral abrangente.</p>
    <p>Para o desenvolvimento do painel, consumi as rotas do back-end, garantindo a integração entre front-end e back-end.</p>
</details>
</ul>

<h3>Hard Skills</h3>

<ul>
    <details><summary><strong>Arquitetura REST:</strong></summary>
    <li> A arquitetura REST (Representational State Transfer) é um estilo arquitetural para sistemas distribuídos que enfatiza a comunicação entre sistemas por meio de interfaces simples e padronizadas. No contexto de desenvolvimento de APIs, REST define um conjunto de princípios e boas práticas para projetar serviços web que sejam escaláveis, flexíveis e de fácil manutenção. No projeto, os princípios RESTful foram utilizados para projetar e implementar as APIs do back-end por meio de rotas, garantindo que elas fossem acessíveis, interoperáveis e eficientes.</li></details>
    <details><summary><strong>Protocolo HTTP:</strong></summary>
    <li> O Protocolo de Transferência de Hipertexto (HTTP) é o protocolo de comunicação utilizado para transferir dados pela World Wide Web. Ele define um conjunto de métodos de requisição e códigos de status que especificam ações a serem realizadas em recursos identificados por URLs. No contexto do desenvolvimento web, o HTTP é usado para a comunicação entre clientes (navegadores) e servidores. Os clientes enviam solicitações HTTP para os servidores, que respondem com respostas HTTP contendo os dados solicitados. No projeto, o protocolo HTTP foi utilizado para definir as operações suportadas pelas APIs RESTful, como GET, POST, PATCH e DELETE.</li></details>
    <details><summary><strong>Rotas PATCH e DELETE:</strong></summary>
    <li> No contexto das APIs RESTful, PATCH e DELETE são métodos HTTP utilizados para atualizar e excluir recursos, respectivamente.
        <ul>
            <details><summary><strong>PATCH:</strong></summary>
            <li> O método PATCH é usado para realizar atualizações parciais em um recurso. Em vez de substituir o recurso inteiro, como ocorre com o método PUT, o PATCH permite enviar apenas as modificações que devem ser aplicadas ao recurso. No projeto, rotas PATCH foram implementadas para permitir a atualização de entidades como usuários e CRs (Centros de Resultados).</li></details>
            <details><summary><strong>DELETE:</strong></summary>
            <li>O método DELETE é usado para excluir um recurso específico. Quando uma solicitação DELETE é enviada para o servidor, o recurso correspondente é removido permanentemente. No projeto, rotas DELETE foram utilizadas para permitir a inativação de entidades como usuários e CRs, excluindo-os do contexto de negócio.</li></details>
        </ul>
    </li></details>
    <details><summary><strong>Java e Spring Boot:</strong></summary>
    <li> Utilizados para o desenvolvimento do back-end da aplicação. Java é uma linguagem de programação popular que oferece portabilidade e robustez. Spring Boot é um framework que facilita a configuração e o desenvolvimento de aplicativos Java, fornecendo uma estrutura sólida para a construção de APIs RESTful.</li></details>
    <details><summary><strong>PostgreSQL:</strong></summary>
    <li> Utilizado como o banco de dados relacional para armazenar os dados da aplicação. </li></details>
    <details><summary><strong>HTML, CSS e JavaScript:</strong></summary>
    <li> Utilizados para o desenvolvimento do front-end da aplicação. HTML é a linguagem de marcação utilizada para estruturar o conteúdo da página web. CSS é utilizada para estilizar a aparência da página, enquanto JavaScript é uma linguagem de programação que adiciona interatividade e dinamismo à página web.</li></details>
    <details><summary><strong>Git:</strong></summary>
    <li> Utilizado para controle de versão do código-fonte. Git é um sistema de controle de versão distribuído que permite rastrear alterações no código, colaborar com outros desenvolvedores e gerenciar o histórico de desenvolvimento do projeto.</li></details>
</ul>


<h3>Soft Skills</h3>

<details>
    <summary></summary>
</details>
