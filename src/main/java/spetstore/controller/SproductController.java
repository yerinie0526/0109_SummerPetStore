package spetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.model.ItemModel;
import spetstore.service.SProductService;

@Controller
public class SproductController {
	@Autowired
	private SProductService sproductService;	//占쏙옙占실뤄옙 占싱몌옙 占쏙옙占쏙옙占쏙옙占�! 占싹반삼옙품 占쏙옙占쏙옙 占쏙옙占쏙옙
	private ItemModel sp;
	
	public void setCartService(SProductService sproductService) {
		this.sproductService = sproductService;
	}

	@RequestMapping("/spetitem/register") //register호占쏙옙 
	public String registeritem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.registerSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //占쏙옙품占쏙옙占� output view占쏙옙 占쏙옙占쏙옙占쌍깍옙
	}
	
	@RequestMapping("/spetitem/delete") //delete호占쏙옙 
	public String deleteitem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.deleteSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //占쏙옙품占쏙옙占쏙옙 output view占쏙옙 占쏙옙占쏙옙占쌍깍옙
	}
	
	@RequestMapping("/spetitem/update") //update호占쏙옙 
	public String updateitem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.updateSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/sListDetail"; //占쏙옙품占쏙옙占쏙옙 output view占쏙옙 占쏙옙占쏙옙占쌍깍옙
	}
}
