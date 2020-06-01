package summerpetstore.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import summerpetstore.model.GpModel;


public class GpDAO {

	private String namespace = "summerpetstore.repository.mapper.GpMapper";
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
	
	//�������� ����
	public int updateGp(GpModel gp) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.update(namespace + ".updateGp", gp);
			if(result > 0) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	
	//�������� ����
	public int deleteGp(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".deleteGp", itemId);
			if(result > 0) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	
	//�������� ����
	public int participateGp(int itemId, String userName) {
		return GpMapper.participate(itemId, userName);
	}
	
	//�������� ��� ����(���� ��� �ؾ����� �� �𸣴� ����)
	public int cancelGp(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".cancelGp", itemId);
			if(result > 0) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	//�������� �˻�
	public GpModel searchGp(String name, String itemKind) {
		return GpMapper.searchGp(name, itemKind);
	}
	
	//�������� ������ �ִ��� Ȯ�� (������ ���� ����)
	public boolean is_GPJP_exist(int itemId) {	
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			GpModel model = (GpModel)sqlSession.selectOne(namespace + ".cancelGp", itemId);
			int result = model.getCurrentCon();
			if(result > 0) { return true; }
			else { return false; }
		}finally { sqlSession.close(); }
	}
			
	
}
