package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping(value = "/wonSample.do")
	public String wonController(ModelMap model) throws Exception {
		
		return "sample/wonSample";
	}
}
