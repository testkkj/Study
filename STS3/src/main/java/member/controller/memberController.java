package member.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import member.service.memberService;

@Controller
public class memberController {

	@Autowired
	private memberService memberService;

	@RequestMapping("/11")
	public ModelAndView first() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test");
		
		List<Map<String, Object>> list = null;
		try {
			list = memberService.selectMember();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(list);
		}
		
		modelAndView.addObject("list", list);
		return modelAndView;
	}
}
