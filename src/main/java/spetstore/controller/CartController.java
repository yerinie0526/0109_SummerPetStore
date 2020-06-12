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
	private CartService cartService;	//占쏙옙占실뤄옙 占싱몌옙 占쏙옙占쏙옙占쏙옙占�! cart占쏙옙占쏙옙 占쏙옙占쏙옙
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("/spetitem/addCart") //addCart호占쏙옙 
	public String addCart(@RequestParam("itemId") int itemId,@RequestParam("userId") String userId, @RequestParam("price") int price, Model model) {
		CartModel cart;	//cart model占쏙옙 占쏙옙載∽옙占쏙옙柰키占쏙옙티占� 占싹댐옙 占싱뤄옙占쏙옙 占쌩곤옙占쌩억옙占�..
		
		if(cartService.containsItemId(itemId, userId))	//占쏙옙袂占쏙옙占� 占쌩곤옙占싹뤄옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占싱뱄옙 占쏙옙占쏙옙占싹댐옙 占쏙옙占�
			cartService.incrementQuantityByItemId(itemId, userId); 	//占쌔댐옙占싹댐옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙킴
		else
			cartService.addCart(userId, itemId, price); //占싣닌곤옙占� 占쏙옙占쏙옙 占쏙옙袂占쏙옙臼占� 占쌩곤옙 
			//占쏙옙占쏙옙占쏙옙 addCart占쏙옙 占신곤옙占쏙옙占쏙옙 userId占쏙옙 占쌍억옙占쏙옙漫占� 占싹댐옙 占싹놂옙 占쏙옙 占쌍억옙占쏙옙!占쏙옙占쏙옙占쏙옙占쏙옙
		
		//model.addAttribute("cart", cart);
		return "spetitem/sListDetail"; //占쏙옙袂占쏙옙占� output view占쏙옙 占쏙옙占쏙옙占쌍깍옙
		
	}
	

	@RequestMapping("/cart") 
	public String createCart(HttpSession sesseion) {
			if(cartService.is_item_exist())
		return "user/myPage/cart"; 
		
	}//占쏙옙袂占쏙옙狗占� 占싱듸옙---占쏙옙 占쏙옙占쏙옙占� 占쏙옙袂占쏙옙狗占� 占싱듸옙占쌀띰옙 占쏙옙袂占쏙옙玖占� 占쏙옙占쏙옙占쌔쇽옙 createcart占싸곤옙占쏙옙..?
	
	
	@RequestMapping("/mypage/cart/delete") 
	public String deleteItem(@RequestParam("userId") String userId, @RequestParam("itemId") int itemId) {
		cartService.deleteCart(userId, itemId);
		return "user/myPage/cart"; 
	}//占쏙옙袂占쏙옙占� 占쏙옙품 占쏙옙占쏙옙
	
	@RequestMapping("/mypage/cart/pay") 
	public String pay(@RequestParam("userId") String userId, @RequestParam("orderId") int orderId) {
		cartService.order(userId, orderId);
		return "user/myPage/sucPay"; 
	}//占쏙옙袂占쏙옙占� 占쏙옙품 占쏙옙占쏙옙
	
	@RequestMapping("/market/addcart") 
	public String addCart(@RequestParam("marketId") String marketId, @RequestParam("itemId") int itemId, @RequestParam("userId") String userId) {
		cartService.addCart(userId, itemId, price);//price가 필요한가요??
		return "market/mListDetail"; 
	}//장터-장바구니 담기
}
