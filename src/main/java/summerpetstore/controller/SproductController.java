package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SproductController {
	@Autowired
	private sproductService sproductService;	//임의로 이름 지었어요! 일반상품 관련 서비스
	SproductModel sp;
	
	public void setCartService(sproductService sproductService) {
		this.sproductService = sproductService;
	}

	@RequestMapping("spetitem/register") //register호출 
	public String registerSitem(@RequestParam("itemId") String itemId, Model model) {
		sp = sproductService.registerItem(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //물품등록 output view로 보내주기
	}
	
	@RequestMapping("spetitem/delete") //delete호출 
	public String deleteSitem(@RequestParam("itemId") String itemId, Model model) {
		sp = sproductService.deleteItem(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //물품삭제 output view로 보내주기
	}
	
	@RequestMapping("spetitem/update") //update호출 
	public String updateSitem(@RequestParam("itemId") String itemId, Model model) {
		sp = sproductService.updateItem(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/sListDetail"; //물품수정 output view로 보내주기
	}
}
