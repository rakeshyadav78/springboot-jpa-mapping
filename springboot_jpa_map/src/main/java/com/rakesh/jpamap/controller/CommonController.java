package com.rakesh.jpamap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.jpamap.dto.Request;
import com.rakesh.jpamap.dto.Response;
import com.rakesh.jpamap.entity.Book;
import com.rakesh.jpamap.entity.Student;
import com.rakesh.jpamap.service.BookService;
import com.rakesh.jpamap.service.StudentService;

@RestController
public class CommonController {

}
