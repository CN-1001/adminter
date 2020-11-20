package com.jfc.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 人
 */
@Data
public class Person implements Serializable {
    /*** 编号*/
    private Integer id;
    /*** 姓名**/
    private String name;
    /***  电话   * */
    private String phone;
    /***  工种   * */
    private String type;
    /***  工钱   * */
    private Double money;
    /***   级别  * */
    private Integer rank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                ", money=" + money +
                ", rank=" + rank +
                '}';
    }
}
