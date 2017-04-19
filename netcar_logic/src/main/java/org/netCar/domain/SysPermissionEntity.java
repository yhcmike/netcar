package org.netCar.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "sys_permission")
public class SysPermissionEntity {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    private String type;
    private String url;
    private Long parentId;
    private String parentIds;
    private String permissionName;
    private String permissionValue;
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


    @Column(name = "type", length = 40)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Column(name = "url", length = 40)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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


    @Column(name = "permission_name", length = 20)
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }


    @Column(name = "permission_value", length = 20)
    public String getPermissionValue() {
        return permissionValue;
    }

    public void setPermissionValue(String permissionValue) {
        this.permissionValue = permissionValue;
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

        SysPermissionEntity that = (SysPermissionEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (parentIds != null ? !parentIds.equals(that.parentIds) : that.parentIds != null) return false;
        if (permissionName != null ? !permissionName.equals(that.permissionName) : that.permissionName != null)
            return false;
        if (permissionValue != null ? !permissionValue.equals(that.permissionValue) : that.permissionValue != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (parentIds != null ? parentIds.hashCode() : 0);
        result = 31 * result + (permissionName != null ? permissionName.hashCode() : 0);
        result = 31 * result + (permissionValue != null ? permissionValue.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
