/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/
package com.salesdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class WeeklyLeadsResponse implements Serializable {


    @JsonProperty("WEEK")
    @ColumnAlias("WEEK")
    private BigInteger week;

    @JsonProperty("LEADS")
    @ColumnAlias("LEADS")
    private BigInteger leads;

    public BigInteger getWeek() {
        return this.week;
    }

    public void setWeek(BigInteger week) {
        this.week = week;
    }

    public BigInteger getLeads() {
        return this.leads;
    }

    public void setLeads(BigInteger leads) {
        this.leads = leads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeeklyLeadsResponse)) return false;
        final WeeklyLeadsResponse weeklyLeadsResponse = (WeeklyLeadsResponse) o;
        return Objects.equals(getWeek(), weeklyLeadsResponse.getWeek()) &&
                Objects.equals(getLeads(), weeklyLeadsResponse.getLeads());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeek(),
                getLeads());
    }
}
