package com.example.ResponseController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Response.UserResponse;
import com.example.ResponseService.UserResponseService;

@RestController
public class UserResponseController {

	@Autowired
	UserResponseService userResponseService;

	@RequestMapping(value = "/get_user_response", method = RequestMethod.GET)
	public ResponseEntity<List<UserResponse>> getUserResponse() {

		List<UserResponse> list = userResponseService.getAllUserResponse();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}

}
