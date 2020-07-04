<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Sporty</title>
</head>
<body>
	<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="#home"><img src="images/sporty-logo-design.jpg"
						alt="Sporty Logo"></a>
				</div>
				<!-- branding -->
				<ul class="navbar">
					<li><a href="/home"><spring:message code="label.home"/></a></li>
                    <li><a href="/goToSearch"><spring:message code="label.search"/></a></li>
                    <li><a href="/redirectToLinkedIn"><spring:message code="label.linkedin"/></a></li>
				</ul>
				<!-- navbar -->
			</div>
			<!-- container nav-elements -->
		</nav>
		<!-- <div class="container tagline">
    <h1 class="headline">Our Mission</h1>
    <p><spring:message code="about.mission"/></p>
  </div>container tagline -->
	</header>
	<!-- #home -->
    <span class="success">${dataSaved}</span>
   	<section id="login" class="section">
		<div class="container tagline">
			<em>LOGIN USER</em>
			<form:form action="/login" method="post" modelAttribute="login">
				<label>Username</label> <form:input type="text" path="username"/><br />
			    <label>Password</label> <form:input type="password" path="password"/><br />
			     <input type="submit" value="Login">
			</form:form>
			 <a class="card-title" href="/goToRegistration">Register new user? Click here</a>
		</div>
	</section>
	<!-- #products -->


	<footer class="footer">
		<div class="container">

			<nav class="nav" role="navigation">
				<div class="container nav-elements">
					<div class="branding">
						<a href="#home"><img src="images/sporty-logo-design.jpg"
							alt="Sporty Logo"></a>
						<p class="address"><spring:message code="about.address"/></p>
					</div>
				</div>
			</nav>
			<p class="legal"><spring:message code="about.legal"/></p>
		</div>
		<!-- container -->
	</footer>
	<!-- footer -->

</body>
</html>