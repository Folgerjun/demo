package com.neo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice // 加强Controller
public class GlobalExceptionHandler {

	// https://jira.spring.io/browse/SPR-14651
	// 4.3.5 supports RedirectAttributes redirectAttributes
	@ExceptionHandler(MultipartException.class) // 全局捕获异常
	public String handleError1(MultipartException e, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", e.getCause().getMessage());
		System.out.println(e.getCause().getMessage());
		return "redirect:/uploadStatus";
	}
}
