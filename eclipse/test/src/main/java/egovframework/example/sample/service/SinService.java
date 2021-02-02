package egovframework.example.sample.service;

public interface SinService {
	public SinVO selectContents(String id) throws Exception;
	public int updateContents(String str) throws Exception;
	public void printContents(String str) throws Exception;
}
