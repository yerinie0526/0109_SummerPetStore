package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import summerstore.service.GpService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;	
	@Autowired
	private AuctionService auctionService;	
	@Autowired
	private MarketService marketService;
	@Autowired
	private GpService gpService;	
		
	
	UserModel user;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setAuctionService(AuctionService auctionService) {
		this.auctionService = auctionService;
	}
	public void setMarketService(MarketService marketService) {
		this.marketService = marketService;
	}
	public void setGpService(GpService gpService) {
		this.gpService = gpService;
	}
	
	
	@RequestMapping("register") //registerȣ�� 
	public String registerUser(@RequestParam("userId") String userId, Model model) {
		String name = userService.registerUser(userId); 	//ȸ����� �Լ� return ���� username����! 
		model.addAttribute("username", name);
		return "sucRegist";
	}//ȸ�����
	
	@RequestMapping("main") 
	public String deleteUser(@RequestParam("userId") String userId, Model model) {
		if(auctionService.is_auction_exist()){
			auctionService.cancelSBId(userId);		//��ſ� ������ ��� �ش��ϴ� ����ڸ� ���ְ� ��� ����
		}else if(marketService.is_market_exist()) {
			marketService.deleteMarket(userId);		//����� �Ϲݱ��Ű� �ִ� ��� �ش�
		}else if(gpService.is_gp_exist()){
			gpService.deleteGP(userId);
		}
		
		return "main";
	}	//ȸ��Ż��
}
