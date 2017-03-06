package com.szy.db.mapper;

import com.szy.db.model.*;
import com.szy.db.model.SystemInfo;

import java.util.List;

/**
 * Created by shizhouyong on 2017/1/8.
 */
public interface SystemMapper {

    public int insertGrade(SystemInfo gradeDbo);
    public List<GradeDbo> selectGrades();
    public int deleteGrade(int id);

    public int insertMajor(SystemInfo majorDbo);
    public List<MajorQueryDbo> selectMajors();
    public int deleteMajor(int id);

    public int insertPosition(SystemInfo positionDbo);
    public List<PositionDbo> selectPositions();
    public int deletePosition(int id);

    public int insertCategory(SystemInfo categoryDbo);
    public List<CategoryDbo> selectCategories();
    public int deleteCategory(int id);
}
