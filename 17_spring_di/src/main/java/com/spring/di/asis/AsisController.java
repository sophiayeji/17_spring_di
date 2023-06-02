package com.spring.di.asis;

public class AsisController {
	// 객체의 생성 순서 Controller > Service > DAO
    // 객체가 생성됨과 동시에 클래스 내부에서 다른 객체를 생성한다. >>> 결합력(의존성)이 강하다. 
	// 결합력(의존성)이 있다 없다가 아니라 강약으로 봐야한다. 
	AsisService asisService = new AsisService();
	
}
