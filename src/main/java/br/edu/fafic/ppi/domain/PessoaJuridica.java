package br.edu.fafic.ppi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("J")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaJuridica extends Pessoa{

    @Column(name = "razao_social")
    private String razaoSocial;
    private String cnpj;
}
