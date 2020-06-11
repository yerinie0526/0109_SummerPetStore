package spetstore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import spetstore.model.CartModel;
import spetstore.service.CartService;


@Controller
@SessionAttributes("sessionCart")
public class CartController {
	@Autowired
	private CartService cartService;	//���Ƿ� �̸� �������! cart���� ����
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("spetitem/addCart") //addCartȣ�� 
	public String addCart(@RequestParam("itemId") int itemId,@RequestParam("userId") String userId, @RequestParam("price") int price, Model model) {
		CartModel cart;	//cart model�� �����ҰŰ��Ƽ� �ϴ� �̷��� �߰��߾��..
		
		if(cartService.containsItemId(itemId, userId))	//��ٱ��� �߰��Ϸ��� �������� �̹� �����ϴ� ���
			cartService.incrementQuantityByItemId(itemId, userId); 	//�ش��ϴ� �������� ������ ������Ŵ
		else
			cartService.addCart(userId, itemId, price); //�ƴѰ�� ���� ��ٱ��Ͽ� �߰� 
			//������ addCart�� �Ű����� userId�� �־���ؼ� �ϴ� �ϳ� �� �־���!��������
		
		//model.addAttribute("cart", cart);
		return "spetitem/sListDetail"; //��ٱ��� output view�� �����ֱ�
		
	}
	

	@RequestMapping("cart") 
	public String createCart(HttpSession sesseion) {
			if(cartService.is_item_exist())
		return "user/myPage/cart"; 
		
	}//��ٱ��Ϸ� �̵�---�� ����� ��ٱ��Ϸ� �̵��Ҷ� ��ٱ��ϸ� �����ؼ� createcart�ΰ���..?
	
	
	@RequestMapping("mypage/cart/delete") 
	public String deleteItem(@RequestParam("userId") String userId, @RequestParam("itemId") int itemId) {
		cartService.deleteCart(userId, itemId);
		return "user/myPage/cart"; 
	}//��ٱ��� ��ǰ ����
	
	@RequestMapping("mypage/cart/pay") 
	public String pay(@RequestParam("userId") String userId, @RequestParam("orderId") int orderId) {
		cartService.order(userId, orderId);
		return "user/myPage/sucPay"; 
	}//��ٱ��� ��ǰ ����
}
