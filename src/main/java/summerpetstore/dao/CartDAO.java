package summerpetstore.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import summerpetstore.model.GpModel;

public class CartDAO {
	
	private String namespace = "summerpetstore.repository.mapper.CartMapper";
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
	
	
	//īƮ����
	public int deleteCart(String userId, int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".deleteCart", itemId);
			if(result > 0) { sqlSession.c]ommit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	//ȸ���� Ż���Ҷ� ��ٱ��ϰ� �����Ǵ� ���
	public int deleteCartByUser(String userId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".deleteCartByUser",userId);
			if(result > 0) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	
	//�ֹ��ϱ�
	public int order(int userId, int orderId){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".cancelGp", itemId);
			if(result > 0) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
	}
	
	//īƮ�� �߰�
	public List<GpModel> addCart(int userId, int itemId, int price) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			List<GpModel> result = sqlSession.selectList(namespace + ".cancelGp", name + itemKind);
			if(result != null) { sqlSession.commit(); }
			return result;
		}finally { sqlSession.close(); }
		//return GpMapper.searchGp(name, itemKind);
	}
	
}
