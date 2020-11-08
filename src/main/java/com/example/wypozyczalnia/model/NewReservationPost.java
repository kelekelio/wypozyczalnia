package com.example.wypozyczalnia.model;

import java.io.Serializable;
import java.time.LocalDate;

public class NewReservationPost implements Serializable {
    private LocalDate from;
    private LocalDate to;
    private long carId;
    private long pickupBranchId;
    private long dropOffBranchId;

    public NewReservationPost() {
    }

    public NewReservationPost(LocalDate from, LocalDate to, long carId, long pickupBranchId, long dropOffBranchId) {
        this.from = from;
        this.to = to;
        this.carId = carId;
        this.pickupBranchId = pickupBranchId;
        this.dropOffBranchId = dropOffBranchId;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public long getPickupBranchId() {
        return pickupBranchId;
    }

    public void setPickupBranchId(long pickupBranchId) {
        this.pickupBranchId = pickupBranchId;
    }

    public long getDropOffBranchId() {
        return dropOffBranchId;
    }

    public void setDropOffBranchId(long dropOffBranchId) {
        this.dropOffBranchId = dropOffBranchId;
    }
}
