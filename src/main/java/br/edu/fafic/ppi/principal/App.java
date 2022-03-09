package br.edu.fafic.ppi.principal;

import br.edu.fafic.ppi.dao.PessoaFisicaDAO;
import br.edu.fafic.ppi.dao.PessoaJuridicaDAO;
import br.edu.fafic.ppi.domain.*;

import java.util.UUID;

public class App {

    public static void main(String[] args) {

      PessoaFisicaDAO pfDAO = new PessoaFisicaDAO();
      PessoaJuridicaDAO pjDAO = new PessoaJuridicaDAO();

      PessoaFisica pf = new PessoaFisica();
      pf.setCpf("123456");
      pf.setNome("Jose");
      pf.setContato(Contato.builder()
                      .email("jose@gmail.com")
                      .telefone("5555-5555")
              .build());
      pf.setEndereco(Endereco.builder()
                      .cidade("Cajazeiras")
                      .UF("PB")
              .build());
      //pfDAO.saveOrUpdate(pf);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj("852.452/0001-20");
        pj.setRazaoSocial("Empresa Fafic");
        pj.setContato(Contato.
                builder()
                        .email("empresa@gmail.com")
                        .telefone("8888-8888")
                .build());
        pj.setEndereco(Endereco.builder()
                        .UF("CE")
                        .cidade("Fortaleza")
                .build());
       // pjDAO.saveOrUpdate(pj);

      PessoaFisica pessoa = pfDAO.findById(PessoaFisica.class, UUID.fromString("49ac8f44-dece-4127-be0f-574c3199662f"));
      pessoa.setCpf("6589565");
      pessoa.setNome("Pedro");
      pessoa.setEndereco(Endereco.builder().cidade("Ipaumirim").UF("CE").build());
      pfDAO.saveOrUpdate(pessoa);
    }
}
