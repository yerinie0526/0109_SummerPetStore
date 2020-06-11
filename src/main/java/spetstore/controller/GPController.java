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
	private GpService gpService;	//���Ƿ� �̸� �������! gp���� ����
	GpModel gp;

	public void setGpService(GpService gpService) {
		this.gpService = gpService;
	}
	
	@RequestMapping("spetitem/gpdelete") //gpdeleteȣ�� 
	public String deleteGp(@RequestParam("itemId") int itemId, Model model) {
		if(gpService.is_GPJP_exist(gp))
			model.addAttribute("deleteok", 0);	//�����Ұ�
		else
			model.addAttribute("deleteok", 1);	//��������
		
		return "spetitem/categoryView"; //�������� output view�� �����ֱ�
		
	}//�������Ż���
	
	@RequestMapping("market") // 
	public String deleteMgp(@RequestParam("itemId") int itemId, Model model) {
		if(gpService.is_GPJP_exist(gp))
			model.addAttribute("deleteok", 0);	//�����Ұ�
		else
			model.addAttribute("deleteok", 1);	//��������
		
		return "market/mListDetail"; 
		
	}//���Ͱ������Ż���--�̰� �Լ��̸� ���� �������Ż����� ��ġ�� ó���帧ǥ�� �����־ �ϴ� �帧ǥ�� �Ȱ�ġ�� �̸��� �̷��� �������
}
