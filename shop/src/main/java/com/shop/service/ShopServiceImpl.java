package com.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.shop.domain.GoodsViewVO;
import com.shop.persistence.ShopDAO;

@Service
public class ShopServiceImpl implements ShopService{

	@Inject
	private ShopDAO dao;
	
	//카테고리별 상품 리스트
	@Override
	public List<GoodsViewVO> list(int cateCode, int level) throws Exception {
		
		// 카테고리 참조 코드. 없어도 무관
		int cateCodeRef = 0;
		
		if (level == 1) { //lavel 1 = 1차 분류.
			cateCodeRef = cateCode;
			
			// 두가지 모두 cateCode로 해도 무관
			return dao.list(cateCode, cateCodeRef);
			
		} 
			return dao.list(cateCode);
	}
}
