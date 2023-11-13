package top.xiaodashuai.spring2.learndemo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Mygame {
    private static final long serialVersionUID = 1L;
    private Integer gid;
    private String gname;
    private String info;
    private Date addtime;

}
