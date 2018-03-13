package com.example.aofeitv.beans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/12/27.
 */
@Entity
public class QianDaoId {
    @Id
    @NotNull
    private Long id;
    private String name;
    @Generated(hash = 810007560)
    public QianDaoId(@NotNull Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 2019086784)
    public QianDaoId() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
