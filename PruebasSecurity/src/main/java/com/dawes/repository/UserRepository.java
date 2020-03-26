package com.dawes.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.UsuarioVO;

@Repository
@Transactional
public class UserRepository {

	@Autowired
	private EntityManager entityManager;

	public UsuarioVO findUserAccount(String userName) {
		try {
			Query query = entityManager.createQuery("select u from UsuarioVO u WHERE u.userName=:nombre",
					UsuarioVO.class);
			query.setParameter("nombre", userName);

			return (UsuarioVO) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
}
