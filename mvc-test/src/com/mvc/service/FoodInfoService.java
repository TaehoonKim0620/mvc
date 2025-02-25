package com.mvc.service;

import java.util.List;

import com.mvc.dto.FoodInfoDTO;
import com.mvc.repository.FoodInfoRepository;

public class FoodInfoService {
	public List<FoodInfoDTO> getFoodInfos(FoodInfoDTO foodInfo){
	FoodInfoRepository fiRepo = new FoodInfoRepository();
	List<FoodInfoDTO> foodInfos = fiRepo.selectFoodInfos(foodInfo);
	return foodInfos;
	}
}
