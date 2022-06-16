package com.javaex.dao;

import java.util.List;

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
	
	
	//사람 삭제
	public int personDelete(int personId) {
		
		int count = sqlSession.delete("phonebook.personDelete", personId);
		
		return count;
	}
	
	
	//수정폼 1명정보 가져오기
	public PersonVo getPerson(int personId) {
		
		PersonVo personVo = sqlSession.selectOne("phonebook.getPerson", personId);
		
		return personVo;
	}
	
	
	//사람 수정
	public int personUpdate(PersonVo personVo) {
		
		int count = sqlSession.update("phonebook.personUpdate", personVo);
		
		return count;
	}
	

}