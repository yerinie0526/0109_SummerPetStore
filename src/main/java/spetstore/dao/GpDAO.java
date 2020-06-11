package spetstore.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import spetstore.model.GpModel;

@Repository
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
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.selectOne(namespace + ".cancelGp", itemId + userName);
			if(result > 0) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
		//return GpMapper.participate(itemId, userName);
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
	public List<GpModel> searchGp(String name, String itemKind) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			List<GpModel> result = sqlSession.selectList(namespace + ".cancelGp", name + itemKind);
			if(result != null) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
		//return GpMapper.searchGp(name, itemKind);
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
	
	public int cancelGpJPId(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".cancelGpJPId", itemId);
			if(result < 0) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	
}
