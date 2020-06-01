package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowDetailController {
	@Autowired
	private sproductService sproductService;	//임의로 이름 지었어요! 일반상품 관련 서비스
	ItemModel item;
	
	public void setCartService(sproductService sproductService) {
		this.sproductService = sproductService;
	}
	
	@RequestMapping("/spetitem/detail")	//detail호출
	public String showSpetitem(@RequestParam("itemId") String itemId, Model model) {
		item = sproductService.showInfo(itemId);
		model.addAttribute("item", item);
		return "spetitem/sListDetail"; //일바구매물품자세히보기 output view로 보내주기
	}
	

}
