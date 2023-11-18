const obterTodasPessoas = async () => {
    // Faz a requisição para a API e retorna os clientes
    try {
        const response = await fetch('http://localhost:8080/pessoa');

        if (!response.ok) {
            throw new Error(`Erro na requisição: ${response.status}`);
        }

        const data = await response.json();
        console.log('Dados recebidos:', data);
        return data;
    } catch (error) {
        console.error('Erro na requisição:', error);
        throw error;
    }
};

async function renderData() {
    try {
        const todasPessoas = await obterTodasPessoas();
        const ulElement = document.querySelector('.list-of-items');

        ulElement.innerHTML = '';
        todasPessoas.forEach((item) => {
            renderListItem(ulElement, item);
        });
    } catch (error) {
        console.error('Erro na hora de renderizar:', error);
        throw error;
    }
}

function searchPessoaByTerm(searchTerm) {
    const apiUrl = `http://localhost:8080/pessoa`;

    fetch(apiUrl)
        .then((response) => response.json())
        .then((data) => {
            const ulElement = document.querySelector('.list-of-items');
            ulElement.innerHTML = '';

            const searchTermLowerCase = searchTerm.toLowerCase().trim();
            console.log(data);
            if (searchTermLowerCase === '') {
                data.forEach((item) => {
                    renderListItem(ulElement, item);
                });
            } else {
                const filteredData = data.filter((item) => {
                    return (
                        item.nome.toLowerCase().includes(searchTermLowerCase) ||
                        item.cpf.toLowerCase().includes(searchTermLowerCase) ||
                        item.telefone.toLowerCase().includes(searchTermLowerCase) ||
                        item.idade.toLowerCase().includes(searchTermLowerCase)
                    );
                });

                filteredData.forEach((item) => {
                    renderListItem(ulElement, item);
                });
            }
        })
        .catch((error) => {
            console.error('Erro ao buscar dados da API:', error);
        });
}

const inputSearch = document.querySelector(".input-search");

inputSearch.addEventListener("input", function () {
    searchTerm = inputSearch.value;
    console.log(searchTerm);
    searchPessoaByTerm(searchTerm);
});

async function refreshListPessoa() {
    try {
        console.log('Atualizando lista de pessoas...');
        await renderData();
    } catch (error) {
        console.error('Erro ao atualizar lista de pessoas:', error);
    }
}

function renderListItem(ulElement, item) {
    const liElement = document.createElement('li');
    liElement.classList.add('rendered-lista');
    
    liElement.innerHTML = `
        <p>${item.cpf}</p>
        <p>${item.nome}</p>
        <p>${item.telefone}</p>
        <p>${item.idade}</p>
        <div class="buttons">
            <button id"editar" class="editar">Editar</button>
            <button id="deletar" class="deletar">Deletar</button>
        </div>
    `;

    ulElement.appendChild(liElement);

    const allLiElements = document.querySelectorAll('.rendered-lista');
    allLiElements.forEach((liElement) => {
        liElementEvent(liElement);
    });
}

refreshListPessoa();

const addButton = document.querySelector('button');
const modal = document.getElementById('myModal');
const closeModal = document.querySelector('#closeModal');

function openModal() {
    modal.style.display = 'block';
}

addButton.addEventListener('click', openModal);

closeModal.addEventListener('click', function () {
    modal.style.display = 'none';
});

window.addEventListener('click', function (event) {
    if (event.target === modal) {
        modal.style.display = 'none';
    }
});

function closeModalFunction() {
    modal.style.display = 'none';
}

closeModal.addEventListener('click', closeModalFunction);

const cancelarButton = document.querySelector('.cancelar');
cancelarButton.addEventListener('click', closeModalFunction);

const confirmarButton = document.querySelector('.confirmar');

confirmarButton.addEventListener('click', function () {
    const nome = document.querySelector('.input-3').value;
    const cpf = document.querySelector('.input-4').value;
    const telefone = document.querySelector('.input-2').value;
    const idade = document.querySelector('.input-1').value;

    const pessoa = {
        nome: nome,
        cpf: cpf,
        telefone: telefone,
        idade: idade
    };

    console.log(pessoa);

    try {
        const response = fetch('http://localhost:8080/pessoa', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(pessoa)
        });

        if (!response.ok) {
            throw new Error(`Erro ao enviar dados para a API: ${response.status}`);
        }

        console.log('Dados enviados com sucesso!');
    
        closeModalFunction();
        refreshListPessoa();
    } catch (error) {
        console.error('Erro ao enviar dados para a API:', error);
    }
});

function liElementEvent(liElement) {

    const deleteElement = liElement.querySelector('.deletar');
    const editElement = liElement.querySelector('.editar');
    const cpfPessoa = liElement.querySelector('p:first-child').textContent;

    console.log(cpfPessoa);
    deleteElement.addEventListener('click', function () {
        const apiUrl = `http://localhost:8080/pessoa/${cpfPessoa}`;

        const requestOptions = {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json',
            },
        };
    
        fetch(apiUrl, requestOptions)
            .then((response) => {
                if (!response.ok) {
                    throw new Error('Erro na requisição');
                }
                return response.json();
            })
            .then((data) => {
                console.log('Pessoa deletada com sucesso:', data);
                refreshListPessoa();
            })
            .catch((error) => {
                console.error('Erro ao deletar pessoa:', error);
            });
    });

    editElement.addEventListener('click', function() {
        openModal();
        const titleModal = document.querySelector('.title-modal');
        titleModal.textContent = 'Editar Pessoa';

        const inputCpf = document.querySelector('.input-4');
        const inputNome = document.querySelector('.input-3');
        const inputTelefone = document.querySelector('.input-2');
        const inputIdade = document.querySelector('.input-1');

        inputCpf.value = liElement.querySelector('p:first-child').textContent;
        inputNome.value = liElement.querySelector('p:nth-child(2)').textContent;
        inputTelefone.value = liElement.querySelector('p:nth-child(3)').textContent;
        inputIdade.value = liElement.querySelector('p:nth-child(4)').textContent;

        inputCpf.disabled = true;        
        
    });

};

