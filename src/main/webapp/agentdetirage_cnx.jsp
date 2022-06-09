<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentification</title>
<link href="/css/bootstrap.min.css" rel="stylesheet" />
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
									<legend></legend>
										<label for="sub"></label> <input name="sub" id="sub"
											type="submit" class="form-control input-md"
											value="Administrateur" />
									</fieldset>
								</form>
							</td>
							<td>
								<form action="agentdetirage_cnx">
									<fieldset>
									<legend></legend>
										<label for="sub"></label> <input name="sub" id="sub"
											type="submit" class="form-control input-md"
											value="Agent de tirage" />
									</fieldset>
								</form>
							</td>
							<td>
								<form action="enseignant_cnx">
									<fieldset>
									<legend></legend>
										<label for="sub"></label> <input name="sub" id="sub"
											type="submit" class="form-control input-md"
											value="Enseignant" />
									</fieldset>
								</form>
							</td>
							<td>
								<form action="/">
									<fieldset>
									<legend></legend>
										<label for="sub"></label> <input name="sub" id="sub"
											type="submit" class="form-control input-md" value="Index" />
									</fieldset>
								</form>
							</td>								
						</tr>
					</table>
				</div>
				<hr>
				<form class="form-horizontal"
					action="/AgentDeTirage/Authentification">
					<fieldset>
						<!-- Form Name -->
						<legend>Authentification Agent</legend>
						<!-- Text input-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="login">Login</label>
							<div class="col-md-4">
								<input id="login" name="login" type="text"
									class="form-control input-md" required="required">
							</div>
						</div>
						<!-- Password input-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="motdepasse">Mot
								de passe</label>
							<div class="col-md-4">
								<input id="motdepasse" name="motdepasse" type="password"
									class="form-control input-md" required="required">
							</div>
						</div>
						<!-- Button (Double) -->
						<div class="form-group">
							<label class="col-md-4 control-label" for="button1id">Submit</label>
							<div class="col-md-8">
								<button id="button1id" name="button1id" class="btn btn-success"
									type="submit">Connection</button>
								<button id="button2id" name="button2id" class="btn btn-danger"
									type="reset">Annuler</button>
							</div>
						</div>
					</fieldset>
				</form>
				<h4 class="text-danger">${erreur}</h4>
			</div>
		</div>
	</div>
	<script src="/js/jquery.min.js" type="text/javascript"></script>
	<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>