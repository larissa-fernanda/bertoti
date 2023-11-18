const obterTodasBolsas = async () => {
    // Faz a requisição para a API e retorna os clientes
    try {
        const response = await fetch('http://localhost:8080/bolsa');

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
        const todasBolsas = await obterTodasBolsas();
        const ulElement = document.querySelector('.list-of-items');

        ulElement.innerHTML = '';
        todasBolsas.forEach((item) => {
            renderListItem(ulElement, item);
        });
    } catch (error) {
        console.error('Erro na hora de renderizar:', error);
        throw error;
    }
}

function searchPessoaByTerm(searchTerm) {
    const apiUrl = `http://localhost:8080/bolsa`;

    fetch(apiUrl)
        .then((response) => response.json())
        .then((data) => {
            const ulElement = document.querySelector('.list-of-items');
            ulElement.innerHTML = '';

            const searchTermLowerCase = searchTerm.toLowerCase().trim();

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

async function refreshListBolsa() {
    try {
        console.log('Atualizando lista de bolsas...');
        await renderData();
    } catch (error) {
        console.error('Erro ao atualizar lista de bolsas:', error);
    }
}

function renderListItem(ulElement, item) {
    const liElement = document.createElement('li');
    liElement.classList.add('rendered-lista');
    console.log(item);
    liElement.innerHTML = `
        <p>${item.Codigo}</p>
        <p>${item.tipo_sanguineo}</p>
        <p>${item.data_doacao}</p>
        <p>${item.cpf}</p>
        <p>${item.data_saida}</p>
        <div class="buttons">
            <button id="deletar" class="deletar">Usar</button>
        </div>
    `;

    ulElement.appendChild(liElement);

    const allLiElements = document.querySelectorAll('.rendered-lista');
    allLiElements.forEach((liElement) => {
        liElementEvent(liElement);
    });
}

refreshListBolsa();

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
    const tipo_sanguineo = document.querySelector('.input-4').value;
    const data_doacao = document.querySelector('.input-3').value;
    const cpf_pessoa = document.querySelector('.input-2').value;
    const cidade = document.querySelector('.input-1').value;

    const bolsa = {
        tipo_sanguineo: tipo_sanguineo,
        data_doacao: data_doacao,
        cpf_pessoa: cpf_pessoa,
        cidade: cidade
    };

    try {
        const response = fetch('http://localhost:8080/bolsa', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(bolsa),
        });

        if (!response.ok) {
            throw new Error(`Erro ao enviar dados: ${response.status}`);
        }

        console.log('Dados enviados com sucesso!');
        closeModalFunction();
        refreshListBolsa();
    } catch (error) {
        console.error('Erro ao enviar dados:', error);
    }
});

function liElementEvent(liElement) {

    const deleteElement = liElement.querySelector('.deletar');
    const editElement = liElement.querySelector('.editar');
    const codigo = liElement.querySelector('p:first-child').textContent;

    console.log(codigo);
    deleteElement.addEventListener('click', function () {
        const apiUrl = `http://localhost:8080/bolsa/${codigo}`;

        const bolsa = {
            data_saida: '2023-11-20'
        };
        const requestOptions = {
            method: 'PATCH',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(bolsa),
        };
    
        fetch(apiUrl, requestOptions)
            .then((response) => {
                if (!response.ok) {
                    throw new Error('Erro na requisição');
                }
                return response.json();
            })
            .then((data) => {
                console.log('Bolsa utilizada com sucesso:', data);
                refreshListBolsa    ();
            })
            .catch((error) => {
                console.error('Erro ao deletar bolsa:', error);
            });
    });

};

