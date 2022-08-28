package org.xunjian.task;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.xunjian.service.ChecklistService;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableScheduling
@Slf4j
public class TimeTask {
    @Resource
    private ChecklistService checklistService;
//    @Resource
//    private HospitalConfigService hospitalConfigService;

    @Scheduled(cron = "* * * * * ?")
    public void timeTest() {
        log.info("Task begin execute");
//        Page<HospitalConfig> hospitalConfigs = hospitalConfigService.listByAll(new HospitalConfig(), 0, 1000);
//        hospitalConfigs.forEach(hospitalConfig -> {
//            Checklist record = new Checklist();
//            //            record.setHospitalId(hospitalConfig.getHospitalId());
//            //TODO 其他完善record数据
//            checklistService.insert(record);
//        });
    }
}
