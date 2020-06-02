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
	
	//카트삭제
	@Transactional
	public int deleteCart(String userId, int itemId) { 
		return cartdao.deleteCart(userId, itemId);
	}
	
	//회원이 탈퇴할때 장바구니가 삭제되는 기능
	@Transactional
	public int deleteCartByUser(String userId) { 
		return cartdao.deleteCartByUser(userId);
	}
	
	//주문하기
	@Transactional
	public int order(String userId, int orderId) { // 매개변수 고려 필요
		return cartdao.order(userId, orderId);
	}
	
	//카트에 추가
	@Transactional
	public int addCart(String userId, int itemId, int price) { // 매개변수 고려 필요
		return cartdao.addCart(userId, itemId, price);
	}
	
}
