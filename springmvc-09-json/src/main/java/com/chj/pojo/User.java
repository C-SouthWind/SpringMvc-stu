package com.chj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ：chj
 * @date ：Created in 2021/12/6 19:34
 * @params :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class User {
    private String name;
    private int age;
    private String sex;
}
