package com.example.demo.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //作用是自动生成getter/setter/equals/canEqual/hashCode/toString方法
@Builder //作用是生成builder类
@AllArgsConstructor //作用是生成全参构造函数
@NoArgsConstructor //作用是生成无参构造函数

public class AuthenticationResponse {

    private  String token;
}
