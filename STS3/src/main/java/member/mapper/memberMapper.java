package member.mapper;

import java.util.List;
import java.util.Map;

public interface memberMapper {
	List<Map<String, Object>> selectMember() throws Exception;
}
