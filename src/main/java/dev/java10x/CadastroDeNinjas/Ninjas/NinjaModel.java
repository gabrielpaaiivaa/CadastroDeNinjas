package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma classe em uma entidade do Banco de Dados
// JPA - JAVA PERSISTENCE API
@Entity
@Table(name = "tb_cadastro")
// Lombok
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private int idade;
    @Column(unique = true) // Nao permite que um usuario tenha o mesmo email de outro.
    private String email;
    @Column(name = "img_url")
    private String imgUrl;
    // Uma missão pode ter varios ninjas, mas um ninja pode ter apenas uma missão por vez.
    @ManyToOne// Na classe ninja eu só vou ter uma unica missao

    @JoinColumn(name = "missoes_id") // Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;


}
