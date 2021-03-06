/**
 * 
 */
package com.thinkgem.javamg.common.filter;

import com.thinkgem.javamg.common.utils.CacheUtils;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter;

/**
 * 页面高速缓存过滤器
 * 
 * @version 2013-8-5
 */
public class PageCachingFilter extends SimplePageCachingFilter {

	
	protected CacheManager getCacheManager() {
		return CacheUtils.getCacheManager();
	}
	
}
