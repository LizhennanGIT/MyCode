package com.qnvip.dao;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import com.qnvip.vo.Girl;
@Mapper  
public interface GirlDAO {
	List<Girl> getGirl();
}
