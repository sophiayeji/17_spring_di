package com.spring.tobe;

import org.springframework.stereotype.Component;

/*

# POJO (Plain Old Java Object) 

- EJB(Enterprise JavaBeans) 등에서 사용되는 Java Bean이 아닌 Getter와 Setter로 구성된 가장 순수한 형태의 기본 클래스 
- Spring에서 핵심적인 부분을 구성하는 가장 기본적인 요소로 사용
- 스프링의 오브젝트 생성 및 사용하는 대표적인 방법이 xml에 명시하는 방법과 @Component로 등록시키는 2가지 방법이 있다.
- Component를 통하여 xml파일에 명시하지 않고 Component-scan으로 객체의 주입이 가능하다.
- Component("이름")를 통하여 빈 이름(id)를 지정할 수 있다.
- Component("이름)을 생략할 경우 클래스의 앞글자를 소문자로 변경하여 이름이 지정된다.
   Ex) Product > @Component("product")
       Goods   > @Component("goods")
- [중요] servelet-context.xml 파일의 <context:component-scan base-package="" />의 지정된 경로(하위패키지 포함)에 컴포넌트 등록이 있어야 컴포넌트 스캔이 가능하다.
- @Component 외 @Controller , @Service , @Repository , @Aspect , @Configuration 어노테이션도 컴포넌트 스캔 대상이 된다.

*/

@Component // 생략해도 무방
public class TobeDTO {

	private String productCd;
	private String productNm;
	private int price;
	
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
