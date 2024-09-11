package com.cpi.is.dao;

import java.util.List;
import com.cpi.is.entity.FinishedProductListEntity;

public interface FinishedProductListDAO {
    
    List<FinishedProductListEntity> getData(Long branchId) throws Exception; // Fixed method name
    String saveItem(FinishedProductListEntity item) throws Exception; // Fixed parameter type
    String deleteItem(FinishedProductListEntity item) throws Exception; // Fixed parameter type

}