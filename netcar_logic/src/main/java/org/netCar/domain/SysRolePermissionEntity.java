package org.netCar.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "sys_role_permission")
public class SysRolePermissionEntity {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    private long roleId;

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    private long permissionId;

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
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


    @Column(name = "role_id")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }


    @Column(name = "permission_id")
    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
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

        SysRolePermissionEntity that = (SysRolePermissionEntity) o;

        if (id != that.id) return false;
        if (roleId != that.roleId) return false;
        if (permissionId != that.permissionId) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (permissionId ^ (permissionId >>> 32));
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
