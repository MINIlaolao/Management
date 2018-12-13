package com.laoqixin.dao;

import com.laoqixin.bean.Position;
import java.util.List;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer psId);

    int insert(Position record);

    Position selectByPrimaryKey(Integer psId);

    List<Position> selectAll();

    int updateByPrimaryKey(Position record);
}