<%@page import="java.time.LocalDate" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  LocalDate today = LocalDate.now();
  LocalDate tomorrow = today.plusDays(1);
%>