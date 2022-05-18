package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<img src='https://images.contentstack.io/v3/assets/blt300387d93dabf50e/blt6aaaab200d5013ff/59131a0f59b80e7305b104bd/one-does-not-simply-implement-continuous-delivery.jpg?format=webp&width=1200' />";
}
}
