package summerpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SproductController {
	@Autowired
	private sproductService sproductService;	//���Ƿ� �̸� �������! �Ϲݻ�ǰ ���� ����
	SproductModel sp;
	
	public void setCartService(sproductService sproductService) {
		this.sproductService = sproductService;
	}

	@RequestMapping("spetitem/register") //registerȣ�� 
	public String registerSitem(@RequestParam("itemId") String itemId, Model model) {
		sp = sproductService.registerItem(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //��ǰ��� output view�� �����ֱ�
	}
	
	@RequestMapping("spetitem/delete") //deleteȣ�� 
	public String deleteSitem(@RequestParam("itemId") String itemId, Model model) {
		sp = sproductService.deleteItem(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/categoryView"; //��ǰ���� output view�� �����ֱ�
	}
	
	@RequestMapping("spetitem/update") //updateȣ�� 
	public String updateSitem(@RequestParam("itemId") String itemId, Model model) {
		sp = sproductService.updateItem(itemId);
		model.addAttribute("sp", sp);
		return "spetitem/sListDetail"; //��ǰ���� output view�� �����ֱ�
	}
}
