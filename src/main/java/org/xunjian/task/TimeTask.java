package org.xunjian.task;

import javax.annotation.Resource;

import com.github.pagehelper.Page;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.xunjian.mapper.model.Checklist;
import org.xunjian.mapper.model.HospitalList;
import org.xunjian.service.ChecklistService;

import lombok.extern.slf4j.Slf4j;
import org.xunjian.service.HospitalListService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration
@EnableScheduling
@Slf4j
public class TimeTask {
    @Resource
    private ChecklistService checklistService;

    @Resource
    private HospitalListService hospitalListService;





//    @Resource
//    private HospitalConfigService hospitalConfigService;

//    @Scheduled(cron = "* * * * * ?")
    @Scheduled(cron = "0 0 0 * * ?")
    public void timeTest() {
        // 每天晚上 0:0:0 执行一次
        log.info("Task begin execute");

        // 获取当前时间
        Date date = new Date();
        // 拉取所有医院, 根据配置去checklist表中去创建信息
        HospitalList hospitalList = new HospitalList();
        List<HospitalList> hospitalLists = hospitalListService.listAll(hospitalList);

        for (HospitalList list : hospitalLists) {
            if(list.getDayConfig() != null) {
                log.info(String.valueOf(list));
                Checklist checklist = new Checklist();
                // 设置关联医院
                checklist.setHospitalId(list.getId());
                // 设置名称为日期
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                checklist.setName(dateFormat.format(date));

                // 日志测试
//                SimpleDateFormat dateFormat_min = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                log.info(dateFormat_min.format(date));

                // 设置检测类型 1为日检
                checklist.setType(1);
                // dayConfig
                checklist.setInspectConfig(list.getDayConfig());
                checklistService.insert(checklist);
            }
        }





        // 先拉取 checklist中所有的数据
//        Checklist checklist = new Checklist();
//        List<Checklist> checklistLists = checklistService.listByAllNoPage(checklist);
//        log.info(String.valueOf(checklistLists));
//
//        boolean sign = false;




//        Page<HospitalConfig> hospitalConfigs = hospitalConfigService.listByAll(new HospitalConfig(), 0, 1000);
//        hospitalConfigs.forEach(hospitalConfig -> {
//            Checklist record = new Checklist();
//            //            record.setHospitalId(hospitalConfig.getHospitalId());
//            //TODO 其他完善record数据
//            checklistService.insert(record);
//        });
    }


    @Scheduled(cron = "0 0 0 1 * ?")
    public void timeTestMonth() {
        // 每月1号执行一次
        // 获取当前时间
        Date date = new Date();
        // 拉取所有医院, 根据配置去checklist表中去创建信息
        HospitalList hospitalList = new HospitalList();
        List<HospitalList> hospitalLists = hospitalListService.listAll(hospitalList);

        for (HospitalList list : hospitalLists) {
            if(list.getMonthConfig() != null) {
                log.info(String.valueOf(list));
                Checklist checklist = new Checklist();
                // 设置关联医院
                checklist.setHospitalId(list.getId());
                // 设置名称为日期
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                checklist.setName(dateFormat.format(date));

//                // 日志测试
//                SimpleDateFormat dateFormat_min = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                log.info(dateFormat_min.format(date));

                // 设置检测类型 1为日检
                checklist.setType(2);
                // dayConfig
                checklist.setInspectConfig(list.getMonthConfig());
                checklistService.insert(checklist);
            }
        }
    }

//    @Scheduled(cron = "0 0 0 1 * ? *")
//    public void timeTestYear() {
//        // 元旦执行
//        // 获取当前时间
//        Date date = new Date();
//        // 拉取所有医院, 根据配置去checklist表中去创建信息
//        HospitalList hospitalList = new HospitalList();
//        List<HospitalList> hospitalLists = hospitalListService.listAll(hospitalList);
//
//        for (HospitalList list : hospitalLists) {
//            if(list.getYearConfig() != null) {
//                log.info(String.valueOf(list));
//                Checklist checklist = new Checklist();
//                // 设置关联医院
//                checklist.setHospitalId(list.getId());
//                // 设置名称为日期
//                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                checklist.setName(dateFormat.format(date));
//
////                // 日志测试
////                SimpleDateFormat dateFormat_min = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////                log.info(dateFormat_min.format(date));
//
//                // 设置检测类型 1为日检
//                checklist.setType(3);
//                // dayConfig
//                checklist.setInspectConfig(list.getYearConfig());
//                checklistService.insert(checklist);
//            }
//        }
//    }
}
