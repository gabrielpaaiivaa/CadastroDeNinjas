package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

// CONTROLLER É A CAMADA MAIS PROXIMA DO USUARIO

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping ("/boasVindas") // Serve para mostrar
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota.";
    }
    // Fazer um CRUD (CREATE, READ, UPDATE, DELETE)

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
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
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
