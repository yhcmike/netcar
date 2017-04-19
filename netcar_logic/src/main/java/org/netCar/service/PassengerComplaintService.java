package org.netCar.service;

import org.netCar.domain.PassengerComplaintEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface PassengerComplaintService {
    public void save(PassengerComplaintEntity passengerComplaintEntity);
    public void update(PassengerComplaintEntity passengerComplaintEntity);
    public void delete(PassengerComplaintEntity passengerComplaintEntity);
}
