package com.thkim.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BlogControllerTest {

		@GetMapping("/test/hello")
		public String Hello() {
			return "<h1>Hello spring boot</h1>";
		}
}








