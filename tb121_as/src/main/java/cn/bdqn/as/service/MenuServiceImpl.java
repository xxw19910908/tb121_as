package cn.bdqn.as.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bdqn.as.dao.MenuDao;
import cn.bdqn.as.entity.Menu;
@Service
@Transactional
public class MenuServiceImpl implements MenuService{
	@Autowired
	private MenuDao menuDaoImpl;
	
	
	
	@Override
	public List<Menu> showAll() {
		// TODO Auto-generated method stub
		return menuDaoImpl.getAll();
	}

}
