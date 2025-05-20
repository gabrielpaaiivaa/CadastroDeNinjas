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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Procurar ninja por ID /Read
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }
    // Mostrar todos os ninjas / Read
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }
    // Deletar Ninja / Delete
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }
    // Alterar dados
    @PutMapping("/alterar/{id}") // Faz a alteracao
    public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }
}
