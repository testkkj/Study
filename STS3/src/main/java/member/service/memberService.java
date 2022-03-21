package member.service;

import java.util.List;
import java.util.Map;

public interface memberService {
	List<Map<String, Object>> selectMember() throws Exception;
}
