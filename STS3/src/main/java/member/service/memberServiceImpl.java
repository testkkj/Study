package member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.mapper.memberMapper;

@Service
public class memberServiceImpl implements memberService {

	@Autowired
	private memberMapper memberMapper;

	@Override
	public List<Map<String, Object>> selectMember() throws Exception {
		List<Map<String, Object>> list = memberMapper.selectMember();
		return list;
	}

}
