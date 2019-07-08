package kr.co.mlec.repository.mapper;

import java.util.List;

import kr.co.mlec.repository.domain.Memo;

public interface MemoMapper {
	
	void insertMemo(Memo memo);
	void updateMemo(Memo memo);
	void updateMemofold(Memo memo);
	
	List<Memo> selectMemo();
	
	void deletememo(int memoNo);

}
