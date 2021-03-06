package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import cn.tedu.pojo.Bbs;

public interface BbsMapper {
	//查询所有
	public List<Bbs> findAll();
	//帖子发布
	@Insert("insert into bbs(bss_id,creat_id,bss_title,bss_class,bss_context) "
			+ "values(#{bssId},#{creatId},#{bssTitle},#{bssClass},#{bssContext})")
	public void saveBBS(Bbs bbs);
	
}
