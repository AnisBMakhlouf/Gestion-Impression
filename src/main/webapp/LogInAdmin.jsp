<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" href="assets/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<title>Gestion Impression</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />

	<!--     Fonts and icons     -->
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.css" rel="stylesheet">

	<!-- CSS Files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
	<link href="assets/css/gsdk-bootstrap-wizard.css" rel="stylesheet" />

	<!-- CSS Just for demo purpose, don't include it in your project -->
	<link href="assets/css/demo.css" rel="stylesheet" />
</head>

<body>
<div class="image-container set-full-height" style="background-image: url('assets/img/wizard-city.jpg')">

    <a href="https://iit.tn/">
         <div class="logo-container">
            <div class="logo">
               <!--  <img src="assets/img/new_logo.png">-->
            </div>
            <div class="brand">
                Gestion Impression
            </div>
        </div>
    </a>


    <!--   Big container   -->
    <div class="container">
        <div class="row">
        <div class="col-sm-8 col-sm-offset-2">

            <!--      Wizard container        -->
            <div class="wizard-container">

                <div class="card wizard-card" data-color="blue" id="wizardProfile">
                    <form method="post" action="${pageContext.request.contextPath}/Administrateur/Authentification">
                <!--        You can switch ' data-color="orange" '  with one of the next bright colors: "blue", "green", "orange", "red"          -->

                    	<div class="wizard-header">
                        	<h3>
                        	   <img src="assets/img/new_logo.png">
                        	</h3>
                    	</div>

						<div >
							<ul>
	                            <li><a href="${pageContext.request.contextPath}/LogInAdmin.jsp">Admin</a></li>
	                            
	                            <li><a href="${pageContext.request.contextPath}/LogInEns.jsp">Enseignant</a></li>
	                            <li><a href="${pageContext.request.contextPath}/LogInAgent.jsp">Agent de tirage</a></li>
	                        </ul>

						</div>

                        <div class="tab-content">
                              <div class="row">

                                  <div class="col-sm-10 col-sm-offset-1">
                                        <div class="form-group">
                                          <label>Email </label>
                                          <input name="login" type="email" class="form-control" placeholder="" required>
                                      </div>
                                      <div class="form-group">
                                        <label>Mot de passe </label>
                                        <input name="password" type="password" class="form-control" placeholder="" required>
                                      </div>
                                  </div>     
                               
                            </div>
                             <div class="wizard-footer height-wizard">
                            <div class="pull-right">
                                <input type='submit' class='btn btn-next btn-fill btn-primary btn-wd btn-sm' name='next' value='Connecter' />
                            </div>

                            <div class="clearfix"></div>
                        </div>

                    </form>
                </div>
            </div> <!-- wizard container -->
        </div>
        </div><!-- end row -->
    </div> <!--  big container -->



</div>

</body>

	<!--   Core JS Files   -->
	<script src="assets/js/jquery-2.2.4.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="assets/js/jquery.bootstrap.wizard.js" type="text/javascript"></script>

	<!--  Plugin for the Wizard -->
	<script src="assets/js/gsdk-bootstrap-wizard.js"></script>

	<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
	<script src="assets/js/jquery.validate.min.js"></script>

</html>
