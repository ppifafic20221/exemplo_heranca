package br.edu.fafic.ppi.dao;

import br.edu.fafic.ppi.domain.PessoaFisica;

import java.util.List;
import java.util.UUID;

public class PessoaFisicaDAO extends GenericDAOImpl<PessoaFisica>{

    @Override
    public void saveOrUpdate(PessoaFisica entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(PessoaFisica entity) {
        super.delete(entity);
    }

    @Override
    public List<PessoaFisica> findAll(String namedQuery) {
        return super.findAll(namedQuery);
    }

    @Override
    public PessoaFisica findById(Class<PessoaFisica> cl, UUID id) {
        return super.findById(cl, id);
    }
}
