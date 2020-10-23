package com.teenyda.controller.banner.dto;

import com.teenyda.entity.Banner;
import lombok.Data;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-23 12:07
 * @description: 幻灯片
 **/

@Data
public class BannerDto extends Banner {

    private String productName;

}
