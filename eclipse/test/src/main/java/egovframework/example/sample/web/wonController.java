package egovframework.example.sample.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.EgovSampleService;
import egovframework.example.sample.service.wonVO;
import egovframework.example.sample.service.impl.wonMapper;

/**
 * @Class Name : EgovSampleServiceImpl.java
 * @Description : Sample Business Implement Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2021.02.01 원효재          최초생성
 *
 * @author doollee
 * @since 2020. 02.01
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */

@Controller
public class wonController {	
	
	@Resource(name = "sampleService")
	private EgovSampleService sampleService;
	
	@Resource(name = "wonMapper")
	wonMapper wonMapper;
	
	@RequestMapping(value = "/wonSample.do")
	public String wonController(wonVO wonVO, ModelMap model) throws Exception {
		//List<?> wonList = sampleService.selectWonList(wonVO);
		List<?> wonList = wonMapper.selectWonList(wonVO);
		System.out.println(wonList);
		model.addAttribute("wonResultList", wonList);
		
		return "sample/wonSample";
	}
}
