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
	
	@RequestMapping("/spetitem/addCart") //��援��대����吏� �ㅽ��
	public String addCart(@RequestParam("itemId") int itemId,@RequestParam("userId") String userId, @RequestParam("price") int price, Model model) {
		CartModel cart;	
		
		if(cartService.containsItemId(itemId, userId))	//留��� 臾쇨굔�� �대�� ���ㅻ㈃
			cartService.incrementQuantityByItemId(itemId, userId); 	//���� + 1
		else
			cartService.addCart(userId, itemId, price);  //��濡� 異�媛�
			
		
		//model.addAttribute("cart", cart);
		return "spetitem/sListDetail"; 
		
	}
	//실험

	@RequestMapping("/cart") 
	public String createCart(HttpSession sesseion) {
			if(cartService.is_item_exist())
		return "user/myPage/cart"; 
		
	}//占쎈��占쎈�占쎌���ш���占쎈�占쎌��占쎈��占쎈����占� 占쎈��占쎈��占쎈�占쎌��---占쎈��占쎈�占쎌�� 占쎈��占쎈�占쎌��占쎈��占쎈�占쎌��占쎈����占� 占쎈��占쎈�占쎌���ш���占쎈�占쎌��占쎈��占쎈����占� 占쎈��占쎈��占쎈�占쎌��占쎈��占쏙옙占쎌��占쎌�� 占쎈��占쎈�占쎌���ш���占쎈�占쎌��占쎈�뤄옙����占� 占쎈��占쎈�占쎌��占쎈��占쎈�占쎌��占쎈��占쎈��占쎈��占쎌�� createcart占쎈��占쎈�ζ�ⓦ�쇱��占쎈��占쎈�占쎌��..?
	
	
	@RequestMapping("/mypage/cart/delete") 
	public String deleteItem(@RequestParam("userId") String userId, @RequestParam("itemId") int itemId) {
		cartService.deleteCart(userId, itemId);
		return "user/myPage/cart"; 
	}//占쎈��占쎈�占쎌���ш���占쎈�占쎌��占쎈����占� 占쎈��占쎈�占쎌��占쎈�� 占쎈��占쎈�占쎌��占쎈��占쎈�占쎌��
	
	@RequestMapping("/mypage/cart/pay") 
	public String pay(@RequestParam("userId") String userId, @RequestParam("orderId") int orderId) {
		cartService.order(userId, orderId);
		return "user/myPage/sucPay"; 
	}//占쎈��占쎈�占쎌���ш���占쎈�占쎌��占쎈����占� 占쎈��占쎈�占쎌��占쎈�� 占쎈��占쎈�占쎌��占쎈��占쎈�占쎌��
	
	@RequestMapping("/market/addcart") 
	public String addCart(@RequestParam("marketId") String marketId, @RequestParam("itemId") int itemId, @RequestParam("userId") String userId) {
		cartService.addCart(userId, itemId, price);//price媛� �ㅼ�닿��쇳������??
		return "market/mListDetail"; 
	}//�ν��- �λ�援щ�� �닿린
}
