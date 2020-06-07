package summerpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerpetstore.service.GpService;

@Controller
public class ForwardController {
	
	ForwardService forwardService;
	
	public void setForwardService(ForwardService forwardService) {
		this.forwardService = forwardService;
	}
	
	@RequestMapping("mypage") //mypage호출 
	public String showMyPage(@RequestParam("userId") String userId) {
		if(forwardService.is_admin())
			return "user/summerPage"; //운영자
		else
			return"user/myPage"; //사용자
	}//마이페이지로 이동 (사용자/운영자)
	
	@RequestMapping("market") //market호출 
	public String moveMarketSearch() {
			return"market/mSearch"; 
	}//장터검색으로 이동 
	
	@RequestMapping("market/register") 
	public String moveMarketRegister(@RequestParam("userId") String userId) {
			return"market/iRegister"; 
	}//물품등록창으로 이동 
}
