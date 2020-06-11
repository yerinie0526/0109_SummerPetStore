package spetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spetstore.model.ItemModel;
import spetstore.service.SProductService;

@Controller
public class SproductController {
	@Autowired
	private SProductService sproductService;	//���Ƿ� �̸� �������! �Ϲݻ�ǰ ���� ����
	private ItemModel sp;
	
	public void setCartService(SProductService sproductService) {
		this.sproductService = sproductService;
	}

	@RequestMapping("spetitem/register") //registerȣ�� 
	public String registeritem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.registerSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //��ǰ��� output view�� �����ֱ�
	}
	
	@RequestMapping("spetitem/delete") //deleteȣ�� 
	public String deleteitem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.deleteSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //��ǰ���� output view�� �����ֱ�
	}
	
	@RequestMapping("spetitem/update") //updateȣ�� 
	public String updateitem(@RequestParam("itemId") int itemId, Model model) {
		sp = sproductService.updateSP(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/sListDetail"; //��ǰ���� output view�� �����ֱ�
	}
}
