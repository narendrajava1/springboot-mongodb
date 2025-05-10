package com.naren.repository;

import com.naren.dto.*;
import com.naren.model.Sales;
import java.util.List;

public interface SalesRepository {
  Sales save(Sales sales);

  List<Sales> findAll();

  Sales findOne(String id);

  Sales update(Sales sale);

  Long delete(String id);

  List<SalesDTO> matchOp(String matchValue);

  List<GroupDTO> groupOp(String matchValue);

  List<TotalSalesDTO> TotalSales();

  List<PopularDTO> findPopularItems();

  List<BucketsDTO> findTotalSpend();
}
