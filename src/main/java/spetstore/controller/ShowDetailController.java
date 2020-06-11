package spetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.model.ItemModel;
import spetstore.service.SProductService;

@Controller
public class ShowDetailController {
	
	@Autowired
	private SProductService sproductService;	//���Ƿ� �̸� �������! �Ϲݻ�ǰ ���� ����
	ItemModel item;
	
	public void setCartService(SProductService sproductService) {
		this.sproductService = sproductService;
	}
	
	@RequestMapping("/spetitem/detail")	//detailȣ��
	public String showSpetitem(@RequestParam("itemId") int itemId, Model model) {
		item = sproductService.showInfo(itemId);
		model.addAttribute("item", item);
		return "spetitem/sListDetail"; //�Ϲٱ��Ź�ǰ�ڼ������� output view�� �����ֱ�
	}
	

}
