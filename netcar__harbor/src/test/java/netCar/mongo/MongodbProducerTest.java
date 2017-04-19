package netCar.mongo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.netCar.domain.VehiclePosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-application.xml"}) //加载配置文件
public class MongodbProducerTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 向kafka里写数据.<br/>
     * @author miaohongbin
     * Date:2016年6月24日下午6:22:58
     */
    @Test
    public void testTemplate(){


    }

    @Test
    public void saveOrUpdate() {
        VehiclePosition position = new VehiclePosition(1,"1q23","d");
        try {
            mongoTemplate.insert(position);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStayTime(int stayed, String deviceSn, Long time) {
        Query query = new Query();
        query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
        query.addCriteria(Criteria.where("receive").is(time));
        mongoTemplate.updateFirst(query, new Update().set("stayed", stayed), VehiclePosition.class);
    }

    public List<VehiclePosition> listByTime(String deviceSn, long start) {
        Query query = new Query();
        query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
        query.addCriteria(Criteria.where("receive").gte(start));
        query.with(new Sort(Sort.Direction.ASC, "receive"));
        return mongoTemplate.find(query, VehiclePosition.class);
    }

    /**获取cell信息大于等于3的数据
     * @param deviceSn
     * @param start
     * @return
     */
    public List<VehiclePosition> findCellByTime(String deviceSn, Long start) {
        Query query = new Query();
        query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
        query.addCriteria(Criteria.where("receive").gte(start));
        query.with(new Sort(Sort.Direction.DESC, "receive"));
        return mongoTemplate.find(query, VehiclePosition.class);
    }



    public void delete(String deviceSn, Long start, Long end) {
        Query query = new Query();
        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(start),Criteria.where("receive").lte(end)));
        mongoTemplate.remove(query, VehiclePosition.class);
    }

}



