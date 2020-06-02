package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.model.GpModel;
import summerstore.service.GpService;

@Controller
public class GPController {
	
	@Autowired
	private GpService gpService;	//임의로 이름 지었어요! gp관련 서비스
	GpModel gp;

	public void setGpService(GpService gpService) {
		this.gpService = gpService;
	}
	
	@RequestMapping("spetitem/gpdelete") //gpdelete호출 
	public String deleteGp(@RequestParam("itemId") int itemId, Model model) {
		if(gpService.is_GPJP_exist(gp))
			//gp = gpService.cancelGpJPId(itemId);	//itemid 줘야할거같아서 추가했어요!
			// cancelGpJPId(itemId) -> int형으로 반환됨
		
		model.addAttribute("gp", gp);
		return "spetitem/categoryView"; //공동구매 output view로 보내주기
		
	}
}
