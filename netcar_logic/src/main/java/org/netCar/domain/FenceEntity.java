package org.netCar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "fence")
public class FenceEntity  extends IdEntity{
<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8947915200707080084L;
	
=======
>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
	@Column(name = "name", length = 64)
    private String name;
	@Column(name = "shape")
    private Integer shape;
<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
	@Column(name = "radius")
    private Double radius;
	@Column(name = "type")
    private Integer type;
	@Column(name = "spots")
    private String spots;
	@Column(name = "remark")
=======
	@Column(name = "radius", precision = 0)
    private Double radius;
	@Column(name = "type")
    private Integer type;
	@Column(name = "spots", length = 32)
    private String spots;
	@Column(name = "remark", length = 128)
>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    private String remark;
	@Column(name = "status")
    private Integer status;
	@Column(name = "number")
    private String number;
	@Column(name = "purpose")
    private String purpose;
	@Column(name = "createTime")
    private Date createTime;
	@Column(name = "endTime")
    private Date endTime;

<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
=======



>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
=======

>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    public Integer getShape() {
        return shape;
    }

    public void setShape(Integer shape) {
        this.shape = shape;
    }
<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
    
=======


>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
=======

>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
=======

>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    public String getSpots() {
        return spots;
    }

    public void setSpots(String spots) {
        this.spots = spots;
    }

<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
=======

>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
=======

>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
    
=======
>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
<<<<<<< abd06f04c3788e34de437a3424c26b703dd45c17
	
=======
>>>>>>> f7e739d5205629f85416c56bca118e777241e8ae
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

   
}
