package com.java110.front.smo.carBlackWhite;

import com.java110.core.context.IPageData;
import org.springframework.http.ResponseEntity;

/**
 * 添加黑白名单接口
 *
 * add by wuxw 2019-06-30
 */
public interface IAddCarBlackWhiteSMO {

    /**
     * 添加黑白名单
     * @param pd 页面数据封装
     * @return ResponseEntity 对象
     */
    ResponseEntity<String> saveCarBlackWhite(IPageData pd);
}
