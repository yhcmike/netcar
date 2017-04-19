package org.netCar.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "sys_user_role")
public class SysUserRoleEntity {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    private long userId;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private long roleId;

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    private String statusId;
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


    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    @Column(name = "role_id")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }


    @Column(name = "status_id", length = 1)
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
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

        SysUserRoleEntity that = (SysUserRoleEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (roleId != that.roleId) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
