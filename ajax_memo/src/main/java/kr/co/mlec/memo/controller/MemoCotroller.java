package kr.co.mlec.memo.controller;

import java.util.List;

import org.springframework.web.anntation.Controller;
import org.springframework.web.anntation.RequestMapping;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.domain.Memo;
import kr.co.mlec.repository.mapper.MemoMapper;

@Controller
public class MemoCotroller {
	
    MemoMapper mapper = MyAppSqlConfig.getSqlSessionInstance().getMapper(MemoMapper.class);
	
	@RequestMapping("/memo/memoWrite.json")
	public void memoWrite(Memo memo){
		System.out.println("도착!!");
		mapper.insertMemo(memo);
	}
	
	@RequestMapping("/memo/memoUpdate.json")
	public void memoUpdate(Memo memo){
		System.out.println(memo.getFoldWhe());
		mapper.updateMemo(memo);
	}
	
	@RequestMapping("/memo/memoUpdatefold.json")
	public void memoUpdatefold(Memo memo){
		mapper.updateMemofold(memo);
	}
	
	@RequestMapping("/memo/memoList.json")
	public List<Memo> memoList(){
		System.out.println("도착!!!");
	    List<Memo> memoList = mapper.selectMemo();
	    for(Memo m : memoList) {
	    	System.out.println(m.getMemoNo());
	    	System.out.println(m.getMemoColor());
	    }
	    
	    return memoList;
	}
	
	@RequestMapping("/memo/delete.json")
	public void delete(int memoNo){
		mapper.deletememo(memoNo);
	}
	

}
