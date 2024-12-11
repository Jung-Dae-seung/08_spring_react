package edu.kh.admin.main.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.admin.main.model.dto.Member;

@Mapper
public interface AdminMapper {

	/** 관리자 로그인
	 * @param memberEmail
	 * @return
	 */
	Member login(String memberEmail);

}
