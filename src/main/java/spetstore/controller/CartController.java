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
	private CartService cartService;
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("/spetitem/addCart") //한국어된느지 실험
	public String addCart(@RequestParam("itemId") int itemId,@RequestParam("userId") String userId, @RequestParam("price") int price, Model model) {
		CartModel cart;	
		
		if(cartService.containsItemId(itemId, userId))	//만약 물건이 이미 있다면
			cartService.incrementQuantityByItemId(itemId, userId); 	//수량 + 1
		else
			cartService.addCart(userId, itemId, price);  //새로 추가
			
		
		//model.addAttribute("cart", cart);
		return "spetitem/sListDetail"; 
		
	}
	

	@RequestMapping("/cart") 
	public String createCart(HttpSession sesseion) {
			if(cartService.is_item_exist())
		return "user/myPage/cart"; 
		
	}//�뜝�룞�삕熬귛뜝�룞�삕�떁�뜝占� �뜝�떛�벝�삕---�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕�뜝占� �뜝�룞�삕熬귛뜝�룞�삕�떁�뜝占� �뜝�떛�벝�삕�뜝���씛�삕 �뜝�룞�삕熬귛뜝�룞�삕�럷�뜝占� �뜝�룞�삕�뜝�룞�삕�뜝�뙏�눦�삕 createcart�뜝�떥怨ㅼ삕�뜝�룞�삕..?
	
	
	@RequestMapping("/mypage/cart/delete") 
	public String deleteItem(@RequestParam("userId") String userId, @RequestParam("itemId") int itemId) {
		cartService.deleteCart(userId, itemId);
		return "user/myPage/cart"; 
	}//�뜝�룞�삕熬귛뜝�룞�삕�뜝占� �뜝�룞�삕�뭹 �뜝�룞�삕�뜝�룞�삕
	
	@RequestMapping("/mypage/cart/pay") 
	public String pay(@RequestParam("userId") String userId, @RequestParam("orderId") int orderId) {
		cartService.order(userId, orderId);
		return "user/myPage/sucPay"; 
	}//�뜝�룞�삕熬귛뜝�룞�삕�뜝占� �뜝�룞�삕�뭹 �뜝�룞�삕�뜝�룞�삕
	
	@RequestMapping("/market/addcart") 
	public String addCart(@RequestParam("marketId") String marketId, @RequestParam("itemId") int itemId, @RequestParam("userId") String userId) {
		cartService.addCart(userId, itemId, price);//price媛� �븘�슂�븳媛��슂??
		return "market/mListDetail"; 
	}//�옣�꽣-�옣諛붽뎄�땲 �떞湲�
}
