<%-- 
    Document   : newjsp
    Created on : Apr 15, 2021, 3:55:42 PM
    Author     : Neranji Sulakshika
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Personal Information Form</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="UpdateForm.css">

    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
  </head>
  <body>
    <div>
      <img src="logo.png" class="logo">
      <h1 class="head">Blue Line Health Care Hospital</h1>
    </div>
    <div class="testbox">
    <form action="/">
      <legend>Doctor Personal Information</legend>

      <div class="item">
        <div class="name-item">
          <div>
            <label for="title">Title<span>*</span></label>
                <select required class="drop">
                  <option selected value="" disabled selected>Title</option>
                  <option value="1">Dr.</option>
                  <option value="2">Ms.</option>
                  <option value="3">Mrs.</option>
                </select>
          </div>
        </div>
      </div>

      <div class="item">
      <label for="name">Name<span>*</span></label>
      <div class="name-item">
      <input id="name" type="text" name="name" placeholder="First" required/>
      <input id="name" type="text" name="name" placeholder="Last" required/>
      </div>
      </div>

      <div class="item">
      <label for="nic">NIC<span>*</span></label>
      <div class="name-item">
      <input id="nic" type="text" name="name" disabled required/>
      </div>
      </div>

      <div class="item">
      <label for="bdate">Date of Birth<span>*</span></label>
      <input id="bdate" type="date" name="bdate" disabled required/>
      <i class="fas fa-calendar-alt"></i>
      </div>

      <div class="item">
        <div class="name-item">
          <div>
            <label for="gender">Gender<span>*</span></label>
                <select required class="drop" disabled>
                  <option selected value="" disabled selected>Gender</option>
                  <option value="1">Male</option>
                  <option value="2">Female</option>
                  <option value="3">Other</option>
                </select>
          </div>
        </div>
      </div>

      <div class="item">
        <div class="name-item">
          <div>
            <label for="maritalstatus">Marital status</label>
              <select required class="drop">
                <option selected value="" disabled selected>Marital status</option>
                <option value="1">Single</option>
                <option value="2">Married</option>
                <option value="3">Divorced</option>
                <option value="4">Legal Separated</option>
              </select>
          </div>
        </div>
      </div>

      <div class="item">
      <label for="religion">Religion</label>
      <input id="religion" type="text" name="text" placeholder="Religion" />
      </div>

        <div class="item">
          <label for="address">Address<span>*</span></label>
          <input id="address" type="text" name="text" placeholder="Street Address" required/>
        </div>
        <div class="item">
          <div class="name-item">
            <div>
              <input type="text" name="city" placeholder="City" />
            </div>
            <div>
              <input type="text" name="state" placeholder="State/region" />
            </div>
          </div>
          <div class="item">
            <div class="name-item">
              <div>
                <input type="text" name="code" placeholder="ZIP Code" />
              </div>
              <div>
                <select class="drop">
                  <option selected value="" disabled selected>Country</option>
                  <option value="1">Australia</option>
                  <option value="2">Brazil</option>
                  <option value="3">Chaina</option>
                  <option value="4">Denmark</option>
                  <option value="5">France</option>
                  <option value="6">Germany</option>
                  <option value="7">Italy</option>
                  <option value="8">Jermany</option>
                  <option value="9">Korea</option>
                  <option value="10">Lebanan</option>
                  <option value="11">Mongolia</option>
                  <option value="12">Nepal</option>
                  <option value="13">Rusia</option>
                  <option value="14">Sri Lanka</option>
                  <option value="15">United Kingdom</option>
                  <option value="16">United State of America</option>
                </select>
              </div>
            </div>
          </div>

          <div class="item">
            <label for="email">Email<span>*</span></label>
            <input id="email" type="text" name="text" placeholder="Email" required/>
          </div>

          <div class="item">
            <label for="phone">Phone<span>*</span></label>
            <input id="phone" type="text" name="text" placeholder="### ### ## ##" required />
          </div>

      <div class="item">
        <div class="name-item">
          <div>
            <label for="bloodGroup">Blood Group</label>
              <select required class="drop" disabled>
                <option selected value="" disabled selected>Blood Group</option>
                <option value="1">O+</option>
                <option value="2">O-</option>
                <option value="3">A+</option>
                <option value="4">A-</option>
                <option value="5">B+</option>
                <option value="6">B-</option>
                <option value="7">AB+</option>
                <option value="8">AB-</option>
              </select>
          </div>
        </div>
      </div>

      <fieldset>
      <%
         Date date = new Date();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
      %>

      <div class="btn-block">
      <button type="submit" href="/">UPDATE</button>
      </div>

    </form>
    </div>

  </body>
</html>