package spetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.model.GpModel;
import spetstore.service.GpService;

@Controller
public class GPController {
	
	@Autowired
	private GpService gpService;	//占쏙옙占실뤄옙 占싱몌옙 占쏙옙占쏙옙占쏙옙占�! gp占쏙옙占쏙옙 占쏙옙占쏙옙
	GpModel gp;

	public void setGpService(GpService gpService) {
		this.gpService = gpService;
	}
	
	@RequestMapping("/spetitem/gpdelete") //gpdelete호占쏙옙 
	public String deleteGp(@RequestParam("itemId") int itemId, Model model) {
		if(gpService.is_GPJP_exist(gp))
			model.addAttribute("deleteok", 0);	//占쏙옙占쏙옙占쌀곤옙
		else
			model.addAttribute("deleteok", 1);	//占쏙옙占쏙옙占쏙옙占쏙옙
		
		return "spetitem/categoryView"; //占쏙옙占쏙옙占쏙옙占쏙옙 output view占쏙옙 占쏙옙占쏙옙占쌍깍옙
		
	}//占쏙옙占쏙옙占쏙옙占신삼옙占쏙옙
	
	@RequestMapping("/market") 
	public String deleteMgp(@RequestParam("itemId") int itemId, Model model) {
		if(gpService.is_GPJP_exist(gp))
			model.addAttribute("deleteok", 0);	//占쏙옙占쏙옙占쌀곤옙
		else
			model.addAttribute("deleteok", 1);	//占쏙옙占쏙옙占쏙옙占쏙옙
		
		return "market/mListDetail"; 
		
	}//占쏙옙占싶곤옙占쏙옙占쏙옙占신삼옙占쏙옙--占싱곤옙 占쌉쇽옙占싱몌옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占신삼옙占쏙옙占쏙옙 占쏙옙치占쏙옙 처占쏙옙占썲름표占쏙옙 占쏙옙占쏙옙占쌍어서 占싹댐옙 占썲름표占쏙옙 占싫곤옙치占쏙옙 占싱몌옙占쏙옙 占싱뤄옙占쏙옙 占쏙옙占쏙옙占쏙옙占�
		//장터공동구매삭제
	
	
}
