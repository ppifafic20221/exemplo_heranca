package br.edu.fafic.ppi.dao;

import br.edu.fafic.ppi.domain.PessoaJuridica;

import java.util.List;
import java.util.UUID;

public class PessoaJuridicaDAO extends GenericDAOImpl<PessoaJuridica>{

    @Override
    public void saveOrUpdate(PessoaJuridica entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public PessoaJuridica findById(Class<PessoaJuridica> cl, UUID id) {
        return super.findById(cl, id);
    }

    @Override
    public List<PessoaJuridica> findAll(String namedQuery) {
        return super.findAll(namedQuery);
    }

    @Override
    public void delete(PessoaJuridica entity) {
        super.delete(entity);
    }
}
