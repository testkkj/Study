package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import egovframework.example.sample.service.SinService;
import egovframework.example.sample.service.SinVO;

@Controller
public class SinController {

	@Resource(name="SinService")
	private SinService sinService;
	
	@RequestMapping(value="/selectSin.do")
	public String SelectSinCon(SinVO sinvo, Model model) throws Exception {
		model.addAttribute("sinvo",sinService.selectContents("bonobono"));
		return "sample/sinsample";
	}
	
}
