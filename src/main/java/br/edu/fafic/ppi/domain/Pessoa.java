package br.edu.fafic.ppi.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Contato contato;

//    public UUID getId() {
//        return id;
//    }
//
//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
//
//    public Contato getContato() {
//        return contato;
//    }
//
//    public void setContato(Contato contato) {
//        this.contato = contato;
//    }


}
