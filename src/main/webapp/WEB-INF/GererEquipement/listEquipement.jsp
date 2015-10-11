<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/include.jsp"%>
            
<!-- <div class="col-sm-4">  -->
<%-- 	<button class="btn btn-large btn-block btn-primary" type="submit" href="<spring:url value="/gererEquipement/createEquipement.html"/>">Ajouter</button> --%>
<!-- </div> -->
<br><br>
<div class="panel panel-primary">
  <div class="panel-heading">List des equipements</div>
	  	<div class="panel-body">
			<table class="table table-bordered tatable-striped table-hover table-nonfluid " id="example">
				<thead>
						<tr>
							<th> code </th>
							<th> Libelle  </th>
							<th align="center">Action</th>
						</tr>
				</thead>
      			<tbody class="searchable">
					<c:forEach items="${listEquipement}" var="list">
						<tr>
<!-- 							<td> -->
<%-- 							    <input type="checkbox" id="idEquipement" value="${list.idEquipement}" onclick="javascript:alert(this.value);"/> --%>
<!-- 							</td> -->
							<td>${list.code}</td>
							<td>${list.libelle }</td>
							<td align="center">
								<a href="<spring:url value="/gererEquipement/updateEquipement/${list.idEquipement}.html"/>" ><i class="glyphicon glyphicon-edit"></i></a>
								<a href="<spring:url value="/gererEquipement/deleteEquipement/${list.idEquipement}.html"/>"  class="triggerRemove">
								<i class="glyphicon glyphicon-remove "></i></a>
							</td>
						</tr>
					</c:forEach>
				 </tbody>
			</table>
		</div>
</div>
 <div class="modal fade" id="ModalSupp" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel"> ٍSuppression</h4>
      </div>
      <div class="modal-body">
        		Voulez-vous vraiment supprimer La ligne !!!! 
      </div>
      <div class="modal-footer ">
        <button type="button" class="btn btn-default" data-dismiss="modal">Annuler</button>
        <a href="" class="btn btn-danger removeBtn">Supprimer</a>
      </div>
    </div>
  </div>
 </div>
    <script type="text/javascript" charset="utf-8">
      $(document).ready(function() {
          $('.triggerRemove ').click(function(e){
  			e.preventDefault();
  			$('#ModalSupp .removeBtn ').attr("href",$(this).attr("href"));
  			$('#ModalSupp').modal();
  		});
  		    
        });
</script>