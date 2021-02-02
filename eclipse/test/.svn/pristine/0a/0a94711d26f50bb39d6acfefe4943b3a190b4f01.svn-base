package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.SinService;
import egovframework.example.sample.service.SinVO;

@Service("SinService")
public class SinServiceImpl extends EgovSampleServiceImpl implements SinService {
	
	@Resource(name="sinMapper")
	private SinMapper sinMapper;
	
	@Override
	public SinVO selectContents(String id) throws Exception{
		SinVO resultVo = sinMapper.selectSin(id);
		if (resultVo == null)
			throw processException("info.nodata.msg");
		return resultVo;
	}
	
	@Override
	public int updateContents(String s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void printContents(String s) throws Exception {
		// TODO Auto-generated method stub
		
	}
}