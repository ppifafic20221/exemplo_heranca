package br.edu.fafic.ppi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    private String email;
    private String telefone;
}
