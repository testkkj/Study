package egovframework.example.sample.web.kim;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import egovframework.example.sample.service.kim.kimloginService;
import egovframework.example.sample.service.kim.kimloginVO;

@Controller
public class kimController {
	
	@Resource(name="kimloginService")
	private kimloginService kimloginService;
	
	@RequestMapping("kim/hello.do")
	public String hello(Model model) throws Exception {
		return "sample/hello";
	}
	
	@RequestMapping(value="kim/login.do", method=RequestMethod.POST)
	public String login(kimloginVO kimloginVO) throws Exception {
		System.out.println("kim/login.do enter");
		int loginCheck = 0;
		String mapping = "";
		try {
			loginCheck = kimloginService.kimlogin(kimloginVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(loginCheck);
		if (loginCheck == 1) {
			mapping = "sample/kimmain";
		} else {
			mapping = "sample/hello";
		}
		
		return mapping;
	}
	
	@RequestMapping("kim/register.do")
	public String registerview(Model model) throws Exception {
		return "sample/register";
	}

	@RequestMapping(value="kim/registerid.do", method=RequestMethod.POST)
	public String register(kimloginVO kimloginVO) throws Exception {
		System.out.println("kim/register.do enter");
		int loginCheck = 0;
		String mapping = "";
		try {
			loginCheck = kimloginService.kimregister(kimloginVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(loginCheck);
		if (loginCheck == 1) {
			mapping = "sample/kimmain";
		} else {
			mapping = "sample/hello";
		}
		
		return mapping;
	}
}
