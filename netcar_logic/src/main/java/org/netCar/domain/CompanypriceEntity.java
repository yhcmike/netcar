package org.netCar.domain;

import javax.persistence.*;

/**
 * Created by ffd on 2017/4/17.
 */
@Entity
@Table(name = "companyprice")
public class CompanypriceEntity  extends  IdEntity{

    private String companyId;


    @Column(name = "companyId", length = 32)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    private Integer address;


    @Column(name = "address")
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    private String fareType;


    @Column(name = "fareType", length = 16)
    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    private String fareTypeNote;


    @Column(name = "fareTypeNote", length = 128)
    public String getFareTypeNote() {
        return fareTypeNote;
    }

    public void setFareTypeNote(String fareTypeNote) {
        this.fareTypeNote = fareTypeNote;
    }

    private Long fareValidOn;


    @Column(name = "fareValidOn")
    public Long getFareValidOn() {
        return fareValidOn;
    }

    public void setFareValidOn(Long fareValidOn) {
        this.fareValidOn = fareValidOn;
    }

    private Long fareValidOff;


    @Column(name = "fareValidOff")
    public Long getFareValidOff() {
        return fareValidOff;
    }

    public void setFareValidOff(Long fareValidOff) {
        this.fareValidOff = fareValidOff;
    }

    private Integer startFare;


    @Column(name = "startFare")
    public Integer getStartFare() {
        return startFare;
    }

    public void setStartFare(Integer startFare) {
        this.startFare = startFare;
    }

    private Integer startMile;


    @Column(name = "startMile")
    public Integer getStartMile() {
        return startMile;
    }

    public void setStartMile(Integer startMile) {
        this.startMile = startMile;
    }

    private Integer unitPricePerMile;


    @Column(name = "unitPricePerMile")
    public Integer getUnitPricePerMile() {
        return unitPricePerMile;
    }

    public void setUnitPricePerMile(Integer unitPricePerMile) {
        this.unitPricePerMile = unitPricePerMile;
    }

    private Integer unitPricePerMinute;


    @Column(name = "unitPricePerMinute")
    public Integer getUnitPricePerMinute() {
        return unitPricePerMinute;
    }

    public void setUnitPricePerMinute(Integer unitPricePerMinute) {
        this.unitPricePerMinute = unitPricePerMinute;
    }

    private Integer upPrice;


    @Column(name = "upPrice")
    public Integer getUpPrice() {
        return upPrice;
    }

    public void setUpPrice(Integer upPrice) {
        this.upPrice = upPrice;
    }

    private Integer upPriceStartMile;


    @Column(name = "upPriceStartMile")
    public Integer getUpPriceStartMile() {
        return upPriceStartMile;
    }

    public void setUpPriceStartMile(Integer upPriceStartMile) {
        this.upPriceStartMile = upPriceStartMile;
    }

    private String morningPeakTimeOn;


    @Column(name = "morningPeakTimeOn", length = 8)
    public String getMorningPeakTimeOn() {
        return morningPeakTimeOn;
    }

    public void setMorningPeakTimeOn(String morningPeakTimeOn) {
        this.morningPeakTimeOn = morningPeakTimeOn;
    }

    private String morningPeakTimeOff;


    @Column(name = "morningPeakTimeOff", length = 8)
    public String getMorningPeakTimeOff() {
        return morningPeakTimeOff;
    }

    public void setMorningPeakTimeOff(String morningPeakTimeOff) {
        this.morningPeakTimeOff = morningPeakTimeOff;
    }

    private String eveningPeakTimeOn;


    @Column(name = "eveningPeakTimeOn", length = 8)
    public String getEveningPeakTimeOn() {
        return eveningPeakTimeOn;
    }

    public void setEveningPeakTimeOn(String eveningPeakTimeOn) {
        this.eveningPeakTimeOn = eveningPeakTimeOn;
    }

    private String eveningPeakTimeOff;


    @Column(name = "eveningPeakTimeOff", length = 8)
    public String getEveningPeakTimeOff() {
        return eveningPeakTimeOff;
    }

    public void setEveningPeakTimeOff(String eveningPeakTimeOff) {
        this.eveningPeakTimeOff = eveningPeakTimeOff;
    }

    private String otherPeakTimeOn;


    @Column(name = "otherPeakTimeOn", length = 8)
    public String getOtherPeakTimeOn() {
        return otherPeakTimeOn;
    }

    public void setOtherPeakTimeOn(String otherPeakTimeOn) {
        this.otherPeakTimeOn = otherPeakTimeOn;
    }

    private String otherPeakTimeOff;


    @Column(name = "otherPeakTimeOff", length = 8)
    public String getOtherPeakTimeOff() {
        return otherPeakTimeOff;
    }

    public void setOtherPeakTimeOff(String otherPeakTimeOff) {
        this.otherPeakTimeOff = otherPeakTimeOff;
    }

    private Integer peakUnitPrice;


    @Column(name = "peakUnitPrice")
    public Integer getPeakUnitPrice() {
        return peakUnitPrice;
    }

    public void setPeakUnitPrice(Integer peakUnitPrice) {
        this.peakUnitPrice = peakUnitPrice;
    }

    private Integer peakPriceStartMile;


    @Column(name = "peakPriceStartMile")
    public Integer getPeakPriceStartMile() {
        return peakPriceStartMile;
    }

    public void setPeakPriceStartMile(Integer peakPriceStartMile) {
        this.peakPriceStartMile = peakPriceStartMile;
    }

    private Integer lowSpeedPricePerMinute;


    @Column(name = "lowSpeedPricePerMinute")
    public Integer getLowSpeedPricePerMinute() {
        return lowSpeedPricePerMinute;
    }

    public void setLowSpeedPricePerMinute(Integer lowSpeedPricePerMinute) {
        this.lowSpeedPricePerMinute = lowSpeedPricePerMinute;
    }

    private Integer nightPricePerMile;


    @Column(name = "nightPricePerMile")
    public Integer getNightPricePerMile() {
        return nightPricePerMile;
    }

    public void setNightPricePerMile(Integer nightPricePerMile) {
        this.nightPricePerMile = nightPricePerMile;
    }

    private Integer nightPricePerMinute;


    @Column(name = "nightPricePerMinute")
    public Integer getNightPricePerMinute() {
        return nightPricePerMinute;
    }

    public void setNightPricePerMinute(Integer nightPricePerMinute) {
        this.nightPricePerMinute = nightPricePerMinute;
    }

    private String otherPrice;


    @Column(name = "otherPrice", length = 10)
    public String getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(String otherPrice) {
        this.otherPrice = otherPrice;
    }

    private Integer state;


    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    private Long updateTime;


    @Column(name = "updateTime")
    public Long getUpdateTime() {
        return updateTime;
    }


    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }    private Integer flag;


    @Column(name = "flag")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanypriceEntity that = (CompanypriceEntity) o;

        if (id != that.id) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (fareType != null ? !fareType.equals(that.fareType) : that.fareType != null) return false;
        if (fareTypeNote != null ? !fareTypeNote.equals(that.fareTypeNote) : that.fareTypeNote != null) return false;
        if (fareValidOn != null ? !fareValidOn.equals(that.fareValidOn) : that.fareValidOn != null) return false;
        if (fareValidOff != null ? !fareValidOff.equals(that.fareValidOff) : that.fareValidOff != null) return false;
        if (startFare != null ? !startFare.equals(that.startFare) : that.startFare != null) return false;
        if (startMile != null ? !startMile.equals(that.startMile) : that.startMile != null) return false;
        if (unitPricePerMile != null ? !unitPricePerMile.equals(that.unitPricePerMile) : that.unitPricePerMile != null)
            return false;
        if (unitPricePerMinute != null ? !unitPricePerMinute.equals(that.unitPricePerMinute) : that.unitPricePerMinute != null)
            return false;
        if (upPrice != null ? !upPrice.equals(that.upPrice) : that.upPrice != null) return false;
        if (upPriceStartMile != null ? !upPriceStartMile.equals(that.upPriceStartMile) : that.upPriceStartMile != null)
            return false;
        if (morningPeakTimeOn != null ? !morningPeakTimeOn.equals(that.morningPeakTimeOn) : that.morningPeakTimeOn != null)
            return false;
        if (morningPeakTimeOff != null ? !morningPeakTimeOff.equals(that.morningPeakTimeOff) : that.morningPeakTimeOff != null)
            return false;
        if (eveningPeakTimeOn != null ? !eveningPeakTimeOn.equals(that.eveningPeakTimeOn) : that.eveningPeakTimeOn != null)
            return false;
        if (eveningPeakTimeOff != null ? !eveningPeakTimeOff.equals(that.eveningPeakTimeOff) : that.eveningPeakTimeOff != null)
            return false;
        if (otherPeakTimeOn != null ? !otherPeakTimeOn.equals(that.otherPeakTimeOn) : that.otherPeakTimeOn != null)
            return false;
        if (otherPeakTimeOff != null ? !otherPeakTimeOff.equals(that.otherPeakTimeOff) : that.otherPeakTimeOff != null)
            return false;
        if (peakUnitPrice != null ? !peakUnitPrice.equals(that.peakUnitPrice) : that.peakUnitPrice != null)
            return false;
        if (peakPriceStartMile != null ? !peakPriceStartMile.equals(that.peakPriceStartMile) : that.peakPriceStartMile != null)
            return false;
        if (lowSpeedPricePerMinute != null ? !lowSpeedPricePerMinute.equals(that.lowSpeedPricePerMinute) : that.lowSpeedPricePerMinute != null)
            return false;
        if (nightPricePerMile != null ? !nightPricePerMile.equals(that.nightPricePerMile) : that.nightPricePerMile != null)
            return false;
        if (nightPricePerMinute != null ? !nightPricePerMinute.equals(that.nightPricePerMinute) : that.nightPricePerMinute != null)
            return false;
        if (otherPrice != null ? !otherPrice.equals(that.otherPrice) : that.otherPrice != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (fareType != null ? fareType.hashCode() : 0);
        result = 31 * result + (fareTypeNote != null ? fareTypeNote.hashCode() : 0);
        result = 31 * result + (fareValidOn != null ? fareValidOn.hashCode() : 0);
        result = 31 * result + (fareValidOff != null ? fareValidOff.hashCode() : 0);
        result = 31 * result + (startFare != null ? startFare.hashCode() : 0);
        result = 31 * result + (startMile != null ? startMile.hashCode() : 0);
        result = 31 * result + (unitPricePerMile != null ? unitPricePerMile.hashCode() : 0);
        result = 31 * result + (unitPricePerMinute != null ? unitPricePerMinute.hashCode() : 0);
        result = 31 * result + (upPrice != null ? upPrice.hashCode() : 0);
        result = 31 * result + (upPriceStartMile != null ? upPriceStartMile.hashCode() : 0);
        result = 31 * result + (morningPeakTimeOn != null ? morningPeakTimeOn.hashCode() : 0);
        result = 31 * result + (morningPeakTimeOff != null ? morningPeakTimeOff.hashCode() : 0);
        result = 31 * result + (eveningPeakTimeOn != null ? eveningPeakTimeOn.hashCode() : 0);
        result = 31 * result + (eveningPeakTimeOff != null ? eveningPeakTimeOff.hashCode() : 0);
        result = 31 * result + (otherPeakTimeOn != null ? otherPeakTimeOn.hashCode() : 0);
        result = 31 * result + (otherPeakTimeOff != null ? otherPeakTimeOff.hashCode() : 0);
        result = 31 * result + (peakUnitPrice != null ? peakUnitPrice.hashCode() : 0);
        result = 31 * result + (peakPriceStartMile != null ? peakPriceStartMile.hashCode() : 0);
        result = 31 * result + (lowSpeedPricePerMinute != null ? lowSpeedPricePerMinute.hashCode() : 0);
        result = 31 * result + (nightPricePerMile != null ? nightPricePerMile.hashCode() : 0);
        result = 31 * result + (nightPricePerMinute != null ? nightPricePerMinute.hashCode() : 0);
        result = 31 * result + (otherPrice != null ? otherPrice.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }
}
