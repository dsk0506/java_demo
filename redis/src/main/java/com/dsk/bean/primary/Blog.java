package com.dsk.bean.primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/21 下午3:35.
 * @blog http://blog.didispace.com
 */
@Entity
public class Blog {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public Integer getContent() {
        return content;
    }

    @Id
    @GeneratedValue
    private Long id;

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Column(nullable = false)
    private Long uid;

    public Long getUid() {
        return uid;
    }

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer content;

    public Blog(){}



}