package summerpetstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import summerpetstore.dao.CartDAO;
import summerpetstore.dao.GpDAO;
import summerpetstore.model.GpModel;

@Service
public class CartService {
	@Autowired
	private CartDAO cartdao;
	
	//īƮ����
	@Transactional
	public int deleteCart(String userId, int itemId) { 
		return cartdao.deleteCart(userId, itemId);
	}
	
	//ȸ���� Ż���Ҷ� ��ٱ��ϰ� �����Ǵ� ���
	@Transactional
	public int deleteCartByUser(String userId) { 
		return cartdao.deleteCartByUser(userId);
	}
	
	//�ֹ��ϱ�
	@Transactional
	public int order(String userId, int orderId) { // �Ű����� ��� �ʿ�
		return cartdao.order(userId, orderId);
	}
	
	//īƮ�� �߰�
	@Transactional
	public void addCart(String userId, int itemId, int price) { // �Ű����� ��� �ʿ�
		
		
	}
	
	//��ٱ��Ͽ� �̹� �� ������ �ִ��� Ȯ��
	@Transactional
	public boolean containsItemId(int itemId, String userId) {
		if(cartdao.getItemCount(itemId, userId) > 0) {
			return true;
		}
		return false;
	}
	
	@Transactional
	public void incrementQuantityByItemId(int itemId, String userId) {
		cartdao.incrementQuantityByItemId(itemId, userId);
	}
}
