package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import summerpetstore.model.CartModel;
import summerpetstore.service.CartService;


@Controller
@SessionAttributes("sessionCart")
public class CartController {
	@Autowired
	private CartService cartService;	//���Ƿ� �̸� �������! cart���� ����
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("spetitem/addCart") //addCartȣ�� 
	public String addCart(@RequestParam("itemId") String itemId, Model model) {
		CartModel cart;	//cart model�� �����ҰŰ��Ƽ� �ϴ� �̷��� �߰��߾��..
		
		if(cartService.containsItemId(itemId))	//��ٱ��� �߰��Ϸ��� �������� �̹� �����ϴ� ���
			cart =  cartService.incrementQuantityByItemId(itemId); 	//�ش��ϴ� �������� ������ ������Ŵ
		else
			cart = cartService.addCart(itemId); //�ƴѰ�� ���� ��ٱ��Ͽ� �߰�
		
		model.addAttribute("cart", cart);
		return "spetitem/sListDetail"; //��ٱ��� output view�� �����ֱ�
		
	}
}
