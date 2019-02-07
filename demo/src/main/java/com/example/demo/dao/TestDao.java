package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


import com.example.demo.entites.Test;

public interface TestDao extends PagingAndSortingRepository<Test, Long>//分页和排序
                                 ,JpaSpecificationExecutor<Test>//动态查询
{ 

}
