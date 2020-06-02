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
	private GpService gpService;	//���Ƿ� �̸� �������! gp���� ����
	GpModel gp;

	public void setGpService(GpService gpService) {
		this.gpService = gpService;
	}
	
	@RequestMapping("spetitem/gpdelete") //gpdeleteȣ�� 
	public String deleteGp(@RequestParam("itemId") int itemId, Model model) {
		if(gpService.is_GPJP_exist(gp))
			//gp = gpService.cancelGpJPId(itemId);	//itemid ����ҰŰ��Ƽ� �߰��߾��!
			// cancelGpJPId(itemId) -> int������ ��ȯ��
		
		model.addAttribute("gp", gp);
		return "spetitem/categoryView"; //�������� output view�� �����ֱ�
		
	}
}
