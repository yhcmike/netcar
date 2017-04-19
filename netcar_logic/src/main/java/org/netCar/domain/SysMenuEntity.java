package org.netCar.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "sys_menu")
public class SysMenuEntity {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    private String menuName;
    private Integer menuType;
    private Long parentId;
    private String parentIds;
    private Integer enable;
    private String iconcls;
    private String href;
    private Integer expand;
    private Integer sortNo;
    private Integer isLeaf;
    private String remark;
    private Long createBy;
    private Timestamp createTime;
    private Long updateBy;
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


    @Column(name = "menu_name", length = 50)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


    @Column(name = "menu_type")
    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
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


    @Column(name = "enable")
    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }


    @Column(name = "iconcls", length = 50)
    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }


    @Column(name = "href", length = 100)
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    @Column(name = "expand")
    public Integer getExpand() {
        return expand;
    }

    public void setExpand(Integer expand) {
        this.expand = expand;
    }


    @Column(name = "sort_no")
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }


    @Column(name = "is_leaf")
    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }


    @Column(name = "remark", length = 1024)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Column(name = "create_by")
    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }


    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }


    @Column(name = "update_by")
    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
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

        SysMenuEntity that = (SysMenuEntity) o;

        if (id != that.id) return false;
        if (menuName != null ? !menuName.equals(that.menuName) : that.menuName != null) return false;
        if (menuType != null ? !menuType.equals(that.menuType) : that.menuType != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (parentIds != null ? !parentIds.equals(that.parentIds) : that.parentIds != null) return false;
        if (enable != null ? !enable.equals(that.enable) : that.enable != null) return false;
        if (iconcls != null ? !iconcls.equals(that.iconcls) : that.iconcls != null) return false;
        if (href != null ? !href.equals(that.href) : that.href != null) return false;
        if (expand != null ? !expand.equals(that.expand) : that.expand != null) return false;
        if (sortNo != null ? !sortNo.equals(that.sortNo) : that.sortNo != null) return false;
        if (isLeaf != null ? !isLeaf.equals(that.isLeaf) : that.isLeaf != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (menuType != null ? menuType.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (parentIds != null ? parentIds.hashCode() : 0);
        result = 31 * result + (enable != null ? enable.hashCode() : 0);
        result = 31 * result + (iconcls != null ? iconcls.hashCode() : 0);
        result = 31 * result + (href != null ? href.hashCode() : 0);
        result = 31 * result + (expand != null ? expand.hashCode() : 0);
        result = 31 * result + (sortNo != null ? sortNo.hashCode() : 0);
        result = 31 * result + (isLeaf != null ? isLeaf.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
