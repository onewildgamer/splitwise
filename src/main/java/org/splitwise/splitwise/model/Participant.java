package org.splitwise.splitwise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.StringJoiner;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class Participant {

    @JsonProperty("id")
    private String id;

    @JsonProperty("share")
    private long share;

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("percentage")
    private double percentage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Participant.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("share=" + share)
                .add("amount=" + amount)
                .add("percentage=" + percentage)
                .toString();
    }
}
