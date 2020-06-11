package spetstore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.service.CartService;
import spetstore.service.MarketService;

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
		
	}//占쏙옙占싶뱄옙품占쏙옙占�
	
	@RequestMapping("market/delete") 
	public String deleteMarket(@RequestParam("marketId") int marketId) {
		marketService.deleteItem(marketId);
		return "market/mSearach"; 
		
	}//占쏙옙占싶뱄옙품占쏙옙占쏙옙
	
	@RequestMapping("market/mitemView") 
	public String updateMarket(@RequestParam("userId") String userId) {
		marketService.updateItem(userId);
		return "market/mListDetail"; 
		
	}//占쏙옙占싶뱄옙품占쏙옙占쏙옙
}
