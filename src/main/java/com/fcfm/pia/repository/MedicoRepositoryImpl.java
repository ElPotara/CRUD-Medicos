package com.fcfm.pia.repository;

import com.fcfm.pia.repository.entity.Medico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MedicoRepositoryImpl implements MedicoRepository{
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void insertar(Medico medico){
        em.persist(medico);
    }
    @Override
    public Medico getMedicoById(Long id){
        return em.find(Medico.class, id);
    }
    @Transactional
    @Override
    public void eliminar(Long id) {em.remove(getMedicoById(id));}
    @Transactional
    @Override
    public void actualizar(Medico medico) {
        em.merge(medico);
    }
    @Override
    public List<Medico> getAllMedicos() {
        TypedQuery<Medico> query = em.createQuery("SELECT a FROM Medico a", Medico.class);
        return query.getResultList();
    }

}
