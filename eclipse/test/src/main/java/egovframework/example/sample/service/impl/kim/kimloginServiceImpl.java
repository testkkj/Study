package egovframework.example.sample.service.impl.kim;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.impl.SampleMapper;
import egovframework.example.sample.service.kim.kimloginService;
import egovframework.example.sample.service.kim.kimloginVO;

@Service("kimloginService")
public class kimloginServiceImpl implements kimloginService {
	
	@Resource(name="kimloginMapper")
	private kimloginMapper kimloginDAO;
	
	@Override
	public int kimlogin(kimloginVO kimloginVO) throws Exception {
		return kimloginDAO.kimlogin(kimloginVO);
	}

	@Override
	public int kimregister(kimloginVO kimloginVO) throws Exception {
		return kimloginDAO.kimregister(kimloginVO);
	}

}
