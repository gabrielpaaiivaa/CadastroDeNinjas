package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CONTROLLER É A CAMADA MAIS PROXIMA DO USUARIO - nao tem muita logica

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    // Fazer um CRUD (CREATE, READ, UPDATE, DELETE)

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }


    // Adicionar Ninja /Create
    @PostMapping("/criar") // Adiciona algo
    public String criarNinja(){
        return "Ninja criado";
    }
    // Procurar ninja por ID /Read
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar ninja por ID";
    }
    // Mostrar todos os ninjas / Read
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }
    // Alterar dados dos ninjas / Update
    @PutMapping("/alterar") // Faz a alteracao
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID";
    }

    // Deletar Ninja / Delete
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID";
    }
}
