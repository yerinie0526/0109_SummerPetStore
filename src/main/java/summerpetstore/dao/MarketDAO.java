package summerpetstore.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import summerpetstore.model.GpModel;
import summerpetstore.model.ItemModel;

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
	
	//장터물품 자세히 보기
	public ItemModel showInfo(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ItemModel result = sqlSession.selectOne(namespace + ".showInfo", itemId);
			return result;
		}finally { sqlSession.close(); }
	}
	
	
	//장터 물품 삭제
	public void deleteItem(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.delete(namespace + ".deleteItem", itemId);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}
	
	
	//장터물품 수정
	public void updateItem(ItemModel im) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.update(namespace + ".updateItem", im);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}
	
	
	//장터상태 수정 ex) 거래중 -> 거래 완료
	public void updateItemStatus(int itemId) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.update(namespace + ".updateItemStatus", itemId);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}
	
	//장터 검색
	public void searchItem() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int result = sqlSession.update(namespace + ".updateItemStatus", itemId);
			if(result > 0) { sqlSession.commit(); }
		}finally { sqlSession.close(); }
	}

}
