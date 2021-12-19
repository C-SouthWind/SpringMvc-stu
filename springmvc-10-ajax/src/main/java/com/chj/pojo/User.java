package com.chj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ：chj
 * @date ：Created in 2021/12/14 19:38
 * @params :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class User {
    private int id;
    private String name;
    private String pwd;
}
