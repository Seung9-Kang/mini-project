package com.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shop.domain.CategoryVO;
import com.shop.domain.GoodsVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService{

	@Inject
	private AdminDAO dao;
	
	//카테고리
	@Override
	public List<CategoryVO> category() throws Exception {
		return dao.category();
	}
	
	//상품등록
	@Override
	public void register(GoodsVO vo) throws Exception {
		dao.register(vo);
	}
	
	//상품목록
	@Override
	public List<GoodsViewVO> goodslist() throws Exception {
		System.out.println("서비스");
		return dao.goodslist();
	}

	//상품조회 + 카테고리 조합
	@Override
	public GoodsViewVO goodsView(int gdsNum) throws Exception {
		return dao.goodsView(gdsNum);
	}
	
	//상품수정
	@Override
	public void goodsModify(GoodsVO vo) throws Exception {
		dao.goodsModify(vo);
	}

	//상품삭제
	@Override
	public void goodsDelete(int gdsNum) throws Exception {
		dao.goodsDelete(gdsNum);
	}

	//주문목록
	@Override
	public List<OrderVO> orderList() throws Exception {
		return dao.orderList();
	}

	//특정주문목록
	@Override
	public List<OrderListVO> orderView(OrderVO order) throws Exception {
		return dao.orderView(order);
	}
	
	//배송상태
	@Override
	public void delivery(OrderVO order) throws Exception {
		dao.delivery(order);
	}

}
