package com.laoqixin.dao;

import com.laoqixin.bean.Position;
import java.util.List;

/**
 * @author Laoqixin
 */
public interface PositionMapper {
    /**
     *
     * @param psId
     * @return
     */
    int deleteByPrimaryKey(Integer psId);

    /**
     *
     * @param record
     * @return
     */
    int insert(Position record);

    /**
     *
     * @param psId
     * @return
     */
    Position selectByPrimaryKey(Integer psId);

    /**
     *
     * @return
     */
    List<Position> selectAll();

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Position record);
}