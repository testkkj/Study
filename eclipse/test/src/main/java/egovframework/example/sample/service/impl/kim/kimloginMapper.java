package egovframework.example.sample.service.impl.kim;

import egovframework.example.sample.service.kim.kimloginVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("kimloginMapper")
public interface kimloginMapper {
	public int kimlogin(kimloginVO kimloginVO) throws Exception;
	public int kimregister(kimloginVO kimloginVO) throws Exception;
}
