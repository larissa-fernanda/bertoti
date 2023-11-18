package com.example.lab3.controllers;

import com.example.lab3.bolsa.Bolsa;
import com.example.lab3.bolsa.BolsaRequestDTO;
import com.example.lab3.bolsa.BolsaResponseDTO;
import com.example.lab3.bolsa.BolsaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("bolsa")
public class BolsaController {

    @Autowired
    private BolsaRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Bolsa saveBolsa(@RequestBody BolsaRequestDTO data) {
        try {
            Bolsa bolsaData = new Bolsa(data);
            return repository.save(bolsaData);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível cadastrar sua bolsa, por favor verifique as informações " + e.getMessage());
        }
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<BolsaResponseDTO> getAll() {
        try {
            List<BolsaResponseDTO> bolsaList = repository.findAll().stream().map(BolsaResponseDTO::new).toList();
            return bolsaList;
        } catch (Exception e) {
            throw new RuntimeException("Não há bolsas disponíveis");
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public ResponseEntity<Bolsa> getOne(@PathVariable Long id) {
        Optional<Bolsa> optionalBolsa = repository.findById(id);

        if (optionalBolsa.isPresent()) {
            Bolsa bolsa = optionalBolsa.get();
            return ResponseEntity.ok(bolsa);
        } else {
            throw new RuntimeException("Bolsa não encontrada");
        }
    }




    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PatchMapping("/{id}")
    public Bolsa updateBolsa(@PathVariable Long id, @RequestBody BolsaRequestDTO partialData) {
        Bolsa bolsa = repository.findById(id).orElseThrow(() -> new RuntimeException("Bolsa não encontrado com o ID: " + id));

        try {
            if (partialData.cpf_pessoa() != null) {
                bolsa.setCpf_pessoa(partialData.cpf_pessoa());
            }
            if (partialData.cidade() != null) {
                bolsa.setCidade(partialData.cidade());
            }
            if (partialData.tipo_sanguineo() != null) {
                bolsa.setTipoSanguineo(partialData.tipo_sanguineo());
            }
            if (partialData.data_doacao() != null) {
                bolsa.setDataDoacao(partialData.data_doacao());
            }
            if (partialData.data_saida() != null) {
                bolsa.setDataSaida(partialData.data_saida());
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a bolsa: " + e.getMessage());
        }

        repository.save(bolsa);
        return bolsa;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteBolsa(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok(Collections.emptyMap());
        } else {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("message", "Erro ao deletar bolsa");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

}
