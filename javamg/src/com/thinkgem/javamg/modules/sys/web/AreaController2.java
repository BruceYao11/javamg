/**
 * 
 */
package com.thinkgem.javamg.modules.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thinkgem.javamg.common.web.BaseController;
import com.thinkgem.javamg.modules.sys.utils.Json;

/**
 * 区域Controller
 * 
 * @version 2013-5-15
 */
@Controller
@RequestMapping(value = "${adminPath}/tt")
public class AreaController2 extends BaseController {

	@RequestMapping(value = "ptt")
	@ResponseBody
	public Json getADTPlcData(String name,String sex) {
			return new Json(true, "hello jack" + name +sex, null);
		
	}
}
