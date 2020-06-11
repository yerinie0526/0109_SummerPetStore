package spetstore.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import spetstore.dao.MarketDAO;
import spetstore.model.ItemModel;


public class MarketService {
	
	@Autowired
	private MarketDAO mdao;
	
	//장터에 물품 등록하기
	@Transactional
	public void registerItem(ItemModel im) { // 매개변수 고려 필요
		mdao.registerItem(im);
	}
	
	//장터물품 자세히 보기
	@Transactional
	public ItemModel showInfo(ItemModel im) { // 매개변수 고려 필요
		return mdao.showInfo(im.getItemId());
	}
	
	//장터물품 삭제
	@Transactional
	public void deleteItem(int itemId) { // 매개변수 고려 필요
		mdao.deleteItem(itemId);
	}
	
	//장터물품 수정
	@Transactional
	public void updateItem(ItemModel im) { // 매개변수 고려 필요
		mdao.updateItem(im);
	}
	
	
	//장터상태 수정 ex) 거래중 -> 거래 완료
	public void updateItemStatus(int itemId) {
		mdao.updateItemStatus(itemId);
	}
		
	//장터 검색
	public List<ItemModel> searchItem(String itemname, String itemKind) {
		List<ItemModel> imList;
		imList = mdao.searchItem(itemname, itemKind);
		return imList;
	}

}
