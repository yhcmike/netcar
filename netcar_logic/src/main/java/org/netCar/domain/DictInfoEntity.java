package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by menxin on 2017/4/19.
 */
@Entity
@Table(name = "dict_info")
public class DictInfoEntity extends IdEntity{
    private String code;
    private String name;
    private String type;

    @Column(name = "code", length = 32)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Column(name = "type", length = 64)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "name", length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
