package org.netCar.task;

/**
 * Created by ffd on 2017/4/12.
 */

public class TaskJob {

   /* @Autowired
    private VehiclepositionService vehiclepositionService;*/

    public static int  id = 3;

    //@Scheduled(cron = "0/1 * * * * ?")
    public void job1() throws Exception {
        id++;
        //vehiclepositionService.operationPostion(id);
    }
}