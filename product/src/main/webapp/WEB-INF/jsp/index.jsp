<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<head>
    <meta charset="UTF-8">
    <title>Sporty</title>
  <link rel="stylesheet" href="/css/style.css" type="text/css"/>
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

<section id="history" class="section">
    <div class="container">
        <div class="text-content">
            <h2 class="headline">Company History</h2>
            <p><spring:message code="about.history1"/></p>
            <p><spring:message code="about.history2"/></p>
            <p><spring:message code="about.history3"/></p>
        </div>
    </div><!-- container text -->
</section><!-- #history -->

<section id="guarantee" class="section">
    <header class="imageheader"></header>
    <div class="container">
        <h2 class="headline">Our Guarantee &amp; Ideals</h2>
        <p><spring:message code="about.headline1"/></p>
        <p><spring:message code="about.headline2"/></p>
    </div>
</section><!-- guarantee -->

<section id="people" class="section">
    <header class="imageheader"></header>
    <div class="container">
        <h2 class="headline">People</h2>
        <div class="people-cards">
            <div class="person-card">
                <img src="images/employees/Akash.jpg" alt="Akash Photo">
                <div class="card-info">
                    <h3 class="card-name">Akash</h3>
                    <h4 class="card-title">CEO</h4>
                </div>
                <p class="card-text"><spring:message code="about.akash"/></p>
            </div><!-- person-card -->

            <div class="person-card">
                <img src="images/employees/Selena.jpg" alt="Selena Photo">
                <div class="card-info">
                    <h3 class="card-name">Selena, MBA</h3>
                    <h4 class="card-title">CFO</h4>
                </div>
                <p class="card-text"><spring:message code="about.selena"/></p>
            </div><!-- person-card -->

            <div class="person-card">
                <img src="images/employees/Peter.jpg" alt="Peter Photo">
                <div class="card-info">
                    <h3 class="card-name">Peter, MBA</h3>
                    <h4 class="card-title">Director of Product Development</h4>
                </div>
                <p class="card-text"><spring:message code="about.peter"/></p>
            </div><!-- person-card -->

            <div class="person-card">
                <img src="images/employees/Harmeet.jpg" alt="Harmeet Photo">
                <div class="card-info">
                    <h3 class="card-name">Harmeet</h3>
                    <h4 class="card-title">Director of Marketing</h4>
                </div>
                <p class="card-text"><spring:message code="about.harmeet"/></p>
            </div><!-- person-card -->

            <div class="person-card">
                <img src="images/employees/SouravRoy.jpg" alt="SouravRoy Photo">
                <div class="card-info">
                    <h3 class="card-name">Sourav Roy</h3>
                    <h4 class="card-title">Director of Sales</h4>
                </div>
                <p class="card-text"><spring:message code="about.sourav"/></p>
            </div><!-- person-card -->

            <div class="person-card">
                <img src="images/employees/MahendraBarman.jpg" alt="MahendraBarman Photo">
                <div class="card-info">
                    <h3 class="card-name">Mahendra Barman</h3>
                    <h4 class="card-title">Sporty, Creative Director</h4>
                </div>
                <p class="card-text"><spring:message code="about.mahendra"/></p>
            </div><!-- person-card -->
        </div><!-- container -->
</section><!-- people -->


<footer class="footer">
    <div class="container">
        <nav class="nav" role="navigation">
            <div class="container nav-elements">
                <div class="branding">
                    <a href="#home"><img src="images/sporty-logo-design.jpg" alt="Sporty Logo"></a>
                    <p class="address">
                        <spring:message code="about.address"/>
                    </p>
                </div>
            </div>
        </nav>
        <p class="legal"><spring:message code="about.legal"/></p>
    </div><!-- container -->
</footer><!-- footer -->

</body>
</html>
