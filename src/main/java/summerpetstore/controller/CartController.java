package summerpetstore.controller;

import javax.servlet.http.HttpSession;

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
	public String addCart(@RequestParam("itemId") int itemId,@RequestParam("userId") String userId, @RequestParam("price") int price, Model model) {
		CartModel cart;	//cart model이 들어가야할거같아서 일단 이렇게 추가했어요..
		
		if(cartService.containsItemId(itemId, userId))	//장바구니 추가하려는 아이템이 이미 존재하는 경우
			cartService.incrementQuantityByItemId(itemId, userId); 	//해당하는 아이템의 수량만 증가시킴
		else
			cartService.addCart(userId, itemId, price); //아닌경우 새로 장바구니에 추가 
			//수현아 addCart에 매개변수 userId도 있어야해서 일단 하나 더 넣었어!ㅋㅋㅋㅋ
		
		//model.addAttribute("cart", cart);
		return "spetitem/sListDetail"; //장바구니 output view로 보내주기
		
	}
	

	@RequestMapping("cart") 
	public String createCart(HttpSession sesseion) {
			if(cartService.is_item_exist())
		return "user/myPage/cart"; 
		
	}//장바구니로 이동---이 기능은 장바구니로 이동할때 장바구니를 생성해서 createcart인가요..?
	
	
	@RequestMapping("mypage/cart/delete") 
	public String deleteItem(@RequestParam("userId") String userId, @RequestParam("itemId") int itemId) {
		cartService.deleteCart(userId, itemId);
		return "user/myPage/cart"; 
	}//장바구니 물품 삭제
	
	@RequestMapping("mypage/cart/pay") 
	public String pay(@RequestParam("userId") String userId, @RequestParam("orderId") int orderId) {
		cartService.order(userId, orderId);
		return "user/myPage/sucPay"; 
	}//장바구니 물품 결제
}
