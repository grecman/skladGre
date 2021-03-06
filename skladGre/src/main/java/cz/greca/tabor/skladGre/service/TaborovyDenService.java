package cz.greca.tabor.skladGre.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.greca.tabor.skladGre.entity.TaborovyDen;
import cz.greca.tabor.skladGre.repository.TaborovyDenRepository;

@Service 
public class TaborovyDenService { 
 
        static Logger log = Logger.getLogger(TaborovyDen.class); 
        
        @Autowired
    	private TaborovyDenRepository taborovyDenRepository;
        
        @Transactional
    	public void save(TaborovyDen taborovyDen) {
    		taborovyDenRepository.save(taborovyDen);
    	}
    	
        @Transactional
    	public void remove(TaborovyDen taborovyDen) {
    		taborovyDenRepository.delete(taborovyDen);
    	}

    	public List<TaborovyDen> findAll() {
    		return taborovyDenRepository.findAll();
    	}

    	public TaborovyDen findOne(int id) {
    		return taborovyDenRepository.findOne(id);
    	}
/*        
        @PersistenceContext(name = "TaborovyDenService") 
        private EntityManager entityManager; 
 
       public void addTaborovyDen(TaborovyDen TaborovyDen) { 
                log.trace("###\t\t addTaborovyDen("+TaborovyDen+")"); 
                entityManager.persist(TaborovyDen);            
        } 
        
       public void updateTaborovyDen(TaborovyDen TaborovyDen) { 
                log.trace("###\t\t updateTaborovyDen("+TaborovyDen+")"); 
                entityManager.merge(TaborovyDen);              
        } 
        
       public void removeTaborovyDen(TaborovyDen TaborovyDen) { 
                log.trace("###\t\t removeTaborovyDen("+TaborovyDen+")"); 
                TaborovyDen u = getTaborovyDen(TaborovyDen.getId()); 
                entityManager.remove(u);               
        }       
        

        
        public List<TaborovyDen> getTaborovyDens() { 
                log.trace("###\t\t getTaborovyDens();"); 
                return entityManager.createQuery("SELECT u FROM TaborovyDen u ORDER BY u.den ", TaborovyDen.class).getResultList(); 
        } 
        */
} 
