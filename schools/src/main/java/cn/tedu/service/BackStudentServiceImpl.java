package cn.tedu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.tedu.mapper.BackStudentMapper;
import cn.tedu.pojo.User;

@Service
public class BackStudentServiceImpl implements BackStudentService {
	
	private BackStudentMapper backStudentMapper;
	@Override
	public List<User> findAllStudent() {
		
		return backStudentMapper.findAllStudent();
	}
	//后台界面的学生管理
	
}