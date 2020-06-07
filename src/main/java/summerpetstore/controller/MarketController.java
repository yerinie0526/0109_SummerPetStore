package summerpetstore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.service.CartService;

@Controller
public class MarketController {
	
	@Autowired
	private MarketService marketService;	
	
	public void setMarketService(MarketService marketService) {
		this.marketService = marketService;
	}
	
	@RequestMapping("market/register") 
	public String registerMarket(@RequestParam("userId") String userId, @RequestParam("marketId") int marketId) {
		
		marketService.registerItem(userId, marketId);
		return "market/mSearach"; 
		
	}//장터물품등록
	
	@RequestMapping("market/delete") 
	public String deleteMarket(@RequestParam("marketId") int marketId) {
		marketService.deleteItem(marketId);
		return "market/mSearach"; 
		
	}//장터물품삭제
	
	@RequestMapping("market/mitemView") 
	public String updateMarket(@RequestParam("userId") String userId) {
		marketService.updateItem(userId);
		return "market/mListDetail"; 
		
	}//장터물품수정
}
