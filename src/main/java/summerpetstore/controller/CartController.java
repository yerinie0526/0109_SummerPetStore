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
	private CartService cartService;	//임의로 이름 지었어요! cart관련 서비스
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("spetitem/addCart") //addCart호출 
	public String addCart(@RequestParam("itemId") String itemId, Model model) {
		CartModel cart;	//cart model이 들어가야할거같아서 일단 이렇게 추가했어요..
		
		if(cartService.containsItemId(itemId))	//장바구니 추가하려는 아이템이 이미 존재하는 경우
			cart =  cartService.incrementQuantityByItemId(itemId); 	//해당하는 아이템의 수량만 증가시킴
		else
			cart = cartService.addCart(itemId); //아닌경우 새로 장바구니에 추가
		
		model.addAttribute("cart", cart);
		return "spetitem/sListDetail"; //장바구니 output view로 보내주기
		
	}
}
