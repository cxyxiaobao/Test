package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.MyMapper;
import com.pojo.Student;
import com.service.MyService;

public class MyServiceImpl implements MyService{

	@Autowired
	private MyMapper myMapper;
  @Override
public List<Student> list() {
	// TODO Auto-generated method stub
	return myMapper.selectist();
}
}
