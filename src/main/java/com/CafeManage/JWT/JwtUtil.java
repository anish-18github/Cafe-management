package com.CafeManage.JWT;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;

@Service
public class JwtUtil {
	
	private String SECRET_KEY = "GzV5C8n1L4p1K9bQzX3sN5f2U8d3L6o7P9k2T3eV7cW8fR6x";

	public <T> T extractClaims(String token, Function<Claims,T> claimsResolver) {
		
	}
}
