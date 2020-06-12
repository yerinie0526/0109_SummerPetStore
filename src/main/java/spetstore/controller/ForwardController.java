package spetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.service.GpService;

@Controller
public class ForwardController {
	
	ForwardService forwardService;
	
	public void setForwardService(ForwardService forwardService) {
		this.forwardService = forwardService;
	}
	
	@RequestMapping("/mypage") //mypage호占쏙옙 
	public String showMyPage(@RequestParam("userId") String userId) {
		if(forwardService.is_admin())
			return "user/summerPage"; //占쏘영占쏙옙
		else
			return"user/myPage"; //占쏙옙占쏙옙占�
	}//占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占싱듸옙 (占쏙옙占쏙옙占�/占쏘영占쏙옙)
	
	@RequestMapping("/market") //market호占쏙옙 
	public String moveMarketSearch() {
			return"market/mSearch"; 
	}//占쏙옙占싶검삼옙占쏙옙占쏙옙 占싱듸옙 
	
	@RequestMapping("/market/register") 
	public String moveMarketRegister(@RequestParam("userId") String userId) {
			return"market/iRegister"; 
	}//占쏙옙품占쏙옙占시�占쏙옙占쏙옙 占싱듸옙 
	
	@RequestMapping("/auction") 
	public String moveAuctionSearch(@RequestParam("userId") String userId) {
			return"auction/aSearch"; 
	}//경매 검색창으로 이동
}
