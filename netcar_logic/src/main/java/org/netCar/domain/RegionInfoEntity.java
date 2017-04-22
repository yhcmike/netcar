package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by menxin on 2017/4/19.
 */
@Entity
@Table(name = "region_info")
public class RegionInfoEntity extends IdEntity{
    private String regionCode;
    private String regionName;
    private String parentCode;

    @Column(name = "parent_code", length = 64)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
    @Column(name = "region_code", length = 64)
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    @Column(name = "region_name", length = 64)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }


}
