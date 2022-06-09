<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/css/bootstrap.min.css" rel="stylesheet" />
<title>Authentification</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<hr>
				<h3 class="text-danger text-center">Bienvenue, Veuillez vous
					identifier SVP!</h3>
				<hr>
				<div class="table-responsive">
					<table id="mytable" class="table table-bordred table-striped">
						<tr>
							<td>
								<form action="administrateur_cnx">
									<fieldset>
										<label for="sub"></label> <input name="sub" id="sub"
											type="submit" class="form-control input-md"
											value="Administrateur" />
									</fieldset>
								</form>
							</td>
							<td>
								<form action="agentdetirage_cnx">
									<fieldset>
										<label for="sub"></label> <input name="sub" id="sub"
											type="submit" class="form-control input-md"
											value="Agent de tirage" />
									</fieldset>
								</form>
							</td>
							<td>
								<form action="enseignant_cnx">
									<fieldset>
										<label for="sub"></label> <input name="sub" id="sub"
											type="submit" class="form-control input-md"
											value="Enseignant" />
									</fieldset>
								</form>
							</td>
						</tr>
					</table>
				</div>
				<hr>
			</div>
		</div>
	</div>
	<script src="/js/jquery.min.js" type="text/javascript"></script>
	<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>