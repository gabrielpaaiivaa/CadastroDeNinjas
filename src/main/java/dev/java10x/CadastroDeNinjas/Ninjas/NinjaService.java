package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // LOGICA PARA LISTAR TODOS OS NINJAS
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }
    // LOGICA PARA LISTAR NINJAS POR ID
    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }
    // LOGICA PARA CRIAR UM NOVO NINJA
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
    // LOGICA PARA DELETAR UM NINJA - TEM QUE SER UM METODO VOID
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }
    // LOGICA PARA ATUALIZAR NINJA
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}
