package com.shop.service;

import java.util.List;

import com.shop.domain.CategoryVO;
import com.shop.domain.GoodsVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;

public interface AdminService {

	//카테고리
	public List<CategoryVO> category() throws Exception;
	
	//상품등록
	public void register(GoodsVO vo) throws Exception;
	
	//상품목록
	public List<GoodsViewVO> goodslist() throws Exception;
	
	//상품조회
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
	
	//상품수정
	public void goodsModify(GoodsVO vo) throws Exception;
	
	//상품삭제
	public void goodsDelete(int gdsNum) throws Exception;
	
	//주문목록
	public List<OrderVO> orderList() throws Exception;
	
	//특정주문목록
	public List<OrderListVO> orderView(OrderVO order) throws Exception;
	
	//배송상태
	public void delivery(OrderVO order) throws Exception;
	
	//상품수량조절
	public void changeStock(GoodsVO goods) throws Exception;
	
	//모든 댓글
	public List<ReplyListVO> allReply() throws Exception;
	
	//댓글 삭제
	public void deleteReply(int repNum) throws Exception;
}
