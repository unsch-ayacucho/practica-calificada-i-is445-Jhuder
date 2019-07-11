package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Semestre;

@Repository
public class SemestreDaoImpl implements SemestreDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Semestre> listaDocente() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from Semestre s join fetch s.docente d ").getResultList();
	}

}
