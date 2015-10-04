<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://tiles.apache.org/tags-tiles"  prefix="tiles"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="f" %>
  <%@ include file="../layout/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="<c:url value="/ressources/css/bootstrap.min.css" />" />
<link rel="stylesheet" href="<c:url value="/ressources/css/datepicker3.css" />" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script type="text/javascript" 
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.0/js/jquery.dataTables.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script type="text/javascript" 
src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.12.0/jquery.validate.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script type="text/javascript" charset="utf8" src="../ressources/js/jquery.dataTables.js"></script>
<!-- DataTables CSS -->
<link rel="stylesheet" type="text/css" href="../resources/css/DT_bootstrap.css">
<script type="text/javascript" charset="utf8" src="../ressources/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf8" src="../ressources/js/bootstrap-datepicker.js"></script>
<title>App</title>
<style type="text/css">

.navbar-static-top {
    border-bottom-right-radius: 15px;
    border-bottom-left-radius: 15px;
}
.logo {
    color: white;
    font-size: 16;
    font-family: Helvetica,Arial,"Lucida Grande",sans-serif;
    font-weight: bold;
/*     background: linear-gradient(#76DBA1, #4ED4C0) repeat scroll 0% 0%  */
}
.navbar-inverse .navbar-nav > li > a {
    color: #FFF;
}
</style>
</head>
<body>
<div class="navbar-wrapper">
      <div class="container">
        <nav class="navbar navbar-inverse navbar-static-top logo">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand"   href='<spring:url value="/index.htm"/>'>App</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                              <li class="dropdown">
                  <a href="#'"class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Gestion des equipement <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href='<spring:url value="/gererEquipement/createEquipement.htm"/>' >Ajouter un équipement</a></li>
                    <li class="divider"></li>
                    <li><a href='<spring:url value=""/>' >Menu1-2</a></li>
                    <li class="divider"></li>
                    <li><a href='<spring:url value=""/>' >Menu1-3 </a></li>
                  </ul>
                </li>
                <li><a href="#about">Menu2</a></li>
                <li><a href="#contact">Menu3</a></li>
                <li><a href="#contact">Menu4</a></li>
                <li><a href="#contact">Menu5 </a></li>

              </ul>
            </div>
          </div>
        </nav>
      </div>
    </div>
    <div class="container">
 	<tiles:insertAttribute name="body"/>
</div>

<br /><br />
<center> <tiles:insertAttribute name="footer"/>  </center>

</body>
</html>