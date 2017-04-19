package org.netCar.service.impl;

import org.netCar.dao.PassengerComplaintDao;
import org.netCar.domain.PassengerComplaintEntity;
import org.netCar.service.PassengerComplaintService;
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
    public void save(PassengerComplaintEntity passengerComplaintEntity) {
        PassengerComplaintDao.save(passengerComplaintEntity);
    }

    @Override
    public void update(PassengerComplaintEntity passengerComplaintEntity) {
        PassengerComplaintDao.update(passengerComplaintEntity);
    }

    @Override
    public void delete(PassengerComplaintEntity passengerComplaintEntity) {
        PassengerComplaintDao.deleteObject(passengerComplaintEntity);
    }
}
