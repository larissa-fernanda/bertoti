package com.example.lab3.controllers;

import com.example.lab3.pessoa.Pessoa;
import com.example.lab3.pessoa.PessoaRepository;
import com.example.lab3.pessoa.PessoaRequestDTO;
import com.example.lab3.pessoa.PessoaResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("pessoa")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Pessoa savePessoa(@RequestBody PessoaRequestDTO data) {
        try {
            Pessoa pessoaData = new Pessoa(data);
            return repository.save(pessoaData);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível cadastrar a pessoa, por favor verifique as informações " + e.getMessage());
        }
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<PessoaResponseDTO> getAll() {
        try {
            List<PessoaResponseDTO> pessoaList = repository.findAll().stream().map(PessoaResponseDTO::new).toList();
            return pessoaList;
        } catch (Exception e) {
            throw new RuntimeException("Não há pessoas disponíveis!");
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{cpf}")
    public ResponseEntity<Pessoa> getOne(@PathVariable Long cpf) {
        Optional<Pessoa> optionalPessoa = repository.findById(cpf);

        if (optionalPessoa.isPresent()) {
            Pessoa pessoa = optionalPessoa.get();
            return ResponseEntity.ok(pessoa);
        } else {
            throw new RuntimeException("Bolsa não encontrada");
        }
    }




    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PatchMapping("/{cpf}")
    public Pessoa updatePessoa(@PathVariable Long cpf, @RequestBody PessoaRequestDTO partialData) {
        Pessoa pessoa = repository.findById(cpf).orElseThrow(() -> new RuntimeException("Pessoa não encontrado com o cpf: " + cpf));

        try {
            if (partialData.nome() != null) {
                pessoa.setNome(partialData.nome());
            }
            if (partialData.telefone() != null) {
                pessoa.setTelefone(partialData.telefone());
            }
            if (partialData.idade() != null) {
                pessoa.setIdade(partialData.idade());
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a bolsa: " + e.getMessage());
        }

        repository.save(pessoa);
        return pessoa;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{cpf}")
    public ResponseEntity<Map<String, String>> deletePessoa(@PathVariable Long cpf) {
        if (repository.existsById(cpf)) {
            repository.deleteById(cpf);
            return ResponseEntity.ok(Collections.emptyMap());
        } else {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("message", "Erro ao deletar pessoa");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

}
