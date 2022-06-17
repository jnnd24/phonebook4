package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;

@Service
public class PhoneService {
	
	//필드
	@Autowired
	private PhoneDao phoneDao;
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	
	//전화번호 리스트
	public List<PersonVo> getPersonList() {
		
		List<PersonVo> personList = phoneDao.getPersonList();
		
		return personList;
		
	}
	
	
	//전화번호 등록
	public int personInsert(PersonVo personVo) {
		System.out.println("PhoneService > personInsert");
		
		int count = phoneDao.personInsert(personVo);
		
		return count;
	}
	
	//전화번호 등록 map활용 (수업용)
	public int personInsert2() {
		System.out.println("PhoneService > personInsert2");
	
		Map<String, String> pMap = new HashMap<String, String>();
		pMap.put("name", "장성찬");
		pMap.put("hp", "010-0000-0000");
		pMap.put("company", "02-111-1111");
		
		int count = phoneDao.personInsert2(pMap);
		
		return count;
	
	}
	
	
	
	//전화번호 삭제
	public int personDelete(int no) {
		
		int count = phoneDao.personDelete(no);
		
		return count;
	}
	
	
	//전호번호 수정폼 - 한사람 정보 불러보기
	public PersonVo getPerson(int no) {
		
		PersonVo personVo = phoneDao.getPerson(no);
		
		return personVo;
	}
	
	//전호번호 수정폼 - 한사람 정보 불러보기 Map활용
		public Map<String, Object> getPerson2(int no) {
			System.out.println("PhoneServic > getPerson2");
			
			Map<String, Object> pMap = phoneDao.getPerson2(no);
			
			return pMap;
		}
		
	
	//전화번호 수정
	public int personUpdate(PersonVo personVo) {
		
		int count = phoneDao.personUpdate(personVo);
		
		return count;
	}
	
	
	
	
	
	

}
