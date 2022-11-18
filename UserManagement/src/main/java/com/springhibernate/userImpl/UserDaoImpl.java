package com.springhibernate.userImpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernate.Entity.User;
import com.springhibernate.UserDao.UserDao;

public class UserDaoImpl implements UserDao {

	private HibernateTemplate ht;
	
	// To insert record of user
		@Transactional
		public int insertUser(User us) {
			ht.save(us);
			return 1;

		}

		// To update record of user
		@Transactional
		public int updateUser(User us) {
			ht.update(us);
			return 1;

		}

		// To delete record of User
		@Transactional
		public int deleteUser(User us) {
			ht.delete(us);
			return 1;

		}

		// To get specific record
		public User getUser(int id) {

			User us = ht.get(User.class, id);
			return us;

		}

		// To get all records
		public List<User> getAllUsers() {

			List<User> deptList = ht.loadAll(User.class);
			return deptList;

		}

		public HibernateTemplate getHt() {
			return ht;
		}

		public void setHt(HibernateTemplate ht) {
			this.ht = ht;
		}

		public User getSpecificUserDetails(int uid) {
			// TODO Auto-generated method stub
			return null;
		}
}
