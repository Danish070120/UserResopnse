package com.example.ResponseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.CustomException;
import com.example.Response.UserResponse;
import com.example.ResponseRepository.UserResponseRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserResponseServiceImpl implements UserResponseService {

	@Autowired
	UserResponseRepository userResponseRepository;

	@Override
	public List<UserResponse> getAllUserResponse() {

		try {
			return userResponseRepository.findAll();

		} catch (Exception e) {

			log.error(e.getMessage());
			throw new CustomException(500, e.getMessage());

		}

	}

}
