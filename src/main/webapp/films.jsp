<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	
<%@include file="head.jsp"%>
<div class="container">

	<header>
		<%@include file="nav.jsp"%>
		<h2>Listado de Películas</h2>
	</header>

	<main>
		<div class="row">
			<div class="col">
				<table class="table">
					<thead class="table-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Titulo</th>
							<th scope="col">Descripción</th>
							<th scope="col">Año</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="film" items="${films}">
						<tr>
							<th><c:out value="${film.getId()}"></c:out></th>
							<td><c:out value="${film.getTitle()}"></c:out></td>
							<td><c:out value="${film.getDescription()}"></c:out></td>
							<td><c:out value="${film.getReleaseYear()}"></c:out></td>
						</tr>
						</c:forEach>					
					</tbody>
				</table>
			</div>
		</div>
	</main>



	<%@include file="footer.jsp"%>
</div>

</body>
</html>