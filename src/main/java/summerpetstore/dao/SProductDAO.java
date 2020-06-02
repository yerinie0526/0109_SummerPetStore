package summerpetstore.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import summerpetstore.model.ItemModel;

@Repository
public class SProductDAO {
	private String namespace = "summerpetstore.repository.mapper.SProductMapper";
	private SqlSessionFactory sqlSessionFactory = createSqlSessionFactory();
	private SqlSessionFactory createSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	//show item
	public ItemModel showInfo(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ItemModel result = sqlSession.selectOne(namespace + ".showInfoSP", itemId);
			if(result != null) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	//register
	public ItemModel registerSP(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ItemModel result = sqlSession.selectOne(namespace + ".registerSP", itemId);
			if(result != null) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	//delete
	public ItemModel deleteSP(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ItemModel result = sqlSession.selectOne(namespace + ".deleteSP", itemId);
			if(result != null) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	//update
	public ItemModel updateSP(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ItemModel result = sqlSession.selectOne(namespace + ".updateSP", itemId);
			if(result != null) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
}
