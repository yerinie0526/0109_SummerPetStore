package spetstore.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import spetstore.model.ItemModel;

public class MarketDAO {
	
	private String namespace = "summerpetstore.repository.mapper.MarketMapper";
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
	
	//���͹�ǰ ���
	public void registerItem(ItemModel im) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.insert(namespace + ".showInfo", im);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}
	
	//���͹�ǰ �ڼ��� ����
	public ItemModel showInfo(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ItemModel result = sqlSession.selectOne(namespace + ".showInfo", itemId);
			return result;
		}finally { sqlSession.close(); }
	}
	
	
	//���� ��ǰ ����
	public void deleteItem(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".deleteItem", itemId);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}
	
	
	//���͹�ǰ ����
	public void updateItem(ItemModel im) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.update(namespace + ".updateItem", im);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}
	
	
	//���ͻ��� ���� ex) �ŷ��� -> �ŷ� �Ϸ�
	public void updateItemStatus(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.update(namespace + ".updateItemStatus", itemId);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}
	
	//���� �˻�
	public List<ItemModel> searchItem(String itemname, String itemKind) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			List<ItemModel> result = sqlSession.selectList(namespace + ".searchMarket", itemname);
			return result;
		}finally { sqlSession.close(); }
	}

}
