package pe.edu.unsch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.unsch.dao.SemestreDao;
import pe.edu.unsch.entities.Semestre;

@Service
public class SemestreServiceImpl implements SemestreService {

	@Autowired
	private SemestreDao semestreDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Semestre> listaDocente() {
		// TODO Auto-generated method stub
		return semestreDao.listaDocente();
	}
	
}
