package br.com.edu.revjpa.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.edu.revjpa.util.JPAUtil;

public abstract class GenericDAO<T extends Serializable> {
	
	private Class<T> aClass;
	protected EntityManager manager;

	public GenericDAO(Class<T> aClass){
		this.aClass = aClass;
		
	}
	
	public EntityManager getEntityManager(){
		return JPAUtil.getInstance().getEntityManager();
	}
	
	public void save(T entity){
		manager = getEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void update(T entity){
		manager = getEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void remove(Long id){
		manager = getEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.getReference(aClass, id));
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(T entity){
		manager = getEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.merge(entity));
		manager.getTransaction().commit();
		manager.close();
	}
	
	public T findById(Long id){
		manager = getEntityManager();
		manager.getTransaction().begin();
		T entity = (T)manager.find(aClass, id);
		manager.getTransaction().commit();
		manager.close();
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		manager = getEntityManager();
		manager.getTransaction().begin();
		Query query = manager.createQuery("from "+ aClass.getSimpleName());
		List<T> list = query.getResultList();
		manager.getTransaction().commit();
		manager.close();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> find(String jpql, Object... params){
		manager = getEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery(jpql);
		for(int i = 0; i < params.length; i++){
			query.setParameter(i+1, params[i]);
		}
		
		List<T> list = query.getResultList();
		manager.getTransaction().commit();
		manager.close();
		
		return list;
		
	}
	

	@SuppressWarnings("unchecked")
	public T findOne(String jpql, Object... params){
		manager = getEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery(jpql);
		for(int i = 0; i < params.length; i++){
			query.setParameter(i+1, params[i]);
		}
		
		T entity = (T) query.getSingleResult();
		manager.getTransaction().commit();
		manager.close();
		
		return entity;
		
	}
	
	public Long count(){
		manager = getEntityManager();
		manager.getTransaction().begin();
		Query query = manager.createQuery("select count(c) from "+aClass.getSimpleName() + " c");
		
		Long result = (Long)query.getSingleResult();
		manager.getTransaction().commit();
		manager.close();
		
		return result;
	}

}
