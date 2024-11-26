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
<p align="justify">
    Atualmente, atuo como Engenheira de Dados na Zarp.AI, uma empresa de consultoria em banco de dados brasileira. 
    Comecei minha carreira como estagiária em Engenharia de Dados na Quero Educaçao, EdTech brasileira, onde me tornei júnior. 
    Como Engenheira de Dados, sou responsável por manter pipelines de dados e desenvolver soluções para clientes, dentro ou fora da empresa. 
    Além disso, sou estudante de Banco de Dados na FATEC São José dos Campos.</p>

<h1 id="contato">Contato</h1>
<ul>
    <li><a href="https://www.linkedin.com/in/larissa-reis-693568250">Linkedin</a></li>
    <li><a href="mailto:larireis.contato@gmail.com">Email</a></li>
    <li><a href="https://github.com/larissa-fernanda">GitHub</a></li>
</ul>

<h1 id="projetos">Projetos</h1>
<ul>
    <li><a href="#api1">Projeto 1: Sistema de avaliação 360º</a></li>
    <li><a href="#api2">Projeto 2: Sistema de lançamento de horas-extras e sobreavisos desktop</a></li>
    <li><a href="#api3">Projeto 3: Sistema de lançamento de horas-extras e sobreavisos web</a></li>
    <li><a href="#api4">Projeto 4: Sistema de cadastro e atualização de parceiros</a></li>
</ul>

<h2 id="api1">Sistema de avaliação 360º</h2>

<h3>Descrição</h3>

<p align="justify">Este projeto foi desenvolvido tendo como cliente a própria FATEC São José dos Campos. O objetivo era criar uma aplicação que permitisse que um time ágil de desenvolvimento dentro da instituição pudesse avaliar o desempenho de seus membros em um processo de avaliação 360º. A aplicação foi desenvolvida em Python, exclusivamente pelo terminal e sem banco de dados.</p>

<p align="justify">O sistema era composto por três categorias de usuários: adminitradores, instrutores e alunos. Além disso, o sistema era divido em turmas, que eram formadas por alunos e instrutores. Para cada turma, um instrutor poderia atuar como Fake Client ou como Group Leader. Dentro de uma mesma turma, os alunos eram divididos em times, que eram formados por um Líder Técnico, um Product Owner e membros do time.</p>

<p align="justify">Na hora da avaliação, um membro do time avaliava os outros membros, respondendo a cinco perguntas, cada uma com cinco opções de resposta. As respostas eram armazenadas em um arquivo de texto, permitindo a geração de relatórios com base nas avaliações realizadas. Um instrutor podia visualizar as avaliações de um aluno e gerar um relatório com as médias das avaliações. Além disso, um instrutor do tipo Fake Client tinha que avaliar seus alunos P.O. e um instrutor do tipo Group Leader tinha que avaliar seus alunos L.T.</p>

<h3>Contribuições Individuais</h3>

Atuei como desenvolvedora full-stack. A seguir, estão listadas as minhas contribuições para o projeto:

<ul>
    <details>
        <summary>Desenvolvimento de funções para validação do nome de usuário e nome de time</summary>
        <p align="justify">Criei as funções iniciais de validação do nome de usuário e nome de time, garantindo que o nome informado pelo usuário atendesse aos critérios estabelecidos. As funções verificavam se o nome era válido, ou seja, se continha apenas letras e underlines, se não começava com números e se tinha mais de dois caracteres. Para isso, usei expressões regulares.</p>
        <pre>
        <code>
        def has_name_valid_characters(name):
            "Verifica se tem caracteres especiais."
            return re.match("^[a-zA-Z0-9_-]+$", name)

        def is_name_valid(name, show=False):
            """
            Retorna True ou False. Verifica se o nome é valido ou não.
            Validações:
                - deve conter mais de 2 caracteres
                - não pode começar com número
                - não pode conter caracteres especiais, exceto underline "_"
            """
            if len(name) <= 2:
                if show == True:
                    print('O nome deve ter mais de 2 caracteres. Tente novamente!')
                return False
            elif not has_name_valid_characters(name):
                if show == True:
                    print('Formato inválido. Tente novamente!')
                return False
            elif re.match('\d', name[0]):
                if show == True:
                    print('Nomes não podem começar com número')
                return False
            else:
                return True

        def prompt_for_valid_username():
            """
            Loop pedindo para o usuário inserir o nome caso
            o nome seja inválido.
            """
            input_name = input('Digite o nome:')

            while not is_name_valid(input_name):
                input_name = input('Digite um nome válido:')

            return input_name

        def prompt_for_valid_team_name():
            input_team_name = input('Digite o nome do time: ')

            while not is_name_valid(input_team_name):
                input_team_name = input('Digite um nome válido para o time: ')

            return input_team_name

</code></pre> 
    </details>
    <details>
        <summary>Desenvolvimento de funções para validação do email</summary>
        <p align="justify">Criei as funções iniciais de validação do email, garantindo que o email informado pelo usuário atendesse aos critérios estabelecidos. As funções verificavam se o email era válido, ou seja, se continha um "@" e um ".". Para isso, usei expressões regulares.</p>
        <pre>
        <code>
        def is_email_valid(email):
            return re.match('^[a-z0-9.]+@[a-z0-9]+\.[a-z]+(\.[a-z]+)?$', email)


        def prompt_for_valid_email():
            input_email = input('Digite o email: ')

            while not is_email_valid(input_email):
                print('E-mail inválido. Digite novamente!')
                input_email = input('Digite o e-mail: ')

            return input_email
</code></pre>
    </details>
    <details>
        <summary>Desenvolvimento de funções para validação da senha</summary>
        <p align="justify">Criei as funções iniciais de validação da senha, garantindo que a senha informada pelo usuário atendesse aos critérios estabelecidos. As funções verificavam se a senha era válida, ou seja, se continha pelo menos 8 caracteres, um número, uma letra maiúscula, uma letra minúscula e um caracter especial. Para isso, usei expressões regulares.</p>
        <pre>
        <code>
        def is_password_valid(password, show=False):
            """
            Retorna True ou False. Verifica se a senha é valida ou não.
            Validações:
                - deve conter mais de 8 caracteres
                - deve conter pelo menos 1 letra maiúscula
                - deve conter pelo menos 1 letra minúscula
                - deve conter pelo menos 1 número
                - deve conter pelo menos 1 carácter especial (@!%*?&)    
            """
            if len(password) < 8:
                if show == True:
                    print('A senha deve ter mais de 8 caracteres.')
                return False
            elif not has_password_valid_characters(password):
                if show == True:
                    print('Formato inválido!')
                return False
            else:
                return True

        def prompt_for_valid_password(show = False):
            """
            Loop pedindo para o usuário inserir a senha caso
            ela seja inválida.
            """
            if show == True:
                print('Sua senha deve conter:\n- No mínimo 8 caracteres\n- No mínimo 1 letra maiúscula\n- No mínimo 1 letra minúscula\n- No mínimo 1 número\n- No mínimo 1 carácter especial (@!%*?&) ')
            input_password = stdiomask.getpass(prompt="Digite a senha: ", mask="*")

            while not is_password_valid(input_password, show):
                input_password = stdiomask.getpass(prompt="Digite uma senha válida: ", mask="*")

            return input_password
</code></pre>
    </details>
    <details>
        <summary>Desenvolvimento de funções para criação do time</summary>
        <p align="justify">Criei as funções iniciais para a criação do time, permitindo que o usuário informasse o nome do time e os membros que fariam parte dele. As funções solicitavam ao usuário o nome do time e os dados dos membros, como nome, email e função. Os membros eram validados de acordo com as regras estabelecidas e, caso fossem válidos, eram adicionados ao time.</p>
        <p align="justify">Os times eram formados por pelo menos um Líder Técnico e um Product Owner. Caso o time não atendesse a esses critérios, o usuário era informado e solicitado a informar os membros novamente. Ao informar um time válido, ele era salvo no arquivo de times.</p>
        <pre>
        <code>
        def create_team_dict(id, team_name, members): #members = [{"nome": "nome do membro", "funcao": "funcao do membro"},...]
            return {
                "id": id,
                "team_name": team_name,
                "members": members
            }

        def prompt_for_team_members():
            members = []
            while True:
                with open('users.txt', 'r') as file:
                    category = prompt_for_valid_category()
                    name = prompt_for_valid_username()
                    email = prompt_for_valid_email()
                    member = None
                    for line in file:
                        user = line_to_user_dict(line)
                        if user["name"] == name and user["email"] == email and user["category"] == category:
                            member = {
                                "id" : user["id"],
                                "category": category,
                                "name": name,
                                "email": email,
                            }
                            members.append(member)
                            break
                    if not member:
                        print('Usuário não encontrado.')

                    asking = input('Deseja continuar?').lower()
                    if asking == 'n'or asking == 'nao' or asking == 'não':
                        break
            return members

        def create_team_interactively():
            print("\nFormulário de Criação de Time\n")

            team_name = prompt_for_valid_team_name()
            members = prompt_for_team_members()
            if not has_team_valid_members(members):
                print("O time precisa ter pelo menos um Líder técnico e um Product Owner")
                return create_team_interactively()
            team_dict = create_team_dict(uuid.uuid4(), team_name, members)
            save_team_to_file(team_dict)

        def has_team_valid_members(members):
            """
            Verifica se o time tem pelo menos 1 Líder Técnico e 1 PO
            """
            needed_categories = set(['LT', 'PO'])
            category_of_members = set([member['category'] for member in members])
            return needed_categories.issubset(category_of_members)

        def save_team_to_file(team):
            file = open("data/teams.txt", "a")
            line = team_dict_to_line(team)
            file.write(line)
            file.write("\n")
            file.close()
            print("Time salvo com sucesso!")

        def print_team_members(team_name):
            found_team = None
            with open('data/teams.txt', 'r') as file:
                for line in file:
                    team_dict = line_to_team_dict(line.rstrip())

                    if team_name == team_dict["team_name"]:
                        found_team = team_dict
                        break

                if not found_team:
                    print("Time não encontrado")
                    return

            members = []

            with open("data/users.txt", "r") as file:
                for line in file:
                    user_dict = line_to_user_dict(line)
                    if user_dict["id"] in found_team["members_id"]:
                        members.append({**user_dict, "password": "****"})

            print("Time: ", found_team["team_name"])
            for member in members:
                print(member["name"], member["category"])

        def team_dict_to_line(team):
            team_id = team["id"]
            team_name = team["team_name"]
            members = [member["id"] for member in team["members"]]
            members_id = ','.join(members)
            return f"{team_id};{team_name};{members_id}"

        def line_to_team_dict(line):
            splited_line = line.split(";")
            team_id = splited_line[0]
            team_name = splited_line[1]
            members_id = splited_line[2].split(',')
            team_dict = {
                "team_id": team_id,
                "team_name": team_name,
                "members_id": members_id
            }
            return team_dict
</code></pre>
    </details>
    <details>
        <summary>Desenvolvimento da lógica para a avaliação 360º</summary>
        <p align="justify">Criei a lógica para a avaliação 360º, permitindo que um membro do time avaliasse os outros membros. A avaliação era composta por cinco perguntas, cada uma com cinco opções de resposta. As respostas eram armazenadas em um arquivo de texto, permitindo a geração de relatórios com base nas avaliações realizadas.</p>
        <p align="justify">Como o sistema era composto por diferentes categorias de usuários, um instrutor 
        <pre>
        <code>
        categories = {
            'PO': 'Product Owner',
            'LT': 'Líder Técnico',
            'MT':  'Membro do time',
        }


        def search_teams_on_file_by_user(user,select_member=True, show=True):
            teams = []
            with open('data/teams.txt', "r") as file:
                for line in file:
                    team = line_to_team_dict(line)
                    if user in team["members"]:
                        teams.append(team)

            if show:
                if len(teams) > 0:
                    blue_bright_print('\n          Seus times:') 
                    for indice, team in enumerate(teams):
                        print(f'     {indice+1}. {team["name"]}')

                    input_team = int(bright_input('\nQual time deseja selecionar? '))

                    if input_team > 0 and input_team <= len(teams):
                        team = teams[input_team - 1]
                        if select_member:
                            return select_team_member(user, team), team['id']
                        else:
                            return None, team['id']

                    else:
                        red_print('\nOpção inválida. Tente novamente!\n')
                        return search_teams_on_file_by_user(user, select_member)
                else:
                    green_print('Você não está inserido em nenhum time ainda.')
                    return None
            else:
                return teams


        def select_team_member(user ,team):
            print()
            blue_bright_print(f'     Membros de {team["name"]}:')
            valid_members = []
            for member in team['members']:
                if user['category'] == 'PO' or user['category'] == 'LT' or user['category'] == 'MT':
                    if member['category'] == 'PO' or member['category'] == 'LT' or member['category'] == 'MT':
                        valid_members.append(member)
                elif user['category'] == 'LG':
                    if member['category'] == 'LT':
                        valid_members.append(member)
                elif user['category'] == 'FC':
                    if member['category'] == 'PO':
                        valid_members.append(member)
            for indice, member in enumerate(valid_members):
                print(f'{indice+1}. {categories[member["category"]].ljust(20," ")}{member["name"]}')

            input_member = int(bright_input('\nQual membro deseja avaliar? '))
            if input_member > 0 and input_member <= len(valid_members):
                return valid_members[input_member-1]

            else:
                red_print('Usuário inválido. Tente novamente!')
                return select_team_member(team)


        def evaluation_form(user=None, team=None, show=True):
            questions = {
                '1': {
                    'question': "Trabalho em equipe, cooperação e descentralização de conhecimento:",
                    'answers': {'0': 'Muito Ruim', '1': 'Ruim', '2': 'Regular', '3': 'Bom', '4': 'Muito Bom'},
                },
                '2': {
                    'question': "Iniciativa e proatividade:",
                    'answers': {'0': 'Muito Ruim', '1': 'Ruim', '2': 'Regular', '3': 'Bom', '4': 'Muito Bom'},
                },
                '3': {
                    'question': "Autodidaxia e agregação de conhecimento ao grupo:",
                    'answers': {'0': 'Muito Ruim', '1': 'Ruim', '2': 'Regular', '3': 'Bom', '4': 'Muito Bom'},
                },
                '4': {
                    'question': "Entrega de resultados e participação efetiva no projeto:",
                    'answers': {'0': 'Muito Ruim', '1': 'Ruim', '2': 'Regular', '3': 'Bom', '4': 'Muito Bom'},
                },
                '5': {
                    'question': "Competência técnica:",
                    'answers': {'0': 'Muito Ruim', '1': 'Ruim', '2': 'Regular', '3': 'Bom', '4': 'Muito Bom'},
                }
            }
            if show:
                blue_bright_print(f"\n           Avaliação de {user['name']}\n")
                lista = []
                for qk, qv in questions.items():
                    green_print(f'\n{qk}. {qv["question"]}')

                    print('\nEscolha entre as opções indicadas:\n')
                    for ak, av in qv['answers'].items():
                        print(f'[{ak}]: {av}')

                    answers_user = int(bright_input('\nOpção: '))
                    print()
                    while answers_user < 0 or answers_user > 4:
                        red_print('\nOpção inválida! Tente novamente.\n')
                        answers_user = int(bright_input('\nOpção: '))
                    lista.append(answers_user)

                return evaluation(lista, user, team)

            else:
                return questions


        def evaluation(lista, user, team):
            evaluation = {'skill_1': lista[0], 'skill_2':lista[1], 'skill_3':lista[2], 'skill_4':lista[3], 'skill_5':lista[4]}
            id_sprint = 1
            id_team = team
            id_user_log = get_logged_user()['id']
            category_user_log = get_logged_user()['category']
            id_av_user = user['id']
            category_av_user = user['category']
            name_av_user = user['name']
            skill_1 = evaluation["skill_1"]
            skill_2 = evaluation["skill_2"]
            skill_3 = evaluation["skill_3"]
            skill_4 = evaluation["skill_4"]
            skill_5 = evaluation["skill_5"]

            line = f"{id_sprint};{id_team};{id_user_log};{category_user_log};{id_av_user};{category_av_user};{name_av_user};{skill_1};{skill_2};{skill_3};{skill_4};{skill_5}"

            return save_evaluation(line)


        def save_evaluation(line):
            file = open('data/evaluations.txt', "a")
            file.write(line)
            file.write("\n")
            file.close()


        def line_to_evaluation_dict(line):
            splitted_line = line.rstrip("\n").split(";")
            id_sprint = splitted_line[0]
            id_team = splitted_line[1]
            id_user_log = splitted_line[2]
            category_user_log = splitted_line[3]
            id_av_user = splitted_line[4]
            category_av_user = splitted_line[5]
            name_av_user = splitted_line[6]
            skill_1 = splitted_line[7]
            skill_2 = splitted_line[8]
            skill_3 = splitted_line[9]
            skill_4 = splitted_line[10]
            skill_5 = splitted_line[11]
            dict = {
                    "id_sprint": id_sprint,
                    "id_team": id_team,
                    "id_user_log": id_user_log,
                    "category_user_log": category_user_log,
                    "id_av_user": id_av_user,
                    "category_av_user": category_av_user,
                    "name_av_user": name_av_user,
                    "skill_1": skill_1,
                    "skill_2": skill_2,
                    "skill_3": skill_3,
                    "skill_4": skill_4,
                    "skill_5": skill_5 
                    }
            return dict


        def mean_grades(team, user):
            skills = [[],[],[],[],[]]

            with open ('data/evaluations.txt', "r") as file:
                for line in file:
                    splitted_line = line.rstrip("\n").split(";")
                    if team == splitted_line[1] and user == splitted_line[4]:
                        skills[0].append(int(splitted_line[7]))
                        skills[1].append(int(splitted_line[8]))
                        skills[2].append(int(splitted_line[9]))
                        skills[3].append(int(splitted_line[10]))
                        skills[4].append(int(splitted_line[11]))

            if len(skills[0]) > 0:    
                mean = [
                    round(statistics.mean(skills[0]), 1),
                    round(statistics.mean(skills[1]), 1),
                    round(statistics.mean(skills[2]), 1),
                    round(statistics.mean(skills[3]), 1),
                    round(statistics.mean(skills[4]), 1),
                ]

                total_mean = round(statistics.mean(mean), 1)

                return [mean, total_mean]
            else:
                return None


        def print_mean_grades(team, user):
            mean = mean_grades(team,user['id'])
            questions = evaluation_form(user, team, show=False)

            if mean is None:
                magenta_print('\nVocê ainda não foi avaliado.')
                return

            blue_bright_print(f"\n          Médias de {user['name']}\n")    
            for n, question in enumerate(questions):
                bright_print(f'{questions[question]["question"]}')
                if mean[0][n] > 2:
                    green_print(f'{mean[0][n]}')
                elif mean[0][n] == 2:
                    magenta_print(f'{mean[0][n]}')
                else:
                    red_print(f'{mean[0][n]}')
            if mean[1] >= 2:
                green_print(f'\nMédia total: {mean[1]}\n')
            elif mean[1] == 2:
                magenta_print(f'\nMédia total: {mean[1]}\n')
            else:
                red_print(f'\nMédia total: {mean[1]}\n')

        def print_mean_grades_LG(team_id, LT = False):
            with open('data/teams.txt', 'r') as file:
                for line in file:
                    team_dict = line_to_team_dict(line)
                    if team_id == team_dict['id']:
                        team = team_dict
                        break

            team_member_mean = {member['id']: {'name': member['name'], 'category': member['category']} for member in team['members']}

            with open ('data/evaluations.txt', "r") as file:
                for line in file:
                    dict_line = line_to_evaluation_dict(line)
                    if team_id == dict_line['id_team']:
                        if team_member_mean[dict_line['id_av_user']].get('mean', None) is None:
                            member_mean = mean_grades(team_id, dict_line['id_av_user'])
                            team_member_mean[dict_line['id_av_user']]['mean'] = member_mean

            questions = evaluation_form(show=False)
            members_to_list = team_member_mean

            if LT:
                members_to_list = {id: item for id, item in team_member_mean.items() if item['category'] == 'LT'}
            for item in members_to_list.values():
                if 'mean' not in item:
                    if item['category'] not in ['FC', 'LG']:
                        magenta_print(f'\n{item["name"]} ({categories[item["category"]]}) ainda não foi avaliado.')
                    continue
                blue_bright_print(f"\n          Médias de {item['name']} - {categories[item['category']]}\n")
                for n, question in enumerate(questions):
                    bright_print(f'{questions[question]["question"]}', end = ' ')
                    if item["mean"][0][n] > 2:
                        green_print(f'{item["mean"][0][n]}')
                    elif item["mean"][0][n] == 2:
                        magenta_print(f'{item["mean"][0][n]}')
                    else:
                        red_print(f'{item["mean"][0][n]}')
                if item["mean"][1] >= 2:
                    green_print(f'\nMédia total: {item["mean"][1]}\n')
                elif item["mean"][1] == 2:
                    magenta_print(f'\nMédia total: {item["mean"][1]}\n')
                else:
                    red_print(f'\nMédia total: {item["mean"][1]}\n')

        def print_mean_grades_FC(team):
            lista = []
            with open ('data/evaluations.txt', "r") as file:
                for line in file:
                    dict_line = line_to_evaluation_dict(line)
                    if team == dict_line['id_team']:
                        if dict_line['category_av_user'] == 'PO':
                            if dict_line['id_av_user'] not in [item[0] for item in lista]:
                                po_mean = mean_grades(team, dict_line['id_av_user'])
                                lista.append((dict_line['id_av_user'], dict_line['name_av_user'], po_mean))

            if len(lista) < 1:
                magenta_print('\nO PO desse time ainda não foi avaliado.')

            questions = evaluation_form(show=False)
            for item in lista:
                blue_bright_print(f"\n          Médias de {item[1]}\n")    
                for n, question in enumerate(questions):
                    bright_print(f'{questions[question]["question"]}', end = ' ')
                    if item[2][0][n] > 2:
                        green_print(f'{item[2][0][n]}')
                    elif item[2][0][n] == 2:
                        magenta_print(f'{item[2][0][n]}')
                    else:
                        red_print(f'{item[2][0][n]}')
                if item[2][1] >= 2:
                    green_print(f'\nMédia total: {item[2][1]}\n')
                elif item[2][1] == 2:
                    magenta_print(f'\nMédia total: {item[2][1]}\n')
                else:
                    red_print(f'\nMédia total: {item[2][1]}\n')

        def run_evaluation():
            user_log = get_logged_user()
            if user_log['category']!= 'LG' and user_log['category']!= 'FC':
                av_user, id_team = search_teams_on_file_by_user(user_log)
                evaluation_form(av_user, id_team)
            elif user_log['category'] == 'LG':
                av_user, id_team = search_teams_on_file_by_user(user_log)
                evaluation_form(av_user, id_team)
            else:
                av_user, id_team = search_teams_on_file_by_user(user_log)
                evaluation_form(av_user, id_team)

        def run_mean_grades():
            user_log = get_logged_user()

            if user_log['category']!= 'LG' and user_log['category']!= 'FC':
                av_user, id_team = search_teams_on_file_by_user(user_log, select_member=False)
                print_mean_grades(id_team, user_log)


            elif user_log['category'] == 'LG':
                av_user, id_team = search_teams_on_file_by_user(user_log, select_member=False)
                only_LT = ['Ver somente as médias dos Líderes Técnicos', 'Ver as notas de todo o time']
                blue_bright_print('\n       Selecione uma opção:'.center(60))
                for indice, item in enumerate(only_LT):
                    print(f'     {indice+1}. {item}')
                awnser = int(input('\n   Opção: '))
                while awnser != 1 and awnser != 2:
                    awnser = int(input('\n   Opção: '))
                if awnser == 1:
                    print_mean_grades_LG(id_team, LT=True)
                elif awnser == 2:
                    print_mean_grades_LG(id_team)


            elif user_log['category'] == 'FC':   
                av_user, id_team = search_teams_on_file_by_user(user_log, select_member=False)
                print_mean_grades_FC(id_team)
</pre></code>
    </details>
    <details>
        <summary>Desenvolvimento da lógica de sprints</summary>
        <p align="justify">Criei a lógica para a criação e fechamento de sprints, permitindo que um instrutor do tipo Group Leader pudesse criar uma sprint e fechá-la. Além disso, criei a lógica para a seleção de uma sprint, permitindo que um instrutor pudesse selecionar uma sprint para avaliar os membros do time</p>
        <p align="justify">Para a criação de uma sprint, era necessário fechar a sprint anterior, caso houvesse uma sprint aberta. Para isso, criei a função <code>get_opened_sprint</code>, que retornava a sprint aberta, caso houvesse uma, e a função <code>has_opened_sprint</code>, que verificava se havia uma sprint aberta. Além disso, criei a função <code>select_sprint_tui</code>, que permitia a seleção de uma sprint, e a função <code>close_sprint_tui</code>, que fechava a sprint selecionada.</p>
        <p align="justify">A criação de uma sprint se dava por turma, ou seja, um instrutor do tipo Group Leader podia criar uma sprint para uma turma específico.</p>
        <pre>
        <code>
        def summary_sprint(sprint):
            name = sprint["name"]
            id = sprint["id"]
            status = sprint["status"]
            return f"{name} #{id} ({status})"


        def show_sprints_from_group(group):
            sprints = get_all_sprints_from_group(group)
            print("Sprints")
            for sprint in sprints:
                print(f"    - {summary_sprint(sprint)}")


        def has_group_opened_sprint(group):
            opened_sprints = get_opened_sprint_from_group(group)
            return opened_sprints is not None


        def open_sprint_for_group(group):
            if has_group_opened_sprint(group):
                print("Já existe uma sprint aberta.")
                return
            sprint_name = input('Qual o nome da sprint? ')
            create_sprint(group, sprint_name)


        def close_sprint_from_group(group):
            if not has_group_opened_sprint(group):
                print("Não existe sprint aberta.")
                return
            sprint = get_opened_sprint_from_group(group)
            print(summary_sprint(sprint))
            answer = input("Tem certeza que deseja fechar essa sprint (S/N)? ")
            if answer != "S" and answer != "s":
                return
            sprint["status"] = "fechada"
            update_sprints()    


        def select_sprint_from_group(group, closed=False):
            sprints = get_all_sprints_from_group(group)
            if not closed:
                valid_sprints = sprints
            if closed:
                valid_sprints = []
                for sprint in sprints:
                    if sprint['status'] == 'fechada':
                        valid_sprints.append(sprint)

            if len(valid_sprints) == 0:
                print("Nenhuma sprint encontrada.")
                return None

            for index, sprint in enumerate(valid_sprints):
                print(f"{index+1} - {summary_sprint(sprint)}")

            while True:
                option = safe_int_input("Opção: ")
                if option > 0 and option <= len(sprints):
                    return valid_sprints[option - 1]
                print("Opção inválida.")


        def reopen_sprint_from_group(group):
            if has_group_opened_sprint(group):
                print("Já existe uma sprint aberta.")
                return
            sprint = select_sprint_from_group(group)

            if sprint is None:
                return
            
            print(summary_sprint(sprint))
            answer = input("Tem certeza que deseja reabrir essa sprint (S/N)? ")
            if answer != "S" and answer != "s":
                return
            sprint["status"] = "aberta"
            update_sprints()    


        def admin_sprints_menu():
            print("Selecione a Turma")
            turma = search_and_select_turma()
            if turma is None:
                return
            
            while True:
                print("Menu Sprints (Administrador)")
                print(f"Turma: {turma['name']}")
                print("1 - Listar")
                print("2 - Abrir Nova")
                print("3 - Fechar")
                print("4 - Reabrir")
                print("5 - Voltar")
                
                while True:
                    option = safe_int_input("Opção: ")
                    if option >= 1 and option <= 6:
                        break
                    print("Opção inválida.")
                
                if option == 1:
                    show_sprints_from_group(turma)
                elif option == 2:
                    open_sprint_for_group(turma)
                elif option == 3:
                    close_sprint_from_group(turma)
                elif option == 4:
                    reopen_sprint_from_group(turma)
                else:
                    return
</code></pre>
    </details>
    <details>
        <summary>Desenvolvimento da lógica de geração de relatórios</summary>
        <p align="justify">Criei a lógica para a geração de relatórios, permitindo que o administrador pudesse ver todas as médias no geral ou por sprint, um aluno pudesse ver todas as suas médias no geral ou por sprint, um instrutor do tipo Group Leader pudesse ver as médias de todos os membros do time ou somente dos Líderes Técnicos e um instrutor do tipo Fake Client pudesse ver somente as médias dos Product Owners.</p>
        <pre>
        <code>
        EVALUATIONS_TXT_FILE =  "data/evaluations.txt"

        CATEGORIES = {
            "PRODU": "Product Owner",
            "LIDER": "Líder Técnico",
            "COMUM": "Membro do time",
        }


        def average_grades(team_id, user_id, sprint=None):
            skills = [[], [], [], [], []]

            with open(EVALUATIONS_TXT_FILE, "r") as file:
                for line in file:
                    evaluation = line_to_evaluation_dict(line)
                    if sprint is not None:
                        if team_id == evaluation["id_team"] and user_id == evaluation["evaluated_id"] and sprint['id'] == evaluation['id_sprint']:
                            skills[0].append(int(evaluation["skill_1"]))
                            skills[1].append(int(evaluation["skill_2"]))
                            skills[2].append(int(evaluation["skill_3"]))
                            skills[3].append(int(evaluation["skill_4"]))
                            skills[4].append(int(evaluation["skill_5"]))
                    else:
                        if team_id == evaluation["id_team"] and user_id == evaluation["evaluated_id"]:
                            skills[0].append(int(evaluation["skill_1"]))
                            skills[1].append(int(evaluation["skill_2"]))
                            skills[2].append(int(evaluation["skill_3"]))
                            skills[3].append(int(evaluation["skill_4"]))
                            skills[4].append(int(evaluation["skill_5"]))


            if len(skills[0]) > 0:
                mean = [
                    round(statistics.mean(skills[0]), 1),
                    round(statistics.mean(skills[1]), 1),
                    round(statistics.mean(skills[2]), 1),
                    round(statistics.mean(skills[3]), 1),
                    round(statistics.mean(skills[4]), 1),
                ]

                total_mean = round(statistics.mean(mean), 1)

                return [mean, total_mean]
            else:
                return None


        def print_average_grades(team, user, sprint=None):
            average = average_grades(team['id'], user["id"], sprint)
            questions = evaluation_form(show=False)

            if average is None:
                magenta_print("\nVocê ainda não foi avaliado.")
                return

            blue_bright_print(f"\n          Médias de {user['name']}\n")
            for n, question in enumerate(questions):
                bright_print(f'{questions[question]["question"]}')
                if average[0][n] > 2:
                    green_print(f"{average[0][n]}")
                elif average[0][n] == 2:
                    magenta_print(f"{average[0][n]}")
                else:
                    red_print(f"{average[0][n]}")
            if average[1] >= 2:
                green_print(f"\nMédia total: {average[1]}\n")
            elif average[1] == 2:
                magenta_print(f"\nMédia total: {average[1]}\n")
            else:
                red_print(f"\nMédia total: {average[1]}\n")


        def print_average_grades_LG(team, sprint=None, LT=False):

            team_member_average = {
                member["id"]: {"name": member["name"], "category": member["category"]}
                for member in team["members"]
            }

            with open(EVALUATIONS_TXT_FILE, "r") as file:
                for line in file:
                    dict_line = line_to_evaluation_dict(line)
                    if team['id'] == dict_line["id_team"]:
                        if team_member_average[dict_line["evaluated_id"]].get("average", None) is None:
                            member_average = average_grades(team['id'], dict_line["evaluated_id"], sprint)
                            team_member_average[dict_line["evaluated_id"]]["average"] = member_average

            questions = evaluation_form(show=False)
            members_to_list = team_member_average

            if LT:
                members_to_list = {
                    id: item
                    for id, item in team_member_average.items()
                    if item["category"] == "LIDER"
                }
            for item in members_to_list.values():
                if "average" not in item:
                    magenta_print(
                        f'\n{item["name"]} ({CATEGORIES[item["category"]]}) ainda não foi avaliado.'
                    )
                    continue
                blue_bright_print(
                    f"\n          Médias de {item['name']} - {CATEGORIES[item['category']]}\n"
                )
                for n, question in enumerate(questions):
                    bright_print(f'{questions[question]["question"]}', end=" ")
                    if item["average"][0][n] > 2:
                        green_print(f'{item["average"][0][n]}')
                    elif item["average"][0][n] == 2:
                        magenta_print(f'{item["average"][0][n]}')
                    else:
                        red_print(f'{item["average"][0][n]}')
                if item["average"][1] >= 2:
                    green_print(f'\nMédia total: {item["average"][1]}\n')
                elif item["average"][1] == 2:
                    magenta_print(f'\nMédia total: {item["average"][1]}\n')
                else:
                    red_print(f'\nMédia total: {item["average"][1]}\n')


        def print_average_grades_FC(team, sprint):
            lista = []
            with open(EVALUATIONS_TXT_FILE, "r") as file:
                for line in file:
                    dict_line = line_to_evaluation_dict(line)
                    if team["id"] == dict_line["id_team"]:
                        if dict_line["evaluated_category"] == "PRODU":
                            if dict_line["evaluated_id"] not in [item[0] for item in lista]:
                                po_average = average_grades(team["id"], dict_line["evaluated_id"], sprint)
                                lista.append(
                                    (
                                        dict_line["evaluated_id"],
                                        dict_line["evaluated_name"],
                                        po_average,
                                    )
                                )

            if len(lista) < 1:
                magenta_print("\nO Product Owner desse time ainda não foi avaliado.")

            questions = evaluation_form(show=False)
            for item in lista:
                blue_bright_print(f"\n          Médias de {item[1]}\n")
                for n, question in enumerate(questions):
                    bright_print(f'{questions[question]["question"]}', end=" ")
                    if item[2][0][n] > 2:
                        green_print(f"{item[2][0][n]}")
                    elif item[2][0][n] == 2:
                        magenta_print(f"{item[2][0][n]}")
                    else:
                        red_print(f"{item[2][0][n]}")
                if item[2][1] >= 2:
                    green_print(f"\nMédia total: {item[2][1]}\n")
                elif item[2][1] == 2:
                    magenta_print(f"\nMédia total: {item[2][1]}\n")
                else:
                    red_print(f"\nMédia total: {item[2][1]}\n")


        def by_sprint_question(team):
            by_sprint = [
                "Ver as médias por sprint",
                "Ver as médias de todas as sprints"
            ]
            blue_bright_print("\n       Ver médias por sprint?".center(60))

            for indice, item in enumerate(by_sprint):
                print(f"     {indice+1}. {item}")
            awnser_sprint = int(bright_input("\n   Opção: "))

            while awnser_sprint != 1 and awnser_sprint != 2:
                awnser_sprint = int(bright_input("\n   Opção: "))

            if awnser_sprint == 1:
                sprint = select_sprint_tui(team['id'], closed=True)

            elif awnser_sprint == 2:
                sprint = None

            return sprint


        def run_average_grades():
            user, groups = search_groups()
            av_user, team = select_group(user, groups, select_member=False)
            sprint = by_sprint_question(team)

            if user["type"] == 'COMUM':
                print_average_grades(team, user, sprint)

            elif user["type"] == 'ADMIN':
                print_average_grades_LG(team, sprint)

            elif user["id"] == team['turma']['group_leader']['id']:
                only_LT = [
                    "Ver somente as médias dos Líderes Técnicos",
                    "Ver as notas de todo o time",
                ]
                blue_bright_print("\n       Quais médias quer ver?".center(60))
                for indice, item in enumerate(only_LT):
                    print(f"     {indice+1}. {item}")
                awnser = int(input("\n   Opção: "))
                while awnser != 1 and awnser != 2:
                    awnser = int(input("\n   Opção: "))
                if awnser == 1:
                    print_average_grades_LG(team, sprint, LT=True)
                elif awnser == 2:
                    print_average_grades_LG(team, sprint)

            elif user["id"] == team['turma']['fake_client']['id']:
                print_average_grades_FC(team, sprint)
</code></pre>
    </details>
</ul>

<h2 id="api2">Sistema de lançamento de horas-extras e sobreavisos desktop</h2>

<h3>Descrição</h3>

<p align="justify">Este projeto foi desenvolvido em parceria com a empresa 2RP. O objetivo era criar uma aplicação desktop que permitisse o lançamento de horas-extras e sobreavisos dos colaboradores, para facilitar a gestão e o controle das horas trabalhadas. A aplicação foi desenvolvida em Java, juntamente com JavaFX para o front-end e banco de dados MySQL.</p>

<p align="justify">A empresa parceira possuía dificuldades na gestão de horas extras e sobreavisos dos colaboradores, uma vez que o processo era manual e demandava muito tempo. A aplicação desenvolvida permitiu a automatização do processo, facilitando a gestão e o controle das horas lançadas.</p>

<h3>Contribuições Individuais</h3>
<p>Atuei como desenvolvedora full-stack. A seguir, estão listadas as minhas contribuições para o projeto:</p>

<ul>
    <details>
        <summary>Modelagem e criação dos scripts SQL do banco de dados</summary>
        <p align="justify">Participei da modelagem do banco de dados, utilizando o MySQL. O banco de dados foi modelado de acordo com as necessidades da empresa parceira, contemplando as entidades e relacionamentos necessários para a aplicação.</p>
        <p align="justify">Além disso, participei da criação dos scripts SQL para a criação das tabelas e relacionamentos no banco de dados.</p>
        <pre>
        <code>
        create table
            hora(
                id int not null AUTO_INCREMENT PRIMARY KEY,
                username_lancador VARCHAR(20) not null,
                data_hora_inicio DATETIME not NULL,
                data_hora_fim DATETIME not NULL,
                tipo VARCHAR(15) NOT NULL,
                Foreign Key (username_lancador) REFERENCES usuarios(username)
            );

        create table
            centro_resultado(
                nome VARCHAR(30) NOT NULL,
                status_aprovacao ENUM('ativo', 'inativo') NOT NULL,
                codigo_cr VARCHAR(10) not NULL PRIMARY KEY,
                sigla VARCHAR (10) NOT NULL UNIQUE
            );

        create table
            cliente (
                razao_social VARCHAR(70) NOT NULL,
                status_clientes ENUM('ativo', 'inativo') NOT NULL,
                cnpj BIGINT PRIMARY KEY NOT NULL
            );

        create table
            contrato(
                id int(10) auto_increment primary key,
                cod_cr VARCHAR(10) not NULL,
                cnpj_cliente BIGINT NOT NULL,
                Foreign Key (cod_cr) REFERENCES centro_resultado(codigo_cr),
                Foreign KEY (cnpj_cliente) REFERENCES cliente(cnpj)
            );

        create table
            integrantes (
                gestor BOOLEAN NOT NULL,
                username_integrante VARCHAR(20) not null,
                cod_cr VARCHAR(10) not NULL,
                Foreign Key (username_integrante) REFERENCES usuarios(username),
                Foreign Key (cod_cr) REFERENCES centro_resultado(codigo_cr),
                PRIMARY KEY (username_integrante, cod_cr)
            );
</code></pre>
    </details>
    <details>
        <summary>Criação do método getUsuario na classe usuarioDAO</summary>
        <p align="justify">Criei o método <code>getUsuario</code> na classe <code>usuarioDAO</code>, que era responsável por buscar um usuário no banco de dados com base no nome de usuário e senha informados. O método retornava um objeto do tipo <code>Usuario</code>, que continha as informações do usuário.</p>
        <pre>
        <code>
        public Usuario getUsuario(String username, String senha){
                
                        String sql = "SELECT * FROM usuario WHERE username = ? AND senha = ?";
                        
                Connection conn = null;
                PreparedStatement pstm = null;
                //Classe que vai recuperar os dados do banco. ***SELECT****
                ResultSet rset = null;
                        Usuario usuario = Usuario.getInstance();
                
                try {
                    conn = Conexao.createConnectionToMySQL();
                    
                    pstm = (PreparedStatement) conn.prepareStatement(sql);
                                pstm.setString(1, username);
                                pstm.setString(2, senha);			
                    rset = pstm.executeQuery();
                                
                    
                                if (rset.next()) {
                        
                        usuario.setUsername(rset.getString("username"));
                        usuario.setNome(rset.getString("nome"));
                                        usuario.setSenha(rset.getString("senha"));
                        usuario.setCargo(rset.getString("funcao"));
                        usuario.setStatus(rset.getString("status_user"));
                                                        
                    } else {
                                    return null;
                                }
                                
                }catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        try {
                            if(rset!=null) {
                                rset.close();
                            }
                            
                            if(pstm!=null) {
                                pstm.close();
                            }
                            
                            if(conn!=null) {
                                conn.close();
                            }
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return usuario;
            }
</code></pre>
    </details>
    <details>
        <summary>Criação do controller de Login</summary>
        <p align="justify">Criei o controller de Login, utilizando o JavaFX. O controller era responsável por controlar a tela de login, validando as informações inseridas pelo usuário e realizando a autenticação do usuário.</p>
        <pre>
        <code>
        public class TelaLoginController implements Initializable {

            @FXML
            private TextField LoginUsuário;
            @FXML
            private PasswordField LoginSenha;
            @FXML
            private Button LoginBotaoEntrar;
            @FXML
            private Button LoginBotaoFechar;

            @Override
            public void initialize(URL url, ResourceBundle rb) {
                // TODO
            }    

            @FXML
            private void handleLoginButtonAction(ActionEvent event) {
                    String user = LoginUsuário.getText();
                    String senha = LoginSenha.getText();

                    try (Connection connection = Conexao.createConnectionToMySQL()) {
                        Usuario usuario = new usuarioDAO().getUsuario(user, senha);
                        if (usuario!=null && usuario.getUsername().equals( user) && usuario.getSenha().equals(senha)) {
                            
                            System.out.println("Logado");
                            System.out.println(usuario.getNome());
                            LoginSenha.setText("");
                            // Usuário e senha são válidos, exibir próxima tela
                            App.setRoot("LancamentoColaborador");
                            
                        } else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Erro");
                            alert.setHeaderText("Usuário ou senha inválidos");
                            alert.setContentText("Por favor verifique suas credenciais e tente novamente.");
                            alert.showAndWait();
                        }
                    } catch (SQLException e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Erro");
                        alert.setHeaderText("Erro de banco de dados");
                        alert.setContentText("Ocorreu um erro ao se comunicar com o banco de dados. Por favor tente novamente mais tarde.");
                        alert.showAndWait();
                        e.printStackTrace();
                    } catch (Exception e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Erro");
                        alert.setHeaderText("Erro desconhecido");
                        alert.setContentText("Ocorreu um erro desconhecido. Por favor tente novamente mais tarde.");
                        alert.showAndWait();
                        e.printStackTrace();
                    } 
                }

                @FXML
                private void handleFecharButtonAction(ActionEvent event) {
                    // Obtém a janela atual
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                // Fecha a janela atual
                stage.close();
                }
            }
</code></pre>
    </details>
    <details>
        <summary>Criação do método para editar Centros de Resultados pelo Administrador</summary>
        <p align="justify">Criei o método <code>BotaoEditar</code> na classe <code>CadastroCRADMController</code>, que era responsável por editar um Centro de Resultado. O método verificava se alguma linha da tabela de Centros de Resultado estava selecionada, exibia uma mensagem de confirmação para o usuário e, caso o usuário confirmasse, atualizava as informações do Centro de Resultado no banco de dados.</p>
        <details>
            <summary>Código do método update dentro de <code>crDAO</code></summary>
            <pre>
            <code>
            public void update(Centro_resultado cr) {
                String sql = "UPDATE centro_resultado SET nome=?, status_cr=?, sigla=? WHERE codigo_cr=?";
                Connection conn = null;
                PreparedStatement pstm = null;

                try {
                    conn = Conexao.createConnectionToMySQL();

                    pstm = (PreparedStatement) conn.prepareStatement(sql);
                    pstm.setString(1, cr.getNome());
                    pstm.setString(2, cr.getStatus_cr());
                    pstm.setString(3, cr.getSigla());
                    pstm.setString(4, cr.getCodigo_cr());

                    pstm.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (pstm != null) {
                            pstm.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
</code></pre>
        </details>
        <details>
            <summary>Código do método BotaoEditar</summary>
                <pre>
                <code>
                @FXML
                private void BotaoEditar(ActionEvent event) {
                    // verifica se alguma linha foi selecionada
                    if (tabelaCadastroCr.getSelectionModel().getSelectedItem() != null) {
                        // desabilita a edição da coluna de código
                        tabelaCadastroCr.getColumns().get(0).setEditable(false);

                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setTitle("Confirmação");
                        alert.setHeaderText(null);
                        alert.setContentText("Tem certeza que deseja atualizar os dados do CR?");

                        Optional<ButtonType> result = alert.showAndWait();
                        if (result.isPresent() && result.get() == ButtonType.OK) {
                            // o usuário clicou em "OK", continue com a ação
                            Centro_resultado crSelecionado = tabelaCadastroCr.getSelectionModel().getSelectedItem();

                            String novoNome = entradaNome.getText();
                            String novaSigla = entradaSigla.getText();
                            if (!novoNome.isEmpty()) {
                                // atualiza o objeto Centro_resultado com o novo nome
                                crSelecionado.setNome(novoNome);
                                crSelecionado.setSigla(novaSigla);

                                // salva o objeto atualizado no banco de dados
                                crDAO crdao = new crDAO();
                                crdao.update(crSelecionado);

                                // atualiza a tabela com as novas informações
                                carregarTabelaCr();
                                limparCampos();
                            }
                        } else {
                            limparCampos();
                            System.out.println("Cancelado");
                        }

                    } else {
                        System.out.println("Nenhuma linha selecionada");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Nenhuma linha selecionada");
                        alert.setHeaderText(null);
                        alert.setContentText("Por favor, selecione uma linha da tabela para editar");
                        alert.showAndWait();
                    }
                }
</code></pre>
        </details>
    </details>
    <details>
        <summary>Criação do método para ativação do Centro de Resultado pelo Administrador</summary>
        <p align="justify">Criei o método <code>BotaoInativar</code>, dentro da classe <code>CadastroCRADMController</code>, que era responsável por ativar um Centro de Resultado. O método verificava se alguma linha da tabela de Centros de Resultado estava selecionada, exibia uma mensagem de confirmação para o usuário e, caso o usuário confirmasse, atualizava o status do Centro de Resultado para ativo no banco de dados.</p>
        <pre>
        <code>
        @FXML
        private void BotaoAtivar(ActionEvent event) {
            // exibe um alerta de confirmação antes de ativar a CR
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmação");
            alert.setHeaderText(null);
            alert.setContentText("Tem certeza que deseja ativar a CR?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                // o usuário clicou em "Ok", então a CR será ativada
                crDAO crdao = new crDAO();
                Centro_resultado cr = crdao.getCrByCodigo(valorDoItemSelecionado);
                cr.setStatus_cr("ativo");
                crdao.update(cr);
                carregarTabelaCr();
                limparCampos();

                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("CR ativado");
                alert2.setHeaderText(null);
                alert2.setContentText("O CR foi ativado com sucesso!");
                alert2.showAndWait();
            } else {
                // o usuário clicou em "Cancelar", então nada será feito
                limparCampos();
                carregarTabelaCr();
            }
        }
</code></pre>
    </details>
    <details>
        <summary>Criação do método para inativação do Centro de Resultado pelo Administrador</summary>
        <p align="justify">Criei o método <code>BotaoInativar</code>, dentro da classe <code>CadastroCRADMController</code>, que era responsável por inativar um Centro de Resultado. O método verificava se alguma linha da tabela de Centros de Resultado estava selecionada, exibia uma mensagem de confirmação para o usuário e, caso o usuário confirmasse, atualizava o status do Centro de Resultado para inativo no banco de dados.</p>
        <pre>
        <code>
        @FXML
        private void BotaoInativar(ActionEvent event) {
            // exibe um alerta de confirmação antes de inativar a CR
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmação");
            alert.setHeaderText(null);
            alert.setContentText("Tem certeza que deseja inativar o CR?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                // o usuário clicou em "Ok", então a CR será inativada
                crDAO crdao = new crDAO();
                Centro_resultado cr = crdao.getCrByCodigo(valorDoItemSelecionado);
                cr.setStatus_cr("inativo");
                crdao.update(cr);

                carregarTabelaCr();
                limparCampos();

                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("CR inativado");
                alert2.setHeaderText(null);
                alert2.setContentText("O CR foi inativado com sucesso!");
                alert2.showAndWait();
            } else {
                // o usuário clicou em "Cancelar", então nada será feito
                limparCampos();
                carregarTabelaCr();
            }
        }
</code></pre>
    </details>
    <details>
        <summary>Criação do método validaDataHora na classe LancamentoColaboradorController</summary>
        <p align="justify">Criei o método que validava a data e hora de início e fim do lançamento de horas, garantindo que a data e hora de início fossem anteriores à data e hora de fim. O método <code>validaDataHora</code> era responsável por realizar essa validação e retornar um valor booleano indicando se a data e hora eram válidas.</p>
        <pre>
        <code>
        public boolean validaDataHora(Hora hora) {
            boolean valido = false;
            // Captura data hora inicio e fim
            Timestamp dtHrInicio = hora.getData_hora_inicio();
            Timestamp dtHrFim = hora.getData_hora_fim();

            int resultDtHrIniFim = dtHrInicio.compareTo(dtHrFim);

            // Verifica se a dtHrInicio é anterior a dtHrFim
            if (resultDtHrIniFim < 0) {
                valido = true;
            }
            return valido;
        }
</code></pre>
    </details>
    <details>
        <summary>Criação do método getConflito na classe LancamentoColaboradorController</summary>
        <p align="justify">Criei o método <code>getConflito</code> na classe <code>LancamentoColaboradorController</code>, que era responsável por verificar se o lançamento de horas entrava em conflito com alguma hora já lançada. O método comparava a data e hora de início e fim do lançamento com as datas e horas de início e fim de todas as horas já lançadas, retornando um valor booleano indicando se havia conflito.</p>
        <pre>
        <code>
        public boolean getConflito(Hora hora) {
            Timestamp dtHrInicio = hora.getData_hora_inicio();
            Timestamp dtHrFim = hora.getData_hora_fim();

            // Verifica se entra em conflito com alguma hora já lançada
            boolean conflito = false;
            for (Hora horaExistente : lishoras) {
                Timestamp inicio = horaExistente.getData_hora_inicio();
                Timestamp fim = horaExistente.getData_hora_fim();

                int resultIniIni = dtHrInicio.compareTo(inicio);
                int resultFimFim = dtHrFim.compareTo(fim);
                int resultIniFim = dtHrInicio.compareTo(fim);
                int resultFimIni = dtHrFim.compareTo(inicio);

                if ((resultIniIni > 0 && resultIniFim < 0)
                        || (resultFimIni > 0 && resultFimFim < 0)
                        || (resultIniIni < 0 && resultFimFim > 0)
                        || resultIniIni == 0 || resultFimFim == 0) {
                    conflito = true;
                    break;
                }
            }
            return conflito;
        }
</code></pre>
    </details>
    <details>
        <summary>Criação da lógica do botaoAcionamento na classe LancamentoColaboradorController</summary>
        <p align="justify">Criei a lógica do método <code>botaoAcionamento</code> na classe <code>LancamentoColaboradorController</code>, que era responsável por realizar o lançamento de um acionamento dentro de um sobreaviso. O método verificava se todos os campos obrigatórios estavam preenchidos, validava a data e hora de início e fim do lançamento, verificava se havia conflito com outras horas lançadas e, caso tudo estivesse correto, exibia um pop-up de confirmação e realizava o lançamento das horas.</p>
        <pre>
        <code>
        @FXML
        public void botaoAcionamento(ActionEvent event) throws ParseException {
            if (getDataInicio().getValue() == null
                    || getHoraInicio().getValue() == null
                    || getMinutoInicio().getValue() == null
                    || getDataFim().getValue() == null
                    || getHoraFim().getValue() == null
                    || getMinutoFim().getValue() == null
                    || entradaProjeto.getText().isEmpty()
                    || selecaoCliente.getValue() == null
                    || selecaoCR.getValue() == null
                    || entradaJustificativa.getText().isEmpty()
                    || horaTipo.getValue() == null) {
                System.out.println("Preencha todos os campos - tela de lançamento");
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Preencha todos os campos");
                alert.setHeaderText(null);
                alert.setContentText("Alguns dos campos não foram preenchidos");
                alert.showAndWait();
            } else {
                capturaHora();
                boolean valido = validaDataHora(capturaHora());

                if (valido) {
                    boolean conflito = getConflito(capturaHora());

                    if (!conflito) {
                        try {
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("PopUpAcionamento.fxml"));
                            Parent root = loader.load();
                            PopUpAcionamentoController controller = new PopUpAcionamentoController();

                            loader.setController(controller);
                            Stage popup = new Stage();
                            popup.initModality(Modality.APPLICATION_MODAL);
                            popup.initOwner(botaoAcionamento.getScene().getWindow());
                            popup.setScene(new Scene(root));

                            popup.showAndWait();
                            carregarTabelaLancamento();
                            limparCampos();

                        } catch (IOException e) {

                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Conflito de horas");
                        alert.setHeaderText(null);
                        alert.setContentText("A hora informada está em conflito com outro lançamento");
                        alert.showAndWait();
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Lançamento incompatível");
                    alert.setHeaderText(null);
                    alert.setContentText("Data e hora de início devem ser antes do fim");
                    alert.showAndWait();
                }
            }
        }
</code></pre>
    </details>
    <details>
        <summary>Criação da lógica do botaoAdicionar na classe PopUpAcionamentoController</summary>
        <p align="justify">Criei a lógica do método <code>botaoAdicionar</code> na classe <code>PopUpAcionamentoController</code>, que era responsável por realizar o lançamento de um acionamento dentro de um sobreaviso. O método verificava se todos os campos obrigatórios estavam preenchidos, validava a data e hora de início e fim do lançamento, verificava se havia conflito com outras horas lançadas e, caso tudo estivesse correto, exibia um pop-up de confirmação e realizava o lançamento das horas.</p>
        <pre>
        <code>
        private void botaoAdicionar() throws ParseException {
            // Obtém os valores de data de inicio e de fim (campos de entrada)
            inicioAcionamento = dataInicioAc.getValue();
            fimAcionamento = dataFimAc.getValue();

            // Verifica se as datas (NÃO) foram preenchidas
            if (inicioAcionamento == null || fimAcionamento == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Preencha todos os campos");
                alert.setHeaderText(null);
                alert.setContentText("Alguns dos campos não foram preenchidos");
                alert.showAndWait();
            } else {
                Hora horaExtra = new Hora();

                // Preenche os dados que vêm do lançamento do sobreaviso
                horaExtra.setCnpj_cliente(sobreaviso.getCnpj_cliente());
                horaExtra.setCod_cr(sobreaviso.getCod_cr());
                horaExtra.setJustificativa_lancamento(sobreaviso.getJustificativa_lancamento());
                horaExtra.setNome_cliente(sobreaviso.getNome_cliente());
                horaExtra.setProjeto(sobreaviso.getProjeto());
                horaExtra.setUsername_aprovador(sobreaviso.getUsername_aprovador());
                horaExtra.setUsername_lancador(sobreaviso.getUsername_lancador());
                horaExtra.setTipo(sobreaviso.getTipo());
                horaExtra.setStatus_aprovacao(sobreaviso.getStatus_aprovacao());
                horaExtra.setSolicitante(sobreaviso.getSolicitante());

                // Formata as strings de inicioAcionamento e fimAcionamento
                String dtInicioAc = inicioAcionamento.toString();
                String dtFimAc = fimAcionamento.toString();

                // Obtém os valores de hora e minuto de inicio (campos de entrada)
                int hora_inicio = horaInicio.getValue();
                int min_inicio = minutoInicio.getValue();

                // Formata as strings de hora_inicio e min_inicio
                String hora_inicioS = Integer.toString(hora_inicio);
                String min_inicioS = Integer.toString(min_inicio);

                if (min_inicioS.length() < 2) {
                    min_inicioS = "0" + min_inicioS;
                }
                if (hora_inicioS.length() < 2) {
                    hora_inicioS = "0" + hora_inicioS;
                }

                // Concatena as strings de hora e minuto iniciais
                hora_inicioS = hora_inicioS + ":" + min_inicioS + ":00";

                // Concatena as strings de data de inicio e hora de inicio
                String data_hora_inicio = dtInicioAc + " " + hora_inicioS;

                // Preenche a data e a hora de inicio no objeto horaExtra
                horaExtra.setData_hora_inicio(data_hora_inicio);

                // Obtém os valores de hora e minuto de fim (campos de entrada)
                int hora_fim = horaFim.getValue();
                int min_fim = minutoFim.getValue();

                // Formata as strings de hora_fim e min_fim
                String hora_fimS = Integer.toString(hora_fim);
                String min_fimS = Integer.toString(min_fim);
                if (min_fimS.length() < 2) {
                    min_fimS = "0" + min_fimS;
                }
                if (hora_fimS.length() < 2) {
                    hora_fimS = "0" + hora_fimS;
                }

                // Concatena as strings de hora e minuto finais
                hora_fimS = hora_fimS + ":" + min_fimS + ":00";

                // Concatena as strings de data de inicio e hora finais
                String data_hora_fim = dtFimAc + " " + hora_fimS;

                // Preenche a data e a hora de fim no objeto horaExtra
                horaExtra.setData_hora_fim(data_hora_fim);

                int resultInicio = horaExtra.getData_hora_inicio().compareTo(sobreaviso.getData_hora_inicio());
                int resultFim = horaExtra.getData_hora_fim().compareTo(sobreaviso.getData_hora_fim());
                int resultHoraExtra = horaExtra.getData_hora_inicio().compareTo(horaExtra.getData_hora_fim());

                // Verifica se a hora-extra informada está dentro do intervalo de sobreaviso
                if (resultInicio >= 0 && resultFim <= 0) {
                    if (resultHoraExtra < 0) {

                        boolean conflito = false;
                        for (Hora horaExistente : lantemp) {
                            Timestamp inicio = horaExistente.getData_hora_inicio();
                            Timestamp fim = horaExistente.getData_hora_fim();

                            int resultIniIni = horaExtra.getData_hora_inicio().compareTo(inicio);
                            int resultFimFim = horaExtra.getData_hora_fim().compareTo(fim);
                            int resultIniFim = horaExtra.getData_hora_inicio().compareTo(fim);
                            int resultFimIni = horaExtra.getData_hora_fim().compareTo(inicio);

                            if ((resultIniIni > 0 && resultIniFim < 0)
                                    || (resultFimIni > 0 && resultFimFim < 0)
                                    || (resultIniIni < 0 && resultFimFim > 0)
                                    || resultIniIni == 0 || resultFimFim == 0) {
                                conflito = true;
                                break;
                            }
                        }

                        if (!conflito) {
                            horaExtra.setTipo(TipoHora.EXTRA.name());
                            horaExtra.setId(lantemp.size() + 1);
                            contagem++;
                            lantemp.add(horaExtra);
                            carregarTabelaAcionamento();
                        } else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Conflito de horas");
                            alert.setHeaderText(null);
                            alert.setContentText("A hora informada está em conflito com uma hora já adicionada.");
                            alert.showAndWait();
                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Hora-extra incompatível");
                        alert.setHeaderText(null);
                        alert.setContentText("O início da hora-extra deve ser antes do fim");
                        alert.showAndWait();
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Hora-extra fora do intervalo");
                    alert.setHeaderText(null);
                    alert.setContentText("A hora-extra informada precisa estar dentro do intervalo de data do sobreaviso.");
                    alert.showAndWait();
                }
            }
        }
</code></pre>
    </details>
</ul>

<h2 id="api3">Sistema de lançamento de horas-extras e sobreavisos web</h2>

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
    <image src="./assets/DER_API3.png" alt="Diagrama de Entidade-Relacionamento">
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

<h2 id="api4">Sistema de cadastro e atualização de parceiros</h2>

<h3>Descrição</h3>

<p align="justify">Este projeto foi desenvolvido em parceria com a empresa Oracle. O objetivo era criar uma aplicação web que permitisse cadastrar e gerenciar empresas parceiras da Oracle. A aplicação foi desenvolvida em Java, utilizando o framework Spring Boot e o banco de dados Mysql. Para o front-end, foi utilizado o Vue.js, com HTML e CSS.</p>

<p align="justify">A empresa parceira possuía dificuldades no controle e gestão das empresas parceiras, possuindo pouca visibilidade dos dados e processos relacionados a essas empresas. A aplicação desenvolvida permitiu a centralização das informações, facilitando o cadastro, atualização e consulta das empresas parceiras, além da visualização gráfica dessas informações.</p>

<h3>Contribuições Individuais</h3>
<p align="justify">Atuei como Scrum-Master e desenvolvedora full-stack. A seguir, estão listadas as minhas contribuições para o projeto:</p>

<ul>
    <details>
        <summary>Criação da entidade OpnTrack</summary>
        <p align="justify">Criei a entidade <code>OpnTrack</code> no Java. A entidade representava as informações relacionadas às trilhas de parceiros da Oracle, como nome, status e data de criação. A entidade foi mapeada para uma tabela no banco de dados Mysql, permitindo o armazenamento e consulta dos dados.</p>
        <pre>
        <code>
        @Entity
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @EqualsAndHashCode
        @Table(name = "opn_track")
        public class OpnTrack {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;

            @Column(name = "name", nullable = true, length = 20)
            private String name;

            @Column(name = "opn_track_status", nullable = false, length = 20)
            private Boolean opnTrackStatus;

            @Column(name = "created_at")
            private LocalDateTime createdAt;
        }
</code></pre>
    </details>
    <details>
        <summary>Criação do repository OpnTrackRepository</summary>
        <p align="justify">Criei o repository responsável pelo acesso aos dados da entidade <code>OpnTrack</code>. O repository permitia a realização de operações de consulta, inserção, atualização e exclusão de dados da entidade, utilizando métodos como <code>findAll</code>, <code>save</code> e <code>deleteById</code>.</p>
        <pre>
        <code>
        public interface OpnTrackRepository extends JpaRepository <OpnTrack,Long>{
            OpnTrack findByName(String name);   
        }
</code></pre>
    </details>
    <details>
        <summary>Criação do DTO OpnTrackDTO</summary>
        <p align="justify">Criei o DTO responsável por representar os dados da entidade <code>OpnTrack</code> na camada de apresentação. O DTO continha os atributos da entidade, juntamente com anotações de validação e exemplos de valores. Além disso, o DTO possuía um construtor que recebia uma entidade <code>OpnTrack</code> e preenchia os atributos correspondentes.</p>
        <pre>
        <code>
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public class OpnTrackDTO {

            @Schema(description = "ID da OPN Track", example = "123")
            private Long id;

            @Schema(description = "Nome da OPN Track", example = "CLOUD BUILD")
            private String name;

            @Schema(description = "Status da OPN Track", example = "true")
            private Boolean opnTrackStatus;

            @Schema(description = "Data de criação da OpnTrack", example = "2022-01-01T12:00:00")
            private LocalDateTime createdAt;

            public OpnTrackDTO(OpnTrack entity){
                this.id = entity.getId();
                this.name = entity.getName();
                this.opnTrackStatus = entity.getOpnTrackStatus();
                this.createdAt = entity.getCreatedAt();
            }

        }
</code></pre>
    </details>
    <details>
        <summary>Criação do service OpnTrackService</summary>
        <p align="justify">Criei o service responsável pela lógica de negócio da entidade <code>OpnTrack</code>. O service continha métodos para realizar operações como consulta, inserção, atualização e exclusão de trilhas de parceiros, utilizando o repository correspondente. Além disso, o service realizava a conversão entre entidades e DTOs, garantindo a separação de responsabilidades.</p>
        <pre>
        <code>
        @Service
        public class OpnTrackService {
            @Autowired
            private OpnTrackRepository opnTrackRepository;

            public OpnTrackDTO findOpnTrackById(Long id){
                OpnTrack opnTrack = opnTrackRepository.findById(id).get();
                return new OpnTrackDTO(opnTrack);
            }

            public Optional<OpnTrackDTO> findOpnTrackByName(String name){
                OpnTrack opnTrack = opnTrackRepository.findByName(name);
                return Optional.ofNullable(opnTrack).map(OpnTrackDTO::new);
            }

            public Page<OpnTrackDTO> findAllOpnTracks(Pageable pageable){
                Page<OpnTrack> opnTracks = opnTrackRepository.findAll(pageable);
                return opnTracks.map(OpnTrackDTO::new);
            }

            public OpnTrackDTO insertOpnTrack(OpnTrackDTO opnTrackDTO){
                if (opnTrackDTO.getName() == null || opnTrackDTO.getName().isBlank()){
                    throw new RuntimeException("O nome da OPN Track é obrigatório");
                }

                OpnTrack opnTrack = new OpnTrack();
                copyDTOtoEntity(opnTrackDTO, opnTrack);

                opnTrack = opnTrackRepository.save(opnTrack);

                return new OpnTrackDTO(opnTrack);

            }

            public OpnTrackDTO updateOpnTrack(Long id, OpnTrackDTO opnTrackDTO){
                OpnTrack opnTrack = opnTrackRepository.findById(id).orElseThrow(
                    () -> new RuntimeException("OPN Track não encontrada com o id: " + id)
                    );
                copyDTOtoEntity(opnTrackDTO, opnTrack);
                opnTrack = opnTrackRepository.save(opnTrack);
                return new OpnTrackDTO(opnTrack);
            }

            public void disableOpnTrack(Long id){
                OpnTrack opnTrack = opnTrackRepository.findById(id).orElseThrow(
                    () -> new RuntimeException("OPN Track não encontrada com o id: " + id)
                    );
                opnTrack.setOpnTrackStatus(false);
                opnTrackRepository.save(opnTrack);
            }

            public void enableOpnTrack(Long id){
                OpnTrack opnTrack = opnTrackRepository.findById(id).orElseThrow(
                    () -> new RuntimeException("OPN Track não encontrada com o id: " + id)
                    );
                opnTrack.setOpnTrackStatus(true);
                opnTrackRepository.save(opnTrack);
            }

            private void copyDTOtoEntity(OpnTrackDTO opnTrackDTO, OpnTrack opnTrack){
                opnTrack.setName(opnTrackDTO.getName());
                opnTrack.setOpnTrackStatus(opnTrackDTO.getOpnTrackStatus());
                opnTrack.setCreatedAt(LocalDateTime.now());
            }
        }
</code></pre>
    </details>
    <details>
        <summary>Criação do controller OpnTrackController</summary>
        <p align="justify">Criei o controller responsável por definir as rotas da entidade <code>OpnTrack</code>. O controller continha métodos para realizar operações como consulta, inserção, atualização e exclusão de trilhas de parceiros, utilizando o service correspondente. Além disso, o controller definia as anotações de mapeamento de rotas, operações suportadas e respostas esperadas.</p>
        <pre>
        <code>
        @RestController
        @RequestMapping(value = "/opntrack")
        public class OpnTrackController {

            @Autowired
            private OpnTrackService opnTrackService;

            @GetMapping
            @Operation(summary = "OpnTrack", description = "Get all OpnTracks")
            @ApiResponses(value = {
                @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                        array = @ArraySchema(
                            schema = @Schema(implementation = OpnTrack.class)
                        )
                    ),
                    description = "OpnTracks retrieved"
                ),
                @ApiResponse(responseCode = "404", description = "OpnTracks not found")
            })
            public ResponseEntity<Page<OpnTrackDTO>> getAllOpnTracks(Pageable pageable) {
                Page<OpnTrackDTO> opnTracks = opnTrackService.findAllOpnTracks(pageable);
                return new ResponseEntity<>(opnTracks, HttpStatus.OK);
            }

            @GetMapping(value = "/{id}")
            @Operation(summary = "Find OpnTrack by ID", description = "Get an OpnTrack by its ID")
            @ApiResponses(value = {
                @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(
                        schema = @Schema(implementation = OpnTrack.class)
                    )
                ),
                @ApiResponse(
                    responseCode = "404",
                    description = "OpnTrack not found"
                )
            })
            public ResponseEntity<OpnTrackDTO> getOpnTrackById(@PathVariable Long id){
                OpnTrackDTO opnTrackDTO = opnTrackService.findOpnTrackById(id);
                if (opnTrackDTO != null){
                    return new ResponseEntity<>(opnTrackDTO, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
            }

            @PostMapping
            @Operation(summary = "Insert OpnTrack", description = "Insert a new OpnTrack")
            @ApiResponses( value = {
                @ApiResponse(
                    responseCode = "201",
                    description = "OpnTrack inserted",
                    content = @Content(
                        schema = @Schema(implementation = OpnTrackDTO.class)
                    )
                ),
                @ApiResponse(
                    responseCode = "400",
                    description = "OpnTrack already exists"
                )
            })
            public ResponseEntity<OpnTrackDTO> insertOpnTrack(@RequestBody OpnTrackDTO opnTrackDTO){
                Optional<OpnTrackDTO> optionalOpnTrack= opnTrackService.findOpnTrackByName(opnTrackDTO.getName());
                if (optionalOpnTrack.isPresent()){
                    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                }
                opnTrackDTO = opnTrackService.insertOpnTrack(opnTrackDTO);
                URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                        .buildAndExpand(opnTrackDTO.getId()).toUri();
                return ResponseEntity.created(uri).body(opnTrackDTO);
            }

            @PutMapping(value = "/{id}")
            @Operation(summary = "Update OpnTrack", description = "Update an existing OpnTrack")
            @ApiResponse(
                responseCode = "200",
                description = "OpnTrack updated",
                content = @Content(
                    schema = @Schema(implementation = OpnTrackDTO.class)
                )
            )
            public ResponseEntity<OpnTrackDTO> updateOpnTrack(@PathVariable Long id, @RequestBody OpnTrackDTO opnTrackDTO){
                opnTrackDTO = opnTrackService.updateOpnTrack(id, opnTrackDTO);
                return new ResponseEntity<>(opnTrackDTO, HttpStatus.OK);
            }

            @DeleteMapping(value = "/{id}")
            @Operation(summary = "Disable OpnTrack", description = "Disable an existing OpnTrack")
            @ApiResponse(
                responseCode = "204",
                description = "OpnTrack disabled"
            )
            public ResponseEntity<Void> disableOpnTrack(@PathVariable Long id){
                opnTrackService.disableOpnTrack(id);
                return ResponseEntity.noContent().build();
            }

            @PutMapping(value = "/{id}/enable")
            @Operation(summary = "Enable OpnTrack", description = "Enable an existing OpnTrack")
            @ApiResponse(
                responseCode = "204",
                description = "OpnTrack enabled"
            )
            public ResponseEntity<Void> enableOpnTrack(@PathVariable Long id){
                opnTrackService.enableOpnTrack(id);
                return ResponseEntity.noContent().build();
            }
        }
</code></pre>
    </details>
</ul>
