package com.marriage.information.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marriage.information.dao.InformationDao;
import com.marriage.information.service.InformationService;
import com.marriage.user.entity.ManInformation;


@Service
@Transactional
public class InformationServiceImpl implements InformationService {

	@Autowired
	private InformationDao informationDao;
	
	@Override
	public Integer addWomanInformation(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return informationDao.addWomanInformation(map);
	}

	@Override
	public List<ManInformation> selectWomanInformationBypage(Map<String, Object> map) {
		
		
		return informationDao.selectWomanInformationBypage(map);
	}

}
