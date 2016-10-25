package rooibos;

import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisAdminDao implements AdminDao {
	 SqlSessionFactory ssf;
	 
	public MybatisAdminDao() {

	ssf = NewlecSessionFactoryBuilder.getSqlsessionFactory(); 
		
	}
	@Override
	public Admin get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}
