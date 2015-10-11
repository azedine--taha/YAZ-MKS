<%@page import="app.controllers.equipement.EquipementDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/include.jsp"%>
  <form:form commandName="equipement" method="post" class="form-horizontal" >
  		<form:hidden path="idEquipement"  cssClass="input-large"/>
     <div class="row">
		<div class="col-lg-8">
		</div>
	</div>
	<div class="panel panel-primary">
	  <div class="panel-heading">Ajouter Equipement</div>
	  <div class="panel-body">
	      <div class="form-group">
	        <label for="TypeVignette " class="col-sm-2">code : </label>  
	        <div class="col-sm-4"> 
	         	<form:input path="code"  class="form-control"/>
	        </div>
	       </div> 
           <div class="form-group">
        	<label for="TypeVignette " class="col-sm-2">Libelle  : </label>  
	        <div class="col-sm-4"> 
	         	<form:input path="libelle"  class="form-control"/>
	        </div>
        	</div>
           <div class="form-group">
        	<label for="TypeVignette " class="col-sm-2">Famille Equipement  : </label>  
	        <div class="col-sm-2"> 
	         	<form:select path="idFamille" class="form-control" items="${equipement.listFamille}" />
	        </div>
        	</div>
	         
	    <div class="row">
	    <div class="col-sm-4"> </div>
	    <div class="col-sm-4">
	        	<a class="btn btn-large btn-block btn-danger"  href="<spring:url value="/gererEquipement/annuler.html"/>">Annuler</a>
	     </div>
	         <div class="col-sm-4"> 
	        	<button class="btn btn-large btn-block btn-primary" type="submit">Enregistrer</button>
	         </div>
	    </div>
	  </div>
	</div>
 </form:form>
 
 <c:import url="../GererEquipement/listEquipement.jsp"></c:import>