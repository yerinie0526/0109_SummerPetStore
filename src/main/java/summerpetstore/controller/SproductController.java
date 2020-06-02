package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.model.ItemModel;
import summerpetstore.service.SProductService;

@Controller
public class SproductController {
	@Autowired
	private SProductService sproductService;	//임의로 이름 지었어요! 일반상품 관련 서비스
	private ItemModel sp;
	
	public void setCartService(SProductService sproductService) {
		this.sproductService = sproductService;
	}

	@RequestMapping("spetitem/register") //register호출 
	public String registeritem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.registerSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //물품등록 output view로 보내주기
	}
	
	@RequestMapping("spetitem/delete") //delete호출 
	public String deleteitem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.deleteSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //물품삭제 output view로 보내주기
	}
	
	@RequestMapping("spetitem/update") //update호출 
	public String updateitem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.updateSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/sListDetail"; //물품수정 output view로 보내주기
	}
}
