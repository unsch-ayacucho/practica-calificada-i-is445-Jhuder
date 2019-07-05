package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Docente;




@Repository("docenteDao")
public class DocenteDaoImpl implements DocenteDao {
	
	private EntityManager entityManager;
	
	@Override
	public List<Docente> listDocente() {
		return (List<Docente>) entityManager
				.createQuery("from Docente ", Docente.class)
				.getResultList();
				
	}
}

