package org.netCar.service.impl;

import org.apache.commons.lang.StringUtils;
import org.netCar.dao.VehiclepositionDao;
import org.netCar.domain.VehiclePositionEntity;
import org.netCar.service.VehiclepositionService;
import org.netCar.service.cache.PositionCache;
import org.netCar.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class VehiclepositionServiceImpl implements VehiclepositionService {

    private static Logger logger = LoggerFactory.getLogger(VehiclepositionServiceImpl.class);

    private static  Integer codeInt = 340101;

    @Autowired
    VehiclepositionDao vehiclepositionDao;

    @Autowired
    private PositionCache positionCache;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(VehiclePositionEntity vehicleposition) {
        vehiclepositionDao.save(vehicleposition);
    }

    @Override
    public void update(VehiclePositionEntity vehicleposition) {
        vehiclepositionDao.update(vehicleposition);
    }

    @Override
    public void delete(VehiclePositionEntity vehicleposition) {
        vehiclepositionDao.deleteObject(vehicleposition);
    }

    @Override
    public void operationPostion(Integer id) {
        logger.info("operationPostion start id:"+id);
     /* 340101	市辖区
        340102	瑶海区
        340103	庐阳区
        340104	蜀山区
        340111	包河区
        340121	长丰县
        340122	肥东县
        340123	肥西县*/
        VehiclePositionEntity vehicleposition = vehiclepositionDao.get(id);
        //1:查询位置所在区域和上次所在区域比较
        String vehicleNo = vehicleposition.getVehicleNo();
        String lastCode = positionCache.getCodeByVehicleNo(vehicleNo);

        String nowCode = codeInt.toString();
        if (id % 50 == 0){
            codeInt++;
            nowCode = codeInt.toString();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(StringUtils.isBlank(lastCode)){
            positionCache.setVehicleNoCode(vehicleNo, nowCode);
        }else if(!lastCode.equals(nowCode)){
            positionCache.deletePosition(lastCode, vehicleNo);
            positionCache.setVehicleNoCode(vehicleNo, nowCode);
        }

        Map map = new HashMap();
        String str = JsonUtil.obj2Str(vehicleposition);
        map.put(vehicleposition.getVehicleNo(),str);
        positionCache.setPosition(nowCode, map);
        logger.info("redis insert success nowCode:"+nowCode);

        //存mongdb
        mongoTemplate.insert(vehicleposition);
        logger.info("operationPostion end");
    }

}
