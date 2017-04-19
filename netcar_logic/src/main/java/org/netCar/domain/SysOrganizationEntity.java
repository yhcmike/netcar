package org.netCar.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "sys_organization")
public class SysOrganizationEntity {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    private String name;
    private Long parentId;
    private String parentIds;
    private String statusId;
    private String email;
    private Long userId;
    private Integer sortNo;
    private Integer expend;
    private Integer isLeaf;
    private String remark;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Column(name = "name", length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "parent_id")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }


    @Column(name = "parent_ids", length = 100)
    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }


    @Column(name = "status_id", length = 1)
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }


    @Column(name = "email", length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    @Column(name = "sort_no")
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }


    @Column(name = "expend")
    public Integer getExpend() {
        return expend;
    }

    public void setExpend(Integer expend) {
        this.expend = expend;
    }


    @Column(name = "is_leaf")
    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }


    @Column(name = "remark", length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }


    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysOrganizationEntity that = (SysOrganizationEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (parentIds != null ? !parentIds.equals(that.parentIds) : that.parentIds != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (sortNo != null ? !sortNo.equals(that.sortNo) : that.sortNo != null) return false;
        if (expend != null ? !expend.equals(that.expend) : that.expend != null) return false;
        if (isLeaf != null ? !isLeaf.equals(that.isLeaf) : that.isLeaf != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (parentIds != null ? parentIds.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sortNo != null ? sortNo.hashCode() : 0);
        result = 31 * result + (expend != null ? expend.hashCode() : 0);
        result = 31 * result + (isLeaf != null ? isLeaf.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
