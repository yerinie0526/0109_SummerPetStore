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
	
	//���Ϳ� ��ǰ ����ϱ�
	@Transactional
	public void registerItem(ItemModel im) { // �Ű����� ��� �ʿ�
		mdao.registerItem(im);
	}
	
	//���͹�ǰ �ڼ��� ����
	@Transactional
	public ItemModel showInfo(ItemModel im) { // �Ű����� ��� �ʿ�
		return mdao.showInfo(im.getItemId());
	}
	
	//���͹�ǰ ����
	@Transactional
	public void deleteItem(int itemId) { // �Ű����� ��� �ʿ�
		mdao.deleteItem(itemId);
	}
	
	//���͹�ǰ ����
	@Transactional
	public void updateItem(ItemModel im) { // �Ű����� ��� �ʿ�
		mdao.updateItem(im);
	}
	
	
	//���ͻ��� ���� ex) �ŷ��� -> �ŷ� �Ϸ�
	public void updateItemStatus(int itemId) {
		mdao.updateItemStatus(itemId);
	}
		
	//���� �˻�
	public List<ItemModel> searchItem(String itemname, String itemKind) {
		List<ItemModel> imList;
		imList = mdao.searchItem(itemname, itemKind);
		return imList;
	}

}
