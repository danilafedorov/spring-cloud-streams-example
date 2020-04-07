package com.fedorov.example.rabbit.consumer.dao.mapper;

import com.fedorov.example.rabbit.consumer.model.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EventMapper {

    void save(@Param("event") Event event);
}
