package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;
@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
	@Autowired
	private IOrderMethodDao dao;

	@Transactional
	public Integer saveOrderMethod(OrderMethod om) {
		return (Integer)dao.saveOrderMethod(om);
	}

	@Transactional
	public void updateOrderMethod(OrderMethod om) {
		dao.updateOrderMethod(om);		
	}

	@Transactional
	public void deleteOrderMethod(Integer id) {
		dao.deleteOrderMethod(id);
	}
	@Transactional(readOnly=true)
	public OrderMethod getOrderMethodById(Integer id) {
		return dao.getOrderMethodById(id);
	}

	@Transactional(readOnly=true)
	public List<OrderMethod> getAllOrderMethodTypes() {
		return dao.getAllOrderMethodTypes();
	}

	
	@Transactional(readOnly=true)
	public List<Object[]> getOrderMethodCountByMode() {
		return dao.getOrderMethodCountByMode();
	}

}
