package spetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.service.GpService;
import spetstore.service.MarketService;

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
	
	
	@RequestMapping("/register") //register호占쏙옙 
	public String registerUser(@RequestParam("userId") String userId, Model model) {
		String name = userService.registerUser(userId); 	//회占쏙옙占쏙옙占� 占쌉쇽옙 return 占쏙옙占쏙옙 username占쏙옙占쏙옙! 
		model.addAttribute("username", name);
		return "sucRegist";
	}//회占쏙옙占쏙옙占�
	
	@RequestMapping("/main") 
	public String deleteUser(@RequestParam("userId") String userId, Model model) {
		if(auctionService.is_auction_exist()){
			auctionService.cancelSBId(userId);		//占쏙옙탓占� 占쏙옙占쏙옙占쏙옙 占쏙옙占� 占쌔댐옙占싹댐옙 占쏙옙占쏙옙美占� 占쏙옙占쌍곤옙 占쏙옙占� 占쏙옙占쏙옙
		}else if(marketService.is_market_exist()) {
			marketService.deleteMarket(userId);		//占쏙옙占쏙옙占� 占싹반깍옙占신곤옙 占쌍댐옙 占쏙옙占� 占쌔댐옙
		}else if(gpService.is_gp_exist()){
			gpService.deleteGP(userId);
		}
		
		return "main";
	}	//회占쏙옙탈占쏙옙
	
	
	@RequestMapping("/login") //register호占쏙옙 
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
		
		return "main";
	}//占싸깍옙占쏙옙
	
	@RequestMapping("/mypage/update") //register호占쏙옙 
	public String updateUser(@RequestParam("userId") String userId) {
		userService.updateMyPage(userId);
		return "user/myPage";
	}//회占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙
}
