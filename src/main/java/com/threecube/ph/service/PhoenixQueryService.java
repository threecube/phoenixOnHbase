/**
 * 
 */
package com.threecube.ph.service;

import com.threecube.ph.model.LogQueryParams;
import com.threecube.phoenix.result.LogSearchResult;

/**
 * @author wenbin_dwb
 *
 */
public interface PhoenixQueryService {
	
	/**
	 * 查询
	 * 
	 * @param queryParams
	 * @return
	 * @throws Exception
	 */
	public LogSearchResult query(LogQueryParams queryParams) throws Exception;
}
