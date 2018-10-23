package com.luban.command.index.service.impl;

import com.luban.command.capitaltrend.service.CapitaltrendService;
import com.luban.command.contractsign.service.ContractSignService;
import com.luban.command.corporatenews.service.CorporateNewsService;
import com.luban.command.groupstructure.service.GroupStructureService;
import com.luban.command.highriskengineer.service.HighRiskEngineeringService;
import com.luban.command.humanresources.service.HumanResourcesService;
import com.luban.command.index.service.IndexService;
import com.luban.command.majorproject.service.MajorProjectService;
import com.luban.command.materialprocurement.service.MaterialProcurementService;
import com.luban.command.notice.service.NoticeService;
import com.luban.command.projectmanager.service.ProjectManagerService;
import com.luban.command.projectmonitory.service.ProjectMonitoryService;
import com.luban.command.safetyquality.service.SafetyQualityService;
import com.luban.command.scientific.service.ScientificService;
import com.luban.command.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName IndexServiceImpl
 * @Author yuanlei
 * @Date 2018/10/17 15:22
 * @Version 1.0
 **/
@Service("indexService")
public class IndexServiceImpl implements IndexService {


    @Autowired
    private CapitaltrendService capitaltrendService;
    @Autowired
    private ContractSignService contractSignService;
    @Autowired
    private CorporateNewsService corporateNewsService;
    @Autowired
    private GroupStructureService groupStructureService;
    @Autowired
    private HighRiskEngineeringService highRiskEngineeringService;
    @Autowired
    private HumanResourcesService humanResourcesService;
    @Autowired
    private MajorProjectService majorProjectService;
    @Autowired
    private MaterialProcurementService materialProcurementService;
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private ProjectManagerService projectManagerService;
    @Autowired
    private ProjectMonitoryService projectMonitoryService;
    @Autowired
    private SafetyQualityService safetyQualityService;
    @Autowired
    private ScientificService scientificService;
    @Autowired
    private WeatherService weatherService;



    @Override
    public HashMap<String, Object> getData() {


        HashMap<String, Object> indexMap = new HashMap<>();

        /**
         * 获取资金走势
         */
        Map<String,Double> capitaltrend = capitaltrendService.getCapitalTrend();

        /**
         * 获取合同签约
         */
        HashMap<String,Object> contractsign = contractSignService.getContractSign();

        /**
         * 获取企业新闻
         */
        String corporateNews = corporateNewsService.getCorporateNews();

        /**
         * 获取集团架构
         */
        String groupstructure = groupStructureService.getGroupStructure();

        /**
         * 获取高危工程
         */
        String highriskengineering = highRiskEngineeringService.getHighRiskEngineering();

        /**
         * 获取人力资源
         */
        String humanresources = humanResourcesService.getHumanResources();

        /**
         * 获取重大工程
         */
        String majorproject = majorProjectService.getMajorProject();

        /**
         * 获取物资采购
         */
        HashMap<String,Object> materialprocurement = materialProcurementService.getMaterialProcurement();

        /**
         * 获取通知
         */
        List notice = noticeService.getNotice();

        /**
         * 获取项目经营情况
         */
        HashMap<String,Object> projectmanager = projectManagerService.getProjectManager();

        /**
         * 获取项目监控
         */
        String projectmonitoring = projectMonitoryService.getProjectMonitoring();

        /**
         * 获取安全质量
         */
        String safetyquality = safetyQualityService.getSafetyQuality();

        /**
         * 获取科研成果
         */
        String scientific =  scientificService.getScientific();

        /**
         * 获取时间天气
         */
        String weatherTime = weatherService.getWeatherTime();



        indexMap.put("capitaltrend",capitaltrend);
        indexMap.put("contractsign",contractsign);
        indexMap.put("corporateNews",corporateNews);
        indexMap.put("groupstructure",groupstructure);
        indexMap.put("highriskengineering",highriskengineering);
        indexMap.put("humanresources",humanresources);
        indexMap.put("majorproject",majorproject);
        indexMap.put("materialprocurement",materialprocurement);
        indexMap.put("notice",notice);
        indexMap.put("projectmanager",projectmanager);
        indexMap.put("projectmonitoring",projectmonitoring);
        indexMap.put("safetyquality",safetyquality);
        indexMap.put("scientific",scientific);
        indexMap.put("weatherTime",weatherTime);


        return indexMap;
    }
}
