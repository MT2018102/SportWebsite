<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<head>
    <meta charset="UTF-8">
    <title>Sporty</title>
   <link rel="stylesheet" href="css/style.css" type="text/css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<header id="home" class="header">
    <nav class="nav" role="navigation">
        <div class="container nav-elements">
            <div class="branding">
                <a href="#home"><img src="images/sporty-logo-design.jpg" alt="Sporty Logo"></a>
            </div><!-- branding -->
            <ul class="navbar">
                <li><a href="/home"><spring:message code="label.home"/></a></li>
                <li><a href="/goToLogin"><spring:message code="label.login"/></a></li>
                <li><a href="/goToSearch"><spring:message code="label.search"/></a></li>
                <li><a href="/redirectToLinkedIn"><spring:message code="label.linkedin"/></a></li>
            </ul><!-- navbar -->
        </div><!-- container nav-elements -->
    </nav>
    <div class="container tagline">
        <h1 class="headline">Our Mission</h1>
        <p><spring:message code="about.mission"/></p>
    </div><!-- container tagline -->
</header><!-- #home -->
<section id="error" class="section">
<p class = "error">Sorry, Something went wrong, looking into it:)</p>
</section>
<footer class="footer">
    <div class="container">
        <nav class="nav" role="navigation">
            <div class="container nav-elements">
                <div class="branding">
                    <a href="#home"><img src="images/sporty-logo-design.jpg" alt="Sporty Logo"></a>
                    <p class="address"><spring:message code="about.address"/>
                    </p>
                </div>
            </div>
        </nav>
        <p class="legal"><spring:message code="about.legal"/></p>
    </div><!-- container -->
</footer><!-- footer -->

</body>
</html>