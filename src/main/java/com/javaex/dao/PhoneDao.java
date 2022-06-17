package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneDao {

	//필드
	@Autowired
	private SqlSession sqlSession;
	
	
	//생성자
	
	//메소드gs
	
	//메소드일반
	
	//리스트 불러오기
	public List<PersonVo> getPersonList() {
		
		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");
		System.out.println(personList);
		
		return personList;
	}
	
	
	//사람 추가
	public int personInsert(PersonVo personVo) {
		
		int count = sqlSession.insert("phonebook.personInsert", personVo);
		
		return count;
	}
	
	

	//전화번호 등록 map활용 (수업용)
	public int personInsert2(Map<String, String> pMap) {
		System.out.println("PhoneDao > personInsert2");
		
		//System.out.println(pMap.toString());
		int count = sqlSession.insert("phonebook.personInsert2", pMap);
		
		return count;
	}
	
	
	//사람 삭제
	public int personDelete(int personId) {
		
		int count = sqlSession.delete("phonebook.personDelete", personId);
		
		return count;
	}
	
	
	//수정폼 1명정보 가져오기
	public PersonVo getPerson(int no) {
		
		PersonVo personVo = sqlSession.selectOne("phonebook.getPerson", no);
		
		return personVo;
	}

	//수정폼 1명정보 가져오기 Map활용
	public Map<String, Object> getPerson2(int no) {
		System.out.println("PhoneDao > getPerson2");
		
		Map<String, Object> pMap = sqlSession.selectOne("phonebook.getPerson2", no);
		
		return pMap;
	}
	
	
	//사람 수정
 	public int personUpdate(PersonVo personVo) {
		
		int count = sqlSession.update("phonebook.personUpdate", personVo);
		
		return count;
	}
	

}