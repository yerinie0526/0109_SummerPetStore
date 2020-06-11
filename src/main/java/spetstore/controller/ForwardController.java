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
	
	@RequestMapping("mypage") //mypageȣ�� 
	public String showMyPage(@RequestParam("userId") String userId) {
		if(forwardService.is_admin())
			return "user/summerPage"; //���
		else
			return"user/myPage"; //�����
	}//������������ �̵� (�����/���)
	
	@RequestMapping("market") //marketȣ�� 
	public String moveMarketSearch() {
			return"market/mSearch"; 
	}//���Ͱ˻����� �̵� 
	
	@RequestMapping("market/register") 
	public String moveMarketRegister(@RequestParam("userId") String userId) {
			return"market/iRegister"; 
	}//��ǰ���â���� �̵� 
}
