<%-- 
    Document   : Dr-Dashboard
    Created on : Apr 15, 2021, 5:43:34 PM
    Author     : Neranji Sulakshika
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">

    <title>Doctors Dashboard</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Favicon -->
        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">

    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-style.css">
    <link rel="stylesheet" href="assets/css/owl.css">

  </head>

<body class="is-preload">

    <!-- Wrapper -->
    <div id="wrapper">

      <!-- Main -->
        <div id="main">
          <div class="inner">

            <!-- Header -->
            <header id="header">
              <div class="logo">                  
                <img class="dash" src="assets/images/dashboard.png">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="Dr-Dashboard.html">Dashboard</a>
              </div>
            </header>
                <jsp:declaration>
                    String username="";
                    String password="";
                </jsp:declaration>
                <jsp:scriptlet>
                    username = request.getParameter("username");
                    password = request.getParameter("pass");        
                </jsp:scriptlet>
        
                <strong>
                    <h3 class="name">Welcome Dr.<jsp:expression>username</jsp:expression></h3>
                </strong>
            
            <div class="time">
                <%
                    Date date = new Date();
                    out.print( "<h5 align = \"center\">" +date.toString()+"</h5>");
                %>
            </div><br><br>

            <!-- Banner -->
            <section class="main-banner">
              <div class="container-fluid">
                <div class="row">
                  <div class="col-md-12">
                    <div class="banner-content">
                      <div class="row">
                        <div class="col-md-12">
                          <div class="banner-caption">
                            <h4>Hello, this is <em>Doctors</em> Dashboard.</h4>
                            <div class="primary-button">
                              <a href="#">WELCOME!</a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </section>

            <!-- Services -->
            <section class="services">
              <div class="container-fluid">
                <div class="row">
                  <div class="col-md-6">
                    <div class="service-item first-item">
                      <div class="icon"></div>
                      <h4><a href="UpdateForm.jsp">PROFILE</a></h4>
                      <p>Hello,</p><p>Check & Update your profile.</p>
                    </div>
                  </div>
                  <div class="col-md-6">
                    <div class="service-item second-item">
                      <div class="icon"></div>
                      <h4><a href="Appointments.html">APPOINTMENTS</a></h4>
                      <p>Hello,</p><p>Check your upcoming appointments.</p>
                    </div>
                  </div>
                </div>
              </div>
            </section>

            <!-- Footer -->
            <footer id="footer">
              <p class="copyright1">Copyright &copy; 2021 Blue Line Health Care Hospital. All rights reserved.
              <br>Designed by <a rel="nofollow" href="../Home/Home.html">Our Team</a></p>
            </footer>

          </div>
        </div>

      <!-- Sidebar -->
        <div id="sidebar">

          <div class="inner">
              
            <!-- Menu -->
            <nav id="menu">
              <ul>
                <li><img class="logo1" src="logo.png"></li>
                <li><a href="#.html">Home</a></li>
                <li><a href="UpdateForm.jsp">Profile</a></li>
                <li><a href="Appointments.html">Appointments</a></li>
                <li><a href="../Home/Home.html">Logout</a></li>
              </ul>
            </nav>

            <!-- Featured Posts -->
            <div class="featured-posts">
              <div class="heading">
                <h2>Featured Posts</h2>
              </div>
              <div class="owl-carousel owl-theme">
                <a href="#">
                  <div class="featured-item">
                    <img src="assets/images/featured_post_01.jpg" alt="featured one">
                  </div>
                </a>
                <a href="#">
                  <div class="featured-item">
                    <img src="assets/images/featured_post_02.jpg" alt="featured two">
                  </div>
                </a>
                <a href="#">
                  <div class="featured-item">
                    <img src="assets/images/featured_post_03.jpg" alt="featured three">
                  </div>
                </a>
              </div>
            </div>

            <!-- Footer -->
            <footer id="footer">
              <p class="copyright">Copyright &copy; 2021 Blue Line Health Care Hospital. All rights reserved.
              <br>Designed by <a rel="nofollow" href="../Home/Home.html">Our Team</a></p>
            </footer>

          </div>
        </div>

    </div>

  <!-- Scripts -->
  <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <script src="assets/js/browser.min.js"></script>
    <script src="assets/js/breakpoints.min.js"></script>
    <script src="assets/js/transition.js"></script>
    <script src="assets/js/owl-carousel.js"></script>
    <script src="assets/js/custom.js"></script>
</body>


  </body>

</html>

