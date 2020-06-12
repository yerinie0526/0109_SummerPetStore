package spetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.model.ItemModel;
import spetstore.service.SProductService;

@Controller
public class ShowDetailController {
	
	@Autowired
	private SProductService sproductService;	//占쏙옙占실뤄옙 占싱몌옙 占쏙옙占쏙옙占쏙옙占�! 占싹반삼옙품 占쏙옙占쏙옙 占쏙옙占쏙옙
	ItemModel item;
	
	public void setCartService(SProductService sproductService) {
		this.sproductService = sproductService;
	}
	
	@RequestMapping("/spetitem/detail")	//detail호占쏙옙
	public String showSpetitem(@RequestParam("itemId") int itemId, Model model) {
		item = sproductService.showInfo(itemId);
		model.addAttribute("item", item);
		return "spetitem/sListDetail"; //占싹바깍옙占신뱄옙품占쌘쇽옙占쏙옙占쏙옙占쏙옙 output view占쏙옙 占쏙옙占쏙옙占쌍깍옙
	}//일반구매물품자세히보기

	@RequestMapping("/market/detail")	
	public String showMarketItem(@RequestParam("itemId") int itemId, Model model) {
		item = sproductService.showInfo(itemId);
		model.addAttribute("item", item);
		return "market/mListDetail"; 
	}//장터물품자세히보기
	
	
	@RequestMapping("/auction/detail")	
	public String showAuction(@RequestParam("auctionId") int auctionId, Model model) {
		item = sproductService.showInfo(auctionId);
		model.addAttribute("item", item);
		return "auction/aListDetail"; 
	}//경매자세히보기

}
