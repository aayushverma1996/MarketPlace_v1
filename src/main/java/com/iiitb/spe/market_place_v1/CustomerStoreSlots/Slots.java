package com.iiitb.spe.market_place_v1.CustomerStoreSlots;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iiitb.spe.market_place_v1.Customer.Customer;
import com.iiitb.spe.market_place_v1.Order.Order;
import com.iiitb.spe.market_place_v1.Store.Store;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "slots")
public class Slots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "order_id")
    private Order order;

   @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Temporal(value = TemporalType.TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "Asia/Kolkata",pattern = "HH:mm")
    @Column(name="start_time")
    private Date startTime;

    @Temporal(value = TemporalType.TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "Asia/Kolkata",pattern = "HH:mm")
    @Column(name="end_time")
    private Date endTime;

    public Slots() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }



    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
