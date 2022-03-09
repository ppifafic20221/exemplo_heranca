package br.edu.fafic.ppi.domain;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("F")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisica extends Pessoa{

    private String nome;
    private String cpf;

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
