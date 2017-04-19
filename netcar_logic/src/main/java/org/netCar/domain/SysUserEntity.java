package org.netCar.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "sys_user")
public class SysUserEntity {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String userNo;


    @Column(name = "user_no", length = 40)
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    private String password;


    @Column(name = "password", length = 40)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String salt;


    @Column(name = "salt", length = 11)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    private int locked;

    public void setLocked(Integer locked) {
        this.locked = locked;
    }


    @Column(name = "locked")
    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    private Long organizationId;


    @Column(name = "organization_id")
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    private Integer userType;


    @Column(name = "user_type")
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    private String name;


    @Column(name = "name", length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String staffNo;


    @Column(name = "staff_no", length = 40)
    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    private String position;


    @Column(name = "position", length = 64)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private Integer sex;


    @Column(name = "sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private String age;


    @Column(name = "age", length = 40)
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String nickName;


    @Column(name = "nick_name", length = 255)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private String phone;


    @Column(name = "phone", length = 40)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String mobile;


    @Column(name = "mobile", length = 40)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String email;


    @Column(name = "email", length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String weight;


    @Column(name = "weight", length = 40)
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    private String height;


    @Column(name = "height", length = 40)
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    private String nation;


    @Column(name = "nation", length = 40)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    private String identityCard;


    @Column(name = "identity_card", length = 64)
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    private String birthday;


    @Column(name = "birthday", length = 40)
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private Integer isMarried;


    @Column(name = "is_married")
    public Integer getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(Integer isMarried) {
        this.isMarried = isMarried;
    }

    private String address;


    @Column(name = "address", length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Long createBy;


    @Column(name = "create_by")
    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    private Timestamp createTime;


    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    private Long updateBy;


    @Column(name = "update_by")
    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    private Timestamp updateTime;


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

        SysUserEntity that = (SysUserEntity) o;

        if (id != that.id) return false;
        if (locked != that.locked) return false;
        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (salt != null ? !salt.equals(that.salt) : that.salt != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (staffNo != null ? !staffNo.equals(that.staffNo) : that.staffNo != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (identityCard != null ? !identityCard.equals(that.identityCard) : that.identityCard != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (isMarried != null ? !isMarried.equals(that.isMarried) : that.isMarried != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + locked;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (staffNo != null ? staffNo.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (identityCard != null ? identityCard.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (isMarried != null ? isMarried.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
