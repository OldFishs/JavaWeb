package com.xxx.schedule.dao.impl;

import com.xxx.schedule.dao.BaseDao;
import com.xxx.schedule.dao.SysScheduleDao;
import com.xxx.schedule.pojo.SysSchedule;

public class SysScheduleimpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        /**
         *
         * 用于向数据中增加一条日程记录
         * @param schedule 日程数据以SysSchedule实体类对象形式入参
         * @return 返回影响数据库记录的行数，0为增加失败
         * @author user
         * @create 2024/10/10
         **/

        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql, schedule.getTitle(), schedule.getCompleted());
        return rows;
    }
}
