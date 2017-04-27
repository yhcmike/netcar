package org.netCar.service.impl;

import org.netCar.dao.PassengerComplaintDao;
import org.netCar.domain.PassengerComplaintEntity;
import org.netCar.service.PassengerComplaintService;
import org.netCar.vo.OTIpcDef.RatedPassenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class PassengerComplaintServiceImpl implements PassengerComplaintService {

    @Autowired
    private PassengerComplaintDao PassengerComplaintDao;

	@Override
	public void operationPassengerComplaint(RatedPassenger ratedPassenger) {
		// TODO Auto-generated method stub
		
	}
	
	private PassengerComplaintEntity transToModelFromComplain(RatedPassenger ratedPassenger){
		if(null == ratedPassenger){
			return null;
		}
		PassengerComplaintEntity entity = new PassengerComplaintEntity();
		entity.setCompanyId(ratedPassenger.getCompanyId());
		entity.setOrderId(ratedPassenger.getOrderId());
		entity.setComplaintTime(ratedPassenger.getEvaluateTime());
		entity.setCompanyId(ratedPassenger.getCompanyId());
		entity.setCompanyId(ratedPassenger.getCompanyId());
		entity.setCompanyId(ratedPassenger.getCompanyId());
	}
}
