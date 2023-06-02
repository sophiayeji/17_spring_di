package com.spring.tobe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 해당 클래스가 Service임을 IOC 컨테이너에 등록한다. 
public class TobeServiceImpl implements TobeService {

	@Autowired //@Inject
	private TobeDAO tobeDAO;  

}
