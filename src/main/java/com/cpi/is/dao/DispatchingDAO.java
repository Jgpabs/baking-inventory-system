package com.cpi.is.dao;

import java.util.List;

import com.cpi.is.entity.DispatchingEntity;

public interface DispatchingDAO {
	
	List<DispatchingEntity> getData(Long branchId) throws Exception;
	String saveData(DispatchingEntity data) throws Exception;
	String deleteData(DispatchingEntity data) throws Exception;
	public Long getDispatchCount(Long branchId) throws Exception;

}
