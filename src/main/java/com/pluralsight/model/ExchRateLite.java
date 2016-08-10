package com.pluralsight.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

/**
 * Created by sdaribazaron on 2016-08-10.
 */
public class ExchRateLite {
    private String memberId;
    private Currency srcCurr;
    private String dstCurr;
    private String tableCode;
    private BigDecimal buyRate;
    private BigDecimal sellRate;
    private BigDecimal avgRate;
    private Date rateDate;
    private Date effectiveDate;
    private Date expiredDate;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Currency getSrcCurr() {
        return srcCurr;
    }

    public void setSrcCurr(Currency srcCurr) {
        this.srcCurr = srcCurr;
    }

    public String getDstCurr() {
        return dstCurr;
    }

    public void setDstCurr(String dstCurr) {
        this.dstCurr = dstCurr;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public BigDecimal getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(BigDecimal buyRate) {
        this.buyRate = buyRate;
    }

    public BigDecimal getSellRate() {
        return sellRate;
    }

    public void setSellRate(BigDecimal sellRate) {
        this.sellRate = sellRate;
    }

    public BigDecimal getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(BigDecimal avgRate) {
        this.avgRate = avgRate;
    }

    public Date getRateDate() {
        return rateDate;
    }

    public void setRateDate(Date rateDate) {
        this.rateDate = rateDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public String toString() {
        return "ExchRateLite{" +
                "memberId='" + memberId + '\'' +
                ", srcCurr='" + srcCurr + '\'' +
                ", dstCurr='" + dstCurr + '\'' +
                ", tableCode='" + tableCode + '\'' +
                ", buyRate=" + buyRate +
                ", sellRate='" + sellRate + '\'' +
                ", avgRate='" + avgRate + '\'' +
                ", rateDate=" + rateDate +
                ", effectiveDate=" + effectiveDate +
                ", expiredDate=" + expiredDate +
                '}';
    }
}
