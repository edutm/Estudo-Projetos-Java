<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>: Agenda - Ocio :</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1"
	user-scalable="no">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
	<link rel="stylesheet" href="<c:url value="/resources/css/jquery-ui.min.css"/>" />
	<link rel="stylesheet" href="<c:url value="/resources/css/fullcalendar.css"/>" />
	<link rel="stylesheet" media="print" ref="<c:url value="/resources/css/fullcalendar.print.css"/>" />
	<link rel="stylesheet" media="print" ref="<c:url value="/resources/css/jquery-ui.min.css"/>" />
	<link rel="stylesheet" media="print" ref="<c:url value="/resources/css/jquery.timepicker.css"/>" />	
	<script type="text/javascript"	src="<c:url value="/resources/js/moment.min.js"/>"></script>
	  <script type="text/javascript"	src="<c:url value="/resources/js/jquery.min.js"/>"></script> 
	<!--<script type="text/javascript"	src="<c:url value="/resources/js/jquery.js"/>"></script> -->
	<script type="text/javascript"	src="<c:url value="/resources/js/fullcalendar.min.js"/>"></script>
	<script type="text/javascript"	src="<c:url value="/resources/js/lang-all.js"/>"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script type="text/javascript"	src="<c:url value="/resources/js/jquery-ui.min.js"/>"></script>
	<script type="text/javascript"	src="<c:url value="/resources/js/jquery.timepicker.min.js"/>"></script>
	<script type="text/javascript"	src="<c:url value="/resources/js/jquery.simple-dtpicker.js"/>"></script>
	<link rel="stylesheet" href="<c:url value="/resources/css/jquery.simple-dtpicker.css"/>" />
	

	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />
	
	
</head>
<body>
	<header>
		<nav class="navbar navbar-default navbar-fixed-top">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <a class="navbar-brand" href="<c:url value="/"/>">Agenda Ocio</a>
		    </div>
		
		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        <li id="linkAdd"><a href="#">Adicionar novo evento</a></li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
	</header>
